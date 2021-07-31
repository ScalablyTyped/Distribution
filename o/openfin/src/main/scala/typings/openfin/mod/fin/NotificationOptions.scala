package typings.openfin.mod.fin

import typings.openfin.openfinStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationOptions extends StObject {
  
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
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit class NotificationOptionsMutableBuilder[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreMouseOver(value: Boolean): Self = StObject.set(x, "ignoreMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreMouseOverUndefined: Self = StObject.set(x, "ignoreMouseOver", js.undefined)
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setOnError(
      value: /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit] => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnMessage(value: /* callback */ js.Function1[/* message */ js.Any, Unit] => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* callback */ js.Function1[/* successObj */ SuccessObj, Unit] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | never): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
