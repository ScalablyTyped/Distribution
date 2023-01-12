package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceApprovalPrompt extends StObject {
  
  var forceApprovalPrompt: js.UndefOr[js.Object] = js.undefined
  
  var passwordSignupFields: js.UndefOr[String] = js.undefined
  
  var requestOfflineToken: js.UndefOr[js.Object] = js.undefined
  
  var requestPermissions: js.UndefOr[js.Object] = js.undefined
}
object ForceApprovalPrompt {
  
  inline def apply(): ForceApprovalPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceApprovalPrompt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceApprovalPrompt] (val x: Self) extends AnyVal {
    
    inline def setForceApprovalPrompt(value: js.Object): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
    
    inline def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
    
    inline def setPasswordSignupFields(value: String): Self = StObject.set(x, "passwordSignupFields", value.asInstanceOf[js.Any])
    
    inline def setPasswordSignupFieldsUndefined: Self = StObject.set(x, "passwordSignupFields", js.undefined)
    
    inline def setRequestOfflineToken(value: js.Object): Self = StObject.set(x, "requestOfflineToken", value.asInstanceOf[js.Any])
    
    inline def setRequestOfflineTokenUndefined: Self = StObject.set(x, "requestOfflineToken", js.undefined)
    
    inline def setRequestPermissions(value: js.Object): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
    
    inline def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
  }
}
