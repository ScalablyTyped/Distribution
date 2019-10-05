package typings.mfiles

import typings.mfiles.MFiles.MFEmailImportance
import typings.mfiles.MFiles.MFEmailSensitivity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmailMessageInformation extends js.Object {
  var Cc: IStrings
  var From: String
  var Importance: MFEmailImportance
  var InReplyTo: String
  var MessageID: String
  var Received: ITimestamp
  var Sensitivity: MFEmailSensitivity
  var Sent: ITimestamp
  var Subject: String
  var To: IStrings
  def Clone(): IEmailMessageInformation
  def CloneFrom(EmailMessageInformation: IEmailMessageInformation): Unit
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
    val __obj = js.Dynamic.literal(Cc = Cc, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), From = From, Importance = Importance, InReplyTo = InReplyTo, MessageID = MessageID, Received = Received, Sensitivity = Sensitivity, Sent = Sent, Subject = Subject, To = To)
  
    __obj.asInstanceOf[IEmailMessageInformation]
  }
}

