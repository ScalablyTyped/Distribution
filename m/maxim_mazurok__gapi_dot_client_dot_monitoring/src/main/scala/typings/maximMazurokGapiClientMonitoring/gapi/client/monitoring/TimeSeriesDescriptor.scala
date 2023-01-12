package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesDescriptor extends StObject {
  
  /** Descriptors for the labels. */
  var labelDescriptors: js.UndefOr[js.Array[LabelDescriptor]] = js.undefined
  
  /** Descriptors for the point data value columns. */
  var pointDescriptors: js.UndefOr[js.Array[ValueDescriptor]] = js.undefined
}
object TimeSeriesDescriptor {
  
  inline def apply(): TimeSeriesDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeSeriesDescriptor] (val x: Self) extends AnyVal {
    
    inline def setLabelDescriptors(value: js.Array[LabelDescriptor]): Self = StObject.set(x, "labelDescriptors", value.asInstanceOf[js.Any])
    
    inline def setLabelDescriptorsUndefined: Self = StObject.set(x, "labelDescriptors", js.undefined)
    
    inline def setLabelDescriptorsVarargs(value: LabelDescriptor*): Self = StObject.set(x, "labelDescriptors", js.Array(value*))
    
    inline def setPointDescriptors(value: js.Array[ValueDescriptor]): Self = StObject.set(x, "pointDescriptors", value.asInstanceOf[js.Any])
    
    inline def setPointDescriptorsUndefined: Self = StObject.set(x, "pointDescriptors", js.undefined)
    
    inline def setPointDescriptorsVarargs(value: ValueDescriptor*): Self = StObject.set(x, "pointDescriptors", js.Array(value*))
  }
}
