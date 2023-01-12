package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDeviceValidation extends StObject {
  
  var applies_to: js.UndefOr[js.Array[ApplyFilter]] = js.undefined
  
  var max_total_retries: js.UndefOr[Double] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object OnDeviceValidation {
  
  inline def apply(): OnDeviceValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnDeviceValidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDeviceValidation] (val x: Self) extends AnyVal {
    
    inline def setApplies_to(value: js.Array[ApplyFilter]): Self = StObject.set(x, "applies_to", value.asInstanceOf[js.Any])
    
    inline def setApplies_toUndefined: Self = StObject.set(x, "applies_to", js.undefined)
    
    inline def setApplies_toVarargs(value: ApplyFilter*): Self = StObject.set(x, "applies_to", js.Array(value*))
    
    inline def setMax_total_retries(value: Double): Self = StObject.set(x, "max_total_retries", value.asInstanceOf[js.Any])
    
    inline def setMax_total_retriesUndefined: Self = StObject.set(x, "max_total_retries", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
