package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRequest extends StObject {
  
  var aggregationFilters: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var aggregations: js.UndefOr[NullableOption[js.Array[AggregationOption]]] = js.undefined
  
  var collapseProperties: js.UndefOr[NullableOption[js.Array[CollapseProperty]]] = js.undefined
  
  var contentSources: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var enableTopResults: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var entityTypes: js.UndefOr[NullableOption[js.Array[EntityType]]] = js.undefined
  
  var fields: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var query: js.UndefOr[SearchQuery] = js.undefined
  
  var queryAlterationOptions: js.UndefOr[NullableOption[SearchAlterationOptions]] = js.undefined
  
  var region: js.UndefOr[NullableOption[String]] = js.undefined
  
  var resultTemplateOptions: js.UndefOr[NullableOption[ResultTemplateOption]] = js.undefined
  
  var sharePointOneDriveOptions: js.UndefOr[NullableOption[SharePointOneDriveOptions]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sortProperties: js.UndefOr[NullableOption[js.Array[SortProperty]]] = js.undefined
}
object SearchRequest {
  
  inline def apply(): SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchRequest] (val x: Self) extends AnyVal {
    
    inline def setAggregationFilters(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "aggregationFilters", value.asInstanceOf[js.Any])
    
    inline def setAggregationFiltersNull: Self = StObject.set(x, "aggregationFilters", null)
    
    inline def setAggregationFiltersUndefined: Self = StObject.set(x, "aggregationFilters", js.undefined)
    
    inline def setAggregationFiltersVarargs(value: String*): Self = StObject.set(x, "aggregationFilters", js.Array(value*))
    
    inline def setAggregations(value: NullableOption[js.Array[AggregationOption]]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsNull: Self = StObject.set(x, "aggregations", null)
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: AggregationOption*): Self = StObject.set(x, "aggregations", js.Array(value*))
    
    inline def setCollapseProperties(value: NullableOption[js.Array[CollapseProperty]]): Self = StObject.set(x, "collapseProperties", value.asInstanceOf[js.Any])
    
    inline def setCollapsePropertiesNull: Self = StObject.set(x, "collapseProperties", null)
    
    inline def setCollapsePropertiesUndefined: Self = StObject.set(x, "collapseProperties", js.undefined)
    
    inline def setCollapsePropertiesVarargs(value: CollapseProperty*): Self = StObject.set(x, "collapseProperties", js.Array(value*))
    
    inline def setContentSources(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "contentSources", value.asInstanceOf[js.Any])
    
    inline def setContentSourcesNull: Self = StObject.set(x, "contentSources", null)
    
    inline def setContentSourcesUndefined: Self = StObject.set(x, "contentSources", js.undefined)
    
    inline def setContentSourcesVarargs(value: String*): Self = StObject.set(x, "contentSources", js.Array(value*))
    
    inline def setEnableTopResults(value: NullableOption[Boolean]): Self = StObject.set(x, "enableTopResults", value.asInstanceOf[js.Any])
    
    inline def setEnableTopResultsNull: Self = StObject.set(x, "enableTopResults", null)
    
    inline def setEnableTopResultsUndefined: Self = StObject.set(x, "enableTopResults", js.undefined)
    
    inline def setEntityTypes(value: NullableOption[js.Array[EntityType]]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setFields(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setQuery(value: SearchQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryAlterationOptions(value: NullableOption[SearchAlterationOptions]): Self = StObject.set(x, "queryAlterationOptions", value.asInstanceOf[js.Any])
    
    inline def setQueryAlterationOptionsNull: Self = StObject.set(x, "queryAlterationOptions", null)
    
    inline def setQueryAlterationOptionsUndefined: Self = StObject.set(x, "queryAlterationOptions", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRegion(value: NullableOption[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResultTemplateOptions(value: NullableOption[ResultTemplateOption]): Self = StObject.set(x, "resultTemplateOptions", value.asInstanceOf[js.Any])
    
    inline def setResultTemplateOptionsNull: Self = StObject.set(x, "resultTemplateOptions", null)
    
    inline def setResultTemplateOptionsUndefined: Self = StObject.set(x, "resultTemplateOptions", js.undefined)
    
    inline def setSharePointOneDriveOptions(value: NullableOption[SharePointOneDriveOptions]): Self = StObject.set(x, "sharePointOneDriveOptions", value.asInstanceOf[js.Any])
    
    inline def setSharePointOneDriveOptionsNull: Self = StObject.set(x, "sharePointOneDriveOptions", null)
    
    inline def setSharePointOneDriveOptionsUndefined: Self = StObject.set(x, "sharePointOneDriveOptions", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSortProperties(value: NullableOption[js.Array[SortProperty]]): Self = StObject.set(x, "sortProperties", value.asInstanceOf[js.Any])
    
    inline def setSortPropertiesNull: Self = StObject.set(x, "sortProperties", null)
    
    inline def setSortPropertiesUndefined: Self = StObject.set(x, "sortProperties", js.undefined)
    
    inline def setSortPropertiesVarargs(value: SortProperty*): Self = StObject.set(x, "sortProperties", js.Array(value*))
  }
}
