package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metrics extends js.Object {
  
  /** Number of active users. */
  var activeUsers: js.UndefOr[js.Array[MetricsValue]] = js.native
  
  /** Number of failed executions. */
  var failedExecutions: js.UndefOr[js.Array[MetricsValue]] = js.native
  
  /** Number of total executions. */
  var totalExecutions: js.UndefOr[js.Array[MetricsValue]] = js.native
}
object Metrics {
  
  @scala.inline
  def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    
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
    def setActiveUsersVarargs(value: MetricsValue*): Self = this.set("activeUsers", js.Array(value :_*))
    
    @scala.inline
    def setActiveUsers(value: js.Array[MetricsValue]): Self = this.set("activeUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveUsers: Self = this.set("activeUsers", js.undefined)
    
    @scala.inline
    def setFailedExecutionsVarargs(value: MetricsValue*): Self = this.set("failedExecutions", js.Array(value :_*))
    
    @scala.inline
    def setFailedExecutions(value: js.Array[MetricsValue]): Self = this.set("failedExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedExecutions: Self = this.set("failedExecutions", js.undefined)
    
    @scala.inline
    def setTotalExecutionsVarargs(value: MetricsValue*): Self = this.set("totalExecutions", js.Array(value :_*))
    
    @scala.inline
    def setTotalExecutions(value: js.Array[MetricsValue]): Self = this.set("totalExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalExecutions: Self = this.set("totalExecutions", js.undefined)
  }
}
