package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthMechanismProperties
  extends StObject
     with Document {
  
  var AWS_SESSION_TOKEN: js.UndefOr[String] = js.undefined
  
  var CANONICALIZE_HOST_NAME: js.UndefOr[GSSAPICanonicalizationValue] = js.undefined
  
  var SERVICE_HOST: js.UndefOr[String] = js.undefined
  
  var SERVICE_NAME: js.UndefOr[String] = js.undefined
  
  var SERVICE_REALM: js.UndefOr[String] = js.undefined
}
object AuthMechanismProperties {
  
  inline def apply(): AuthMechanismProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthMechanismProperties]
  }
  
  extension [Self <: AuthMechanismProperties](x: Self) {
    
    inline def setAWS_SESSION_TOKEN(value: String): Self = StObject.set(x, "AWS_SESSION_TOKEN", value.asInstanceOf[js.Any])
    
    inline def setAWS_SESSION_TOKENUndefined: Self = StObject.set(x, "AWS_SESSION_TOKEN", js.undefined)
    
    inline def setCANONICALIZE_HOST_NAME(value: GSSAPICanonicalizationValue): Self = StObject.set(x, "CANONICALIZE_HOST_NAME", value.asInstanceOf[js.Any])
    
    inline def setCANONICALIZE_HOST_NAMEUndefined: Self = StObject.set(x, "CANONICALIZE_HOST_NAME", js.undefined)
    
    inline def setSERVICE_HOST(value: String): Self = StObject.set(x, "SERVICE_HOST", value.asInstanceOf[js.Any])
    
    inline def setSERVICE_HOSTUndefined: Self = StObject.set(x, "SERVICE_HOST", js.undefined)
    
    inline def setSERVICE_NAME(value: String): Self = StObject.set(x, "SERVICE_NAME", value.asInstanceOf[js.Any])
    
    inline def setSERVICE_NAMEUndefined: Self = StObject.set(x, "SERVICE_NAME", js.undefined)
    
    inline def setSERVICE_REALM(value: String): Self = StObject.set(x, "SERVICE_REALM", value.asInstanceOf[js.Any])
    
    inline def setSERVICE_REALMUndefined: Self = StObject.set(x, "SERVICE_REALM", js.undefined)
  }
}
