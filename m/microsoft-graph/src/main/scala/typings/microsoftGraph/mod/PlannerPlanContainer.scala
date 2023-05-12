package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerPlanContainer extends StObject {
  
  // The identifier of the resource that contains the plan. Optional.
  var containerId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of the resource that contains the plan. For supported types, see the previous table. Possible values are:
    * group, unknownFutureValue, roster. Note that you must use the Prefer: include-unknown-enum-members request header to
    * get the following value in this evolvable enum: roster. Optional.
    */
  var `type`: js.UndefOr[NullableOption[PlannerContainerType]] = js.undefined
  
  // The full canonical URL of the container. Optional.
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerPlanContainer {
  
  inline def apply(): PlannerPlanContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerPlanContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerPlanContainer] (val x: Self) extends AnyVal {
    
    inline def setContainerId(value: NullableOption[String]): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setType(value: NullableOption[PlannerContainerType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
