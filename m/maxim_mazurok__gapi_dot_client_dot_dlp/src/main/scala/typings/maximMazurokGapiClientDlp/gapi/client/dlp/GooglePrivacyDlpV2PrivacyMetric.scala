package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2PrivacyMetric extends StObject {
  
  /** Categorical stats */
  var categoricalStatsConfig: js.UndefOr[GooglePrivacyDlpV2CategoricalStatsConfig] = js.undefined
  
  /** delta-presence */
  var deltaPresenceEstimationConfig: js.UndefOr[GooglePrivacyDlpV2DeltaPresenceEstimationConfig] = js.undefined
  
  /** K-anonymity */
  var kAnonymityConfig: js.UndefOr[GooglePrivacyDlpV2KAnonymityConfig] = js.undefined
  
  /** k-map */
  var kMapEstimationConfig: js.UndefOr[GooglePrivacyDlpV2KMapEstimationConfig] = js.undefined
  
  /** l-diversity */
  var lDiversityConfig: js.UndefOr[GooglePrivacyDlpV2LDiversityConfig] = js.undefined
  
  /** Numerical stats */
  var numericalStatsConfig: js.UndefOr[GooglePrivacyDlpV2NumericalStatsConfig] = js.undefined
}
object GooglePrivacyDlpV2PrivacyMetric {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PrivacyMetric]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2PrivacyMetricMutableBuilder[Self <: GooglePrivacyDlpV2PrivacyMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalStatsConfig(value: GooglePrivacyDlpV2CategoricalStatsConfig): Self = StObject.set(x, "categoricalStatsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalStatsConfigUndefined: Self = StObject.set(x, "categoricalStatsConfig", js.undefined)
    
    @scala.inline
    def setDeltaPresenceEstimationConfig(value: GooglePrivacyDlpV2DeltaPresenceEstimationConfig): Self = StObject.set(x, "deltaPresenceEstimationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaPresenceEstimationConfigUndefined: Self = StObject.set(x, "deltaPresenceEstimationConfig", js.undefined)
    
    @scala.inline
    def setKAnonymityConfig(value: GooglePrivacyDlpV2KAnonymityConfig): Self = StObject.set(x, "kAnonymityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKAnonymityConfigUndefined: Self = StObject.set(x, "kAnonymityConfig", js.undefined)
    
    @scala.inline
    def setKMapEstimationConfig(value: GooglePrivacyDlpV2KMapEstimationConfig): Self = StObject.set(x, "kMapEstimationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMapEstimationConfigUndefined: Self = StObject.set(x, "kMapEstimationConfig", js.undefined)
    
    @scala.inline
    def setLDiversityConfig(value: GooglePrivacyDlpV2LDiversityConfig): Self = StObject.set(x, "lDiversityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLDiversityConfigUndefined: Self = StObject.set(x, "lDiversityConfig", js.undefined)
    
    @scala.inline
    def setNumericalStatsConfig(value: GooglePrivacyDlpV2NumericalStatsConfig): Self = StObject.set(x, "numericalStatsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericalStatsConfigUndefined: Self = StObject.set(x, "numericalStatsConfig", js.undefined)
  }
}
