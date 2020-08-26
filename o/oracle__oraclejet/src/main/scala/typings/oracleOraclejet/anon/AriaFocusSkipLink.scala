package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AriaFocusSkipLink extends js.Object {
  var ariaFocusSkipLink: js.UndefOr[String] = js.native
  var labelCancel: js.UndefOr[String] = js.native
}

object AriaFocusSkipLink {
  @scala.inline
  def apply(): AriaFocusSkipLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaFocusSkipLink]
  }
  @scala.inline
  implicit class AriaFocusSkipLinkOps[Self <: AriaFocusSkipLink] (val x: Self) extends AnyVal {
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
    def setAriaFocusSkipLink(value: String): Self = this.set("ariaFocusSkipLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaFocusSkipLink: Self = this.set("ariaFocusSkipLink", js.undefined)
    @scala.inline
    def setLabelCancel(value: String): Self = this.set("labelCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCancel: Self = this.set("labelCancel", js.undefined)
  }
  
}

