package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "filterPivotHierarchy.toJSON()". */
trait FilterPivotHierarchyData extends js.Object {
  /**
    *
    * Determines whether to allow multiple filter items.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableMultipleFilterItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the PivotFields associated with the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var fields: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
  /**
    *
    * Id of the FilterPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
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

object FilterPivotHierarchyData {
  @scala.inline
  def apply(
    enableMultipleFilterItems: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Array[PivotFieldData] = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    position: scala.Int | scala.Double = null
  ): FilterPivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableMultipleFilterItems)) __obj.updateDynamic("enableMultipleFilterItems")(enableMultipleFilterItems)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPivotHierarchyData]
  }
}

