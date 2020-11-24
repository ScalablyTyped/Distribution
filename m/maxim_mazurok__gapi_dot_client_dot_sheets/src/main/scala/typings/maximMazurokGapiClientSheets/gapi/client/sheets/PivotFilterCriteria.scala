package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotFilterCriteria extends js.Object {
  
  /**
    * A condition that must be true for values to be shown. (`visibleValues` does not override this -- even if a value is listed there, it is still hidden if it does not meet the
    * condition.) Condition values that refer to ranges in A1-notation are evaluated relative to the pivot table sheet. References are treated absolutely, so are not filled down the pivot
    * table. For example, a condition value of `=A1` on "Pivot Table 1" is treated as `'Pivot Table 1'!$A$1`. The source data of the pivot table can be referenced by column header name.
    * For example, if the source data has columns named "Revenue" and "Cost" and a condition is applied to the "Revenue" column with type `NUMBER_GREATER` and value `=Cost`, then only
    * columns where "Revenue" > "Cost" are included.
    */
  var condition: js.UndefOr[BooleanCondition] = js.native
  
  /**
    * Whether values are visible by default. If true, the visible_values are ignored, all values that meet condition (if specified) are shown. If false, values that are both in
    * visible_values and meet condition are shown.
    */
  var visibleByDefault: js.UndefOr[Boolean] = js.native
  
  /** Values that should be included. Values not listed here are excluded. */
  var visibleValues: js.UndefOr[js.Array[String]] = js.native
}
object PivotFilterCriteria {
  
  @scala.inline
  def apply(): PivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilterCriteria]
  }
  
  @scala.inline
  implicit class PivotFilterCriteriaOps[Self <: PivotFilterCriteria] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: BooleanCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setVisibleByDefault(value: Boolean): Self = this.set("visibleByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleByDefault: Self = this.set("visibleByDefault", js.undefined)
    
    @scala.inline
    def setVisibleValuesVarargs(value: String*): Self = this.set("visibleValues", js.Array(value :_*))
    
    @scala.inline
    def setVisibleValues(value: js.Array[String]): Self = this.set("visibleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleValues: Self = this.set("visibleValues", js.undefined)
  }
}
