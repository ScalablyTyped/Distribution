package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ExcludeInfoTypes extends StObject {
  
  /**
    * InfoType list in ExclusionRule rule drops a finding when it overlaps or contained within with a finding of an infoType from this list. For example, for
    * `InspectionRuleSet.info_types` containing "PHONE_NUMBER"` and `exclusion_rule` containing `exclude_info_types.info_types` with "EMAIL_ADDRESS" the phone number findings are dropped
    * if they overlap with EMAIL_ADDRESS finding. That leads to "555-222-2222@example.org" to generate only a single finding, namely email address.
    */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoType]] = js.undefined
}
object GooglePrivacyDlpV2ExcludeInfoTypes {
  
  inline def apply(): GooglePrivacyDlpV2ExcludeInfoTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ExcludeInfoTypes]
  }
  
  extension [Self <: GooglePrivacyDlpV2ExcludeInfoTypes](x: Self) {
    
    inline def setInfoTypes(value: js.Array[GooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: GooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
  }
}
