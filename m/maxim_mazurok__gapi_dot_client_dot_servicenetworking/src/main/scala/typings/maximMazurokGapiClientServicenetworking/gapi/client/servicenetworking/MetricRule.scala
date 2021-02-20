package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricRule extends StObject {
  
  /**
    * Metrics to update when the selected methods are called, and the associated cost applied to each metric. The key of the map is the metric name, and the values are the amount
    * increased for the metric against which the quota limits are defined. The value must not be negative.
    */
  var metricCosts: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.MetricRule with TopLevel[js.Any]
  ] = js.native
  
  /** Selects the methods to which this rule applies. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.native
}
object MetricRule {
  
  @scala.inline
  def apply(): MetricRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricRule]
  }
  
  @scala.inline
  implicit class MetricRuleMutableBuilder[Self <: MetricRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricCosts(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.MetricRule with TopLevel[js.Any]
    ): Self = StObject.set(x, "metricCosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricCostsUndefined: Self = StObject.set(x, "metricCosts", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
