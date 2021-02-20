package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommsNotifications extends StObject {
  
  // The notification of a change in the resource.
  var value: js.UndefOr[NullableOption[js.Array[CommsNotification]]] = js.native
}
object CommsNotifications {
  
  @scala.inline
  def apply(): CommsNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsNotifications]
  }
  
  @scala.inline
  implicit class CommsNotificationsMutableBuilder[Self <: CommsNotifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: NullableOption[js.Array[CommsNotification]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: CommsNotification*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
