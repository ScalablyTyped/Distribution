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
    Clear: js.Function0[scala.Unit],
    EmailMessage: IEmailMessageInformation,
    ExtractFromFile: js.Function1[java.lang.String, scala.Unit],
    FileType: mfilesLib.MFilesNs.MFFileInformationType
  ): IFileInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clear")(Clear)
    __obj.updateDynamic("EmailMessage")(EmailMessage)
    __obj.updateDynamic("ExtractFromFile")(ExtractFromFile)
    __obj.updateDynamic("FileType")(FileType)
    __obj.asInstanceOf[IFileInformation]
  }
}

