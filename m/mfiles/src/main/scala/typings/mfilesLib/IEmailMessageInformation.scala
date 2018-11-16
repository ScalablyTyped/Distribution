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

