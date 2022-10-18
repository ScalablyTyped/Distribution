package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1RecommenderGenerationConfig extends StObject {
  
  /** Parameters for this RecommenderGenerationConfig. These configs can be used by or are applied to all subtypes. */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object GoogleCloudRecommenderV1RecommenderGenerationConfig {
  
  inline def apply(): GoogleCloudRecommenderV1RecommenderGenerationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1RecommenderGenerationConfig]
  }
  
  extension [Self <: GoogleCloudRecommenderV1RecommenderGenerationConfig](x: Self) {
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
