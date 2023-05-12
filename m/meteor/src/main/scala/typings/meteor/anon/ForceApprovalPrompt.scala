package typings.meteor.anon

import typings.meteor.accountsBaseMod.Accounts.PasswordSignupField
import typings.meteor.accountsBaseMod.Accounts.PasswordlessSignupField
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceApprovalPrompt extends StObject {
  
  var forceApprovalPrompt: js.UndefOr[Recordgoogleboolean] = js.undefined
  
  var passwordSignupFields: js.UndefOr[PasswordSignupField | js.Array[PasswordSignupField]] = js.undefined
  
  var passwordlessSignupFields: js.UndefOr[PasswordlessSignupField | js.Array[PasswordlessSignupField]] = js.undefined
  
  var requestOfflineToken: js.UndefOr[Recordgoogleboolean] = js.undefined
  
  var requestPermissions: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
}
object ForceApprovalPrompt {
  
  inline def apply(): ForceApprovalPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceApprovalPrompt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceApprovalPrompt] (val x: Self) extends AnyVal {
    
    inline def setForceApprovalPrompt(value: Recordgoogleboolean): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
    
    inline def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
    
    inline def setPasswordSignupFields(value: PasswordSignupField | js.Array[PasswordSignupField]): Self = StObject.set(x, "passwordSignupFields", value.asInstanceOf[js.Any])
    
    inline def setPasswordSignupFieldsUndefined: Self = StObject.set(x, "passwordSignupFields", js.undefined)
    
    inline def setPasswordSignupFieldsVarargs(value: PasswordSignupField*): Self = StObject.set(x, "passwordSignupFields", js.Array(value*))
    
    inline def setPasswordlessSignupFields(value: PasswordlessSignupField | js.Array[PasswordlessSignupField]): Self = StObject.set(x, "passwordlessSignupFields", value.asInstanceOf[js.Any])
    
    inline def setPasswordlessSignupFieldsUndefined: Self = StObject.set(x, "passwordlessSignupFields", js.undefined)
    
    inline def setPasswordlessSignupFieldsVarargs(value: PasswordlessSignupField*): Self = StObject.set(x, "passwordlessSignupFields", js.Array(value*))
    
    inline def setRequestOfflineToken(value: Recordgoogleboolean): Self = StObject.set(x, "requestOfflineToken", value.asInstanceOf[js.Any])
    
    inline def setRequestOfflineTokenUndefined: Self = StObject.set(x, "requestOfflineToken", js.undefined)
    
    inline def setRequestPermissions(value: Record[String, js.Array[String]]): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
    
    inline def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
  }
}
