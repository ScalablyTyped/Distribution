package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.issue
import typings.octokitTypes.octokitTypesStrings.organization
import typings.octokitTypes.octokitTypesStrings.pull_request
import typings.octokitTypes.octokitTypesStrings.repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersGetContextForUserEndpoint extends js.Object {
  
  /**
    * Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`.
    */
  var subject_id: js.UndefOr[String] = js.native
  
  /**
    * Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`.
    */
  var subject_type: js.UndefOr[organization | repository | issue | pull_request] = js.native
  
  var username: String = js.native
}
object UsersGetContextForUserEndpoint {
  
  @scala.inline
  def apply(username: String): UsersGetContextForUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserEndpoint]
  }
  
  @scala.inline
  implicit class UsersGetContextForUserEndpointOps[Self <: UsersGetContextForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject_id(value: String): Self = this.set("subject_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject_id: Self = this.set("subject_id", js.undefined)
    
    @scala.inline
    def setSubject_type(value: organization | repository | issue | pull_request): Self = this.set("subject_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject_type: Self = this.set("subject_type", js.undefined)
  }
}
