package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ISharedFileInfo
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SharedFileInfo")
@js.native
class SharedFileInfo () extends ISharedFileInfo {
  /* CompleteClass */
  override val ChangeTimeUtc: Date = js.native
  /* CompleteClass */
  override val Extension: String = js.native
  /* CompleteClass */
  override val LogicalSize: Double = js.native
  /* CompleteClass */
  override val LogicalSize_32bit: Double = js.native
  /* CompleteClass */
  override val Title: String = js.native
  /* CompleteClass */
  override def Clone(): ISharedFileInfo = js.native
}

@JSGlobal("MFiles.SharedFileInfo")
@js.native
object SharedFileInfo extends Instantiable0[ISharedFileInfo]

