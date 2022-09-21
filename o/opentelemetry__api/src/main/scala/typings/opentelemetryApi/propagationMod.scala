package typings.opentelemetryApi

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.textMapPropagatorMod.TextMapGetter
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryApi.textMapPropagatorMod.TextMapSetter
import typings.opentelemetryApi.typesMod.Baggage
import typings.opentelemetryApi.typesMod.BaggageEntry
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propagationMod {
  
  @JSImport("@opentelemetry/api/build/src/api/propagation", "PropagationAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class PropagationAPI () extends StObject {
    
    /* private */ var _getGlobalPropagator: Any = js.native
    
    def createBaggage(): Baggage = js.native
    def createBaggage(entries: Record[String, BaggageEntry]): Baggage = js.native
    @JSName("createBaggage")
    var createBaggage_Original: js.Function1[/* entries */ js.UndefOr[Record[String, BaggageEntry]], Baggage] = js.native
    
    def deleteBaggage(context: Context): Context = js.native
    @JSName("deleteBaggage")
    var deleteBaggage_Original: js.Function1[/* context */ Context, Context] = js.native
    
    /** Remove the global propagator */
    def disable(): Unit = js.native
    
    /**
      * Extract context from a carrier
      *
      * @param context Context which the newly created context will inherit from
      * @param carrier Carrier to extract context from
      * @param getter Function used to extract keys from a carrier
      */
    def extract[Carrier](context: Context, carrier: Carrier): Context = js.native
    def extract[Carrier](context: Context, carrier: Carrier, getter: TextMapGetter[Carrier]): Context = js.native
    
    /**
      * Return a list of all fields which may be used by the propagator.
      */
    def fields(): js.Array[String] = js.native
    
    def getBaggage(context: Context): js.UndefOr[Baggage] = js.native
    @JSName("getBaggage")
    var getBaggage_Original: js.Function1[/* context */ Context, js.UndefOr[Baggage]] = js.native
    
    /**
      * Inject context into a carrier to be propagated inter-process
      *
      * @param context Context carrying tracing data to inject
      * @param carrier carrier to inject context into
      * @param setter Function used to set values on the carrier
      */
    def inject[Carrier](context: Context, carrier: Carrier): Unit = js.native
    def inject[Carrier](context: Context, carrier: Carrier, setter: TextMapSetter[Carrier]): Unit = js.native
    
    def setBaggage(context: Context, baggage: Baggage): Context = js.native
    @JSName("setBaggage")
    var setBaggage_Original: js.Function2[/* context */ Context, /* baggage */ Baggage, Context] = js.native
    
    /**
      * Set the current propagator.
      *
      * @returns true if the propagator was successfully registered, else false
      */
    def setGlobalPropagator(propagator: TextMapPropagator[Any]): Boolean = js.native
  }
  /* static members */
  object PropagationAPI {
    
    @JSImport("@opentelemetry/api/build/src/api/propagation", "PropagationAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api/build/src/api/propagation", "PropagationAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Propagator API */
    inline def getInstance(): PropagationAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[PropagationAPI]
  }
}
