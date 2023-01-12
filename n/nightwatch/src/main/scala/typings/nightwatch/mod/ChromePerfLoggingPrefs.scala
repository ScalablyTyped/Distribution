package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromePerfLoggingPrefs extends StObject {
  
  /**
    * Default: 1000. The requested number of milliseconds between DevTools trace buffer usage events. For example, if 1000,
    * then once per second, DevTools will report how full the trace buffer is. If a report indicates the buffer usage is 100%,
    * a warning will be issued.
    */
  var bufferUsageReportingInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Default: true. Whether or not to collect events from Network domain.
    */
  var enableNetwork: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default: true. Whether or not to collect events from Page domain.
    */
  var enablePage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A comma-separated string of Chrome tracing categories for which trace events should be collected.
    * An unspecified or empty string disables tracing.
    */
  var traceCategories: js.UndefOr[String] = js.undefined
}
object ChromePerfLoggingPrefs {
  
  inline def apply(): ChromePerfLoggingPrefs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromePerfLoggingPrefs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChromePerfLoggingPrefs] (val x: Self) extends AnyVal {
    
    inline def setBufferUsageReportingInterval(value: Double): Self = StObject.set(x, "bufferUsageReportingInterval", value.asInstanceOf[js.Any])
    
    inline def setBufferUsageReportingIntervalUndefined: Self = StObject.set(x, "bufferUsageReportingInterval", js.undefined)
    
    inline def setEnableNetwork(value: Boolean): Self = StObject.set(x, "enableNetwork", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkUndefined: Self = StObject.set(x, "enableNetwork", js.undefined)
    
    inline def setEnablePage(value: Boolean): Self = StObject.set(x, "enablePage", value.asInstanceOf[js.Any])
    
    inline def setEnablePageUndefined: Self = StObject.set(x, "enablePage", js.undefined)
    
    inline def setTraceCategories(value: String): Self = StObject.set(x, "traceCategories", value.asInstanceOf[js.Any])
    
    inline def setTraceCategoriesUndefined: Self = StObject.set(x, "traceCategories", js.undefined)
  }
}
