package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailTemplate extends js.Object {
  
  /** Email body. */
  var body: js.UndefOr[String] = js.native
  
  /** Email body format. */
  var format: js.UndefOr[String] = js.native
  
  /** From address of the email. */
  var from: js.UndefOr[String] = js.native
  
  /** From display name. */
  var fromDisplayName: js.UndefOr[String] = js.native
  
  /** Reply-to address. */
  var replyTo: js.UndefOr[String] = js.native
  
  /** Subject of the email. */
  var subject: js.UndefOr[String] = js.native
}
object EmailTemplate {
  
  @scala.inline
  def apply(): EmailTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplate]
  }
  
  @scala.inline
  implicit class EmailTemplateOps[Self <: EmailTemplate] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setFromDisplayName(value: String): Self = this.set("fromDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromDisplayName: Self = this.set("fromDisplayName", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
