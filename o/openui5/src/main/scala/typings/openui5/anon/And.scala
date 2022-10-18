package typings.openui5.anon

import typings.openui5.sapUiModelFilterOperatorMod.FilterOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait And extends StObject {
  
  /**
    * Indicates whether an "AND" logical conjunction is applied on the filters. If it's not set or set to `false`,
    * an "OR" conjunction is applied.
    */
  var and: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a string value should be compared case sensitive or not. The handling of `undefined`
    * depends on the model implementation.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function used to compare two values for equality and order during client-side filtering. Two values are
    * given as parameters. The function is expected to return:
    * 	a negative number if the first value is smaller than the second value, `0` if the two values are
    * equal, a positive number if the first value is larger than the second value, `NaN` for non-comparable
    * values.  If no function is given, {@link sap.ui.model.Filter.defaultComparator} is used.
    */
  var comparator: js.UndefOr[js.Function2[/* p1 */ Any, /* p2 */ Any, Double]] = js.undefined
  
  /**
    * A filter instance which will be used as the condition for lambda operators ({@link sap.ui.model.FilterOperator.Any
    * "Any"} and {@link sap.ui.model.FilterOperator.All "All"})
    */
  var condition: js.UndefOr[typings.openui5.sapUiModelFilterMod.Filter] = js.undefined
  
  /**
    * An array of filters on which the logical conjunction is applied
    */
  var filters: js.UndefOr[js.Array[typings.openui5.sapUiModelFilterMod.Filter]] = js.undefined
  
  /**
    * Operator used for the filter
    */
  var operator: js.UndefOr[
    FilterOperator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String)
  ] = js.undefined
  
  /**
    * Binding path for this filter
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Function used for the client-side filtering of items. It should return a Boolean indicating whether the
    * current item passes the filter. If no test function is given, a default test function is used, based
    * on the given filter operator and the comparator function.
    */
  var test: js.UndefOr[js.Function1[/* p1 */ Any, Boolean]] = js.undefined
  
  /**
    * First value to use with the given filter operator
    */
  var value1: js.UndefOr[Any] = js.undefined
  
  /**
    * Second value to use with the given filter operator, used only for the {@link sap.ui.model.FilterOperator.BT
    * "BT" between} and {@link sap.ui.model.FilterOperator.NB "NB" not between} filter operators
    */
  var value2: js.UndefOr[Any] = js.undefined
  
  /**
    * The variable name used in lambda operators ({@link sap.ui.model.FilterOperator.Any "Any"} and {@link
    * sap.ui.model.FilterOperator.All "All"})
    */
  var variable: js.UndefOr[String] = js.undefined
}
object And {
  
  inline def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  
  extension [Self <: And](x: Self) {
    
    inline def setAnd(value: Boolean): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setComparator(value: (/* p1 */ Any, /* p2 */ Any) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setCondition(value: typings.openui5.sapUiModelFilterMod.Filter): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setFilters(value: js.Array[typings.openui5.sapUiModelFilterMod.Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: typings.openui5.sapUiModelFilterMod.Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setOperator(
      value: FilterOperator | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String)
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTest(value: /* p1 */ Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setValue1(value: Any): Self = StObject.set(x, "value1", value.asInstanceOf[js.Any])
    
    inline def setValue1Undefined: Self = StObject.set(x, "value1", js.undefined)
    
    inline def setValue2(value: Any): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
    
    inline def setValue2Undefined: Self = StObject.set(x, "value2", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
