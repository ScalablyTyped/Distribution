package typings
package nwDotJsLib.nwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Window: http://docs.nwjs.io/en/latest/References/Window/ */
/**
  * Window is a wrapper of the DOM's window object. It has extended operations and can receive various window events.
  */
@js.native
trait Window
  extends nwDotJsLib.NWJSUnderscoreHelpersNs.EventEmitter {
  /**
    * Get the native Window Object.
    *
    * @param event {DOM Window} (Optional) Is the DOM window
    */
  def get(): nwDotJsLib.NWJSUnderscoreHelpersNs.win = js.native
  def get(window_object: js.Object): nwDotJsLib.NWJSUnderscoreHelpersNs.win = js.native
  /**
    * Open a new window and load url in it.
    *
    * @param url {string} URL to be loaded in the opened window
    * @param option {object} (Optional) New window open options like window subfields in manifest format plus some more options
    * @param callback {string} (Optional) Callback when with the opened native Window object
    * - (Optional) new_win {object} New opened window object.
    */
  def open(url: java.lang.String): scala.Unit = js.native
  def open(url: java.lang.String, option: nwDotJsLib.NWJSUnderscoreHelpersNs.WindowOpenOption): scala.Unit = js.native
  def open(
    url: java.lang.String,
    option: nwDotJsLib.NWJSUnderscoreHelpersNs.WindowOpenOption,
    callback: js.Function1[/* new_win */ js.UndefOr[nwDotJsLib.NWJSUnderscoreHelpersNs.win], scala.Unit]
  ): scala.Unit = js.native
}

