package typings.onsenui

import typings.onsenui.mod.AlertOptions
import typings.onsenui.mod.OnsOptions
import typings.std.DocumentFragment
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ons {
    
    @JSGlobal("ons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ons.GestureDetector")
    @js.native
    def GestureDetector: Any = js.native
    inline def GestureDetector_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GestureDetector")(x.asInstanceOf[js.Any])
    
    /**
      * @description PageLoader class constructor
      */
    @JSGlobal("ons.PageLoader")
    @js.native
    open class PageLoader protected ()
      extends typings.onsenui.mod.PageLoader {
      def this(args: Any*) = this()
    }
    
    /**
      * @description Create a alert dialog instance from a template.
      * @return Promise object that resolves to the alert dialog component object.
      */
    inline def createAlertDialog(page: String): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlertDialog")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
    inline def createAlertDialog(page: String, options: OnsOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlertDialog")(page.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
    
    /**
      * @description Create a dialog instance from a template.
      * @return Promise object that resolves to the dialog component object.
      */
    inline def createDialog(page: String): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDialog")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
    inline def createDialog(page: String, options: OnsOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDialog")(page.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
    
    /**
      * @description Create a new element from a template. Both inline HTML and external files are supported although the return value differs.
      * @return If the provided template was an inline HTML string, it returns the new element. Otherwise, it returns a promise that resolves to the new element.
      */
    inline def createElement(args: Any*): HTMLElement | js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[HTMLElement | js.Promise[HTMLElement]]
    
    /**
      * @description Create a popover instance from a template.
      * @return Promise object that resolves to the popover component object.
      */
    inline def createPopover(page: String): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopover")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
    inline def createPopover(page: String, options: OnsOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopover")(page.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
    
    /**
      * @description Default page loader that load page template
      */
    @JSGlobal("ons.defaultPageLoader")
    @js.native
    def defaultPageLoader: typings.onsenui.mod.PageLoader = js.native
    inline def defaultPageLoader_=(x: typings.onsenui.mod.PageLoader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPageLoader")(x.asInstanceOf[js.Any])
    
    /**
      * @description Disable all animations. Could be handy for testing and older devices.
      */
    inline def disableAnimations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAnimations")().asInstanceOf[Unit]
    
    /**
      * @description Disable status bar fill feature on iOS7 and above (except for iPhone X)
      */
    inline def disableAutoStatusBarFill(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoStatusBarFill")().asInstanceOf[Unit]
    
    /**
      * @description Disable automatic styling.
      */
    inline def disableAutoStyling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoStyling")().asInstanceOf[Unit]
    
    /**
      * @description Disable device back button event handler
      */
    inline def disableDeviceBackButtonHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableDeviceBackButtonHandler")().asInstanceOf[Unit]
    
    /**
      * @description Disable adding `fa-` prefix automatically to `ons-icon` classes. Useful when including custom icon packs.
      */
    inline def disableIconAutoPrefix(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableIconAutoPrefix")().asInstanceOf[Unit]
    
    /**
      * @description Enable animations (default).
      */
    inline def enableAnimations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAnimations")().asInstanceOf[Unit]
    
    /**
      * @description Enable status bar fill feature on iOS7 and above (except for iPhone X)
      */
    inline def enableAutoStatusBarFill(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAutoStatusBarFill")().asInstanceOf[Unit]
    
    /**
      * @description Enable automatic styling based on OS (default).
      */
    inline def enableAutoStyling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAutoStyling")().asInstanceOf[Unit]
    
    /**
      * @description Enable device back button event handler
      */
    inline def enableDeviceBackButtonHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDeviceBackButtonHandler")().asInstanceOf[Unit]
    
    /**
      * @description Refresh styling for the given platform. Only useful for demos. Use `ons.platform.select(...)` for development and production.
      */
    inline def forcePlatformStyling(platform: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forcePlatformStyling")(platform.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @description Access the last created page from the current `script` scope. Only works inside `<script></script>` tags that are direct children of `ons-page` element. Use this to add lifecycle hooks to a page.
      * @return Returns the corresponding page element.
      */
    inline def getScriptPage(): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getScriptPage")().asInstanceOf[HTMLElement | Null]
    
    /**
      * @return {Boolean} Will be true if Onsen UI is initialized
      * @description Returns true if Onsen UI is initialized
      */
    inline def isReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReady")().asInstanceOf[Boolean]
    
    /**
      * @return {Boolean} Will be true if the app is running in Cordova
      * @description Returns true if running inside Cordova
      */
    inline def isWebView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebView")().asInstanceOf[Boolean]
    
    /**
      * @description Creates a static element similar to iOS status bar. Only useful for browser testing
      */
    inline def mockStatusBar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockStatusBar")().asInstanceOf[Unit]
    
    /**
      * @description Utility methods for modifier attributes
      */
    object modifier {
      
      @JSGlobal("ons.modifier")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @description Add the specified modifiers to the element if they are not already included.
        * @param {HTMLElemenet} element Target element.
        * @param {String} modifier Name of the modifier.
        */
      inline def add(element: HTMLElement, modifier: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(scala.List(element.asInstanceOf[js.Any]).`++`(modifier.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
      
      /**
        * @description Check whether the specified modifier is included in the element.
        * @param {HTMLElemenet} element Target element.
        * @param {String} modifier Name of the modifier.
        * @return {Boolean} 'true' when the specified modifier is found in the element's 'modifier' attribute. 'false' otherwise.
        */
      inline def contains(element: HTMLElement, modifier: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * @description Remove the specified modifiers from the element if they are included.
        * @param {HTMLElemenet} element Target element.
        * @param {String} modifier Name of the modifier.
        */
      inline def remove(element: HTMLElement, modifier: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(scala.List(element.asInstanceOf[js.Any]).`++`(modifier.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
      
      /**
        * @description Toggle the specified modifier.
        * @param {HTMLElemenet} element Target element.
        * @param {String} modifier Name of the modifier.
        * @param {Boolean} force If it evaluates to true, add specified modifier value, and if it evaluates to false, remove it.
        */
      inline def toggle(element: HTMLElement, modifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toggle(element: HTMLElement, modifier: String, force: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * @description Utility methods to create different kinds of alert dialogs. There are three methods available: alert, confirm and prompt
      */
    object notification {
      
      @JSGlobal("ons.notification")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @param {Object} options Parameter object
        * @param {String} [options.message] Alert message
        * @param {String} [options.messageHTML] Alert message in HTML
        * @param {String} [options.buttonLabel] Label for confirmation button. Default is "OK"
        * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
        * @param {String} [options.title] Dialog title. Default is "Alert"
        * @param {String} [options.modifier] Modifier for the dialog
        * @param {String} [options.id] The `<ons-alert-dialog>` element's ID.
        * @param {Function} [options.callback] Function that executes after dialog has been closed
        * @description
        *   Display an alert dialog to show the user a message
        *   The content of the message can be either simple text or HTML
        *   Must specify either message or messageHTML
        */
      inline def alert(message: String): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
      inline def alert(message: String, options: AlertOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
      inline def alert(message: AlertOptions): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
      inline def alert(message: AlertOptions, options: AlertOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
      
      /**
        * @param {Object} options Parameter object
        * @param {String} [options.message] Confirmation question
        * @param {String} [options.messageHTML] Dialog content in HTML
        * @param {Array} [options.buttonLabels] Labels for the buttons. Default is ["Cancel", "OK"]
        * @param {Number} [options.primaryButtonIndex] Index of primary button. Default is 1
        * @param {Boolean} [options.cancelable] Whether the dialog is cancelable or not. Default is false
        * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
        * @param {String} [options.title] Dialog title. Default is "Confirm"
        * @param {String} [options.modifier] Modifier for the dialog
        * @param {String} [options.id] The `<ons-alert-dialog>` element's ID.
        * @param {Function} [options.callback]
        *   Function that executes after the dialog has been closed
        *   Argument for the function is the index of the button that was pressed or -1 if the dialog was canceled
        * @description
        *   Display a dialog to ask the user for confirmation
        *   The default button labels are "Cancel" and "OK" but they can be customized
        *   Must specify either message or messageHTML
        */
      inline def confirm(message: String): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
      inline def confirm(message: String, options: AlertOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
      inline def confirm(message: AlertOptions): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
      inline def confirm(message: AlertOptions, options: AlertOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
      
      /**
        * @param {Object} options Parameter object
        * @param {String} [options.message] Prompt question
        * @param {String} [options.messageHTML] Dialog content in HTML
        * @param {String} [options.buttonLabel] Label for confirmation button. Default is "OK"
        * @param {Number} [options.primaryButtonIndex] Index of primary button. Default is 1
        * @param {Boolean} [options.cancelable] Whether the dialog is cancelable or not. Default is false
        * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
        * @param {String} [options.title] Dialog title. Default is "Alert"
        * @param {String} [options.modifier] Modifier for the dialog
        * @param {String} [options.id] The `<ons-alert-dialog>` element's ID.
        * @param {Function} [options.callback]
        *   Function that executes after the dialog has been closed
        *   Argument for the function is the value of the input field or null if the dialog was canceled
        * @description
        *   Display a dialog with a prompt to ask the user a question
        *   Must specify either message or messageHTML
        */
      inline def prompt(message: String): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
      inline def prompt(message: String, options: AlertOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
      inline def prompt(message: AlertOptions): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
      inline def prompt(message: AlertOptions, options: AlertOptions): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
      
      inline def toast(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toast")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    }
    
    /**
      * @description Shows an instant Action Sheet and lets the user choose an action.
      * @return Will resolve when the action sheet is closed. The resolve value is either the index of the tapped button or -1 when canceled.
      */
    inline def openActionSheet(args: Any*): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("openActionSheet")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Double]]
    
    /**
      * @description Utility methods for orientation detection
      */
    object orientation {
      
      @JSGlobal("ons.orientation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @return {Boolean} Will be true if the current orientation is landscape mode
        * @description Returns whether the current screen orientation is landscape or not
        */
      inline def isLandscape(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLandscape")().asInstanceOf[Boolean]
      
      /**
        * @return {Boolean} Will be true if the current orientation is portrait mode
        * @description Returns whether the current screen orientation is portrait or not
        */
      inline def isPortrait(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPortrait")().asInstanceOf[Boolean]
      
      /**
        * @description Remove an event listener. If the listener is not specified all listeners for the event type will be removed.
        */
      inline def off(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def off(eventName: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * @description Add an event listener.
        */
      inline def on(eventName: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * @description Add an event listener that's only triggered once.
        */
      inline def once(eventName: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * @description Utility methods to detect current platform
      */
    object platform {
      
      @JSGlobal("ons.platform")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @description Returns whether the OS is Android
        * @return {Boolean}
        */
      inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
      
      inline def isAndroidPhone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroidPhone")().asInstanceOf[Boolean]
      
      inline def isAndroidTablet(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroidTablet")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the device is BlackBerry
        * @return {Boolean}
        */
      inline def isBlackBerry(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlackBerry")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the browser is Chrome
        * @return {Boolean}
        */
      inline def isChrome(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")().asInstanceOf[Boolean]
      
      /**
        *
        */
      inline def isEdge(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdge")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the browser is Firefox
        * @return {Boolean}
        */
      inline def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefox")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the browser is Internet Explorer
        * @return {Boolean}
        */
      inline def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the OS is iOS
        * @return {Boolean}
        */
      inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the iOS version is 7 or above
        * @return {Boolean}
        */
      inline def isIOS7above(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS7above")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether app is running in iOS Safari.
        * @return {Boolean}
        */
      inline def isIOSSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOSSafari")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the device is iPad
        * @return {Boolean}
        */
      inline def isIPad(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPad")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the OS is iPadOS
        * @return {Boolean}
        */
      inline def isIPadOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPadOS")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the device is iPhone
        * @return {Boolean}
        */
      inline def isIPhone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhone")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the device is iPhone X
        * @return {Boolean}
        */
      inline def isIPhoneX(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhoneX")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the browser is Opera
        * @return {Boolean}
        */
      inline def isOpera(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpera")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether the browser is Safari
        * @return {Boolean}
        */
      inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether app is running in WKWebView.
        * @return {Boolean}
        */
      inline def isWKWebView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWKWebView")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether device is Windows phone
        * @return {Boolean}
        */
      inline def isWP(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWP")().asInstanceOf[Boolean]
      
      /**
        * @description Returns whether app is running in Cordova
        * @return {Boolean}
        */
      inline def isWebView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebView")().asInstanceOf[Boolean]
      
      /**
        * @param  {string} platform Name of the platform. Possible values are: "opera", "firefox", "safari", "chrome", "ie", "android", "blackberry", "ios" or "wp".
        * @description Sets the platform used to render the elements. Useful for testing.
        */
      inline def select(platform: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(platform.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * @description Separated files need to be requested on demand and this can slightly delay pushing new pages. This method requests and caches templates for later use.
      * @return Promise that resolves when all the templates are cached.
      */
    inline def preload(args: Any*): js.Promise[js.Array[DocumentFragment]] = ^.asInstanceOf[js.Dynamic].applyDynamic("preload")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[js.Array[DocumentFragment]]]
    
    /**
      * @description Method used to wait for app initialization. The callback will not be executed until Onsen UI has been completely initialized
      * @param {Function} callback Function that executes after Onsen UI has been initialized
      */
    inline def ready(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @description If no page is defined for the `ons-loading-placeholder` attribute it will wait for this method being called before loading the page.
      */
    inline def resolveLoadingPlaceholder(page: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLoadingPlaceholder")(page.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @param {Function} listener Function that executes when device back button is pressed
      * @description Set default handler for device back button
      */
    inline def setDefaultDeviceBackButtonListener(listener: js.Function1[/* eventObject */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultDeviceBackButtonListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
