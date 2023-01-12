package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerPlanContainer extends StObject {
  
  // The identifier of the resource that contains the plan.
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource that contains the plan. For supported types, see the previous table. Possible values are:
    * group, unknownFutureValue, roster. Note that you must use the Prefer: include-unknown-enum-members request header to
    * get the following value in this evolvable enum: roster.
    */
  var `type`: js.UndefOr[PlannerContainerType] = js.undefined
  
  // The full canonical URL of the container.
  var url: js.UndefOr[String] = js.undefined
}
object PlannerPlanContainer {
  
  inline def apply(): PlannerPlanContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerPlanContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerPlanContainer] (val x: Self) extends AnyVal {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setType(value: PlannerContainerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
