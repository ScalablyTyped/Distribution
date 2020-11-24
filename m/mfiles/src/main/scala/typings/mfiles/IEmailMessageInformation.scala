package typings.mfiles

import typings.mfiles.MFiles.MFEmailImportance
import typings.mfiles.MFiles.MFEmailSensitivity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEmailMessageInformation extends js.Object {
  
  var Cc: IStrings = js.native
  
  def Clone(): IEmailMessageInformation = js.native
  
  def CloneFrom(EmailMessageInformation: IEmailMessageInformation): Unit = js.native
  
  var From: String = js.native
  
  var Importance: MFEmailImportance = js.native
  
  var InReplyTo: String = js.native
  
  var MessageID: String = js.native
  
  var Received: ITimestamp = js.native
  
  var Sensitivity: MFEmailSensitivity = js.native
  
  var Sent: ITimestamp = js.native
  
  var Subject: String = js.native
  
  var To: IStrings = js.native
}
object IEmailMessageInformation {
  
  @scala.inline
  def apply(
    Cc: IStrings,
    Clone: () => IEmailMessageInformation,
    CloneFrom: IEmailMessageInformation => Unit,
    From: String,
    Importance: MFEmailImportance,
    InReplyTo: String,
    MessageID: String,
    Received: ITimestamp,
    Sensitivity: MFEmailSensitivity,
    Sent: ITimestamp,
    Subject: String,
    To: IStrings
  ): IEmailMessageInformation = {
    val __obj = js.Dynamic.literal(Cc = Cc.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), From = From.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], InReplyTo = InReplyTo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Sensitivity = Sensitivity.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEmailMessageInformation]
  }
  
  @scala.inline
  implicit class IEmailMessageInformationOps[Self <: IEmailMessageInformation] (val x: Self) extends AnyVal {
    
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
    def setCc(value: IStrings): Self = this.set("Cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IEmailMessageInformation): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IEmailMessageInformation => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrom(value: String): Self = this.set("From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportance(value: MFEmailImportance): Self = this.set("Importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyTo(value: String): Self = this.set("InReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: String): Self = this.set("MessageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceived(value: ITimestamp): Self = this.set("Received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivity(value: MFEmailSensitivity): Self = this.set("Sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSent(value: ITimestamp): Self = this.set("Sent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: IStrings): Self = this.set("To", value.asInstanceOf[js.Any])
  }
}
