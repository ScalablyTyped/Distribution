package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  var identity: typings.openfin.identityMod.Identity
  
  var response: String
  
  var success: Boolean
}
object Identity {
  
  inline def apply(identity: typings.openfin.identityMod.Identity, response: String, success: Boolean): Identity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  extension [Self <: Identity](x: Self) {
    
    inline def setIdentity(value: typings.openfin.identityMod.Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
