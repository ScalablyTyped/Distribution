package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1InsightStateInfo extends js.Object {
  
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
  implicit class GoogleCloudRecommenderV1InsightStateInfoOps[Self <: GoogleCloudRecommenderV1InsightStateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1InsightStateInfo with TopLevel[js.Any]
    ): Self = this.set("stateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateMetadata: Self = this.set("stateMetadata", js.undefined)
  }
}
