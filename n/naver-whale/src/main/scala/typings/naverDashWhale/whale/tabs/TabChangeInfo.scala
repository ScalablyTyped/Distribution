package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabChangeInfo extends js.Object {
  /**
    * The tab's new audible state.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.undefined
  /**
    * The tab's new auto-discardable
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.undefined
  /**
    * The tab's new discarded state.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[Boolean] = js.undefined
  /**
    * The tab's new favicon URL.
    * @since Chrome 27.
    */
  var favIconUrl: js.UndefOr[String] = js.undefined
  /**
    * The tab's new muted state and the reason for the change.
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var mutedInfo: js.UndefOr[typings.chrome.chrome.tabs.MutedInfo] = js.undefined
  /**
    * The tab's new pinned state.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /** Optional. The status of the tab. Can be either loading or complete. */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The tab's new title.
    * @since Chrome 48.
    */
  var title: js.UndefOr[String] = js.undefined
  /** Optional. The tab's URL if it has changed. */
  var url: js.UndefOr[String] = js.undefined
}

object TabChangeInfo {
  @scala.inline
  def apply(
    audible: js.UndefOr[Boolean] = js.undefined,
    autoDiscardable: js.UndefOr[Boolean] = js.undefined,
    discarded: js.UndefOr[Boolean] = js.undefined,
    favIconUrl: String = null,
    mutedInfo: typings.chrome.chrome.tabs.MutedInfo = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    status: String = null,
    title: String = null,
    url: String = null
  ): TabChangeInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible)
    if (!js.isUndefined(autoDiscardable)) __obj.updateDynamic("autoDiscardable")(autoDiscardable)
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded)
    if (favIconUrl != null) __obj.updateDynamic("favIconUrl")(favIconUrl)
    if (mutedInfo != null) __obj.updateDynamic("mutedInfo")(mutedInfo)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TabChangeInfo]
  }
}

