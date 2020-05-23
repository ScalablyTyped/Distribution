package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ISourceObjectFile
import typings.mfiles.ISourceObjectFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SourceObjectFiles")
@js.native
class SourceObjectFiles () extends ISourceObjectFiles {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def Add(Index: Double, SourceObjectFile: ISourceObjectFile): Unit = js.native
  /* CompleteClass */
  override def AddEmptyFile(Title: String, Extension: String): ISourceObjectFile = js.native
  /* CompleteClass */
  override def AddFile(Title: String, Extension: String, SourcePath: String): ISourceObjectFile = js.native
  /* CompleteClass */
  override def Item(Index: Double): ISourceObjectFile = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

@JSGlobal("MFiles.SourceObjectFiles")
@js.native
object SourceObjectFiles extends Instantiable0[ISourceObjectFiles]

