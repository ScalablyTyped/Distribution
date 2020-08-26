package typings.openfin.mod.fin

import typings.openfin.openfinStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationOptions extends js.Object {
  /**
    * A boolean that will force dismissal even if the mouse is hovering over the notification
    */
  var ignoreMouseOver: js.UndefOr[Boolean] = js.native
  /**
    * A message of any primitive or composite-primitive type to be passed to the notification upon creation.
    */
  var message: js.UndefOr[js.Any] = js.native
  /**
    * A function that is called when a notification is clicked.
    */
  var onClick: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  /**
    * Invoked when the notification is closed via .close() method on the created notification instance
    * or the by the notification itself via fin.desktop.Notification.getCurrent().close().
    * NOTE: this is not invoked when the notification is dismissed via a swipe. For the swipe dismissal callback see onDismiss
    */
  var onClose: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  /**
    * Invoked when a the notification is dismissed by swiping it off the screen to the right. NOTE: this is no fired on a programmatic close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  /**
    * A function that is called when an error occurs.The reason for the error is passed as an argument.
    */
  var onError: js.UndefOr[
    js.Function1[
      /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * The onMessage function will respond to messages sent from notification.sendMessageToApplication.
    * The function is passed the message, which can be of any primitive or composite-primitive type.
    */
  var onMessage: js.UndefOr[js.Function1[/* callback */ js.Function1[/* message */ js.Any, Unit], Unit]] = js.native
  /**
    * A function that is called when a notification is shown.
    */
  var onShow: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* successObj */ SuccessObj, Unit], Unit]
  ] = js.native
  /**
    * The timeout for displaying a notification.Can be in milliseconds or "never".
    */
  var timeout: js.UndefOr[Double | never] = js.native
  /**
    * The url of the notification
    */
  var url: js.UndefOr[String] = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreMouseOver(value: Boolean): Self = this.set("ignoreMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreMouseOver: Self = this.set("ignoreMouseOver", js.undefined)
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOnClick(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClose(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnDismiss(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnError(
      value: /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit] => Unit
    ): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnMessage(value: /* callback */ js.Function1[/* message */ js.Any, Unit] => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    @scala.inline
    def setOnShow(value: /* callback */ js.Function1[/* successObj */ SuccessObj, Unit] => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setTimeout(value: Double | never): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

