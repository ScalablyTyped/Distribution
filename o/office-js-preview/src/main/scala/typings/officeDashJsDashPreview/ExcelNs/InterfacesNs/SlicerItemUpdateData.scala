package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SlicerItem object, for use in "slicerItem.set({ ... })". */
trait SlicerItemUpdateData extends js.Object {
  /**
    *
    * True if the slicer item is selected.
    Setting this value will not clear other SlicerItems' selected state.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object SlicerItemUpdateData {
  @scala.inline
  def apply(isSelected: js.UndefOr[Boolean] = js.undefined): SlicerItemUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[SlicerItemUpdateData]
  }
}

