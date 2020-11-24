package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceApprovalPrompt extends js.Object {
  
  var forceApprovalPrompt: js.UndefOr[js.Object] = js.native
  
  var passwordSignupFields: js.UndefOr[String] = js.native
  
  var requestOfflineToken: js.UndefOr[js.Object] = js.native
  
  var requestPermissions: js.UndefOr[js.Object] = js.native
}
object ForceApprovalPrompt {
  
  @scala.inline
  def apply(): ForceApprovalPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceApprovalPrompt]
  }
  
  @scala.inline
  implicit class ForceApprovalPromptOps[Self <: ForceApprovalPrompt] (val x: Self) extends AnyVal {
    
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
    def setForceApprovalPrompt(value: js.Object): Self = this.set("forceApprovalPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceApprovalPrompt: Self = this.set("forceApprovalPrompt", js.undefined)
    
    @scala.inline
    def setPasswordSignupFields(value: String): Self = this.set("passwordSignupFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordSignupFields: Self = this.set("passwordSignupFields", js.undefined)
    
    @scala.inline
    def setRequestOfflineToken(value: js.Object): Self = this.set("requestOfflineToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOfflineToken: Self = this.set("requestOfflineToken", js.undefined)
    
    @scala.inline
    def setRequestPermissions(value: js.Object): Self = this.set("requestPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPermissions: Self = this.set("requestPermissions", js.undefined)
  }
}
