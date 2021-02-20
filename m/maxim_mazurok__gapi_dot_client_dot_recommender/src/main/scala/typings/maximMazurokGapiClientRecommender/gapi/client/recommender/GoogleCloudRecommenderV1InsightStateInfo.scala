package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1InsightStateInfo extends StObject {
  
  /** Insight state. */
  var state: js.UndefOr[String] = js.native
  
  /** A map of metadata for the state, provided by user or automations systems. */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1InsightStateInfo with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudRecommenderV1InsightStateInfo {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1InsightStateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1InsightStateInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1InsightStateInfoMutableBuilder[Self <: GoogleCloudRecommenderV1InsightStateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1InsightStateInfo with TopLevel[js.Any]
    ): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
