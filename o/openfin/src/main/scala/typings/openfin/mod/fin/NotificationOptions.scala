package typings.openfin.mod.fin

import typings.openfin.openfinStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  /**
    * A boolean that will force dismissal even if the mouse is hovering over the notification
    */
  var ignoreMouseOver: js.UndefOr[Boolean] = js.undefined
  /**
    * A message of any primitive or composite-primitive type to be passed to the notification upon creation.
    */
  var message: js.UndefOr[js.Any] = js.undefined
  /**
    * A function that is called when a notification is clicked.
    */
  var onClick: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
  /**
    * Invoked when the notification is closed via .close() method on the created notification instance
    * or the by the notification itself via fin.desktop.Notification.getCurrent().close().
    * NOTE: this is not invoked when the notification is dismissed via a swipe. For the swipe dismissal callback see onDismiss
    */
  var onClose: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
  /**
    * Invoked when a the notification is dismissed by swiping it off the screen to the right. NOTE: this is no fired on a programmatic close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
  /**
    * A function that is called when an error occurs.The reason for the error is passed as an argument.
    */
  var onError: js.UndefOr[
    js.Function1[
      /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * The onMessage function will respond to messages sent from notification.sendMessageToApplication.
    * The function is passed the message, which can be of any primitive or composite-primitive type.
    */
  var onMessage: js.UndefOr[js.Function1[/* callback */ js.Function1[/* message */ js.Any, Unit], Unit]] = js.undefined
  /**
    * A function that is called when a notification is shown.
    */
  var onShow: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* successObj */ SuccessObj, Unit], Unit]
  ] = js.undefined
  /**
    * The timeout for displaying a notification.Can be in milliseconds or "never".
    */
  var timeout: js.UndefOr[Double | never] = js.undefined
  /**
    * The url of the notification
    */
  var url: js.UndefOr[String] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    ignoreMouseOver: js.UndefOr[Boolean] = js.undefined,
    message: js.Any = null,
    onClick: /* callback */ js.Function0[Unit] => Unit = null,
    onClose: /* callback */ js.Function0[Unit] => Unit = null,
    onDismiss: /* callback */ js.Function0[Unit] => Unit = null,
    onError: /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit] => Unit = null,
    onMessage: /* callback */ js.Function1[/* message */ js.Any, Unit] => Unit = null,
    onShow: /* callback */ js.Function1[/* successObj */ SuccessObj, Unit] => Unit = null,
    timeout: Double | never = null,
    url: String = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreMouseOver)) __obj.updateDynamic("ignoreMouseOver")(ignoreMouseOver.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

