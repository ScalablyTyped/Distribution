package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.GoogleCloudMlV1__HyperparameterOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1HyperparameterOutput extends StObject {
  
  /** All recorded object metrics for this trial. This field is not currently populated. */
  var allMetrics: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.native
  
  /** Details related to built-in algorithms jobs. Only set for trials of built-in algorithms jobs that have succeeded. */
  var builtInAlgorithmOutput: js.UndefOr[GoogleCloudMlV1BuiltInAlgorithmOutput] = js.native
  
  /** Output only. End time for the trial. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The final objective metric seen for this trial. */
  var finalMetric: js.UndefOr[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.native
  
  /** The hyperparameters given to this trial. */
  var hyperparameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ GoogleCloudMlV1__HyperparameterOutput with TopLevel[js.Any]
  ] = js.native
  
  /** True if the trial is stopped early. */
  var isTrialStoppedEarly: js.UndefOr[Boolean] = js.native
  
  /** Output only. Start time for the trial. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. The detailed state of the trial. */
  var state: js.UndefOr[String] = js.native
  
  /** The trial id for these results. */
  var trialId: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1HyperparameterOutput {
  
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutput]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterOutputMutableBuilder[Self <: GoogleCloudMlV1HyperparameterOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllMetrics(value: js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = StObject.set(x, "allMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllMetricsUndefined: Self = StObject.set(x, "allMetrics", js.undefined)
    
    @scala.inline
    def setAllMetricsVarargs(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric*): Self = StObject.set(x, "allMetrics", js.Array(value :_*))
    
    @scala.inline
    def setBuiltInAlgorithmOutput(value: GoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setFinalMetric(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = StObject.set(x, "finalMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalMetricUndefined: Self = StObject.set(x, "finalMetric", js.undefined)
    
    @scala.inline
    def setHyperparameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ GoogleCloudMlV1__HyperparameterOutput with TopLevel[js.Any]
    ): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperparametersUndefined: Self = StObject.set(x, "hyperparameters", js.undefined)
    
    @scala.inline
    def setIsTrialStoppedEarly(value: Boolean): Self = StObject.set(x, "isTrialStoppedEarly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrialStoppedEarlyUndefined: Self = StObject.set(x, "isTrialStoppedEarly", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTrialId(value: String): Self = StObject.set(x, "trialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialIdUndefined: Self = StObject.set(x, "trialId", js.undefined)
  }
}
