package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Bucket extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2BucketOps[Self <: GooglePrivacyDlpV2Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMax(value: GooglePrivacyDlpV2Value): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: GooglePrivacyDlpV2Value): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setReplacementValue(value: GooglePrivacyDlpV2Value): Self = this.set("replacementValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacementValue: Self = this.set("replacementValue", js.undefined)
  }
}
