package typings.ngNotify.ngNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the options used to configure notification.
  */
@js.native
trait IUserOptions extends js.Object {
  var button: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
  var sticky: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object IUserOptions {
  @scala.inline
  def apply(): IUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUserOptions]
  }
  @scala.inline
  implicit class IUserOptionsOps[Self <: IUserOptions] (val x: Self) extends AnyVal {
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
    def setButton(value: Boolean): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

