package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1SecurityProjection extends StObject {
  
  /** Additional security impact details that is provided by the recommender. */
  var details: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1SecurityProjection & TopLevel[Any]
  ] = js.undefined
}
object GoogleCloudRecommenderV1SecurityProjection {
  
  inline def apply(): GoogleCloudRecommenderV1SecurityProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1SecurityProjection]
  }
  
  extension [Self <: GoogleCloudRecommenderV1SecurityProjection](x: Self) {
    
    inline def setDetails(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1SecurityProjection & TopLevel[Any]
    ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
