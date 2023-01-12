package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticMessage extends StObject {
  
  /** Information about this diagnostic information. */
  var info: js.UndefOr[LocalizedString] = js.undefined
  
  /** The metric. */
  var metric: js.UndefOr[LocalizedString] = js.undefined
  
  /**
    * Whether this message is specific only for the current metric. By default Diagnostics are shown for all metrics, regardless which metric is the currently selected metric in the UI.
    * However occasionally a metric will generate so many messages that the resulting visual clutter becomes overwhelming. In this case setting this to true, will show the diagnostic
    * messages for that metric only if it is the currently selected metric.
    */
  var metricSpecific: js.UndefOr[Boolean] = js.undefined
  
  /** The severity of the diagnostic message. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** The short message. */
  var shortMessage: js.UndefOr[LocalizedString] = js.undefined
}
object DiagnosticMessage {
  
  inline def apply(): DiagnosticMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticMessage] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: LocalizedString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setMetric(value: LocalizedString): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricSpecific(value: Boolean): Self = StObject.set(x, "metricSpecific", value.asInstanceOf[js.Any])
    
    inline def setMetricSpecificUndefined: Self = StObject.set(x, "metricSpecific", js.undefined)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setShortMessage(value: LocalizedString): Self = StObject.set(x, "shortMessage", value.asInstanceOf[js.Any])
    
    inline def setShortMessageUndefined: Self = StObject.set(x, "shortMessage", js.undefined)
  }
}
