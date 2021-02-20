package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersDeleteGpgKeyForAuthenticatedEndpoint extends StObject {
  
  var gpg_key_id: Double = js.native
}
object UsersDeleteGpgKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(gpg_key_id: Double): UsersDeleteGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeleteGpgKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersDeleteGpgKeyForAuthenticatedEndpointMutableBuilder[Self <: UsersDeleteGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGpg_key_id(value: Double): Self = StObject.set(x, "gpg_key_id", value.asInstanceOf[js.Any])
  }
}
