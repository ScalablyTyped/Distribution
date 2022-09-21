package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.GoogleCloudMlV1__TrainingOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1TrainingOutput extends StObject {
  
  /** Details related to built-in algorithms jobs. Only set for built-in algorithms jobs. */
  var builtInAlgorithmOutput: js.UndefOr[GoogleCloudMlV1BuiltInAlgorithmOutput] = js.undefined
  
  /** The number of hyperparameter tuning trials that completed successfully. Only set for hyperparameter tuning jobs. */
  var completedTrialCount: js.UndefOr[String] = js.undefined
  
  /** The amount of ML units consumed by the job. */
  var consumedMLUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * The TensorFlow summary tag name used for optimizing hyperparameter tuning trials. See
    * [`HyperparameterSpec.hyperparameterMetricTag`](#HyperparameterSpec.FIELDS.hyperparameter_metric_tag) for more information. Only set for hyperparameter tuning jobs.
    */
  var hyperparameterMetricTag: js.UndefOr[String] = js.undefined
  
  /** Whether this job is a built-in Algorithm job. */
  var isBuiltInAlgorithmJob: js.UndefOr[Boolean] = js.undefined
  
  /** Whether this job is a hyperparameter tuning job. */
  var isHyperparameterTuningJob: js.UndefOr[Boolean] = js.undefined
  
  /** Results for individual Hyperparameter trials. Only set for hyperparameter tuning jobs. */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutput]] = js.undefined
  
  /**
    * Output only. URIs for accessing [interactive shells](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) (one URI for each training node). Only
    * available if training_input.enable_web_access is `true`. The keys are names of each node in the training job; for example, `master-replica-0` for the master node, `worker-replica-0`
    * for the first worker, and `ps-replica-0` for the first parameter server. The values are the URIs for each node's interactive shell.
    */
  var webAccessUris: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ GoogleCloudMlV1__TrainingOutput & TopLevel[Any]
  ] = js.undefined
}
object GoogleCloudMlV1TrainingOutput {
  
  inline def apply(): GoogleCloudMlV1TrainingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1TrainingOutput]
  }
  
  extension [Self <: GoogleCloudMlV1TrainingOutput](x: Self) {
    
    inline def setBuiltInAlgorithmOutput(value: GoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    inline def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    inline def setCompletedTrialCount(value: String): Self = StObject.set(x, "completedTrialCount", value.asInstanceOf[js.Any])
    
    inline def setCompletedTrialCountUndefined: Self = StObject.set(x, "completedTrialCount", js.undefined)
    
    inline def setConsumedMLUnits(value: Double): Self = StObject.set(x, "consumedMLUnits", value.asInstanceOf[js.Any])
    
    inline def setConsumedMLUnitsUndefined: Self = StObject.set(x, "consumedMLUnits", js.undefined)
    
    inline def setHyperparameterMetricTag(value: String): Self = StObject.set(x, "hyperparameterMetricTag", value.asInstanceOf[js.Any])
    
    inline def setHyperparameterMetricTagUndefined: Self = StObject.set(x, "hyperparameterMetricTag", js.undefined)
    
    inline def setIsBuiltInAlgorithmJob(value: Boolean): Self = StObject.set(x, "isBuiltInAlgorithmJob", value.asInstanceOf[js.Any])
    
    inline def setIsBuiltInAlgorithmJobUndefined: Self = StObject.set(x, "isBuiltInAlgorithmJob", js.undefined)
    
    inline def setIsHyperparameterTuningJob(value: Boolean): Self = StObject.set(x, "isHyperparameterTuningJob", value.asInstanceOf[js.Any])
    
    inline def setIsHyperparameterTuningJobUndefined: Self = StObject.set(x, "isHyperparameterTuningJob", js.undefined)
    
    inline def setTrials(value: js.Array[GoogleCloudMlV1HyperparameterOutput]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    inline def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    inline def setTrialsVarargs(value: GoogleCloudMlV1HyperparameterOutput*): Self = StObject.set(x, "trials", js.Array(value*))
    
    inline def setWebAccessUris(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ GoogleCloudMlV1__TrainingOutput & TopLevel[Any]
    ): Self = StObject.set(x, "webAccessUris", value.asInstanceOf[js.Any])
    
    inline def setWebAccessUrisUndefined: Self = StObject.set(x, "webAccessUris", js.undefined)
  }
}
