package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.EmailMessageInformation")
@js.native
class EmailMessageInformation ()
  extends mfilesLib.IEmailMessageInformation {
  /* CompleteClass */
  override var Cc: mfilesLib.IStrings = js.native
  /* CompleteClass */
  override var From: java.lang.String = js.native
  /* CompleteClass */
  override var Importance: MFEmailImportance = js.native
  /* CompleteClass */
  override var InReplyTo: java.lang.String = js.native
  /* CompleteClass */
  override var MessageID: java.lang.String = js.native
  /* CompleteClass */
  override var Received: mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override var Sensitivity: MFEmailSensitivity = js.native
  /* CompleteClass */
  override var Sent: mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override var Subject: java.lang.String = js.native
  /* CompleteClass */
  override var To: mfilesLib.IStrings = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IEmailMessageInformation = js.native
  /* CompleteClass */
  override def CloneFrom(EmailMessageInformation: mfilesLib.IEmailMessageInformation): scala.Unit = js.native
}

@JSGlobal("MFiles.EmailMessageInformation")
@js.native
object EmailMessageInformation
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IEmailMessageInformation]

