package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.RangeValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `namedItemArrayValues.toJSON()`. */
trait NamedItemArrayValuesData extends js.Object {
  /**
    *
    * Represents the types for each item in the named item array
    *
    * [Api set: ExcelApi 1.7]
    */
  var types: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.undefined
  /**
    *
    * Represents the values of each item in the named item array.
    *
    * [Api set: ExcelApi 1.7]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object NamedItemArrayValuesData {
  @scala.inline
  def apply(types: js.Array[js.Array[RangeValueType]] = null, values: js.Array[js.Array[_]] = null): NamedItemArrayValuesData = {
    val __obj = js.Dynamic.literal()
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedItemArrayValuesData]
  }
}

