package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmCallbackValue extends StObject {
  
  /**
    * Click Confirm to return true; click Cancel to return false.
    */
  var confirm: Boolean
}
object ConfirmCallbackValue {
  
  inline def apply(confirm: Boolean): ConfirmCallbackValue = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmCallbackValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmCallbackValue] (val x: Self) extends AnyVal {
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
  }
}
