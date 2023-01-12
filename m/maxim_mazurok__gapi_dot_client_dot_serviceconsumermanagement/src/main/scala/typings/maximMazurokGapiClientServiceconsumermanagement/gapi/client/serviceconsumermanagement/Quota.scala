package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quota extends StObject {
  
  /** List of `QuotaLimit` definitions for the service. */
  var limits: js.UndefOr[js.Array[QuotaLimit]] = js.undefined
  
  /** List of `MetricRule` definitions, each one mapping a selected method to one or more metrics. */
  var metricRules: js.UndefOr[js.Array[MetricRule]] = js.undefined
}
object Quota {
  
  inline def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Quota] (val x: Self) extends AnyVal {
    
    inline def setLimits(value: js.Array[QuotaLimit]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setLimitsVarargs(value: QuotaLimit*): Self = StObject.set(x, "limits", js.Array(value*))
    
    inline def setMetricRules(value: js.Array[MetricRule]): Self = StObject.set(x, "metricRules", value.asInstanceOf[js.Any])
    
    inline def setMetricRulesUndefined: Self = StObject.set(x, "metricRules", js.undefined)
    
    inline def setMetricRulesVarargs(value: MetricRule*): Self = StObject.set(x, "metricRules", js.Array(value*))
  }
}
