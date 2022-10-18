package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pressed extends StObject {
  
  /**
    * The current pressed state of the control.
    */
  var pressed: js.UndefOr[Boolean] = js.undefined
}
object Pressed {
  
  inline def apply(): Pressed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pressed]
  }
  
  extension [Self <: Pressed](x: Self) {
    
    inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
  }
}
