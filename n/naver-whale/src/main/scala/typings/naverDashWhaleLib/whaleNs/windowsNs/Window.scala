package typings
package naverDashWhaleLib.whaleNs.windowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /**
    * Whether the window is set to be always on top.
    * @since Chrome 19.
    */
  var alwaysOnTop: scala.Boolean
  /** Whether the window is currently the focused window. */
  var focused: scala.Boolean
  /** Optional. The height of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned height property, for example when querying closed windows from the sessions API. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Optional. The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may not be assigned an ID, for example when querying windows using the sessions API, in which case a session ID may be present. */
  var id: scala.Double
  /** Whether the window is incognito. */
  var incognito: scala.Boolean
  /** Optional. The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may not be assigned left property, for example when querying closed windows from the sessions API. */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    * The session ID used to uniquely identify a Window obtained from the sessions API.
    * @since Chrome 31.
    */
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state of this browser window.
    * One of: "normal", "minimized", "maximized", "fullscreen", or "docked"
    * @since Chrome 17.
    */
  var state: java.lang.String
  /** Array of tabs.Tab objects representing the current tabs in the window. */
  var tabs: js.UndefOr[js.Array[chromeLib.chromeNs.tabsNs.Tab]] = js.undefined
  /** Optional. The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may not be assigned top property, for example when querying closed windows from the sessions API. */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    * The type of browser window this is.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var `type`: java.lang.String
  /** Optional. The width of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned width property, for example when querying closed windows from the sessions API. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    alwaysOnTop: scala.Boolean,
    focused: scala.Boolean,
    id: scala.Double,
    incognito: scala.Boolean,
    state: java.lang.String,
    `type`: java.lang.String,
    height: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    sessionId: java.lang.String = null,
    tabs: js.Array[chromeLib.chromeNs.tabsNs.Tab] = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Window = {
    val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop, focused = focused, id = id, incognito = incognito, state = state)
    __obj.updateDynamic("type")(`type`)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

