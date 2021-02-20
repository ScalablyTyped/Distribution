package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DateShiftConfig extends StObject {
  
  /** Points to the field that contains the context, for example, an entity id. If set, must also set cryptoKey. If set, shift will be consistent for the given context. */
  var context: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
  
  /**
    * Causes the shift to be computed based on this key and the context. This results in the same shift for the same context and crypto_key. If set, must also set context. Can only be
    * applied to table items.
    */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2CryptoKey] = js.native
  
  /** Required. For example, -5 means shift date to at most 5 days back in the past. */
  var lowerBoundDays: js.UndefOr[Double] = js.native
  
  /**
    * Required. Range of shift in days. Actual shift will be selected at random within this range (inclusive ends). Negative means shift to earlier in time. Must not be more than 365250
    * days (1000 years) each direction. For example, 3 means shift date to at most 3 days into the future.
    */
  var upperBoundDays: js.UndefOr[Double] = js.native
}
object GooglePrivacyDlpV2DateShiftConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DateShiftConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DateShiftConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DateShiftConfigMutableBuilder[Self <: GooglePrivacyDlpV2DateShiftConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setCryptoKey(value: GooglePrivacyDlpV2CryptoKey): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
    
    @scala.inline
    def setLowerBoundDays(value: Double): Self = StObject.set(x, "lowerBoundDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundDaysUndefined: Self = StObject.set(x, "lowerBoundDays", js.undefined)
    
    @scala.inline
    def setUpperBoundDays(value: Double): Self = StObject.set(x, "upperBoundDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundDaysUndefined: Self = StObject.set(x, "upperBoundDays", js.undefined)
  }
}
