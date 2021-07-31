package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails extends StObject {
  
  /** Categorical stats result */
  var categoricalStatsResult: js.UndefOr[GooglePrivacyDlpV2CategoricalStatsResult] = js.undefined
  
  /** Delta-presence result */
  var deltaPresenceEstimationResult: js.UndefOr[GooglePrivacyDlpV2DeltaPresenceEstimationResult] = js.undefined
  
  /** K-anonymity result */
  var kAnonymityResult: js.UndefOr[GooglePrivacyDlpV2KAnonymityResult] = js.undefined
  
  /** K-map result */
  var kMapEstimationResult: js.UndefOr[GooglePrivacyDlpV2KMapEstimationResult] = js.undefined
  
  /** L-divesity result */
  var lDiversityResult: js.UndefOr[GooglePrivacyDlpV2LDiversityResult] = js.undefined
  
  /** Numerical stats result */
  var numericalStatsResult: js.UndefOr[GooglePrivacyDlpV2NumericalStatsResult] = js.undefined
  
  /** The configuration used for this job. */
  var requestedOptions: js.UndefOr[GooglePrivacyDlpV2RequestedRiskAnalysisOptions] = js.undefined
  
  /** Privacy metric to compute. */
  var requestedPrivacyMetric: js.UndefOr[GooglePrivacyDlpV2PrivacyMetric] = js.undefined
  
  /** Input dataset to compute metrics over. */
  var requestedSourceTable: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsMutableBuilder[Self <: GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalStatsResult(value: GooglePrivacyDlpV2CategoricalStatsResult): Self = StObject.set(x, "categoricalStatsResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalStatsResultUndefined: Self = StObject.set(x, "categoricalStatsResult", js.undefined)
    
    @scala.inline
    def setDeltaPresenceEstimationResult(value: GooglePrivacyDlpV2DeltaPresenceEstimationResult): Self = StObject.set(x, "deltaPresenceEstimationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaPresenceEstimationResultUndefined: Self = StObject.set(x, "deltaPresenceEstimationResult", js.undefined)
    
    @scala.inline
    def setKAnonymityResult(value: GooglePrivacyDlpV2KAnonymityResult): Self = StObject.set(x, "kAnonymityResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKAnonymityResultUndefined: Self = StObject.set(x, "kAnonymityResult", js.undefined)
    
    @scala.inline
    def setKMapEstimationResult(value: GooglePrivacyDlpV2KMapEstimationResult): Self = StObject.set(x, "kMapEstimationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMapEstimationResultUndefined: Self = StObject.set(x, "kMapEstimationResult", js.undefined)
    
    @scala.inline
    def setLDiversityResult(value: GooglePrivacyDlpV2LDiversityResult): Self = StObject.set(x, "lDiversityResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLDiversityResultUndefined: Self = StObject.set(x, "lDiversityResult", js.undefined)
    
    @scala.inline
    def setNumericalStatsResult(value: GooglePrivacyDlpV2NumericalStatsResult): Self = StObject.set(x, "numericalStatsResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericalStatsResultUndefined: Self = StObject.set(x, "numericalStatsResult", js.undefined)
    
    @scala.inline
    def setRequestedOptions(value: GooglePrivacyDlpV2RequestedRiskAnalysisOptions): Self = StObject.set(x, "requestedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedOptionsUndefined: Self = StObject.set(x, "requestedOptions", js.undefined)
    
    @scala.inline
    def setRequestedPrivacyMetric(value: GooglePrivacyDlpV2PrivacyMetric): Self = StObject.set(x, "requestedPrivacyMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedPrivacyMetricUndefined: Self = StObject.set(x, "requestedPrivacyMetric", js.undefined)
    
    @scala.inline
    def setRequestedSourceTable(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "requestedSourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedSourceTableUndefined: Self = StObject.set(x, "requestedSourceTable", js.undefined)
  }
}
