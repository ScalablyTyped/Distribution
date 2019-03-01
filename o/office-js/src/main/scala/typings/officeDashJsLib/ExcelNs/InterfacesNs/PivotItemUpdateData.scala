package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotItem object, for use in "pivotItem.set({ ... })". */
trait PivotItemUpdateData extends js.Object {
  /**
    *
    * Determines whether the item is expanded to show child items or if it's collapsed and child items are hidden.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Name of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Determines whether the PivotItem is visible or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object PivotItemUpdateData {
  @scala.inline
  def apply(
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PivotItemUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PivotItemUpdateData]
  }
}

