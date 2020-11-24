package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersDeleteGpgKeyForAuthenticatedEndpoint extends js.Object {
  
  var gpg_key_id: Double = js.native
}
object UsersDeleteGpgKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(gpg_key_id: Double): UsersDeleteGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeleteGpgKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersDeleteGpgKeyForAuthenticatedEndpointOps[Self <: UsersDeleteGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGpg_key_id(value: Double): Self = this.set("gpg_key_id", value.asInstanceOf[js.Any])
  }
}
