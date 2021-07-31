package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadInputConfig extends StObject {
  
  /**
    * Where the Gamepad Manager listens for gamepad input events.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}
object GamepadInputConfig {
  
  @scala.inline
  def apply(): GamepadInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamepadInputConfig]
  }
  
  @scala.inline
  implicit class GamepadInputConfigMutableBuilder[Self <: GamepadInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
