package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoverySearch
  extends StObject
     with Search {
  
  // Adds the results of the eDiscovery search to the specified reviewSet.
  var addToReviewSetOperation: js.UndefOr[NullableOption[EdiscoveryAddToReviewSetOperation]] = js.undefined
  
  // Adds an additional source to the eDiscovery search.
  var additionalSources: js.UndefOr[NullableOption[js.Array[DataSource]]] = js.undefined
  
  // Custodian sources that are included in the eDiscovery search.
  var custodianSources: js.UndefOr[NullableOption[js.Array[DataSource]]] = js.undefined
  
  /**
    * When specified, the collection will span across a service for an entire workload. Possible values are: none,
    * allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
    */
  var dataSourceScopes: js.UndefOr[NullableOption[DataSourceScopes]] = js.undefined
  
  // The last estimate operation associated with the eDiscovery search.
  var lastEstimateStatisticsOperation: js.UndefOr[NullableOption[EdiscoveryEstimateOperation]] = js.undefined
  
  // noncustodialDataSource sources that are included in the eDiscovery search
  var noncustodialSources: js.UndefOr[NullableOption[js.Array[EdiscoveryNoncustodialDataSource]]] = js.undefined
}
object EdiscoverySearch {
  
  inline def apply(): EdiscoverySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoverySearch]
  }
  
  extension [Self <: EdiscoverySearch](x: Self) {
    
    inline def setAddToReviewSetOperation(value: NullableOption[EdiscoveryAddToReviewSetOperation]): Self = StObject.set(x, "addToReviewSetOperation", value.asInstanceOf[js.Any])
    
    inline def setAddToReviewSetOperationNull: Self = StObject.set(x, "addToReviewSetOperation", null)
    
    inline def setAddToReviewSetOperationUndefined: Self = StObject.set(x, "addToReviewSetOperation", js.undefined)
    
    inline def setAdditionalSources(value: NullableOption[js.Array[DataSource]]): Self = StObject.set(x, "additionalSources", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSourcesNull: Self = StObject.set(x, "additionalSources", null)
    
    inline def setAdditionalSourcesUndefined: Self = StObject.set(x, "additionalSources", js.undefined)
    
    inline def setAdditionalSourcesVarargs(value: DataSource*): Self = StObject.set(x, "additionalSources", js.Array(value*))
    
    inline def setCustodianSources(value: NullableOption[js.Array[DataSource]]): Self = StObject.set(x, "custodianSources", value.asInstanceOf[js.Any])
    
    inline def setCustodianSourcesNull: Self = StObject.set(x, "custodianSources", null)
    
    inline def setCustodianSourcesUndefined: Self = StObject.set(x, "custodianSources", js.undefined)
    
    inline def setCustodianSourcesVarargs(value: DataSource*): Self = StObject.set(x, "custodianSources", js.Array(value*))
    
    inline def setDataSourceScopes(value: NullableOption[DataSourceScopes]): Self = StObject.set(x, "dataSourceScopes", value.asInstanceOf[js.Any])
    
    inline def setDataSourceScopesNull: Self = StObject.set(x, "dataSourceScopes", null)
    
    inline def setDataSourceScopesUndefined: Self = StObject.set(x, "dataSourceScopes", js.undefined)
    
    inline def setLastEstimateStatisticsOperation(value: NullableOption[EdiscoveryEstimateOperation]): Self = StObject.set(x, "lastEstimateStatisticsOperation", value.asInstanceOf[js.Any])
    
    inline def setLastEstimateStatisticsOperationNull: Self = StObject.set(x, "lastEstimateStatisticsOperation", null)
    
    inline def setLastEstimateStatisticsOperationUndefined: Self = StObject.set(x, "lastEstimateStatisticsOperation", js.undefined)
    
    inline def setNoncustodialSources(value: NullableOption[js.Array[EdiscoveryNoncustodialDataSource]]): Self = StObject.set(x, "noncustodialSources", value.asInstanceOf[js.Any])
    
    inline def setNoncustodialSourcesNull: Self = StObject.set(x, "noncustodialSources", null)
    
    inline def setNoncustodialSourcesUndefined: Self = StObject.set(x, "noncustodialSources", js.undefined)
    
    inline def setNoncustodialSourcesVarargs(value: EdiscoveryNoncustodialDataSource*): Self = StObject.set(x, "noncustodialSources", js.Array(value*))
  }
}
