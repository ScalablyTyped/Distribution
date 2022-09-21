package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DataProfileConfigSnapshot extends StObject {
  
  /** A copy of the configuration used to generate this profile. */
  var dataProfileJob: js.UndefOr[GooglePrivacyDlpV2DataProfileJobConfig] = js.undefined
  
  /** A copy of the inspection config used to generate this profile. This is a copy of the inspect_template specified in `DataProfileJobConfig`. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.undefined
}
object GooglePrivacyDlpV2DataProfileConfigSnapshot {
  
  inline def apply(): GooglePrivacyDlpV2DataProfileConfigSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DataProfileConfigSnapshot]
  }
  
  extension [Self <: GooglePrivacyDlpV2DataProfileConfigSnapshot](x: Self) {
    
    inline def setDataProfileJob(value: GooglePrivacyDlpV2DataProfileJobConfig): Self = StObject.set(x, "dataProfileJob", value.asInstanceOf[js.Any])
    
    inline def setDataProfileJobUndefined: Self = StObject.set(x, "dataProfileJob", js.undefined)
    
    inline def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    inline def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
  }
}
