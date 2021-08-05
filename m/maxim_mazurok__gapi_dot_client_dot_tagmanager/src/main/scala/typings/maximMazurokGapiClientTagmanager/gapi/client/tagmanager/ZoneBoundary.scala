package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneBoundary extends StObject {
  
  /** The conditions that, when conjoined, make up the boundary. */
  var condition: js.UndefOr[js.Array[Condition]] = js.undefined
  
  /** Custom evaluation trigger IDs. A zone will evaluate its boundary conditions when any of the listed triggers are true. */
  var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.undefined
}
object ZoneBoundary {
  
  inline def apply(): ZoneBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneBoundary]
  }
  
  extension [Self <: ZoneBoundary](x: Self) {
    
    inline def setCondition(value: js.Array[Condition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: Condition*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    inline def setCustomEvaluationTriggerId(value: js.Array[String]): Self = StObject.set(x, "customEvaluationTriggerId", value.asInstanceOf[js.Any])
    
    inline def setCustomEvaluationTriggerIdUndefined: Self = StObject.set(x, "customEvaluationTriggerId", js.undefined)
    
    inline def setCustomEvaluationTriggerIdVarargs(value: String*): Self = StObject.set(x, "customEvaluationTriggerId", js.Array(value :_*))
  }
}
