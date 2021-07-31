package typings.maximMazurokGapiClientMl.gapi.client.ml

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
}
object GoogleCloudMlV1TrainingOutput {
  
  @scala.inline
  def apply(): GoogleCloudMlV1TrainingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1TrainingOutput]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1TrainingOutputMutableBuilder[Self <: GoogleCloudMlV1TrainingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltInAlgorithmOutput(value: GoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    @scala.inline
    def setCompletedTrialCount(value: String): Self = StObject.set(x, "completedTrialCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedTrialCountUndefined: Self = StObject.set(x, "completedTrialCount", js.undefined)
    
    @scala.inline
    def setConsumedMLUnits(value: Double): Self = StObject.set(x, "consumedMLUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedMLUnitsUndefined: Self = StObject.set(x, "consumedMLUnits", js.undefined)
    
    @scala.inline
    def setHyperparameterMetricTag(value: String): Self = StObject.set(x, "hyperparameterMetricTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperparameterMetricTagUndefined: Self = StObject.set(x, "hyperparameterMetricTag", js.undefined)
    
    @scala.inline
    def setIsBuiltInAlgorithmJob(value: Boolean): Self = StObject.set(x, "isBuiltInAlgorithmJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuiltInAlgorithmJobUndefined: Self = StObject.set(x, "isBuiltInAlgorithmJob", js.undefined)
    
    @scala.inline
    def setIsHyperparameterTuningJob(value: Boolean): Self = StObject.set(x, "isHyperparameterTuningJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHyperparameterTuningJobUndefined: Self = StObject.set(x, "isHyperparameterTuningJob", js.undefined)
    
    @scala.inline
    def setTrials(value: js.Array[GoogleCloudMlV1HyperparameterOutput]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    @scala.inline
    def setTrialsVarargs(value: GoogleCloudMlV1HyperparameterOutput*): Self = StObject.set(x, "trials", js.Array(value :_*))
  }
}
