package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DeidentifyContentResponse extends StObject {
  
  /** The de-identified item. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.undefined
  
  /** An overview of the changes that were made on the `item`. */
  var overview: js.UndefOr[GooglePrivacyDlpV2TransformationOverview] = js.undefined
}
object GooglePrivacyDlpV2DeidentifyContentResponse {
  
  inline def apply(): GooglePrivacyDlpV2DeidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeidentifyContentResponse]
  }
  
  extension [Self <: GooglePrivacyDlpV2DeidentifyContentResponse](x: Self) {
    
    inline def setItem(value: GooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setOverview(value: GooglePrivacyDlpV2TransformationOverview): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
  }
}
