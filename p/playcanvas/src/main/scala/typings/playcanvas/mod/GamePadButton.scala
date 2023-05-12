package typings.playcanvas.mod

import typings.std.GamepadButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GamePadButton stores information about a button from the Gamepad API.
  */
trait GamePadButton extends StObject {
  
  /**
    * Whether the button is currently down.
    *
    * @type {boolean}
    */
  var pressed: Boolean
  
  /**
    * Whether the button is currently touched.
    *
    * @type {boolean}
    */
  var touched: Boolean
  
  /**
    * Update the existing GamePadButton Instance.
    *
    * @param {GamepadButton} button - The original Gamepad API gamepad button.
    * @ignore
    */
  def update(button: GamepadButton): Unit
  
  /**
    * The value for the button between 0 and 1, with 0 representing a button that is not pressed, and 1 representing a button that is fully pressed.
    *
    * @type {number}
    */
  var value: Double
  
  /**
    * Whether the button was pressed.
    *
    * @type {boolean}
    */
  var wasPressed: Boolean
  
  /**
    * Whether the button was released since the last update.
    *
    * @type {boolean}
    */
  var wasReleased: Boolean
  
  /**
    * Whether the button was touched since the last update.
    *
    * @type {boolean}
    */
  var wasTouched: Boolean
}
object GamePadButton {
  
  inline def apply(
    pressed: Boolean,
    touched: Boolean,
    update: GamepadButton => Unit,
    value: Double,
    wasPressed: Boolean,
    wasReleased: Boolean,
    wasTouched: Boolean
  ): GamePadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), value = value.asInstanceOf[js.Any], wasPressed = wasPressed.asInstanceOf[js.Any], wasReleased = wasReleased.asInstanceOf[js.Any], wasTouched = wasTouched.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamePadButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GamePadButton] (val x: Self) extends AnyVal {
    
    inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: GamepadButton => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWasPressed(value: Boolean): Self = StObject.set(x, "wasPressed", value.asInstanceOf[js.Any])
    
    inline def setWasReleased(value: Boolean): Self = StObject.set(x, "wasReleased", value.asInstanceOf[js.Any])
    
    inline def setWasTouched(value: Boolean): Self = StObject.set(x, "wasTouched", value.asInstanceOf[js.Any])
  }
}
