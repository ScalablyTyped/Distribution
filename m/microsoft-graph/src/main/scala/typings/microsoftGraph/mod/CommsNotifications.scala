package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommsNotifications extends StObject {
  
  // The notification of a change in the resource.
  var value: js.UndefOr[NullableOption[js.Array[CommsNotification]]] = js.undefined
}
object CommsNotifications {
  
  inline def apply(): CommsNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsNotifications]
  }
  
  extension [Self <: CommsNotifications](x: Self) {
    
    inline def setValue(value: NullableOption[js.Array[CommsNotification]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: CommsNotification*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
