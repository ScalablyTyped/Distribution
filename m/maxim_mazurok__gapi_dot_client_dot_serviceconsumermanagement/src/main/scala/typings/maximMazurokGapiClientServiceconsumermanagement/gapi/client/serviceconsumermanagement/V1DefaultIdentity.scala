package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1DefaultIdentity extends js.Object {
  
  /** The email address of the default identity. */
  var email: js.UndefOr[String] = js.native
  
  /** Default identity resource name. An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/defaultIdentity` */
  var name: js.UndefOr[String] = js.native
  
  /** The unique and stable id of the default identity. */
  var uniqueId: js.UndefOr[String] = js.native
}
object V1DefaultIdentity {
  
  @scala.inline
  def apply(): V1DefaultIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1DefaultIdentity]
  }
  
  @scala.inline
  implicit class V1DefaultIdentityOps[Self <: V1DefaultIdentity] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUniqueId(value: String): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
}
