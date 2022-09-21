package typings.mercadopago

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultConfigurationModelMod {
  
  trait DefaultConfiguration extends StObject {
    
    /** Object with headers to be included in the request. Note that `user-agent` and `x-idempotency-key` headers will be ignored if included in this object. */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Idempotency value that will be included on the header. */
    var idempotency: js.UndefOr[String] = js.undefined
    
    /** Query string params. */
    var qs: js.UndefOr[Any] = js.undefined
  }
  object DefaultConfiguration {
    
    inline def apply(): DefaultConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultConfiguration]
    }
    
    extension [Self <: DefaultConfiguration](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIdempotency(value: String): Self = StObject.set(x, "idempotency", value.asInstanceOf[js.Any])
      
      inline def setIdempotencyUndefined: Self = StObject.set(x, "idempotency", js.undefined)
      
      inline def setQs(value: Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    }
  }
  
  /* Inlined std.Omit<mercadopago.mercadopago/models/default-configuration.model.DefaultConfiguration, 'qs'> */
  trait DefaultConfigurationOmitQs extends StObject {
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var idempotency: js.UndefOr[String] = js.undefined
  }
  object DefaultConfigurationOmitQs {
    
    inline def apply(): DefaultConfigurationOmitQs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultConfigurationOmitQs]
    }
    
    extension [Self <: DefaultConfigurationOmitQs](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIdempotency(value: String): Self = StObject.set(x, "idempotency", value.asInstanceOf[js.Any])
      
      inline def setIdempotencyUndefined: Self = StObject.set(x, "idempotency", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<mercadopago.mercadopago/models/default-configuration.model.DefaultConfiguration, 'qs'> */
  trait SearchConfiguration[T] extends StObject {
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var idempotency: js.UndefOr[String] = js.undefined
    
    /** Query string params. */
    var qs: T
  }
  object SearchConfiguration {
    
    inline def apply[T](qs: T): SearchConfiguration[T] = {
      val __obj = js.Dynamic.literal(qs = qs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchConfiguration[T]]
    }
    
    extension [Self <: SearchConfiguration[?], T](x: Self & SearchConfiguration[T]) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIdempotency(value: String): Self = StObject.set(x, "idempotency", value.asInstanceOf[js.Any])
      
      inline def setIdempotencyUndefined: Self = StObject.set(x, "idempotency", js.undefined)
      
      inline def setQs(value: T): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    }
  }
}
