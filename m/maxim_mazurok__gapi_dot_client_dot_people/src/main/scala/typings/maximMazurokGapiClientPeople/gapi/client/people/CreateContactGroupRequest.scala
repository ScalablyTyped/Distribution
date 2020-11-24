package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactGroupRequest extends js.Object {
  
  /** Required. The contact group to create. */
  var contactGroup: js.UndefOr[ContactGroup] = js.native
}
object CreateContactGroupRequest {
  
  @scala.inline
  def apply(): CreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactGroupRequest]
  }
  
  @scala.inline
  implicit class CreateContactGroupRequestOps[Self <: CreateContactGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setContactGroup(value: ContactGroup): Self = this.set("contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroup: Self = this.set("contactGroup", js.undefined)
  }
}
