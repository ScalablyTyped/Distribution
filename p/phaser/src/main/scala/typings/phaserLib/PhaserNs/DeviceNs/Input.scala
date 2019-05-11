package typings
package phaserLib.PhaserNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the input support of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.input` from within any Scene.
  */
trait Input extends js.Object {
  /**
    * Is navigator.getGamepads available?
    */
  var gamepads: scala.Boolean
  /**
    * Is mspointer available?
    */
  var mspointer: scala.Boolean
  /**
    * Is touch available?
    */
  var touch: scala.Boolean
  /**
    * The newest type of Wheel/Scroll event supported: 'wheel', 'mousewheel', 'DOMMouseScroll'
    */
  var wheelType: java.lang.String
}

object Input {
  @scala.inline
  def apply(
    gamepads: scala.Boolean,
    mspointer: scala.Boolean,
    touch: scala.Boolean,
    wheelType: java.lang.String
  ): Input = {
    val __obj = js.Dynamic.literal(gamepads = gamepads, mspointer = mspointer, touch = touch, wheelType = wheelType)
  
    __obj.asInstanceOf[Input]
  }
}

