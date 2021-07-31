package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.MACOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetWorkflowRunUsageResponseData extends StObject {
  
  var billable: MACOS
  
  var run_duration_ms: Double
}
object ActionsGetWorkflowRunUsageResponseData {
  
  @scala.inline
  def apply(billable: MACOS, run_duration_ms: Double): ActionsGetWorkflowRunUsageResponseData = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any], run_duration_ms = run_duration_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunUsageResponseData]
  }
  
  @scala.inline
  implicit class ActionsGetWorkflowRunUsageResponseDataMutableBuilder[Self <: ActionsGetWorkflowRunUsageResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillable(value: MACOS): Self = StObject.set(x, "billable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_duration_ms(value: Double): Self = StObject.set(x, "run_duration_ms", value.asInstanceOf[js.Any])
  }
}
