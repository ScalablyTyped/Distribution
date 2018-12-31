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

