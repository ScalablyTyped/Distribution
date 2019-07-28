package typings.mfiles

import typings.mfiles.MFilesNs.MFFileInformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInformation extends js.Object {
  var EmailMessage: IEmailMessageInformation
  var FileType: MFFileInformationType
  def Clear(): Unit
  def ExtractFromFile(PathToFile: String): Unit
}

object IFileInformation {
  @scala.inline
  def apply(
    Clear: () => Unit,
    EmailMessage: IEmailMessageInformation,
    ExtractFromFile: String => Unit,
    FileType: MFFileInformationType
  ): IFileInformation = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), EmailMessage = EmailMessage, ExtractFromFile = js.Any.fromFunction1(ExtractFromFile), FileType = FileType)
  
    __obj.asInstanceOf[IFileInformation]
  }
}

