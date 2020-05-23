package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IFolderDefs
import typings.mfiles.ITypedValue
import typings.mfiles.IViewLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ViewLocation")
@js.native
class ViewLocation () extends IViewLocation {
  /* CompleteClass */
  override var OverlappedFolder: ITypedValue = js.native
  /* CompleteClass */
  override var Overlapping: Boolean = js.native
  /* CompleteClass */
  override var ParentFolder: IFolderDefs = js.native
  /* CompleteClass */
  override def Clone(): IViewLocation = js.native
}

@JSGlobal("MFiles.ViewLocation")
@js.native
object ViewLocation extends Instantiable0[IViewLocation]

