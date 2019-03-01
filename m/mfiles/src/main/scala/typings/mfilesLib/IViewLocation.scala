package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewLocation extends js.Object {
  var OverlappedFolder: ITypedValue
  var Overlapping: scala.Boolean
  var ParentFolder: IFolderDefs
  def Clone(): IViewLocation
}

object IViewLocation {
  @scala.inline
  def apply(
    Clone: js.Function0[IViewLocation],
    OverlappedFolder: ITypedValue,
    Overlapping: scala.Boolean,
    ParentFolder: IFolderDefs
  ): IViewLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("OverlappedFolder")(OverlappedFolder)
    __obj.updateDynamic("Overlapping")(Overlapping)
    __obj.updateDynamic("ParentFolder")(ParentFolder)
    __obj.asInstanceOf[IViewLocation]
  }
}

