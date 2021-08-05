package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersDeletePublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var key_id: Double
}
object UsersDeletePublicSshKeyForAuthenticatedEndpoint {
  
  inline def apply(key_id: Double): UsersDeletePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeletePublicSshKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: UsersDeletePublicSshKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
