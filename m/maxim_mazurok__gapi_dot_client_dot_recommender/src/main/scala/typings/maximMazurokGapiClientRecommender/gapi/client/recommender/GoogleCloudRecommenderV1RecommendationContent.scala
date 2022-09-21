package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1RecommendationContent extends StObject {
  
  /** Operations to one or more Google Cloud resources grouped in such a way that, all operations within one group are expected to be performed atomically and in an order. */
  var operationGroups: js.UndefOr[js.Array[GoogleCloudRecommenderV1OperationGroup]] = js.undefined
  
  /** Condensed overview information about the recommendation. */
  var overview: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1RecommendationContent & TopLevel[Any]
  ] = js.undefined
}
object GoogleCloudRecommenderV1RecommendationContent {
  
  inline def apply(): GoogleCloudRecommenderV1RecommendationContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1RecommendationContent]
  }
  
  extension [Self <: GoogleCloudRecommenderV1RecommendationContent](x: Self) {
    
    inline def setOperationGroups(value: js.Array[GoogleCloudRecommenderV1OperationGroup]): Self = StObject.set(x, "operationGroups", value.asInstanceOf[js.Any])
    
    inline def setOperationGroupsUndefined: Self = StObject.set(x, "operationGroups", js.undefined)
    
    inline def setOperationGroupsVarargs(value: GoogleCloudRecommenderV1OperationGroup*): Self = StObject.set(x, "operationGroups", js.Array(value*))
    
    inline def setOverview(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1RecommendationContent & TopLevel[Any]
    ): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
  }
}
