package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2PrivacyMetric extends js.Object {
  
  /** Categorical stats */
  var categoricalStatsConfig: js.UndefOr[GooglePrivacyDlpV2CategoricalStatsConfig] = js.native
  
  /** delta-presence */
  var deltaPresenceEstimationConfig: js.UndefOr[GooglePrivacyDlpV2DeltaPresenceEstimationConfig] = js.native
  
  /** K-anonymity */
  var kAnonymityConfig: js.UndefOr[GooglePrivacyDlpV2KAnonymityConfig] = js.native
  
  /** k-map */
  var kMapEstimationConfig: js.UndefOr[GooglePrivacyDlpV2KMapEstimationConfig] = js.native
  
  /** l-diversity */
  var lDiversityConfig: js.UndefOr[GooglePrivacyDlpV2LDiversityConfig] = js.native
  
  /** Numerical stats */
  var numericalStatsConfig: js.UndefOr[GooglePrivacyDlpV2NumericalStatsConfig] = js.native
}
object GooglePrivacyDlpV2PrivacyMetric {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PrivacyMetric]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2PrivacyMetricOps[Self <: GooglePrivacyDlpV2PrivacyMetric] (val x: Self) extends AnyVal {
    
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
    def setCategoricalStatsConfig(value: GooglePrivacyDlpV2CategoricalStatsConfig): Self = this.set("categoricalStatsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoricalStatsConfig: Self = this.set("categoricalStatsConfig", js.undefined)
    
    @scala.inline
    def setDeltaPresenceEstimationConfig(value: GooglePrivacyDlpV2DeltaPresenceEstimationConfig): Self = this.set("deltaPresenceEstimationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaPresenceEstimationConfig: Self = this.set("deltaPresenceEstimationConfig", js.undefined)
    
    @scala.inline
    def setKAnonymityConfig(value: GooglePrivacyDlpV2KAnonymityConfig): Self = this.set("kAnonymityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKAnonymityConfig: Self = this.set("kAnonymityConfig", js.undefined)
    
    @scala.inline
    def setKMapEstimationConfig(value: GooglePrivacyDlpV2KMapEstimationConfig): Self = this.set("kMapEstimationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMapEstimationConfig: Self = this.set("kMapEstimationConfig", js.undefined)
    
    @scala.inline
    def setLDiversityConfig(value: GooglePrivacyDlpV2LDiversityConfig): Self = this.set("lDiversityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLDiversityConfig: Self = this.set("lDiversityConfig", js.undefined)
    
    @scala.inline
    def setNumericalStatsConfig(value: GooglePrivacyDlpV2NumericalStatsConfig): Self = this.set("numericalStatsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericalStatsConfig: Self = this.set("numericalStatsConfig", js.undefined)
  }
}
