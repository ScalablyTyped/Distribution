package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotItem.toJSON()". */
trait PivotItemData extends js.Object {
  /**
    *
    * Id of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
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

object PivotItemData {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PivotItemData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PivotItemData]
  }
}

