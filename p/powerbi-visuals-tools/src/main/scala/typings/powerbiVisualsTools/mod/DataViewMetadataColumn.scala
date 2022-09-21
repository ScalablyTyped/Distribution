package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StringDictionary
import typings.powerbiVisualsTools.mod.data.ISQExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewMetadataColumn extends StObject {
  
  /** The aggregates computed for this column, if any. */
  var aggregates: js.UndefOr[DataViewColumnAggregates] = js.undefined
  
  /** Indicates that aggregates should not be computed across groups with different values of this column. */
  var discourageAggregationAcrossGroups: js.UndefOr[Boolean] = js.undefined
  
  /** The user-facing display name of the column. */
  var displayName: String
  
  /** The SQExpr this column represents. */
  var expr: js.UndefOr[ISQExpr] = js.undefined
  
  /** The format string of the column. */
  var format: js.UndefOr[String] = js.undefined
  
  /** The name of the containing group. */
  var groupName: js.UndefOr[PrimitiveValue] = js.undefined
  
  /**
    * The set of expressions that define the identity for instances of this grouping field.
    * This must be a subset of the items in the DataViewScopeIdentity in the grouped items result.
    * This property is undefined for measure fields, as well as for grouping fields in DSR generated prior to the CY16SU08 or SU09 timeframe.
    */
  var identityExprs: js.UndefOr[js.Array[ISQExpr]] = js.undefined
  
  /** The position of the column in the select statement. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** Indicates that this column is a measure (aggregate) value. */
  var isMeasure: js.UndefOr[Boolean] = js.undefined
  
  /** The KPI metadata to use to convert a numeric status value into its visual representation. */
  var kpi: js.UndefOr[DataViewKpiColumnMetadata] = js.undefined
  
  /** The metadata repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  
  var parameter: js.UndefOr[js.Object] = js.undefined
  
  /** The query name the source column in the query. */
  var queryName: js.UndefOr[String] = js.undefined
  
  /** The properties that this column provides to the visualization. */
  var roles: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  /** The sort direction of this column. */
  var sort: js.UndefOr[SortDirection] = js.undefined
  
  /** The order sorts are applied. Lower values are applied first. Undefined indicates no sort was done on this column. */
  var sortOrder: js.UndefOr[Double] = js.undefined
  
  // TODO: Deprecate this, and populate format string through objects instead.
  /** Data type information for the column. */
  var `type`: js.UndefOr[ValueTypeDescriptor] = js.undefined
}
object DataViewMetadataColumn {
  
  inline def apply(displayName: String): DataViewMetadataColumn = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewMetadataColumn]
  }
  
  extension [Self <: DataViewMetadataColumn](x: Self) {
    
    inline def setAggregates(value: DataViewColumnAggregates): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    inline def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    inline def setDiscourageAggregationAcrossGroups(value: Boolean): Self = StObject.set(x, "discourageAggregationAcrossGroups", value.asInstanceOf[js.Any])
    
    inline def setDiscourageAggregationAcrossGroupsUndefined: Self = StObject.set(x, "discourageAggregationAcrossGroups", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: ISQExpr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGroupName(value: PrimitiveValue): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setIdentityExprs(value: js.Array[ISQExpr]): Self = StObject.set(x, "identityExprs", value.asInstanceOf[js.Any])
    
    inline def setIdentityExprsUndefined: Self = StObject.set(x, "identityExprs", js.undefined)
    
    inline def setIdentityExprsVarargs(value: ISQExpr*): Self = StObject.set(x, "identityExprs", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIsMeasure(value: Boolean): Self = StObject.set(x, "isMeasure", value.asInstanceOf[js.Any])
    
    inline def setIsMeasureUndefined: Self = StObject.set(x, "isMeasure", js.undefined)
    
    inline def setKpi(value: DataViewKpiColumnMetadata): Self = StObject.set(x, "kpi", value.asInstanceOf[js.Any])
    
    inline def setKpiUndefined: Self = StObject.set(x, "kpi", js.undefined)
    
    inline def setObjects(value: DataViewObjects): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setParameter(value: js.Object): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setQueryName(value: String): Self = StObject.set(x, "queryName", value.asInstanceOf[js.Any])
    
    inline def setQueryNameUndefined: Self = StObject.set(x, "queryName", js.undefined)
    
    inline def setRoles(value: StringDictionary[Boolean]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setSort(value: SortDirection): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: ValueTypeDescriptor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
