package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Bucket extends StObject {
  
  /** Upper bound of the range, exclusive; type must match min. */
  var max: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
  
  /** Lower bound of the range, inclusive. Type should be the same as max if used. */
  var min: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
  
  /** Required. Replacement value for this bucket. */
  var replacementValue: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
}
object GooglePrivacyDlpV2Bucket {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Bucket]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2BucketMutableBuilder[Self <: GooglePrivacyDlpV2Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setReplacementValue(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "replacementValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementValueUndefined: Self = StObject.set(x, "replacementValue", js.undefined)
  }
}
