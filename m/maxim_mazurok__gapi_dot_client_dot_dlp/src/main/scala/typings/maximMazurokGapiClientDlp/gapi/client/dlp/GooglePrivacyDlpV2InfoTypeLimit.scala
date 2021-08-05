package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InfoTypeLimit extends StObject {
  
  /**
    * Type of information the findings limit applies to. Only one limit per info_type should be provided. If InfoTypeLimit does not have an info_type, the DLP API applies the limit
    * against all info_types that are found but not specified in another InfoTypeLimit.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.undefined
  
  /** Max findings limit for the given infoType. */
  var maxFindings: js.UndefOr[Double] = js.undefined
}
object GooglePrivacyDlpV2InfoTypeLimit {
  
  inline def apply(): GooglePrivacyDlpV2InfoTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeLimit]
  }
  
  extension [Self <: GooglePrivacyDlpV2InfoTypeLimit](x: Self) {
    
    inline def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    inline def setMaxFindings(value: Double): Self = StObject.set(x, "maxFindings", value.asInstanceOf[js.Any])
    
    inline def setMaxFindingsUndefined: Self = StObject.set(x, "maxFindings", js.undefined)
  }
}
