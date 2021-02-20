package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.UBUNTU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsGetWorkflowUsageResponseData extends StObject {
  
  var billable: UBUNTU = js.native
}
object ActionsGetWorkflowUsageResponseData {
  
  @scala.inline
  def apply(billable: UBUNTU): ActionsGetWorkflowUsageResponseData = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowUsageResponseData]
  }
  
  @scala.inline
  implicit class ActionsGetWorkflowUsageResponseDataMutableBuilder[Self <: ActionsGetWorkflowUsageResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillable(value: UBUNTU): Self = StObject.set(x, "billable", value.asInstanceOf[js.Any])
  }
}
