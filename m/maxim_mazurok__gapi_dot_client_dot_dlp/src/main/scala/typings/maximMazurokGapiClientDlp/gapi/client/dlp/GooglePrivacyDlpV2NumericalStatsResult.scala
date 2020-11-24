package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2NumericalStatsResult extends js.Object {
  
  /** Maximum value appearing in the column. */
  var maxValue: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
  
  /** Minimum value appearing in the column. */
  var minValue: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
  
  /** List of 99 values that partition the set of field values into 100 equal sized buckets. */
  var quantileValues: js.UndefOr[js.Array[GooglePrivacyDlpV2Value]] = js.native
}
object GooglePrivacyDlpV2NumericalStatsResult {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2NumericalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2NumericalStatsResult]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2NumericalStatsResultOps[Self <: GooglePrivacyDlpV2NumericalStatsResult] (val x: Self) extends AnyVal {
    
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
    def setMaxValue(value: GooglePrivacyDlpV2Value): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: GooglePrivacyDlpV2Value): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setQuantileValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = this.set("quantileValues", js.Array(value :_*))
    
    @scala.inline
    def setQuantileValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = this.set("quantileValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantileValues: Self = this.set("quantileValues", js.undefined)
  }
}
