package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricRule extends StObject {
  
  /**
    * Metrics to update when the selected methods are called, and the associated cost applied to each metric. The key of the map is the metric name, and the values are the amount
    * increased for the metric against which the quota limits are defined. The value must not be negative.
    */
  var metricCosts: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Selects the methods to which this rule applies. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.undefined
}
object MetricRule {
  
  inline def apply(): MetricRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricRule]
  }
  
  extension [Self <: MetricRule](x: Self) {
    
    inline def setMetricCosts(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metricCosts", value.asInstanceOf[js.Any])
    
    inline def setMetricCostsUndefined: Self = StObject.set(x, "metricCosts", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
