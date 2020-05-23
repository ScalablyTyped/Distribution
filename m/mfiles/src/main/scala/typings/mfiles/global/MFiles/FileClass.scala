package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IFileClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.FileClass")
@js.native
class FileClass () extends IFileClass {
  /* CompleteClass */
  override var DisplayName: String = js.native
  /* CompleteClass */
  override val DotAndExtension: String = js.native
  /* CompleteClass */
  override val Extension: String = js.native
  /* CompleteClass */
  override val FileClass: String = js.native
  /* CompleteClass */
  override def Clone(): IFileClass = js.native
  /* CompleteClass */
  override def LoadByExtension(Extension: String): Unit = js.native
  /* CompleteClass */
  override def LoadByFileClass(Extension: String, FileClass: String): Unit = js.native
  /* CompleteClass */
  override def SetFileClassInfo(DotAndFileExtension: String, FileClass: String, FileClassDisplayName: String): Unit = js.native
}

@JSGlobal("MFiles.FileClass")
@js.native
object FileClass extends Instantiable0[IFileClass]

