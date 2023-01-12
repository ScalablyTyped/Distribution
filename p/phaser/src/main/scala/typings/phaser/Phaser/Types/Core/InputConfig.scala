package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputConfig extends StObject {
  
  /**
    * The maximum number of touch pointers. See {@link Phaser.Input.InputManager#pointers}.
    */
  var activePointers: js.UndefOr[Double] = js.undefined
  
  /**
    * Gamepad input configuration. `true` enables gamepad input.
    */
  var gamepad: js.UndefOr[Boolean | GamepadInputConfig] = js.undefined
  
  /**
    * Keyboard input configuration. `true` uses the default configuration and `false` disables keyboard input.
    */
  var keyboard: js.UndefOr[Boolean | KeyboardInputConfig] = js.undefined
  
  /**
    * Mouse input configuration. `true` uses the default configuration and `false` disables mouse input.
    */
  var mouse: js.UndefOr[Boolean | MouseInputConfig] = js.undefined
  
  /**
    * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
    */
  var smoothFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Touch input configuration. `true` uses the default configuration and `false` disables touch input.
    */
  var touch: js.UndefOr[Boolean | TouchInputConfig] = js.undefined
  
  /**
    * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
    */
  var windowEvents: js.UndefOr[Boolean] = js.undefined
}
object InputConfig {
  
  inline def apply(): InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputConfig] (val x: Self) extends AnyVal {
    
    inline def setActivePointers(value: Double): Self = StObject.set(x, "activePointers", value.asInstanceOf[js.Any])
    
    inline def setActivePointersUndefined: Self = StObject.set(x, "activePointers", js.undefined)
    
    inline def setGamepad(value: Boolean | GamepadInputConfig): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
    
    inline def setGamepadUndefined: Self = StObject.set(x, "gamepad", js.undefined)
    
    inline def setKeyboard(value: Boolean | KeyboardInputConfig): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setMouse(value: Boolean | MouseInputConfig): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setSmoothFactor(value: Double): Self = StObject.set(x, "smoothFactor", value.asInstanceOf[js.Any])
    
    inline def setSmoothFactorUndefined: Self = StObject.set(x, "smoothFactor", js.undefined)
    
    inline def setTouch(value: Boolean | TouchInputConfig): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    inline def setWindowEvents(value: Boolean): Self = StObject.set(x, "windowEvents", value.asInstanceOf[js.Any])
    
    inline def setWindowEventsUndefined: Self = StObject.set(x, "windowEvents", js.undefined)
  }
}
