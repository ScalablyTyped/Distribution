package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ReidentifyContentResponse extends StObject {
  
  /** The re-identified item. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.undefined
  
  /** An overview of the changes that were made to the `item`. */
  var overview: js.UndefOr[GooglePrivacyDlpV2TransformationOverview] = js.undefined
}
object GooglePrivacyDlpV2ReidentifyContentResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ReidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ReidentifyContentResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ReidentifyContentResponseMutableBuilder[Self <: GooglePrivacyDlpV2ReidentifyContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: GooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setOverview(value: GooglePrivacyDlpV2TransformationOverview): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
  }
}
