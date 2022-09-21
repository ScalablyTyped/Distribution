package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTimeSeriesSummary extends StObject {
  
  /** The number of points that failed to be written. Order is not guaranteed. */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
  
  /** The number of points that were successfully written. */
  var successPointCount: js.UndefOr[Double] = js.undefined
  
  /** The number of points in the request. */
  var totalPointCount: js.UndefOr[Double] = js.undefined
}
object CreateTimeSeriesSummary {
  
  inline def apply(): CreateTimeSeriesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTimeSeriesSummary]
  }
  
  extension [Self <: CreateTimeSeriesSummary](x: Self) {
    
    inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setSuccessPointCount(value: Double): Self = StObject.set(x, "successPointCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessPointCountUndefined: Self = StObject.set(x, "successPointCount", js.undefined)
    
    inline def setTotalPointCount(value: Double): Self = StObject.set(x, "totalPointCount", value.asInstanceOf[js.Any])
    
    inline def setTotalPointCountUndefined: Self = StObject.set(x, "totalPointCount", js.undefined)
  }
}
