package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1HyperparameterOutputHyperparameterMetric extends StObject {
  
  /** The objective value at this training step. */
  var objectiveValue: js.UndefOr[Double] = js.native
  
  /** The global training step for this metric. */
  var trainingStep: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1HyperparameterOutputHyperparameterMetric {
  
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterOutputHyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterOutputHyperparameterMetricMutableBuilder[Self <: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectiveValue(value: Double): Self = StObject.set(x, "objectiveValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectiveValueUndefined: Self = StObject.set(x, "objectiveValue", js.undefined)
    
    @scala.inline
    def setTrainingStep(value: String): Self = StObject.set(x, "trainingStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingStepUndefined: Self = StObject.set(x, "trainingStep", js.undefined)
  }
}
