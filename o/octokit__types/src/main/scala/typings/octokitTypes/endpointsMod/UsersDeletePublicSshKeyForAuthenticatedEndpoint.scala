package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersDeletePublicSshKeyForAuthenticatedEndpoint extends js.Object {
  
  var key_id: Double = js.native
}
object UsersDeletePublicSshKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(key_id: Double): UsersDeletePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeletePublicSshKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersDeletePublicSshKeyForAuthenticatedEndpointOps[Self <: UsersDeletePublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setKey_id(value: Double): Self = this.set("key_id", value.asInstanceOf[js.Any])
  }
}
