package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IEmailMessageInformation
import typings.mfiles.IStrings
import typings.mfiles.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.EmailMessageInformation")
@js.native
class EmailMessageInformation () extends IEmailMessageInformation {
  /* CompleteClass */
  override var Cc: IStrings = js.native
  /* CompleteClass */
  override var From: String = js.native
  /* CompleteClass */
  override var Importance: MFEmailImportance = js.native
  /* CompleteClass */
  override var InReplyTo: String = js.native
  /* CompleteClass */
  override var MessageID: String = js.native
  /* CompleteClass */
  override var Received: ITimestamp = js.native
  /* CompleteClass */
  override var Sensitivity: MFEmailSensitivity = js.native
  /* CompleteClass */
  override var Sent: ITimestamp = js.native
  /* CompleteClass */
  override var Subject: String = js.native
  /* CompleteClass */
  override var To: IStrings = js.native
  /* CompleteClass */
  override def Clone(): IEmailMessageInformation = js.native
  /* CompleteClass */
  override def CloneFrom(EmailMessageInformation: IEmailMessageInformation): Unit = js.native
}

@JSGlobal("MFiles.EmailMessageInformation")
@js.native
object EmailMessageInformation extends Instantiable0[IEmailMessageInformation]

