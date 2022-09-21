package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1InsightTypeGenerationConfig extends StObject {
  
  /** Parameters for this InsightTypeGenerationConfig. These configs can be used by or are applied to all subtypes. */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1InsightTypeGenerationConfig & TopLevel[Any]
  ] = js.undefined
}
object GoogleCloudRecommenderV1InsightTypeGenerationConfig {
  
  inline def apply(): GoogleCloudRecommenderV1InsightTypeGenerationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1InsightTypeGenerationConfig]
  }
  
  extension [Self <: GoogleCloudRecommenderV1InsightTypeGenerationConfig](x: Self) {
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1InsightTypeGenerationConfig & TopLevel[Any]
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
