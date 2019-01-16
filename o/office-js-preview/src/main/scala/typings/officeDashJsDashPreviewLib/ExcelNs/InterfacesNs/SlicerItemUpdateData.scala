package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SlicerItem object, for use in "slicerItem.set({ ... })". */
trait SlicerItemUpdateData extends js.Object {
  /**
    *
    * True if the slicer item is selected. Setting this value will not clear other SlicerItems' selected state.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
}

