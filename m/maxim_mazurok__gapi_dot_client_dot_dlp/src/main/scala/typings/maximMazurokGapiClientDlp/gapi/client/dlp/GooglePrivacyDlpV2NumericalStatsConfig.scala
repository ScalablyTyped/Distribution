package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2NumericalStatsConfig extends StObject {
  
  /** Field to compute numerical stats on. Supported types are integer, float, date, datetime, timestamp, time. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
}
object GooglePrivacyDlpV2NumericalStatsConfig {
  
  inline def apply(): GooglePrivacyDlpV2NumericalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2NumericalStatsConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2NumericalStatsConfig](x: Self) {
    
    inline def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
