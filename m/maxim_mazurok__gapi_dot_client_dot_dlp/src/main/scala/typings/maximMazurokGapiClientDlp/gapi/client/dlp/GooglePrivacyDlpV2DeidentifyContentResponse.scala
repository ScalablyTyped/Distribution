package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeidentifyContentResponse extends StObject {
  
  /** The de-identified item. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.native
  
  /** An overview of the changes that were made on the `item`. */
  var overview: js.UndefOr[GooglePrivacyDlpV2TransformationOverview] = js.native
}
object GooglePrivacyDlpV2DeidentifyContentResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeidentifyContentResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeidentifyContentResponseMutableBuilder[Self <: GooglePrivacyDlpV2DeidentifyContentResponse] (val x: Self) extends AnyVal {
    
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
