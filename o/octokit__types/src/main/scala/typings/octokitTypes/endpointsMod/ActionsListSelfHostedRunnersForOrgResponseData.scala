package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Busy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListSelfHostedRunnersForOrgResponseData extends js.Object {
  
  var runners: js.Array[Busy] = js.native
  
  var total_count: Double = js.native
}
object ActionsListSelfHostedRunnersForOrgResponseData {
  
  @scala.inline
  def apply(runners: js.Array[Busy], total_count: Double): ActionsListSelfHostedRunnersForOrgResponseData = {
    val __obj = js.Dynamic.literal(runners = runners.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelfHostedRunnersForOrgResponseData]
  }
  
  @scala.inline
  implicit class ActionsListSelfHostedRunnersForOrgResponseDataOps[Self <: ActionsListSelfHostedRunnersForOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRunnersVarargs(value: Busy*): Self = this.set("runners", js.Array(value :_*))
    
    @scala.inline
    def setRunners(value: js.Array[Busy]): Self = this.set("runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}
