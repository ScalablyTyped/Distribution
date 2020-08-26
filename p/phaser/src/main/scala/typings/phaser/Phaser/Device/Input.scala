package typings.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the input support of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.input` from within any Scene.
  */
@js.native
trait Input extends js.Object {
  /**
    * Is navigator.getGamepads available?
    */
  var gamepads: Boolean = js.native
  /**
    * Is mspointer available?
    */
  var mspointer: Boolean = js.native
  /**
    * Is touch available?
    */
  var touch: Boolean = js.native
  /**
    * The newest type of Wheel/Scroll event supported: 'wheel', 'mousewheel', 'DOMMouseScroll'
    */
  var wheelType: String = js.native
}

object Input {
  @scala.inline
  def apply(gamepads: Boolean, mspointer: Boolean, touch: Boolean, wheelType: String): Input = {
    val __obj = js.Dynamic.literal(gamepads = gamepads.asInstanceOf[js.Any], mspointer = mspointer.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], wheelType = wheelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGamepads(value: Boolean): Self = this.set("gamepads", value.asInstanceOf[js.Any])
    @scala.inline
    def setMspointer(value: Boolean): Self = this.set("mspointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def setWheelType(value: String): Self = this.set("wheelType", value.asInstanceOf[js.Any])
  }
  
}

