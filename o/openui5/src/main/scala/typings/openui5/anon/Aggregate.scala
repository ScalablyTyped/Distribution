package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregate extends StObject {
  
  /**
    * A map from aggregatable property names or aliases to objects containing the following details:
    * 	 `grandTotal`: An optional boolean that tells whether a grand total for this aggregatable property is
    * needed (since 1.59.0); not supported in this case are:
    * 	 filtering by any aggregatable property (since 1.89.0),  "$search" (since 1.93.0),  the `vGroup`
    * parameter of {@link sap.ui.model.Sorter} (since 1.107.0),  shared requests (since 1.108.0).
    *  `subtotals`: An optional boolean that tells whether subtotals for this aggregatable property are
    * needed  `with`: An optional string that provides the name of the method (for example "sum") used
    * for aggregation of this aggregatable property; see "3.1.2 Keyword with".  `name`: An optional string
    * that provides the original aggregatable property name in case a different alias is chosen as the name
    * of the dynamic property used for aggregation of this aggregatable property; see "3.1.1 Keyword as"
    * `unit`: An optional string that provides the name of the custom aggregate for a currency or unit of measure
    * corresponding to this aggregatable property (since 1.86.0). The custom aggregate must return the single
    * value of that unit in case there is only one, or `null` otherwise ("multi-unit situation"). (SQL suggestion:
    * `CASE WHEN MIN(Unit) = MAX(Unit) THEN MIN(Unit) END`)
    */
  var aggregate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The number of initially expanded levels as a positive integer (@experimental as of version 1.105.0),
    * supported only if a `hierarchyQualifier` is given.
    */
  var expandTo: js.UndefOr[Double] = js.undefined
  
  /**
    * Tells whether the grand totals for aggregatable properties are displayed at the bottom only (since 1.86.0);
    * `true` for bottom only, `false` for top and bottom, the default is top only
    */
  var grandTotalAtBottomOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A map from groupable property names to objects containing the following details:
    * 	 `additionally`: An optional list of strings that provides the paths to properties (like texts or attributes)
    * related to this groupable property in a 1:1 relation (since 1.87.0). They are requested additionally
    * via `groupby and must not change the actual grouping; a unit` for an aggregatable property
    * must not be repeated here.
    */
  var group: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A list of groupable property names used to determine group levels. They may, but don't need to, be repeated
    * in `oAggregation.group`. Group levels cannot be combined with:
    * 	 filtering for aggregated properties,  "$search" (since 1.93.0),  the `vGroup` parameter of
    * {@link sap.ui.model.Sorter} (since 1.107.0),  shared requests (since 1.108.0).
    */
  var groupLevels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The qualifier for the pair of "Org.OData.Aggregation.V1.RecursiveHierarchy" and "com.sap.vocabularies.Hierarchy.v1.RecursiveHierarchy"
    * annotations at this binding's entity type (@experimental as of version 1.105.0). If present, a recursive
    * hierarchy without data aggregation is defined, and the only other supported properties are `expandTo`
    * and `search`. A recursive hierarchy cannot be combined with:
    * 	 "$search",  the `vGroup` parameter of {@link sap.ui.model.Sorter} (since 1.107.0),  shared
    * requests (since 1.108.0).
    */
  var hierarchyQualifier: js.UndefOr[String] = js.undefined
  
  /**
    * Like the "5.1.7 System Query Option $search", but applied before data aggregation (since 1.93.0). Note that
    * certain content will break the syntax of the system query option `$apply` and result in an invalid request.
    * If the OData service supports the proposal ODATA-1452,
    * then `ODataUtils.formatLiteral(sSearch, "Edm.String");` should be used to encapsulate the whole search
    * string beforehand (see {@link sap.ui.model.odata.v4.ODataUtils.formatLiteral}).
    */
  var search: js.UndefOr[String] = js.undefined
  
  /**
    * Tells whether subtotals for aggregatable properties are displayed at the bottom only, as a separate row
    * after all children, when a group level node is expanded (since 1.86.0); `true` for bottom only, `false`
    * for top and bottom, the default is top only (that is, as part of the group level node)
    */
  var subtotalsAtBottomOnly: js.UndefOr[Boolean] = js.undefined
}
object Aggregate {
  
  inline def apply(): Aggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aggregate] (val x: Self) extends AnyVal {
    
    inline def setAggregate(value: js.Object): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setExpandTo(value: Double): Self = StObject.set(x, "expandTo", value.asInstanceOf[js.Any])
    
    inline def setExpandToUndefined: Self = StObject.set(x, "expandTo", js.undefined)
    
    inline def setGrandTotalAtBottomOnly(value: Boolean): Self = StObject.set(x, "grandTotalAtBottomOnly", value.asInstanceOf[js.Any])
    
    inline def setGrandTotalAtBottomOnlyUndefined: Self = StObject.set(x, "grandTotalAtBottomOnly", js.undefined)
    
    inline def setGroup(value: js.Object): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupLevels(value: js.Array[String]): Self = StObject.set(x, "groupLevels", value.asInstanceOf[js.Any])
    
    inline def setGroupLevelsUndefined: Self = StObject.set(x, "groupLevels", js.undefined)
    
    inline def setGroupLevelsVarargs(value: String*): Self = StObject.set(x, "groupLevels", js.Array(value*))
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHierarchyQualifier(value: String): Self = StObject.set(x, "hierarchyQualifier", value.asInstanceOf[js.Any])
    
    inline def setHierarchyQualifierUndefined: Self = StObject.set(x, "hierarchyQualifier", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSubtotalsAtBottomOnly(value: Boolean): Self = StObject.set(x, "subtotalsAtBottomOnly", value.asInstanceOf[js.Any])
    
    inline def setSubtotalsAtBottomOnlyUndefined: Self = StObject.set(x, "subtotalsAtBottomOnly", js.undefined)
  }
}
