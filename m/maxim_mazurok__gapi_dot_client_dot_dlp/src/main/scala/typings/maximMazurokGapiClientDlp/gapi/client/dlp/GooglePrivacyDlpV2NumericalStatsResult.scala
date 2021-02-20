package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2NumericalStatsResult extends StObject {
  
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
  implicit class GooglePrivacyDlpV2NumericalStatsResultMutableBuilder[Self <: GooglePrivacyDlpV2NumericalStatsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setQuantileValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = StObject.set(x, "quantileValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantileValuesUndefined: Self = StObject.set(x, "quantileValues", js.undefined)
    
    @scala.inline
    def setQuantileValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = StObject.set(x, "quantileValues", js.Array(value :_*))
  }
}
