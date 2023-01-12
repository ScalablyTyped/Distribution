package typings.mondaySdkJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelButton extends StObject {
  
  /**
    * The text for the cancel button
    * Defaults to "Cancel"
    */
  var cancelButton: js.UndefOr[String] = js.undefined
  
  /**
    * The text for the confirmation button
    * Defaults to "OK"
    */
  var confirmButton: js.UndefOr[String] = js.undefined
  
  /**
    * Either to exclude the cancel button
    * Defaults to `false`
    */
  var excludeCancelButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The message to display in the dialog
    */
  var message: String
}
object CancelButton {
  
  inline def apply(message: String): CancelButton = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelButton] (val x: Self) extends AnyVal {
    
    inline def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
    
    inline def setConfirmButton(value: String): Self = StObject.set(x, "confirmButton", value.asInstanceOf[js.Any])
    
    inline def setConfirmButtonUndefined: Self = StObject.set(x, "confirmButton", js.undefined)
    
    inline def setExcludeCancelButton(value: Boolean): Self = StObject.set(x, "excludeCancelButton", value.asInstanceOf[js.Any])
    
    inline def setExcludeCancelButtonUndefined: Self = StObject.set(x, "excludeCancelButton", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
