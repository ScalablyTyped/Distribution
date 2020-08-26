package typings.ngbootbox

import typings.bootbox.BootboxButtonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgBootboxDialog extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var backdrop: js.UndefOr[Boolean] = js.native
  var buttons: js.UndefOr[BootboxButtonMap] = js.native
  var callback: js.UndefOr[js.Function0[_]] = js.native
  var className: js.UndefOr[String] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var onEscape: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var templateUrl: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object NgBootboxDialog {
  @scala.inline
  def apply(): NgBootboxDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NgBootboxDialog]
  }
  @scala.inline
  implicit class NgBootboxDialogOps[Self <: NgBootboxDialog] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBackdrop(value: Boolean): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setButtons(value: BootboxButtonMap): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCallback(value: () => _): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOnEscape(value: () => _ | Boolean): Self = this.set("onEscape", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEscape: Self = this.set("onEscape", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

