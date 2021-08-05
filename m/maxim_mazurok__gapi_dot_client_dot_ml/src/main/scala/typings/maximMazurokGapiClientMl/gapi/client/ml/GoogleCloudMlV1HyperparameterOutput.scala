package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.GoogleCloudMlV1__HyperparameterOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1HyperparameterOutput extends StObject {
  
  /** All recorded object metrics for this trial. This field is not currently populated. */
  var allMetrics: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.undefined
  
  /** Details related to built-in algorithms jobs. Only set for trials of built-in algorithms jobs that have succeeded. */
  var builtInAlgorithmOutput: js.UndefOr[GoogleCloudMlV1BuiltInAlgorithmOutput] = js.undefined
  
  /** Output only. End time for the trial. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The final objective metric seen for this trial. */
  var finalMetric: js.UndefOr[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.undefined
  
  /** The hyperparameters given to this trial. */
  var hyperparameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ GoogleCloudMlV1__HyperparameterOutput & TopLevel[js.Any]
  ] = js.undefined
  
  /** True if the trial is stopped early. */
  var isTrialStoppedEarly: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Start time for the trial. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The detailed state of the trial. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The trial id for these results. */
  var trialId: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1HyperparameterOutput {
  
  inline def apply(): GoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutput]
  }
  
  extension [Self <: GoogleCloudMlV1HyperparameterOutput](x: Self) {
    
    inline def setAllMetrics(value: js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = StObject.set(x, "allMetrics", value.asInstanceOf[js.Any])
    
    inline def setAllMetricsUndefined: Self = StObject.set(x, "allMetrics", js.undefined)
    
    inline def setAllMetricsVarargs(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric*): Self = StObject.set(x, "allMetrics", js.Array(value :_*))
    
    inline def setBuiltInAlgorithmOutput(value: GoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    inline def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFinalMetric(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = StObject.set(x, "finalMetric", value.asInstanceOf[js.Any])
    
    inline def setFinalMetricUndefined: Self = StObject.set(x, "finalMetric", js.undefined)
    
    inline def setHyperparameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ GoogleCloudMlV1__HyperparameterOutput & TopLevel[js.Any]
    ): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    inline def setHyperparametersUndefined: Self = StObject.set(x, "hyperparameters", js.undefined)
    
    inline def setIsTrialStoppedEarly(value: Boolean): Self = StObject.set(x, "isTrialStoppedEarly", value.asInstanceOf[js.Any])
    
    inline def setIsTrialStoppedEarlyUndefined: Self = StObject.set(x, "isTrialStoppedEarly", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrialId(value: String): Self = StObject.set(x, "trialId", value.asInstanceOf[js.Any])
    
    inline def setTrialIdUndefined: Self = StObject.set(x, "trialId", js.undefined)
  }
}
