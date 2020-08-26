package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AriaCloseSkipLink extends js.Object {
  var ariaCloseSkipLink: js.UndefOr[String] = js.native
  var ariaFocusSkipLink: js.UndefOr[String] = js.native
  var ariaLiveRegionInitialFocusFirstFocusable: js.UndefOr[String] = js.native
  var ariaLiveRegionInitialFocusFirstFocusableTouch: js.UndefOr[String] = js.native
  var ariaLiveRegionInitialFocusNone: js.UndefOr[String] = js.native
  var ariaLiveRegionInitialFocusNoneTouch: js.UndefOr[String] = js.native
}

object AriaCloseSkipLink {
  @scala.inline
  def apply(): AriaCloseSkipLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaCloseSkipLink]
  }
  @scala.inline
  implicit class AriaCloseSkipLinkOps[Self <: AriaCloseSkipLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAriaCloseSkipLink(value: String): Self = this.set("ariaCloseSkipLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaCloseSkipLink: Self = this.set("ariaCloseSkipLink", js.undefined)
    @scala.inline
    def setAriaFocusSkipLink(value: String): Self = this.set("ariaFocusSkipLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaFocusSkipLink: Self = this.set("ariaFocusSkipLink", js.undefined)
    @scala.inline
    def setAriaLiveRegionInitialFocusFirstFocusable(value: String): Self = this.set("ariaLiveRegionInitialFocusFirstFocusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLiveRegionInitialFocusFirstFocusable: Self = this.set("ariaLiveRegionInitialFocusFirstFocusable", js.undefined)
    @scala.inline
    def setAriaLiveRegionInitialFocusFirstFocusableTouch(value: String): Self = this.set("ariaLiveRegionInitialFocusFirstFocusableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLiveRegionInitialFocusFirstFocusableTouch: Self = this.set("ariaLiveRegionInitialFocusFirstFocusableTouch", js.undefined)
    @scala.inline
    def setAriaLiveRegionInitialFocusNone(value: String): Self = this.set("ariaLiveRegionInitialFocusNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLiveRegionInitialFocusNone: Self = this.set("ariaLiveRegionInitialFocusNone", js.undefined)
    @scala.inline
    def setAriaLiveRegionInitialFocusNoneTouch(value: String): Self = this.set("ariaLiveRegionInitialFocusNoneTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLiveRegionInitialFocusNoneTouch: Self = this.set("ariaLiveRegionInitialFocusNoneTouch", js.undefined)
  }
  
}

