package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceThreshold extends StObject {
  
  /** BasicSli to evaluate to judge window quality. */
  var basicSliPerformance: js.UndefOr[BasicSli] = js.undefined
  
  /** RequestBasedSli to evaluate to judge window quality. */
  var performance: js.UndefOr[RequestBasedSli] = js.undefined
  
  /** If window performance >= threshold, the window is counted as good. */
  var threshold: js.UndefOr[Double] = js.undefined
}
object PerformanceThreshold {
  
  inline def apply(): PerformanceThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceThreshold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceThreshold] (val x: Self) extends AnyVal {
    
    inline def setBasicSliPerformance(value: BasicSli): Self = StObject.set(x, "basicSliPerformance", value.asInstanceOf[js.Any])
    
    inline def setBasicSliPerformanceUndefined: Self = StObject.set(x, "basicSliPerformance", js.undefined)
    
    inline def setPerformance(value: RequestBasedSli): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
