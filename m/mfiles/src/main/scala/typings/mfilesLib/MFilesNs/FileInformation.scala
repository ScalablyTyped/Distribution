package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.FileInformation")
@js.native
class FileInformation ()
  extends mfilesLib.IFileInformation {
  /* CompleteClass */
  override var EmailMessage: mfilesLib.IEmailMessageInformation = js.native
  /* CompleteClass */
  override var FileType: MFFileInformationType = js.native
  /* CompleteClass */
  override def Clear(): scala.Unit = js.native
  /* CompleteClass */
  override def ExtractFromFile(PathToFile: java.lang.String): scala.Unit = js.native
}

