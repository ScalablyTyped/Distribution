package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateWebhookParamsConfig extends StObject {
  
  var content_type: js.UndefOr[String] = js.undefined
  
  var insecure_ssl: js.UndefOr[String] = js.undefined
  
  var secret: js.UndefOr[String] = js.undefined
  
  var url: String
}
object ReposCreateWebhookParamsConfig {
  
  inline def apply(url: String): ReposCreateWebhookParamsConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateWebhookParamsConfig]
  }
  
  extension [Self <: ReposCreateWebhookParamsConfig](x: Self) {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setInsecure_ssl(value: String): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    inline def setInsecure_sslUndefined: Self = StObject.set(x, "insecure_ssl", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
