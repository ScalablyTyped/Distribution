package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceApprovalPrompt extends StObject {
  
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
  implicit class ForceApprovalPromptMutableBuilder[Self <: ForceApprovalPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceApprovalPrompt(value: js.Object): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
    
    @scala.inline
    def setPasswordSignupFields(value: String): Self = StObject.set(x, "passwordSignupFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordSignupFieldsUndefined: Self = StObject.set(x, "passwordSignupFields", js.undefined)
    
    @scala.inline
    def setRequestOfflineToken(value: js.Object): Self = StObject.set(x, "requestOfflineToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOfflineTokenUndefined: Self = StObject.set(x, "requestOfflineToken", js.undefined)
    
    @scala.inline
    def setRequestPermissions(value: js.Object): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
  }
}
