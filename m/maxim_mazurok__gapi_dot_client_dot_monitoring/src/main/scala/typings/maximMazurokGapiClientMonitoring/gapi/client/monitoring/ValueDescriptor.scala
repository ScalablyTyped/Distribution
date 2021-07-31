package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDescriptor extends StObject {
  
  /** The value key. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The value stream kind. */
  var metricKind: js.UndefOr[String] = js.undefined
  
  /**
    * The unit in which time_series point values are reported. unit follows the UCUM format for units as seen in https://unitsofmeasure.org/ucum.html. unit is only valid if value_type is
    * INTEGER, DOUBLE, DISTRIBUTION.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /** The value type. */
  var valueType: js.UndefOr[String] = js.undefined
}
object ValueDescriptor {
  
  @scala.inline
  def apply(): ValueDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueDescriptor]
  }
  
  @scala.inline
  implicit class ValueDescriptorMutableBuilder[Self <: ValueDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMetricKind(value: String): Self = StObject.set(x, "metricKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricKindUndefined: Self = StObject.set(x, "metricKind", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
