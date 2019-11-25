package typings.naverDashWhale.whale.windows

import typings.chrome.chrome.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /**
    * Whether the window is set to be always on top.
    * @since Chrome 19.
    */
  var alwaysOnTop: Boolean
  /** Whether the window is currently the focused window. */
  var focused: Boolean
  /** Optional. The height of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned height property, for example when querying closed windows from the sessions API. */
  var height: js.UndefOr[Double] = js.undefined
  /** Optional. The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may not be assigned an ID, for example when querying windows using the sessions API, in which case a session ID may be present. */
  var id: Double
  /** Whether the window is incognito. */
  var incognito: Boolean
  /** Optional. The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may not be assigned left property, for example when querying closed windows from the sessions API. */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * The session ID used to uniquely identify a Window obtained from the sessions API.
    * @since Chrome 31.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  /**
    * The state of this browser window.
    * One of: "normal", "minimized", "maximized", "fullscreen", or "docked"
    * @since Chrome 17.
    */
  var state: String
  /** Array of tabs.Tab objects representing the current tabs in the window. */
  var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
  /** Optional. The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may not be assigned top property, for example when querying closed windows from the sessions API. */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * The type of browser window this is.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var `type`: String
  /** Optional. The width of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned width property, for example when querying closed windows from the sessions API. */
  var width: js.UndefOr[Double] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    alwaysOnTop: Boolean,
    focused: Boolean,
    id: Double,
    incognito: Boolean,
    state: String,
    `type`: String,
    height: Int | Double = null,
    left: Int | Double = null,
    sessionId: String = null,
    tabs: js.Array[Tab] = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): Window = {
    val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

