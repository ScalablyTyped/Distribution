package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.UBUNTU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetWorkflowUsageResponseData extends StObject {
  
  var billable: UBUNTU
}
object ActionsGetWorkflowUsageResponseData {
  
  inline def apply(billable: UBUNTU): ActionsGetWorkflowUsageResponseData = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowUsageResponseData]
  }
  
  extension [Self <: ActionsGetWorkflowUsageResponseData](x: Self) {
    
    inline def setBillable(value: UBUNTU): Self = StObject.set(x, "billable", value.asInstanceOf[js.Any])
  }
}
