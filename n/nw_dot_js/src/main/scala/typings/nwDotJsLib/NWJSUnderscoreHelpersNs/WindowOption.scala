package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Window Option that is in the same format as the Window subfields in manifest format.
  */
trait WindowOption extends js.Object {
  /**
    * Whether the window should always stay on top of other windows.
    */
  var always_on_top: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show as desktop background window under X11 environment
    */
  var as_desktop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify it to false to make the window frameless
    */
  var frame: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether window is fullscreen
    */
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The initial height of the main window.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Path to window’s icon
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id used to identify the window.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to use Kiosk mode.
    */
  var kiosk: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum height of window
    */
  var max_height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum width of window
    */
  var max_width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum height of window
    */
  var min_height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum width of window
    */
  var min_width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls where window will be put, be `null` or `center` or `mouse`
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether window is resizable
    */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify it to false if you want your app to be hidden on startup
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window is shown in taskbar or dock. The default is true.
    */
  var show_in_taskbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default title of window created by NW.js
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to turn on transparent window mode.
    */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window should be visible on all workspaces simultaneously (on platforms that support multiple workspaces, currently Mac OS X and Linux).
    */
  var visible_on_all_workspaces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The initial width of the main window.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

