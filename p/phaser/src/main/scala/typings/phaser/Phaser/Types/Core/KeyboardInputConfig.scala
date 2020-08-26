package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardInputConfig extends js.Object {
  /**
    * `preventDefault` will be called on every non-modified key which has a key code in this array. By default it is empty.
    */
  var capture: js.UndefOr[js.Array[integer]] = js.native
  /**
    * Where the Keyboard Manager listens for keyboard input events.
    */
  var target: js.UndefOr[js.Any] = js.native
}

object KeyboardInputConfig {
  @scala.inline
  def apply(): KeyboardInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardInputConfig]
  }
  @scala.inline
  implicit class KeyboardInputConfigOps[Self <: KeyboardInputConfig] (val x: Self) extends AnyVal {
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
    def setCaptureVarargs(value: integer*): Self = this.set("capture", js.Array(value :_*))
    @scala.inline
    def setCapture(value: js.Array[integer]): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

