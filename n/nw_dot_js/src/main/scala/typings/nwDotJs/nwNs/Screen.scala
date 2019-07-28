package typings.nwDotJs.nwNs

import typings.nwDotJs.NWJSUnderscoreHelpersNs.EventEmitter
import typings.nwDotJs.NWJSUnderscoreHelpersNs.screen
import typings.nwDotJs.nwDotJsStrings.`displayAdded `
import typings.nwDotJs.nwDotJsStrings.`displayRemoved `
import typings.nwDotJs.nwDotJsStrings.displayBoundsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Screen: http://docs.nwjs.io/en/latest/References/Screen/ */
/**
  * Screen is an instance of EventEmitter object, and you"re able to use Screen.on(...) to respond to native screen"s events.
  * Screen is a singleton object, need to be initiated once by calling nw.Screen.Init().
  */
@js.native
trait Screen extends EventEmitter {
  /**
    * Use this API to monitor the changes of screens and windows on desktop. This is an instance of EventEmitter.
    */
  var DesktopCaptureMonitor: typings.nwDotJs.NWJSUnderscoreHelpersNs.DesktopCaptureMonitor = js.native
  /**
    * Get the array of screen (number of screen connected to the computer)
    */
  var screens: js.Array[screen] = js.native
  /**
    * Init the Screen singleton object, you only need to call this once.
    */
  def Init(): Unit = js.native
  /**
    *
    * @param sources {string[]} Array of source types.
    * @param callback {Function} callback function with chosed streamId.
    * - (optional) streamId {string}  streamId will be false if failed to execute or existing session is alive.
    */
  def chooseDesktopMedia(
    sources: js.Array[String],
    callback: js.Function1[/* streamId */ js.UndefOr[String | Boolean], Unit]
  ): Unit = js.native
  /**
    * Emitted when a new screen added.
    *
    * @param event {string} Event name
    * @param listener {Function(screen?)} The callback that handles the `displayAdded` event.
    * - (optional) screen {screen} screen object
    */
  @JSName("on")
  def on_displayAdded(event: `displayAdded `, listener: js.Function1[/* screen */ screen, _]): this.type = js.native
  /**
    * Emitted when the screen resolution, arrangement is changed.
    *
    * @param event {string} Event name
    * @param listener {Function(screen?)} The callback that handles the `displayBoundsChanged` event.
    * - (optional) screen {screen} screen object
    */
  @JSName("on")
  def on_displayBoundsChanged(event: displayBoundsChanged, listener: js.Function1[/* screen */ screen, _]): this.type = js.native
  /**
    * Emitted when existing screen removed.
    *
    * @param event {string} Event name
    * @param listener {Function(screen?)} The callback that handles the `displayRemoved` event.
    * - (optional) screen {screen} screen object
    */
  @JSName("on")
  def on_displayRemoved(event: `displayRemoved `, listener: js.Function1[/* screen */ screen, _]): this.type = js.native
}

