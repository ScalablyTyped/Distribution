package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelPressed extends StObject {
  
  /**
    * Indicates if the close events are triggered by a user, pressing a cancel button or because the operation
    * was terminated. This parameter is set to true if the close event is fired by user interaction.
    */
  var cancelPressed: js.UndefOr[Boolean] = js.undefined
}
object CancelPressed {
  
  inline def apply(): CancelPressed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelPressed]
  }
  
  extension [Self <: CancelPressed](x: Self) {
    
    inline def setCancelPressed(value: Boolean): Self = StObject.set(x, "cancelPressed", value.asInstanceOf[js.Any])
    
    inline def setCancelPressedUndefined: Self = StObject.set(x, "cancelPressed", js.undefined)
  }
}
