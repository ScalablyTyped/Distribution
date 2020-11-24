package typings.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationRequired extends js.Object {
  
  var authenticationRequired: js.UndefOr[Boolean] = js.native
  
  var destructive: js.UndefOr[Boolean] = js.native
  
  var foreground: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var identifier: js.UndefOr[String] = js.native
  
  var moRequired: js.UndefOr[Boolean] = js.native
  
  var textInputActionButtonTitle: js.UndefOr[String] = js.native
  
  var textInputPlaceholder: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object AuthenticationRequired {
  
  @scala.inline
  def apply(): AuthenticationRequired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationRequired]
  }
  
  @scala.inline
  implicit class AuthenticationRequiredOps[Self <: AuthenticationRequired] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationRequired(value: Boolean): Self = this.set("authenticationRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationRequired: Self = this.set("authenticationRequired", js.undefined)
    
    @scala.inline
    def setDestructive(value: Boolean): Self = this.set("destructive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestructive: Self = this.set("destructive", js.undefined)
    
    @scala.inline
    def setForeground(value: Boolean): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setMoRequired(value: Boolean): Self = this.set("moRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoRequired: Self = this.set("moRequired", js.undefined)
    
    @scala.inline
    def setTextInputActionButtonTitle(value: String): Self = this.set("textInputActionButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInputActionButtonTitle: Self = this.set("textInputActionButtonTitle", js.undefined)
    
    @scala.inline
    def setTextInputPlaceholder(value: String): Self = this.set("textInputPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInputPlaceholder: Self = this.set("textInputPlaceholder", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
