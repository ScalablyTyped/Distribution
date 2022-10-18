package typings.openui5.anon

import typings.openui5.sapUiModelTreeAutoExpandModeMod.TreeAutoExpandMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoExpandMode extends StObject {
  
  /**
    * The auto expand mode; applying sorters to groups is only possible in auto expand mode {@link sap.ui.model.TreeAutoExpandMode.Sequential}
    */
  var autoExpandMode: js.UndefOr[
    TreeAutoExpandMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TreeAutoExpandMode * / any */ String)
  ] = js.undefined
  
  /**
    * The entity set addressed by the last segment of the given binding path
    */
  var entitySet: Unit
  
  /**
    * Whether grand total values are provided for all bound measure properties
    */
  var provideGrandTotals: Unit
  
  /**
    * Whether the total number of matching entries in the bound OData entity set is provided
    */
  var provideTotalResultSize: Unit
  
  /**
    * Whether the binding checks aggregated entries with multi-unit occurrences, if some measure properties
    * have a unique unit and will trigger separate OData requests to fetch them
    */
  var reloadSingleUnitMeasures: Unit
  
  /**
    * A comma-separated list of property names that need to be selected.
    *  If the `select` parameter is given, it has to contain all properties that are contained in the analytical
    * information (see {@link sap.ui.model.analytics.AnalyticalBinding#updateAnalyticalInfo}). It must not
    * contain additional dimensions or measures or associated properties for additional dimensions or measures.
    * But it may contain additional properties like a text property of a dimension that is also selected.
    *  All properties of the `select` parameter are also considered in {@link sap.ui.model.analytics.AnalyticalBinding#getDownloadUrl}.
    *  The `select` parameter must not contain any duplicate entry.
    *  If the `select` parameter does not fit to the analytical information or if the `select` parameter contains
    * duplicates, a warning is logged and the `select` parameter is ignored.
    */
  var select: js.UndefOr[String] = js.undefined
  
  /**
    * Whether multiple OData requests are wrapped into a single $batch request wherever possible
    */
  var useBatchRequests: Unit
}
object AutoExpandMode {
  
  inline def apply(
    entitySet: Unit,
    provideGrandTotals: Unit,
    provideTotalResultSize: Unit,
    reloadSingleUnitMeasures: Unit,
    useBatchRequests: Unit
  ): AutoExpandMode = {
    val __obj = js.Dynamic.literal(entitySet = entitySet.asInstanceOf[js.Any], provideGrandTotals = provideGrandTotals.asInstanceOf[js.Any], provideTotalResultSize = provideTotalResultSize.asInstanceOf[js.Any], reloadSingleUnitMeasures = reloadSingleUnitMeasures.asInstanceOf[js.Any], useBatchRequests = useBatchRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoExpandMode]
  }
  
  extension [Self <: AutoExpandMode](x: Self) {
    
    inline def setAutoExpandMode(
      value: TreeAutoExpandMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TreeAutoExpandMode * / any */ String)
    ): Self = StObject.set(x, "autoExpandMode", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandModeUndefined: Self = StObject.set(x, "autoExpandMode", js.undefined)
    
    inline def setEntitySet(value: Unit): Self = StObject.set(x, "entitySet", value.asInstanceOf[js.Any])
    
    inline def setProvideGrandTotals(value: Unit): Self = StObject.set(x, "provideGrandTotals", value.asInstanceOf[js.Any])
    
    inline def setProvideTotalResultSize(value: Unit): Self = StObject.set(x, "provideTotalResultSize", value.asInstanceOf[js.Any])
    
    inline def setReloadSingleUnitMeasures(value: Unit): Self = StObject.set(x, "reloadSingleUnitMeasures", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setUseBatchRequests(value: Unit): Self = StObject.set(x, "useBatchRequests", value.asInstanceOf[js.Any])
  }
}
