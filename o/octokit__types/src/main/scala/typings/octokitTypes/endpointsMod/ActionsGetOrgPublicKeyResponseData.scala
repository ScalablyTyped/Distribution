package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetOrgPublicKeyResponseData extends StObject {
  
  var key: String
  
  var key_id: String
}
object ActionsGetOrgPublicKeyResponseData {
  
  inline def apply(key: String, key_id: String): ActionsGetOrgPublicKeyResponseData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetOrgPublicKeyResponseData]
  }
  
  extension [Self <: ActionsGetOrgPublicKeyResponseData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
