package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails extends js.Object {
  
  /** Categorical stats result */
  var categoricalStatsResult: js.UndefOr[GooglePrivacyDlpV2CategoricalStatsResult] = js.native
  
  /** Delta-presence result */
  var deltaPresenceEstimationResult: js.UndefOr[GooglePrivacyDlpV2DeltaPresenceEstimationResult] = js.native
  
  /** K-anonymity result */
  var kAnonymityResult: js.UndefOr[GooglePrivacyDlpV2KAnonymityResult] = js.native
  
  /** K-map result */
  var kMapEstimationResult: js.UndefOr[GooglePrivacyDlpV2KMapEstimationResult] = js.native
  
  /** L-divesity result */
  var lDiversityResult: js.UndefOr[GooglePrivacyDlpV2LDiversityResult] = js.native
  
  /** Numerical stats result */
  var numericalStatsResult: js.UndefOr[GooglePrivacyDlpV2NumericalStatsResult] = js.native
  
  /** The configuration used for this job. */
  var requestedOptions: js.UndefOr[GooglePrivacyDlpV2RequestedRiskAnalysisOptions] = js.native
  
  /** Privacy metric to compute. */
  var requestedPrivacyMetric: js.UndefOr[GooglePrivacyDlpV2PrivacyMetric] = js.native
  
  /** Input dataset to compute metrics over. */
  var requestedSourceTable: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.native
}
object GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsOps[Self <: GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] (val x: Self) extends AnyVal {
    
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
    def setCategoricalStatsResult(value: GooglePrivacyDlpV2CategoricalStatsResult): Self = this.set("categoricalStatsResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoricalStatsResult: Self = this.set("categoricalStatsResult", js.undefined)
    
    @scala.inline
    def setDeltaPresenceEstimationResult(value: GooglePrivacyDlpV2DeltaPresenceEstimationResult): Self = this.set("deltaPresenceEstimationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaPresenceEstimationResult: Self = this.set("deltaPresenceEstimationResult", js.undefined)
    
    @scala.inline
    def setKAnonymityResult(value: GooglePrivacyDlpV2KAnonymityResult): Self = this.set("kAnonymityResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKAnonymityResult: Self = this.set("kAnonymityResult", js.undefined)
    
    @scala.inline
    def setKMapEstimationResult(value: GooglePrivacyDlpV2KMapEstimationResult): Self = this.set("kMapEstimationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMapEstimationResult: Self = this.set("kMapEstimationResult", js.undefined)
    
    @scala.inline
    def setLDiversityResult(value: GooglePrivacyDlpV2LDiversityResult): Self = this.set("lDiversityResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLDiversityResult: Self = this.set("lDiversityResult", js.undefined)
    
    @scala.inline
    def setNumericalStatsResult(value: GooglePrivacyDlpV2NumericalStatsResult): Self = this.set("numericalStatsResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericalStatsResult: Self = this.set("numericalStatsResult", js.undefined)
    
    @scala.inline
    def setRequestedOptions(value: GooglePrivacyDlpV2RequestedRiskAnalysisOptions): Self = this.set("requestedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedOptions: Self = this.set("requestedOptions", js.undefined)
    
    @scala.inline
    def setRequestedPrivacyMetric(value: GooglePrivacyDlpV2PrivacyMetric): Self = this.set("requestedPrivacyMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedPrivacyMetric: Self = this.set("requestedPrivacyMetric", js.undefined)
    
    @scala.inline
    def setRequestedSourceTable(value: GooglePrivacyDlpV2BigQueryTable): Self = this.set("requestedSourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedSourceTable: Self = this.set("requestedSourceTable", js.undefined)
  }
}
