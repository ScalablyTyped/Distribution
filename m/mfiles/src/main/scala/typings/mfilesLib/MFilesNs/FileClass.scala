package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.FileClass")
@js.native
class FileClass ()
  extends mfilesLib.IFileClass {
  /* CompleteClass */
  override var DisplayName: java.lang.String = js.native
  /* CompleteClass */
  override val DotAndExtension: java.lang.String = js.native
  /* CompleteClass */
  override val Extension: java.lang.String = js.native
  /* CompleteClass */
  override val FileClass: java.lang.String = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IFileClass = js.native
  /* CompleteClass */
  override def LoadByExtension(Extension: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def LoadByFileClass(Extension: java.lang.String, FileClass: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def SetFileClassInfo(
    DotAndFileExtension: java.lang.String,
    FileClass: java.lang.String,
    FileClassDisplayName: java.lang.String
  ): scala.Unit = js.native
}

