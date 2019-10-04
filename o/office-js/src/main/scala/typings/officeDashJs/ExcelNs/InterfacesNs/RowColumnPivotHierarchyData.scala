package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rowColumnPivotHierarchy.toJSON()`. */
trait RowColumnPivotHierarchyData extends js.Object {
  /**
    *
    * Returns the PivotFields associated with the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var fields: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
  /**
    *
    * Id of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Name of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Position of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.undefined
}

object RowColumnPivotHierarchyData {
  @scala.inline
  def apply(
    fields: js.Array[PivotFieldData] = null,
    id: String = null,
    name: String = null,
    position: Int | Double = null
  ): RowColumnPivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowColumnPivotHierarchyData]
  }
}

