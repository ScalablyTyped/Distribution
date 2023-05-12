package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationReportOverview extends StObject {
  
  /**
    * List of recommended actions for a tenant to improve its security posture based on the attack simulation and training
    * campaign attack type.
    */
  var recommendedActions: js.UndefOr[NullableOption[js.Array[RecommendedAction]]] = js.undefined
  
  // Number of valid users in the attack simulation and training campaign.
  var resolvedTargetsCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Summary of simulation events in the attack simulation and training campaign.
  var simulationEventsContent: js.UndefOr[NullableOption[SimulationEventsContent]] = js.undefined
  
  // Summary of assigned trainings in the attack simulation and training campaign.
  var trainingEventsContent: js.UndefOr[NullableOption[TrainingEventsContent]] = js.undefined
}
object SimulationReportOverview {
  
  inline def apply(): SimulationReportOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationReportOverview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationReportOverview] (val x: Self) extends AnyVal {
    
    inline def setRecommendedActions(value: NullableOption[js.Array[RecommendedAction]]): Self = StObject.set(x, "recommendedActions", value.asInstanceOf[js.Any])
    
    inline def setRecommendedActionsNull: Self = StObject.set(x, "recommendedActions", null)
    
    inline def setRecommendedActionsUndefined: Self = StObject.set(x, "recommendedActions", js.undefined)
    
    inline def setRecommendedActionsVarargs(value: RecommendedAction*): Self = StObject.set(x, "recommendedActions", js.Array(value*))
    
    inline def setResolvedTargetsCount(value: NullableOption[Double]): Self = StObject.set(x, "resolvedTargetsCount", value.asInstanceOf[js.Any])
    
    inline def setResolvedTargetsCountNull: Self = StObject.set(x, "resolvedTargetsCount", null)
    
    inline def setResolvedTargetsCountUndefined: Self = StObject.set(x, "resolvedTargetsCount", js.undefined)
    
    inline def setSimulationEventsContent(value: NullableOption[SimulationEventsContent]): Self = StObject.set(x, "simulationEventsContent", value.asInstanceOf[js.Any])
    
    inline def setSimulationEventsContentNull: Self = StObject.set(x, "simulationEventsContent", null)
    
    inline def setSimulationEventsContentUndefined: Self = StObject.set(x, "simulationEventsContent", js.undefined)
    
    inline def setTrainingEventsContent(value: NullableOption[TrainingEventsContent]): Self = StObject.set(x, "trainingEventsContent", value.asInstanceOf[js.Any])
    
    inline def setTrainingEventsContentNull: Self = StObject.set(x, "trainingEventsContent", null)
    
    inline def setTrainingEventsContentUndefined: Self = StObject.set(x, "trainingEventsContent", js.undefined)
  }
}
