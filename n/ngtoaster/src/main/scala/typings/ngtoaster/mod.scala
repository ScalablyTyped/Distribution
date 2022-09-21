package typings.ngtoaster

import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait IIconClasses extends StObject {
    
    var error: String
    
    var info: String
    
    var success: String
    
    @JSName("wait")
    var wait_FIIconClasses: String
    
    var warning: String
  }
  object IIconClasses {
    
    inline def apply(error: String, info: String, success: String, wait_ : String, warning: String): IIconClasses = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconClasses]
    }
    
    extension [Self <: IIconClasses](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: String): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPopParams
    extends StObject
       with IToast {
    
    var toasterId: js.UndefOr[Double] = js.undefined
  }
  object IPopParams {
    
    inline def apply(): IPopParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopParams]
    }
    
    extension [Self <: IPopParams](x: Self) {
      
      inline def setToasterId(value: Double): Self = StObject.set(x, "toasterId", value.asInstanceOf[js.Any])
      
      inline def setToasterIdUndefined: Self = StObject.set(x, "toasterId", js.undefined)
    }
  }
  
  trait IPopReturn extends StObject {
    
    var toastId: String | Double
    
    var toasterId: Double
  }
  object IPopReturn {
    
    inline def apply(toastId: String | Double, toasterId: Double): IPopReturn = {
      val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any], toasterId = toasterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopReturn]
    }
    
    extension [Self <: IPopReturn](x: Self) {
      
      inline def setToastId(value: String | Double): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
      
      inline def setToasterId(value: Double): Self = StObject.set(x, "toasterId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IToast extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var bodyOutputType: js.UndefOr[String] = js.undefined
    
    var clickHandler: js.UndefOr[EventListener] = js.undefined
    
    var closeHtml: js.UndefOr[String] = js.undefined
    
    var directiveData: js.UndefOr[Any] = js.undefined
    
    /**
      * Called when the toast has been removed.
      * @param toast the displayed toast
      */
    var onHideCallback: js.UndefOr[IToastCallback] = js.undefined
    
    /**
      * Called when the toast has been displayed.
      * @param toast the displayed toast
      */
    var onShowCallback: js.UndefOr[IToastCallback] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var tapToDismiss: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var toastId: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Acceptable types are:
      * 'error', 'info', 'wait', 'success', and 'warning'
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IToast {
    
    inline def apply(): IToast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IToast]
    }
    
    extension [Self <: IToast](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyOutputType(value: String): Self = StObject.set(x, "bodyOutputType", value.asInstanceOf[js.Any])
      
      inline def setBodyOutputTypeUndefined: Self = StObject.set(x, "bodyOutputType", js.undefined)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setClickHandler(value: /* evt */ Event => Unit): Self = StObject.set(x, "clickHandler", js.Any.fromFunction1(value))
      
      inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      inline def setCloseHtml(value: String): Self = StObject.set(x, "closeHtml", value.asInstanceOf[js.Any])
      
      inline def setCloseHtmlUndefined: Self = StObject.set(x, "closeHtml", js.undefined)
      
      inline def setDirectiveData(value: Any): Self = StObject.set(x, "directiveData", value.asInstanceOf[js.Any])
      
      inline def setDirectiveDataUndefined: Self = StObject.set(x, "directiveData", js.undefined)
      
      inline def setOnHideCallback(value: /* toast */ IToast => Unit): Self = StObject.set(x, "onHideCallback", js.Any.fromFunction1(value))
      
      inline def setOnHideCallbackUndefined: Self = StObject.set(x, "onHideCallback", js.undefined)
      
      inline def setOnShowCallback(value: /* toast */ IToast => Unit): Self = StObject.set(x, "onShowCallback", js.Any.fromFunction1(value))
      
      inline def setOnShowCallbackUndefined: Self = StObject.set(x, "onShowCallback", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setTapToDismiss(value: Boolean): Self = StObject.set(x, "tapToDismiss", value.asInstanceOf[js.Any])
      
      inline def setTapToDismissUndefined: Self = StObject.set(x, "tapToDismiss", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToastId(value: String | Double): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
      
      inline def setToastIdUndefined: Self = StObject.set(x, "toastId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type IToastCallback = js.Function1[/* toast */ IToast, Unit]
  
  type IToastEventListener = js.Function3[/* event */ Event, /* toasterId */ Double, /* toastId */ String | Double, Unit]
  
  trait IToasterConfig extends StObject {
    
    /**
      * Options include:
      * '', 'trustedHtml', 'template', 'templateWithData'
      */
    var `body-output-type`: js.UndefOr[String] = js.undefined
    
    var `body-template`: js.UndefOr[String] = js.undefined
    
    var `close-button`: js.UndefOr[Boolean] = js.undefined
    
    var `close-html`: js.UndefOr[String] = js.undefined
    
    var `icon-class`: js.UndefOr[String] = js.undefined
    
    var `icon-classes`: js.UndefOr[IIconClasses] = js.undefined
    
    /**
      * limits max number of toasts
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    var `message-class`: js.UndefOr[String] = js.undefined
    
    /**
      * stop timeout on mouseover and restart timer on mouseout
      */
    var `mouseover-timer-stop`: js.UndefOr[Boolean] = js.undefined
    
    var `newest-on-top`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options include:
      * 'toast-top-full-width', 'toast-bottom-full-width', 'toast-center',
      * 'toast-top-left', 'toast-top-center', 'toast-top-rigt',
      * 'toast-bottom-left', 'toast-bottom-center', 'toast-bottom-rigt',
      */
    var `position-class`: js.UndefOr[String] = js.undefined
    
    var `prevent-duplicates`: js.UndefOr[Boolean] = js.undefined
    
    var `tap-to-dismiss`: js.UndefOr[Boolean] = js.undefined
    
    var `time-out`: js.UndefOr[Double] = js.undefined
    
    var `title-class`: js.UndefOr[String] = js.undefined
  }
  object IToasterConfig {
    
    inline def apply(): IToasterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IToasterConfig]
    }
    
    extension [Self <: IToasterConfig](x: Self) {
      
      inline def `setBody-output-type`(value: String): Self = StObject.set(x, "body-output-type", value.asInstanceOf[js.Any])
      
      inline def `setBody-output-typeUndefined`: Self = StObject.set(x, "body-output-type", js.undefined)
      
      inline def `setBody-template`(value: String): Self = StObject.set(x, "body-template", value.asInstanceOf[js.Any])
      
      inline def `setBody-templateUndefined`: Self = StObject.set(x, "body-template", js.undefined)
      
      inline def `setClose-button`(value: Boolean): Self = StObject.set(x, "close-button", value.asInstanceOf[js.Any])
      
      inline def `setClose-buttonUndefined`: Self = StObject.set(x, "close-button", js.undefined)
      
      inline def `setClose-html`(value: String): Self = StObject.set(x, "close-html", value.asInstanceOf[js.Any])
      
      inline def `setClose-htmlUndefined`: Self = StObject.set(x, "close-html", js.undefined)
      
      inline def `setIcon-class`(value: String): Self = StObject.set(x, "icon-class", value.asInstanceOf[js.Any])
      
      inline def `setIcon-classUndefined`: Self = StObject.set(x, "icon-class", js.undefined)
      
      inline def `setIcon-classes`(value: IIconClasses): Self = StObject.set(x, "icon-classes", value.asInstanceOf[js.Any])
      
      inline def `setIcon-classesUndefined`: Self = StObject.set(x, "icon-classes", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def `setMessage-class`(value: String): Self = StObject.set(x, "message-class", value.asInstanceOf[js.Any])
      
      inline def `setMessage-classUndefined`: Self = StObject.set(x, "message-class", js.undefined)
      
      inline def `setMouseover-timer-stop`(value: Boolean): Self = StObject.set(x, "mouseover-timer-stop", value.asInstanceOf[js.Any])
      
      inline def `setMouseover-timer-stopUndefined`: Self = StObject.set(x, "mouseover-timer-stop", js.undefined)
      
      inline def `setNewest-on-top`(value: Boolean): Self = StObject.set(x, "newest-on-top", value.asInstanceOf[js.Any])
      
      inline def `setNewest-on-topUndefined`: Self = StObject.set(x, "newest-on-top", js.undefined)
      
      inline def `setPosition-class`(value: String): Self = StObject.set(x, "position-class", value.asInstanceOf[js.Any])
      
      inline def `setPosition-classUndefined`: Self = StObject.set(x, "position-class", js.undefined)
      
      inline def `setPrevent-duplicates`(value: Boolean): Self = StObject.set(x, "prevent-duplicates", value.asInstanceOf[js.Any])
      
      inline def `setPrevent-duplicatesUndefined`: Self = StObject.set(x, "prevent-duplicates", js.undefined)
      
      inline def `setTap-to-dismiss`(value: Boolean): Self = StObject.set(x, "tap-to-dismiss", value.asInstanceOf[js.Any])
      
      inline def `setTap-to-dismissUndefined`: Self = StObject.set(x, "tap-to-dismiss", js.undefined)
      
      inline def `setTime-out`(value: Double): Self = StObject.set(x, "time-out", value.asInstanceOf[js.Any])
      
      inline def `setTime-outUndefined`: Self = StObject.set(x, "time-out", js.undefined)
      
      inline def `setTitle-class`(value: String): Self = StObject.set(x, "title-class", value.asInstanceOf[js.Any])
      
      inline def `setTitle-classUndefined`: Self = StObject.set(x, "title-class", js.undefined)
    }
  }
  
  trait IToasterEventRegistry extends StObject {
    
    def setup(): Unit
    
    def subscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit
    
    def subscribeToNewToastEvent(onNewToast: IToastEventListener): Unit
    
    def unsubscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit
    
    def unsubscribeToNewToastEvent(onNewToast: IToastEventListener): Unit
  }
  object IToasterEventRegistry {
    
    inline def apply(
      setup: () => Unit,
      subscribeToClearToastsEvent: IToastEventListener => Unit,
      subscribeToNewToastEvent: IToastEventListener => Unit,
      unsubscribeToClearToastsEvent: IToastEventListener => Unit,
      unsubscribeToNewToastEvent: IToastEventListener => Unit
    ): IToasterEventRegistry = {
      val __obj = js.Dynamic.literal(setup = js.Any.fromFunction0(setup), subscribeToClearToastsEvent = js.Any.fromFunction1(subscribeToClearToastsEvent), subscribeToNewToastEvent = js.Any.fromFunction1(subscribeToNewToastEvent), unsubscribeToClearToastsEvent = js.Any.fromFunction1(unsubscribeToClearToastsEvent), unsubscribeToNewToastEvent = js.Any.fromFunction1(unsubscribeToNewToastEvent))
      __obj.asInstanceOf[IToasterEventRegistry]
    }
    
    extension [Self <: IToasterEventRegistry](x: Self) {
      
      inline def setSetup(value: () => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
      
      inline def setSubscribeToClearToastsEvent(value: IToastEventListener => Unit): Self = StObject.set(x, "subscribeToClearToastsEvent", js.Any.fromFunction1(value))
      
      inline def setSubscribeToNewToastEvent(value: IToastEventListener => Unit): Self = StObject.set(x, "subscribeToNewToastEvent", js.Any.fromFunction1(value))
      
      inline def setUnsubscribeToClearToastsEvent(value: IToastEventListener => Unit): Self = StObject.set(x, "unsubscribeToClearToastsEvent", js.Any.fromFunction1(value))
      
      inline def setUnsubscribeToNewToastEvent(value: IToastEventListener => Unit): Self = StObject.set(x, "unsubscribeToNewToastEvent", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IToasterService extends StObject {
    
    def clear(): Unit = js.native
    def clear(toasterId: Double): Unit = js.native
    def clear(toasterId: Double, toastId: String): Unit = js.native
    def clear(toasterId: Double, toastId: Double): Unit = js.native
    def clear(toasterId: Unit, toastId: String): Unit = js.native
    def clear(toasterId: Unit, toastId: Double): Unit = js.native
    
    def error(params: IPopParams): Unit = js.native
    def error(
      title: js.UndefOr[String],
      body: js.UndefOr[String],
      timeout: js.UndefOr[Double],
      bodyOutputType: js.UndefOr[String],
      clickHandler: js.UndefOr[EventListener],
      toasterId: js.UndefOr[Double],
      showCloseButton: js.UndefOr[Boolean],
      toastId: js.UndefOr[String | Double],
      onHideCallback: js.UndefOr[IToastCallback]
    ): IPopReturn = js.native
    
    def info(params: IPopParams): Unit = js.native
    def info(
      title: js.UndefOr[String],
      body: js.UndefOr[String],
      timeout: js.UndefOr[Double],
      bodyOutputType: js.UndefOr[String],
      clickHandler: js.UndefOr[EventListener],
      toasterId: js.UndefOr[Double],
      showCloseButton: js.UndefOr[Boolean],
      toastId: js.UndefOr[String | Double],
      onHideCallback: js.UndefOr[IToastCallback]
    ): IPopReturn = js.native
    
    def pop(params: IPopParams): Unit = js.native
    /**
      * @param type Type of toaster  -- 'error', 'info', 'wait', 'success', and 'warning'
      */
    def pop(
      `type`: js.UndefOr[String],
      title: js.UndefOr[String],
      body: js.UndefOr[String],
      timeout: js.UndefOr[Double],
      bodyOutputType: js.UndefOr[String],
      clickHandler: js.UndefOr[EventListener],
      toasterId: js.UndefOr[Double],
      showCloseButton: js.UndefOr[Boolean],
      toastId: js.UndefOr[String | Double],
      onHideCallback: js.UndefOr[IToastCallback]
    ): IPopReturn = js.native
    
    def success(params: IPopParams): Unit = js.native
    def success(
      title: js.UndefOr[String],
      body: js.UndefOr[String],
      timeout: js.UndefOr[Double],
      bodyOutputType: js.UndefOr[String],
      clickHandler: js.UndefOr[EventListener],
      toasterId: js.UndefOr[Double],
      showCloseButton: js.UndefOr[Boolean],
      toastId: js.UndefOr[String | Double],
      onHideCallback: js.UndefOr[IToastCallback]
    ): IPopReturn = js.native
    
    var toast: IToast = js.native
    
    def wait(params: IPopParams): Unit = js.native
    def wait(
      title: js.UndefOr[String],
      body: js.UndefOr[String],
      timeout: js.UndefOr[Double],
      bodyOutputType: js.UndefOr[String],
      clickHandler: js.UndefOr[EventListener],
      toasterId: js.UndefOr[Double],
      showCloseButton: js.UndefOr[Boolean],
      toastId: js.UndefOr[String | Double],
      onHideCallback: js.UndefOr[IToastCallback]
    ): IPopReturn = js.native
    
    def warning(params: IPopParams): Unit = js.native
    def warning(
      title: js.UndefOr[String],
      body: js.UndefOr[String],
      timeout: js.UndefOr[Double],
      bodyOutputType: js.UndefOr[String],
      clickHandler: js.UndefOr[EventListener],
      toasterId: js.UndefOr[Double],
      showCloseButton: js.UndefOr[Boolean],
      toastId: js.UndefOr[String | Double],
      onHideCallback: js.UndefOr[IToastCallback]
    ): IPopReturn = js.native
  }
}
