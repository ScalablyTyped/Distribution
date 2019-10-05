package typings.phaser.Phaser.Scale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Scale.Events")
@js.native
object Events extends js.Object {
  /**
    * The Scale Manager has successfully entered fullscreen mode.
    */
  val ENTER_FULLSCREEN: js.Any = js.native
  /**
    * The Scale Manager tried to enter fullscreen mode but failed.
    */
  val FULLSCREEN_FAILED: js.Any = js.native
  /**
    * The Scale Manager tried to enter fullscreen mode, but it is unsupported by the browser.
    */
  val FULLSCREEN_UNSUPPORTED: js.Any = js.native
  /**
    * The Scale Manager was in fullscreen mode, but has since left, either directly via game code,
    * or via a user gestured, such as pressing the ESC key.
    */
  val LEAVE_FULLSCREEN: js.Any = js.native
  /**
    * The Scale Manager Orientation Change Event.
    */
  val ORIENTATION_CHANGE: js.Any = js.native
  /**
    * The Scale Manager Resize Event.
    * 
    * This event is dispatched whenever the Scale Manager detects a resize event from the browser.
    * It sends three parameters to the callback, each of them being Size components. You can read
    * the `width`, `height`, `aspectRatio` and other properties of these components to help with
    * scaling your own game content.
    */
  val RESIZE: js.Any = js.native
}

