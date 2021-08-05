package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointData extends StObject {
  
  /** The time interval associated with the point. */
  var timeInterval: js.UndefOr[TimeInterval] = js.undefined
  
  /** The values that make up the point. */
  var values: js.UndefOr[js.Array[TypedValue]] = js.undefined
}
object PointData {
  
  inline def apply(): PointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointData]
  }
  
  extension [Self <: PointData](x: Self) {
    
    inline def setTimeInterval(value: TimeInterval): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
    
    inline def setValues(value: js.Array[TypedValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: TypedValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
