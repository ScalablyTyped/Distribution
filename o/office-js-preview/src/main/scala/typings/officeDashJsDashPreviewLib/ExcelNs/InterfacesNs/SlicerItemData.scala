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
    * True if the slicer item is selected.
    Setting this value will not clear other SlicerItems' selected state.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
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

object SlicerItemData {
  @scala.inline
  def apply(
    hasData: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    name: java.lang.String = null
  ): SlicerItemData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasData)) __obj.updateDynamic("hasData")(hasData)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SlicerItemData]
  }
}

