package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChecksListForRefResponseData extends js.Object {
  
  var check_runs: js.Array[App] = js.native
  
  var total_count: Double = js.native
}
object ChecksListForRefResponseData {
  
  @scala.inline
  def apply(check_runs: js.Array[App], total_count: Double): ChecksListForRefResponseData = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForRefResponseData]
  }
  
  @scala.inline
  implicit class ChecksListForRefResponseDataOps[Self <: ChecksListForRefResponseData] (val x: Self) extends AnyVal {
    
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
    def setCheck_runsVarargs(value: App*): Self = this.set("check_runs", js.Array(value :_*))
    
    @scala.inline
    def setCheck_runs(value: js.Array[App]): Self = this.set("check_runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}
