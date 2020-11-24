package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyContactGroupMembersRequest extends js.Object {
  
  /**
    * Optional. The resource names of the contact people to add in the form of `people/{person_id}`. The total number of resource names in `resource_names_to_add` and
    * `resource_names_to_remove` must be less than or equal to 1000.
    */
  var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The resource names of the contact people to remove in the form of `people/{person_id}`. The total number of resource names in `resource_names_to_add` and
    * `resource_names_to_remove` must be less than or equal to 1000.
    */
  var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.native
}
object ModifyContactGroupMembersRequest {
  
  @scala.inline
  def apply(): ModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyContactGroupMembersRequest]
  }
  
  @scala.inline
  implicit class ModifyContactGroupMembersRequestOps[Self <: ModifyContactGroupMembersRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceNamesToAddVarargs(value: String*): Self = this.set("resourceNamesToAdd", js.Array(value :_*))
    
    @scala.inline
    def setResourceNamesToAdd(value: js.Array[String]): Self = this.set("resourceNamesToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceNamesToAdd: Self = this.set("resourceNamesToAdd", js.undefined)
    
    @scala.inline
    def setResourceNamesToRemoveVarargs(value: String*): Self = this.set("resourceNamesToRemove", js.Array(value :_*))
    
    @scala.inline
    def setResourceNamesToRemove(value: js.Array[String]): Self = this.set("resourceNamesToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceNamesToRemove: Self = this.set("resourceNamesToRemove", js.undefined)
  }
}
