package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  /** Number of active users. */
  var activeUsers: js.UndefOr[js.Array[MetricsValue]] = js.undefined
  
  /** Number of failed executions. */
  var failedExecutions: js.UndefOr[js.Array[MetricsValue]] = js.undefined
  
  /** Number of total executions. */
  var totalExecutions: js.UndefOr[js.Array[MetricsValue]] = js.undefined
}
object Metrics {
  
  @scala.inline
  def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  
  @scala.inline
  implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveUsers(value: js.Array[MetricsValue]): Self = StObject.set(x, "activeUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUsersUndefined: Self = StObject.set(x, "activeUsers", js.undefined)
    
    @scala.inline
    def setActiveUsersVarargs(value: MetricsValue*): Self = StObject.set(x, "activeUsers", js.Array(value :_*))
    
    @scala.inline
    def setFailedExecutions(value: js.Array[MetricsValue]): Self = StObject.set(x, "failedExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedExecutionsUndefined: Self = StObject.set(x, "failedExecutions", js.undefined)
    
    @scala.inline
    def setFailedExecutionsVarargs(value: MetricsValue*): Self = StObject.set(x, "failedExecutions", js.Array(value :_*))
    
    @scala.inline
    def setTotalExecutions(value: js.Array[MetricsValue]): Self = StObject.set(x, "totalExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalExecutionsUndefined: Self = StObject.set(x, "totalExecutions", js.undefined)
    
    @scala.inline
    def setTotalExecutionsVarargs(value: MetricsValue*): Self = StObject.set(x, "totalExecutions", js.Array(value :_*))
  }
}
