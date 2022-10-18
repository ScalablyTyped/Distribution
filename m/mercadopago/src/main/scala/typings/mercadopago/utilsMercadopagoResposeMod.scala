package typings.mercadopago

import typings.mercadopago.sharedTypesMod.CallbackFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMercadopagoResposeMod {
  
  @JSImport("mercadopago/utils/mercadopago-respose", "MercadoPagoResponse")
  @js.native
  open class MercadoPagoResponse[K] () extends StObject {
    
    var body: Any = js.native
    
    /** Get exec options */
    def getExecOptions(): K = js.native
    
    /** Check if it has a next page */
    def hasNext(): Boolean = js.native
    
    /** Check if it has a previous page */
    def hasPrev(): Boolean = js.native
    
    var idempotency: String = js.native
    
    /** Execute next page request */
    def next(callback: CallbackFunction): MercadoPagoResponse[K] = js.native
    
    var pagination: Any = js.native
    
    /** Execute previous page request */
    def prev(callback: CallbackFunction): MercadoPagoResponse[K] = js.native
    
    var response: Any = js.native
    
    var status: Double = js.native
  }
  
  trait ExecOptions[K, P] extends StObject {
    
    var access_token: String
    
    var base_url: String
    
    /** Configurations object */
    var config: K
    
    var corporationId: String
    
    /** If needs the idempotency header */
    var idempotency: Boolean
    
    var integratorId: String
    
    var method: String
    
    var path: String
    
    /** Payload to send */
    var payload: P
    
    var platformId: String
    
    var schema: Any
  }
  object ExecOptions {
    
    inline def apply[K, P](
      access_token: String,
      base_url: String,
      config: K,
      corporationId: String,
      idempotency: Boolean,
      integratorId: String,
      method: String,
      path: String,
      payload: P,
      platformId: String,
      schema: Any
    ): ExecOptions[K, P] = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], base_url = base_url.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], corporationId = corporationId.asInstanceOf[js.Any], idempotency = idempotency.asInstanceOf[js.Any], integratorId = integratorId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], platformId = platformId.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecOptions[K, P]]
    }
    
    extension [Self <: ExecOptions[?, ?], K, P](x: Self & (ExecOptions[K, P])) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setBase_url(value: String): Self = StObject.set(x, "base_url", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: K): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCorporationId(value: String): Self = StObject.set(x, "corporationId", value.asInstanceOf[js.Any])
      
      inline def setIdempotency(value: Boolean): Self = StObject.set(x, "idempotency", value.asInstanceOf[js.Any])
      
      inline def setIntegratorId(value: String): Self = StObject.set(x, "integratorId", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: P): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPlatformId(value: String): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pagination extends StObject {
    
    var limit: Double
    
    var offset: Double
    
    var total: Double
  }
  object Pagination {
    
    inline def apply(limit: Double, offset: Double, total: Double): Pagination = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pagination]
    }
    
    extension [Self <: Pagination](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
