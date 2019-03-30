package typings
package naverDashWhaleLib.whaleNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProperties extends js.Object {
  /**
    * Optional. Whether the tab should be active. Does not affect whether the window is focused (see windows.update).
    * @since Chrome 16.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tab should be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Adds or removes the tab from the current selection.
    * @since Chrome 16.
    */
  var highlighted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tab should be muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional. Whether the tab should be pinned.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tab should be selected.
    * @deprecated since Chrome 33. Please use highlighted.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. A URL to navigate the tab to. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateProperties {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    autoDiscardable: js.UndefOr[scala.Boolean] = js.undefined,
    highlighted: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    openerTabId: scala.Int | scala.Double = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(autoDiscardable)) __obj.updateDynamic("autoDiscardable")(autoDiscardable)
    if (!js.isUndefined(highlighted)) __obj.updateDynamic("highlighted")(highlighted)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (openerTabId != null) __obj.updateDynamic("openerTabId")(openerTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UpdateProperties]
  }
}

