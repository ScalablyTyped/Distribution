package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmailMessageInformation extends js.Object {
  var Cc: IStrings
  var From: java.lang.String
  var Importance: mfilesLib.MFilesNs.MFEmailImportance
  var InReplyTo: java.lang.String
  var MessageID: java.lang.String
  var Received: ITimestamp
  var Sensitivity: mfilesLib.MFilesNs.MFEmailSensitivity
  var Sent: ITimestamp
  var Subject: java.lang.String
  var To: IStrings
  def Clone(): IEmailMessageInformation
  def CloneFrom(EmailMessageInformation: IEmailMessageInformation): scala.Unit
}

object IEmailMessageInformation {
  @scala.inline
  def apply(
    Cc: IStrings,
    Clone: () => IEmailMessageInformation,
    CloneFrom: IEmailMessageInformation => scala.Unit,
    From: java.lang.String,
    Importance: mfilesLib.MFilesNs.MFEmailImportance,
    InReplyTo: java.lang.String,
    MessageID: java.lang.String,
    Received: ITimestamp,
    Sensitivity: mfilesLib.MFilesNs.MFEmailSensitivity,
    Sent: ITimestamp,
    Subject: java.lang.String,
    To: IStrings
  ): IEmailMessageInformation = {
    val __obj = js.Dynamic.literal(Cc = Cc, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), From = From, Importance = Importance, InReplyTo = InReplyTo, MessageID = MessageID, Received = Received, Sensitivity = Sensitivity, Sent = Sent, Subject = Subject, To = To)
  
    __obj.asInstanceOf[IEmailMessageInformation]
  }
}

