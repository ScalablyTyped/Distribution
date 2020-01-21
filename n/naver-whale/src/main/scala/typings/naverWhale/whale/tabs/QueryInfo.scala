package typings.naverWhale.whale.tabs

import typings.naverWhale.naverWhaleStrings.app
import typings.naverWhale.naverWhaleStrings.complete
import typings.naverWhale.naverWhaleStrings.devtools
import typings.naverWhale.naverWhaleStrings.loading
import typings.naverWhale.naverWhaleStrings.normal
import typings.naverWhale.naverWhaleStrings.panel
import typings.naverWhale.naverWhaleStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  /** Optional. Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are audible.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Whether the tabs can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are in the current window.
    * @since Chrome 19.
    */
  var currentWindow: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Whether the tabs are discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[Boolean] = js.undefined
  /** Optional. Whether the tabs are highlighted. */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. The position of the tabs within their windows.
    * @since Chrome 18.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Optional. Whether the tabs are in the last focused window.
    * @since Chrome 19.
    */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  /** Optional. Whether the tabs are pinned. */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Whether the tabs have completed loading.
    * One of: "loading", or "complete"
    */
  var status: js.UndefOr[loading | complete] = js.undefined
  /** Optional. Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.undefined
  /** Optional. Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Optional. The ID of the parent window, or windows.WINDOW_ID_CURRENT for the current window. */
  var windowId: js.UndefOr[Double] = js.undefined
  /**
    * Optional. The type of window the tabs are in.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowType: js.UndefOr[normal | popup | panel | app | devtools] = js.undefined
}

object QueryInfo {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    audible: js.UndefOr[Boolean] = js.undefined,
    autoDiscardable: js.UndefOr[Boolean] = js.undefined,
    currentWindow: js.UndefOr[Boolean] = js.undefined,
    discarded: js.UndefOr[Boolean] = js.undefined,
    highlighted: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    lastFocusedWindow: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    pinned: js.UndefOr[Boolean] = js.undefined,
    status: loading | complete = null,
    title: String = null,
    url: String | js.Array[String] = null,
    windowId: Int | Double = null,
    windowType: normal | popup | panel | app | devtools = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDiscardable)) __obj.updateDynamic("autoDiscardable")(autoDiscardable.asInstanceOf[js.Any])
    if (!js.isUndefined(currentWindow)) __obj.updateDynamic("currentWindow")(currentWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded.asInstanceOf[js.Any])
    if (!js.isUndefined(highlighted)) __obj.updateDynamic("highlighted")(highlighted.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lastFocusedWindow)) __obj.updateDynamic("lastFocusedWindow")(lastFocusedWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    if (windowType != null) __obj.updateDynamic("windowType")(windowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
}

