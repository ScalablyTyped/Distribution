package typings.ngtoaster.mod

import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToast extends js.Object {
  var body: js.UndefOr[String] = js.native
  var bodyOutputType: js.UndefOr[String] = js.native
  var clickHandler: js.UndefOr[EventListener] = js.native
  var closeHtml: js.UndefOr[String] = js.native
  var directiveData: js.UndefOr[js.Any] = js.native
  /**
    * Called when the toast has been removed.
    * @param toast the displayed toast
    */
  var onHideCallback: js.UndefOr[IToastCallback] = js.native
  /**
    * Called when the toast has been displayed.
    * @param toast the displayed toast
    */
  var onShowCallback: js.UndefOr[IToastCallback] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var tapToDismiss: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var toastId: js.UndefOr[String | Double] = js.native
  /**
    * Acceptable types are:
    * 'error', 'info', 'wait', 'success', and 'warning'
    */
  var `type`: js.UndefOr[String] = js.native
}

object IToast {
  @scala.inline
  def apply(): IToast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToast]
  }
  @scala.inline
  implicit class IToastOps[Self <: IToast] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyOutputType(value: String): Self = this.set("bodyOutputType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyOutputType: Self = this.set("bodyOutputType", js.undefined)
    @scala.inline
    def setClickHandler(value: /* evt */ Event => Unit): Self = this.set("clickHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClickHandler: Self = this.set("clickHandler", js.undefined)
    @scala.inline
    def setCloseHtml(value: String): Self = this.set("closeHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseHtml: Self = this.set("closeHtml", js.undefined)
    @scala.inline
    def setDirectiveData(value: js.Any): Self = this.set("directiveData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectiveData: Self = this.set("directiveData", js.undefined)
    @scala.inline
    def setOnHideCallback(value: /* toast */ IToast => Unit): Self = this.set("onHideCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHideCallback: Self = this.set("onHideCallback", js.undefined)
    @scala.inline
    def setOnShowCallback(value: /* toast */ IToast => Unit): Self = this.set("onShowCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShowCallback: Self = this.set("onShowCallback", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setTapToDismiss(value: Boolean): Self = this.set("tapToDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapToDismiss: Self = this.set("tapToDismiss", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToastId(value: String | Double): Self = this.set("toastId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToastId: Self = this.set("toastId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

