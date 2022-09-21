package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlInspectionResult extends StObject {
  
  /** Result of the AMP analysis. Absent if the page is not an AMP page. */
  var ampResult: js.UndefOr[AmpInspectionResult] = js.undefined
  
  /** Result of the index status analysis. */
  var indexStatusResult: js.UndefOr[IndexStatusInspectionResult] = js.undefined
  
  /** Link to Search Console URL inspection. */
  var inspectionResultLink: js.UndefOr[String] = js.undefined
  
  /** Result of the Mobile usability analysis. */
  var mobileUsabilityResult: js.UndefOr[MobileUsabilityInspectionResult] = js.undefined
  
  /** Result of the Rich Results analysis. Absent if there are no rich results found. */
  var richResultsResult: js.UndefOr[RichResultsInspectionResult] = js.undefined
}
object UrlInspectionResult {
  
  inline def apply(): UrlInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlInspectionResult]
  }
  
  extension [Self <: UrlInspectionResult](x: Self) {
    
    inline def setAmpResult(value: AmpInspectionResult): Self = StObject.set(x, "ampResult", value.asInstanceOf[js.Any])
    
    inline def setAmpResultUndefined: Self = StObject.set(x, "ampResult", js.undefined)
    
    inline def setIndexStatusResult(value: IndexStatusInspectionResult): Self = StObject.set(x, "indexStatusResult", value.asInstanceOf[js.Any])
    
    inline def setIndexStatusResultUndefined: Self = StObject.set(x, "indexStatusResult", js.undefined)
    
    inline def setInspectionResultLink(value: String): Self = StObject.set(x, "inspectionResultLink", value.asInstanceOf[js.Any])
    
    inline def setInspectionResultLinkUndefined: Self = StObject.set(x, "inspectionResultLink", js.undefined)
    
    inline def setMobileUsabilityResult(value: MobileUsabilityInspectionResult): Self = StObject.set(x, "mobileUsabilityResult", value.asInstanceOf[js.Any])
    
    inline def setMobileUsabilityResultUndefined: Self = StObject.set(x, "mobileUsabilityResult", js.undefined)
    
    inline def setRichResultsResult(value: RichResultsInspectionResult): Self = StObject.set(x, "richResultsResult", value.asInstanceOf[js.Any])
    
    inline def setRichResultsResultUndefined: Self = StObject.set(x, "richResultsResult", js.undefined)
  }
}
