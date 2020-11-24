package typings.meteor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailTemplates extends js.Object {
  
  var enrollAccount: EmailFields = js.native
  
  var from: String = js.native
  
  var headers: js.UndefOr[Header] = js.native
  
  var resetPassword: EmailFields = js.native
  
  var siteName: String = js.native
  
  var verifyEmail: EmailFields = js.native
}
object EmailTemplates {
  
  @scala.inline
  def apply(
    enrollAccount: EmailFields,
    from: String,
    resetPassword: EmailFields,
    siteName: String,
    verifyEmail: EmailFields
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplates]
  }
  
  @scala.inline
  implicit class EmailTemplatesOps[Self <: EmailTemplates] (val x: Self) extends AnyVal {
    
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
    def setEnrollAccount(value: EmailFields): Self = this.set("enrollAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetPassword(value: EmailFields): Self = this.set("resetPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteName(value: String): Self = this.set("siteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyEmail(value: EmailFields): Self = this.set("verifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Header): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
}
