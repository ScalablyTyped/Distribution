package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.RangeValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `namedItemArrayValues.toJSON()`. */
@js.native
trait NamedItemArrayValuesData extends js.Object {
  /**
    *
    * Represents the types for each item in the named item array
    *
    * [Api set: ExcelApi 1.7]
    */
  var types: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.native
  /**
    *
    * Represents the values of each item in the named item array.
    *
    * [Api set: ExcelApi 1.7]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object NamedItemArrayValuesData {
  @scala.inline
  def apply(): NamedItemArrayValuesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemArrayValuesData]
  }
  @scala.inline
  implicit class NamedItemArrayValuesDataOps[Self <: NamedItemArrayValuesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTypesVarargs(value: js.Array[RangeValueType]*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[js.Array[RangeValueType]]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

