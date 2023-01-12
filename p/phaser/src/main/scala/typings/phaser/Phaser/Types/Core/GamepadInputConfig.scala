package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadInputConfig extends StObject {
  
  /**
    * Where the Gamepad Manager listens for gamepad input events.
    */
  var target: js.UndefOr[Any] = js.undefined
}
object GamepadInputConfig {
  
  inline def apply(): GamepadInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamepadInputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GamepadInputConfig] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
