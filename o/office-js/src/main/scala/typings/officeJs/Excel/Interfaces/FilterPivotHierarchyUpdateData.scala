package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the FilterPivotHierarchy object, for use in `filterPivotHierarchy.set({ ... })`. */
trait FilterPivotHierarchyUpdateData extends js.Object {
  /**
    *
    * Determines whether to allow multiple filter items.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableMultipleFilterItems: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Name of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Position of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.undefined
}

object FilterPivotHierarchyUpdateData {
  @scala.inline
  def apply(
    enableMultipleFilterItems: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    position: js.UndefOr[Double] = js.undefined
  ): FilterPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableMultipleFilterItems)) __obj.updateDynamic("enableMultipleFilterItems")(enableMultipleFilterItems.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPivotHierarchyUpdateData]
  }
}

