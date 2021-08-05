package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /** The set of label values that uniquely identify this metric. All labels listed in the MetricDescriptor must be assigned values. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.Metric & TopLevel[js.Any]
  ] = js.undefined
  
  /** An existing metric type, see google.api.MetricDescriptor. For example, custom.googleapis.com/invoice/paid/amount. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Metric {
  
  inline def apply(): Metric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metric]
  }
  
  extension [Self <: Metric](x: Self) {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.Metric & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
