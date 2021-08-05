package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMonitoringV3Range extends StObject {
  
  /** Range maximum. */
  var max: js.UndefOr[Double] = js.undefined
  
  /** Range minimum. */
  var min: js.UndefOr[Double] = js.undefined
}
object GoogleMonitoringV3Range {
  
  inline def apply(): GoogleMonitoringV3Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMonitoringV3Range]
  }
  
  extension [Self <: GoogleMonitoringV3Range](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
