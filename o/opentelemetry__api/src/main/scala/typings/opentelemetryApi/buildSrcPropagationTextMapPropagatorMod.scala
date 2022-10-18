package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPropagationTextMapPropagatorMod {
  
  @JSImport("@opentelemetry/api/build/src/propagation/TextMapPropagator", "defaultTextMapGetter")
  @js.native
  val defaultTextMapGetter: TextMapGetter[Any] = js.native
  
  @JSImport("@opentelemetry/api/build/src/propagation/TextMapPropagator", "defaultTextMapSetter")
  @js.native
  val defaultTextMapSetter: TextMapSetter[Any] = js.native
  
  trait TextMapGetter[Carrier] extends StObject {
    
    /**
      * Get the value of a specific key from the carrier.
      *
      * @param carrier
      * @param key
      */
    def get(carrier: Carrier, key: String): js.UndefOr[String | js.Array[String]]
    
    /**
      * Get a list of all keys available on the carrier.
      *
      * @param carrier
      */
    def keys(carrier: Carrier): js.Array[String]
  }
  object TextMapGetter {
    
    inline def apply[Carrier](get: (Carrier, String) => js.UndefOr[String | js.Array[String]], keys: Carrier => js.Array[String]): TextMapGetter[Carrier] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), keys = js.Any.fromFunction1(keys))
      __obj.asInstanceOf[TextMapGetter[Carrier]]
    }
    
    extension [Self <: TextMapGetter[?], Carrier](x: Self & TextMapGetter[Carrier]) {
      
      inline def setGet(value: (Carrier, String) => js.UndefOr[String | js.Array[String]]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setKeys(value: Carrier => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
    }
  }
  
  trait TextMapPropagator[Carrier] extends StObject {
    
    /**
      * Given a `Context` and a carrier, extract context values from a
      * carrier and return a new context, created from the old context, with the
      * extracted values.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param getter an optional {@link TextMapGetter}. If undefined, keys will be all
      *     own properties, and keys will be accessed by direct object access.
      */
    def extract(context: Context, carrier: Carrier, getter: TextMapGetter[Carrier]): Context
    
    /**
      * Return a list of all fields which may be used by the propagator.
      */
    def fields(): js.Array[String]
    
    /**
      * Injects values from a given `Context` into a carrier.
      *
      * OpenTelemetry defines a common set of format values (TextMapPropagator),
      * and each has an expected `carrier` type.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param setter an optional {@link TextMapSetter}. If undefined, values will be
      *     set by direct object assignment.
      */
    def inject(context: Context, carrier: Carrier, setter: TextMapSetter[Carrier]): Unit
  }
  object TextMapPropagator {
    
    inline def apply[Carrier](
      extract: (Context, Carrier, TextMapGetter[Carrier]) => Context,
      fields: () => js.Array[String],
      inject: (Context, Carrier, TextMapSetter[Carrier]) => Unit
    ): TextMapPropagator[Carrier] = {
      val __obj = js.Dynamic.literal(extract = js.Any.fromFunction3(extract), fields = js.Any.fromFunction0(fields), inject = js.Any.fromFunction3(inject))
      __obj.asInstanceOf[TextMapPropagator[Carrier]]
    }
    
    extension [Self <: TextMapPropagator[?], Carrier](x: Self & TextMapPropagator[Carrier]) {
      
      inline def setExtract(value: (Context, Carrier, TextMapGetter[Carrier]) => Context): Self = StObject.set(x, "extract", js.Any.fromFunction3(value))
      
      inline def setFields(value: () => js.Array[String]): Self = StObject.set(x, "fields", js.Any.fromFunction0(value))
      
      inline def setInject(value: (Context, Carrier, TextMapSetter[Carrier]) => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction3(value))
    }
  }
  
  trait TextMapSetter[Carrier] extends StObject {
    
    /**
      * Callback used to set a key/value pair on an object.
      *
      * Should be called by the propagator each time a key/value pair
      * should be set, and should set that key/value pair on the propagator.
      *
      * @param carrier object or class which carries key/value pairs
      * @param key string key to modify
      * @param value value to be set to the key on the carrier
      */
    def set(carrier: Carrier, key: String, value: String): Unit
  }
  object TextMapSetter {
    
    inline def apply[Carrier](set: (Carrier, String, String) => Unit): TextMapSetter[Carrier] = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[TextMapSetter[Carrier]]
    }
    
    extension [Self <: TextMapSetter[?], Carrier](x: Self & TextMapSetter[Carrier]) {
      
      inline def setSet(value: (Carrier, String, String) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
}
