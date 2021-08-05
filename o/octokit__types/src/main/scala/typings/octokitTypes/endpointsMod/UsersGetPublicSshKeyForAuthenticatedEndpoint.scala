package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersGetPublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var key_id: Double
}
object UsersGetPublicSshKeyForAuthenticatedEndpoint {
  
  inline def apply(key_id: Double): UsersGetPublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetPublicSshKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: UsersGetPublicSshKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
