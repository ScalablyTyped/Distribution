package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "slicerItem.toJSON()". */
trait SlicerItemData extends js.Object {
  /**
    *
    * True if the slicer item has data.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var hasData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if the slicer item is selected. Setting this value will not clear other SlicerItems' selected state.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the unique value representing the slicer item.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the value displayed on UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

