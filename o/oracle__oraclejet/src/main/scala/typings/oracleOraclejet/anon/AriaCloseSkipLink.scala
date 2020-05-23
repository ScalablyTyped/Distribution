package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AriaCloseSkipLink extends js.Object {
  var ariaCloseSkipLink: js.UndefOr[String] = js.undefined
  var ariaFocusSkipLink: js.UndefOr[String] = js.undefined
  var ariaLiveRegionInitialFocusFirstFocusable: js.UndefOr[String] = js.undefined
  var ariaLiveRegionInitialFocusFirstFocusableTouch: js.UndefOr[String] = js.undefined
  var ariaLiveRegionInitialFocusNone: js.UndefOr[String] = js.undefined
  var ariaLiveRegionInitialFocusNoneTouch: js.UndefOr[String] = js.undefined
}

object AriaCloseSkipLink {
  @scala.inline
  def apply(
    ariaCloseSkipLink: String = null,
    ariaFocusSkipLink: String = null,
    ariaLiveRegionInitialFocusFirstFocusable: String = null,
    ariaLiveRegionInitialFocusFirstFocusableTouch: String = null,
    ariaLiveRegionInitialFocusNone: String = null,
    ariaLiveRegionInitialFocusNoneTouch: String = null
  ): AriaCloseSkipLink = {
    val __obj = js.Dynamic.literal()
    if (ariaCloseSkipLink != null) __obj.updateDynamic("ariaCloseSkipLink")(ariaCloseSkipLink.asInstanceOf[js.Any])
    if (ariaFocusSkipLink != null) __obj.updateDynamic("ariaFocusSkipLink")(ariaFocusSkipLink.asInstanceOf[js.Any])
    if (ariaLiveRegionInitialFocusFirstFocusable != null) __obj.updateDynamic("ariaLiveRegionInitialFocusFirstFocusable")(ariaLiveRegionInitialFocusFirstFocusable.asInstanceOf[js.Any])
    if (ariaLiveRegionInitialFocusFirstFocusableTouch != null) __obj.updateDynamic("ariaLiveRegionInitialFocusFirstFocusableTouch")(ariaLiveRegionInitialFocusFirstFocusableTouch.asInstanceOf[js.Any])
    if (ariaLiveRegionInitialFocusNone != null) __obj.updateDynamic("ariaLiveRegionInitialFocusNone")(ariaLiveRegionInitialFocusNone.asInstanceOf[js.Any])
    if (ariaLiveRegionInitialFocusNoneTouch != null) __obj.updateDynamic("ariaLiveRegionInitialFocusNoneTouch")(ariaLiveRegionInitialFocusNoneTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaCloseSkipLink]
  }
}

