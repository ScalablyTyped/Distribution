package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardInputConfig extends js.Object {
  /**
    * `preventDefault` will be called on every non-modified key which has a key code in this array. By default it is empty.
    */
  var capture: js.UndefOr[js.Array[integer]] = js.undefined
  /**
    * Where the Keyboard Manager listens for keyboard input events.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

object KeyboardInputConfig {
  @scala.inline
  def apply(capture: js.Array[integer] = null, target: js.Any = null): KeyboardInputConfig = {
    val __obj = js.Dynamic.literal()
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInputConfig]
  }
}

