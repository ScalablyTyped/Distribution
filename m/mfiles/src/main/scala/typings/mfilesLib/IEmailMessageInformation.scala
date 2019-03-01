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
    Clone: js.Function0[IEmailMessageInformation],
    CloneFrom: js.Function1[IEmailMessageInformation, scala.Unit],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cc")(Cc)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("From")(From)
    __obj.updateDynamic("Importance")(Importance)
    __obj.updateDynamic("InReplyTo")(InReplyTo)
    __obj.updateDynamic("MessageID")(MessageID)
    __obj.updateDynamic("Received")(Received)
    __obj.updateDynamic("Sensitivity")(Sensitivity)
    __obj.updateDynamic("Sent")(Sent)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("To")(To)
    __obj.asInstanceOf[IEmailMessageInformation]
  }
}

