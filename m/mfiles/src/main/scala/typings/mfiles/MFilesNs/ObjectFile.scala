package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IFileVer
import typings.mfiles.IObjectFile
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjectFile")
@js.native
class ObjectFile () extends IObjectFile {
  /* CompleteClass */
  override val ChangeTimeUtc: Date = js.native
  /* CompleteClass */
  override val CreationTimeUtc: Date = js.native
  /* CompleteClass */
  override val Extension: String = js.native
  /* CompleteClass */
  override val FileGUID: String = js.native
  /* CompleteClass */
  override val FileVer: IFileVer = js.native
  /* CompleteClass */
  override val ID: Double = js.native
  /* CompleteClass */
  override val LastAccessTimeUtc: Date = js.native
  /* CompleteClass */
  override val LastWriteTimeUtc: Date = js.native
  /* CompleteClass */
  override val LogicalSize: Double = js.native
  /* CompleteClass */
  override val LogicalSize_32bit: Double = js.native
  /* CompleteClass */
  override val Title: String = js.native
  /* CompleteClass */
  override val Version: Double = js.native
  /* CompleteClass */
  override def GetNameForFileSystem(): String = js.native
  /* CompleteClass */
  override def ToJSON(): String = js.native
}

@JSGlobal("MFiles.ObjectFile")
@js.native
object ObjectFile extends Instantiable0[IObjectFile]

