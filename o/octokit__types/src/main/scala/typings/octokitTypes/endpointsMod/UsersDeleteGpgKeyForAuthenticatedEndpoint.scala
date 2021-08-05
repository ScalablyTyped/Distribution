package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersDeleteGpgKeyForAuthenticatedEndpoint extends StObject {
  
  var gpg_key_id: Double
}
object UsersDeleteGpgKeyForAuthenticatedEndpoint {
  
  inline def apply(gpg_key_id: Double): UsersDeleteGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeleteGpgKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: UsersDeleteGpgKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setGpg_key_id(value: Double): Self = StObject.set(x, "gpg_key_id", value.asInstanceOf[js.Any])
  }
}
