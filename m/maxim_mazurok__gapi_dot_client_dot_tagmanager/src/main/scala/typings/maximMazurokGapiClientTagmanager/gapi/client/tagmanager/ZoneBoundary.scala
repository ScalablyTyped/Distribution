package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneBoundary extends StObject {
  
  /** The conditions that, when conjoined, make up the boundary. */
  var condition: js.UndefOr[js.Array[Condition]] = js.native
  
  /** Custom evaluation trigger IDs. A zone will evaluate its boundary conditions when any of the listed triggers are true. */
  var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.native
}
object ZoneBoundary {
  
  @scala.inline
  def apply(): ZoneBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneBoundary]
  }
  
  @scala.inline
  implicit class ZoneBoundaryMutableBuilder[Self <: ZoneBoundary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: js.Array[Condition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setConditionVarargs(value: Condition*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    @scala.inline
    def setCustomEvaluationTriggerId(value: js.Array[String]): Self = StObject.set(x, "customEvaluationTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEvaluationTriggerIdUndefined: Self = StObject.set(x, "customEvaluationTriggerId", js.undefined)
    
    @scala.inline
    def setCustomEvaluationTriggerIdVarargs(value: String*): Self = StObject.set(x, "customEvaluationTriggerId", js.Array(value :_*))
  }
}
