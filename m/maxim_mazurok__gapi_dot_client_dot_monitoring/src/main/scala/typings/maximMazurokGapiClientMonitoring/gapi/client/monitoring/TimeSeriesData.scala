package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesData extends StObject {
  
  /**
    * The values of the labels in the time series identifier, given in the same order as the label_descriptors field of the TimeSeriesDescriptor associated with this object. Each value
    * must have a value of the type given in the corresponding entry of label_descriptors.
    */
  var labelValues: js.UndefOr[js.Array[LabelValue]] = js.undefined
  
  /** The points in the time series. */
  var pointData: js.UndefOr[js.Array[PointData]] = js.undefined
}
object TimeSeriesData {
  
  inline def apply(): TimeSeriesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesData]
  }
  
  extension [Self <: TimeSeriesData](x: Self) {
    
    inline def setLabelValues(value: js.Array[LabelValue]): Self = StObject.set(x, "labelValues", value.asInstanceOf[js.Any])
    
    inline def setLabelValuesUndefined: Self = StObject.set(x, "labelValues", js.undefined)
    
    inline def setLabelValuesVarargs(value: LabelValue*): Self = StObject.set(x, "labelValues", js.Array(value :_*))
    
    inline def setPointData(value: js.Array[PointData]): Self = StObject.set(x, "pointData", value.asInstanceOf[js.Any])
    
    inline def setPointDataUndefined: Self = StObject.set(x, "pointData", js.undefined)
    
    inline def setPointDataVarargs(value: PointData*): Self = StObject.set(x, "pointData", js.Array(value :_*))
  }
}
