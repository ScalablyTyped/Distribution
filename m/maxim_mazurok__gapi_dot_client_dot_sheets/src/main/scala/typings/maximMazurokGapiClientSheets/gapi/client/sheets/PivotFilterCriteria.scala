package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotFilterCriteria extends StObject {
  
  /**
    * A condition that must be true for values to be shown. (`visibleValues` does not override this -- even if a value is listed there, it is still hidden if it does not meet the
    * condition.) Condition values that refer to ranges in A1-notation are evaluated relative to the pivot table sheet. References are treated absolutely, so are not filled down the pivot
    * table. For example, a condition value of `=A1` on "Pivot Table 1" is treated as `'Pivot Table 1'!$A$1`. The source data of the pivot table can be referenced by column header name.
    * For example, if the source data has columns named "Revenue" and "Cost" and a condition is applied to the "Revenue" column with type `NUMBER_GREATER` and value `=Cost`, then only
    * columns where "Revenue" > "Cost" are included.
    */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  
  /**
    * Whether values are visible by default. If true, the visible_values are ignored, all values that meet condition (if specified) are shown. If false, values that are both in
    * visible_values and meet condition are shown.
    */
  var visibleByDefault: js.UndefOr[Boolean] = js.undefined
  
  /** Values that should be included. Values not listed here are excluded. */
  var visibleValues: js.UndefOr[js.Array[String]] = js.undefined
}
object PivotFilterCriteria {
  
  @scala.inline
  def apply(): PivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilterCriteria]
  }
  
  @scala.inline
  implicit class PivotFilterCriteriaMutableBuilder[Self <: PivotFilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: BooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setVisibleByDefault(value: Boolean): Self = StObject.set(x, "visibleByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleByDefaultUndefined: Self = StObject.set(x, "visibleByDefault", js.undefined)
    
    @scala.inline
    def setVisibleValues(value: js.Array[String]): Self = StObject.set(x, "visibleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleValuesUndefined: Self = StObject.set(x, "visibleValues", js.undefined)
    
    @scala.inline
    def setVisibleValuesVarargs(value: String*): Self = StObject.set(x, "visibleValues", js.Array(value :_*))
  }
}
