package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInformation extends js.Object {
  var EmailMessage: IEmailMessageInformation
  var FileType: mfilesLib.MFilesNs.MFFileInformationType
  def Clear(): scala.Unit
  def ExtractFromFile(PathToFile: java.lang.String): scala.Unit
}

object IFileInformation {
  @scala.inline
  def apply(
    Clear: () => scala.Unit,
    EmailMessage: IEmailMessageInformation,
    ExtractFromFile: java.lang.String => scala.Unit,
    FileType: mfilesLib.MFilesNs.MFFileInformationType
  ): IFileInformation = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), EmailMessage = EmailMessage, ExtractFromFile = js.Any.fromFunction1(ExtractFromFile), FileType = FileType)
  
    __obj.asInstanceOf[IFileInformation]
  }
}

