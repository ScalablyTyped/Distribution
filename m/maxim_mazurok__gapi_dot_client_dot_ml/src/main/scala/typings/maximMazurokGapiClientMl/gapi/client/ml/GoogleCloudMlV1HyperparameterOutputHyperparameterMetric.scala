package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1HyperparameterOutputHyperparameterMetric extends StObject {
  
  /** The objective value at this training step. */
  var objectiveValue: js.UndefOr[Double] = js.undefined
  
  /** The global training step for this metric. */
  var trainingStep: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1HyperparameterOutputHyperparameterMetric {
  
  inline def apply(): GoogleCloudMlV1HyperparameterOutputHyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] (val x: Self) extends AnyVal {
    
    inline def setObjectiveValue(value: Double): Self = StObject.set(x, "objectiveValue", value.asInstanceOf[js.Any])
    
    inline def setObjectiveValueUndefined: Self = StObject.set(x, "objectiveValue", js.undefined)
    
    inline def setTrainingStep(value: String): Self = StObject.set(x, "trainingStep", value.asInstanceOf[js.Any])
    
    inline def setTrainingStepUndefined: Self = StObject.set(x, "trainingStep", js.undefined)
  }
}
