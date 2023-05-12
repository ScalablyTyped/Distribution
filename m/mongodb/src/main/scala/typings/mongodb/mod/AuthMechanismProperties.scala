package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.mongodbStrings.aws
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthMechanismProperties
  extends StObject
     with Document {
  
  /** @experimental */
  var ALLOWED_HOSTS: js.UndefOr[js.Array[String]] = js.undefined
  
  var AWS_SESSION_TOKEN: js.UndefOr[String] = js.undefined
  
  var CANONICALIZE_HOST_NAME: js.UndefOr[GSSAPICanonicalizationValue] = js.undefined
  
  /** @experimental */
  var PROVIDER_NAME: js.UndefOr[aws] = js.undefined
  
  /** @experimental */
  var REFRESH_TOKEN_CALLBACK: js.UndefOr[OIDCRefreshFunction] = js.undefined
  
  /** @experimental */
  var REQUEST_TOKEN_CALLBACK: js.UndefOr[OIDCRequestFunction] = js.undefined
  
  var SERVICE_HOST: js.UndefOr[String] = js.undefined
  
  var SERVICE_NAME: js.UndefOr[String] = js.undefined
  
  var SERVICE_REALM: js.UndefOr[String] = js.undefined
}
object AuthMechanismProperties {
  
  inline def apply(): AuthMechanismProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthMechanismProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthMechanismProperties] (val x: Self) extends AnyVal {
    
    inline def setALLOWED_HOSTS(value: js.Array[String]): Self = StObject.set(x, "ALLOWED_HOSTS", value.asInstanceOf[js.Any])
    
    inline def setALLOWED_HOSTSUndefined: Self = StObject.set(x, "ALLOWED_HOSTS", js.undefined)
    
    inline def setALLOWED_HOSTSVarargs(value: String*): Self = StObject.set(x, "ALLOWED_HOSTS", js.Array(value*))
    
    inline def setAWS_SESSION_TOKEN(value: String): Self = StObject.set(x, "AWS_SESSION_TOKEN", value.asInstanceOf[js.Any])
    
    inline def setAWS_SESSION_TOKENUndefined: Self = StObject.set(x, "AWS_SESSION_TOKEN", js.undefined)
    
    inline def setCANONICALIZE_HOST_NAME(value: GSSAPICanonicalizationValue): Self = StObject.set(x, "CANONICALIZE_HOST_NAME", value.asInstanceOf[js.Any])
    
    inline def setCANONICALIZE_HOST_NAMEUndefined: Self = StObject.set(x, "CANONICALIZE_HOST_NAME", js.undefined)
    
    inline def setPROVIDER_NAME(value: aws): Self = StObject.set(x, "PROVIDER_NAME", value.asInstanceOf[js.Any])
    
    inline def setPROVIDER_NAMEUndefined: Self = StObject.set(x, "PROVIDER_NAME", js.undefined)
    
    inline def setREFRESH_TOKEN_CALLBACK(
      value: (/* info */ IdPServerInfo, /* context */ OIDCCallbackContext) => js.Promise[IdPServerResponse]
    ): Self = StObject.set(x, "REFRESH_TOKEN_CALLBACK", js.Any.fromFunction2(value))
    
    inline def setREFRESH_TOKEN_CALLBACKUndefined: Self = StObject.set(x, "REFRESH_TOKEN_CALLBACK", js.undefined)
    
    inline def setREQUEST_TOKEN_CALLBACK(
      value: (/* info */ IdPServerInfo, /* context */ OIDCCallbackContext) => js.Promise[IdPServerResponse]
    ): Self = StObject.set(x, "REQUEST_TOKEN_CALLBACK", js.Any.fromFunction2(value))
    
    inline def setREQUEST_TOKEN_CALLBACKUndefined: Self = StObject.set(x, "REQUEST_TOKEN_CALLBACK", js.undefined)
    
    inline def setSERVICE_HOST(value: String): Self = StObject.set(x, "SERVICE_HOST", value.asInstanceOf[js.Any])
    
    inline def setSERVICE_HOSTUndefined: Self = StObject.set(x, "SERVICE_HOST", js.undefined)
    
    inline def setSERVICE_NAME(value: String): Self = StObject.set(x, "SERVICE_NAME", value.asInstanceOf[js.Any])
    
    inline def setSERVICE_NAMEUndefined: Self = StObject.set(x, "SERVICE_NAME", js.undefined)
    
    inline def setSERVICE_REALM(value: String): Self = StObject.set(x, "SERVICE_REALM", value.asInstanceOf[js.Any])
    
    inline def setSERVICE_REALMUndefined: Self = StObject.set(x, "SERVICE_REALM", js.undefined)
  }
}
