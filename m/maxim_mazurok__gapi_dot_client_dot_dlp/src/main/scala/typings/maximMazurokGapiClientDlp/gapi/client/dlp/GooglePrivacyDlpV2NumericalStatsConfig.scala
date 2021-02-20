package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2NumericalStatsConfig extends StObject {
  
  /** Field to compute numerical stats on. Supported types are integer, float, date, datetime, timestamp, time. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
}
object GooglePrivacyDlpV2NumericalStatsConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2NumericalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2NumericalStatsConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2NumericalStatsConfigMutableBuilder[Self <: GooglePrivacyDlpV2NumericalStatsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
