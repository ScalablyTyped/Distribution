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
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InfoTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeLimit]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InfoTypeLimitMutableBuilder[Self <: GooglePrivacyDlpV2InfoTypeLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setMaxFindings(value: Double): Self = StObject.set(x, "maxFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFindingsUndefined: Self = StObject.set(x, "maxFindings", js.undefined)
  }
}
