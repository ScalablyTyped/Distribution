package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessDevices extends StObject {
  
  /**
    * Filter that defines the dynamic-device-syntax rule to include/exclude devices. A filter can use device properties (such
    * as extension attributes) to include/exclude them.
    */
  var deviceFilter: js.UndefOr[NullableOption[ConditionalAccessFilter]] = js.undefined
}
object ConditionalAccessDevices {
  
  inline def apply(): ConditionalAccessDevices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessDevices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessDevices] (val x: Self) extends AnyVal {
    
    inline def setDeviceFilter(value: NullableOption[ConditionalAccessFilter]): Self = StObject.set(x, "deviceFilter", value.asInstanceOf[js.Any])
    
    inline def setDeviceFilterNull: Self = StObject.set(x, "deviceFilter", null)
    
    inline def setDeviceFilterUndefined: Self = StObject.set(x, "deviceFilter", js.undefined)
  }
}
