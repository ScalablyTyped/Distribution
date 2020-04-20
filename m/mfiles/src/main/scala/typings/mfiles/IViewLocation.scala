package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewLocation extends js.Object {
  var OverlappedFolder: ITypedValue
  var Overlapping: Boolean
  var ParentFolder: IFolderDefs
  def Clone(): IViewLocation
}

object IViewLocation {
  @scala.inline
  def apply(
    Clone: () => IViewLocation,
    OverlappedFolder: ITypedValue,
    Overlapping: Boolean,
    ParentFolder: IFolderDefs
  ): IViewLocation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OverlappedFolder = OverlappedFolder.asInstanceOf[js.Any], Overlapping = Overlapping.asInstanceOf[js.Any], ParentFolder = ParentFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewLocation]
  }
}

