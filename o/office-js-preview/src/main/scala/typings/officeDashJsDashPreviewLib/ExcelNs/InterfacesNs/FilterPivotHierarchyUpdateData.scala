package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the FilterPivotHierarchy object, for use in "filterPivotHierarchy.set({ ... })". */
trait FilterPivotHierarchyUpdateData extends js.Object {
  /**
    *
    * Determines whether to allow multiple filter items.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableMultipleFilterItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Name of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Position of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[scala.Double] = js.undefined
}

object FilterPivotHierarchyUpdateData {
  @scala.inline
  def apply(
    enableMultipleFilterItems: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    position: scala.Int | scala.Double = null
  ): FilterPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableMultipleFilterItems)) __obj.updateDynamic("enableMultipleFilterItems")(enableMultipleFilterItems)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPivotHierarchyUpdateData]
  }
}

