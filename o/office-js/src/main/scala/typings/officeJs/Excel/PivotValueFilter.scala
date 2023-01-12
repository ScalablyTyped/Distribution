package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Between
import typings.officeJs.officeJsStrings.BottomN
import typings.officeJs.officeJsStrings.Equals
import typings.officeJs.officeJsStrings.GreaterThan
import typings.officeJs.officeJsStrings.GreaterThanOrEqualTo
import typings.officeJs.officeJsStrings.Items
import typings.officeJs.officeJsStrings.LessThan
import typings.officeJs.officeJsStrings.LessThanOrEqualTo
import typings.officeJs.officeJsStrings.Percent
import typings.officeJs.officeJsStrings.Sum
import typings.officeJs.officeJsStrings.TopN
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurable template for a value filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait PivotValueFilter extends StObject {
  
  /**
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    For example, if comparator is "50" and condition is "greaterThan", all item values that are not greater than 50 will be removed by the filter.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var comparator: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var condition: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN
  
  /**
    * If `true`, filter *excludes* items that meet criteria. The default is `false` (filter to include items that meet criteria).
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The lower-bound of the range for the `between` filter condition.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var lowerBound: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the filter is for the top/bottom N items, top/bottom N percent, or top/bottom N sum.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var selectionType: js.UndefOr[TopBottomSelectionType | Items | Percent | Sum] = js.undefined
  
  /**
    * The "N" threshold number of items, percent, or sum to be filtered for a top/bottom filter condition.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var threshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The upper-bound of the range for the `between` filter condition.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var upperBound: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the chosen "value" in the field by which to filter.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var value: String
}
object PivotValueFilter {
  
  inline def apply(
    condition: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN,
    value: String
  ): PivotValueFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotValueFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotValueFilter] (val x: Self) extends AnyVal {
    
    inline def setComparator(value: Double): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setCondition(
      value: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setLowerBound(value: Double): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    inline def setSelectionType(value: TopBottomSelectionType | Items | Percent | Sum): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
    
    inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setUpperBound(value: Double): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
