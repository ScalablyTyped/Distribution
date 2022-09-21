package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1InsightStateInfo extends StObject {
  
  /** Insight state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** A map of metadata for the state, provided by user or automations systems. */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1InsightStateInfo & TopLevel[Any]
  ] = js.undefined
}
object GoogleCloudRecommenderV1InsightStateInfo {
  
  inline def apply(): GoogleCloudRecommenderV1InsightStateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1InsightStateInfo]
  }
  
  extension [Self <: GoogleCloudRecommenderV1InsightStateInfo](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1InsightStateInfo & TopLevel[Any]
    ): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    inline def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
