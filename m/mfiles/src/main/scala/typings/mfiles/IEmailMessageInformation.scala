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
    val __obj = js.Dynamic.literal(Cc = Cc.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), From = From.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], InReplyTo = InReplyTo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Sensitivity = Sensitivity.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEmailMessageInformation]
  }
}

