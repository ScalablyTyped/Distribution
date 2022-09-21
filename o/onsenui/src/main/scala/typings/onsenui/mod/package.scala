package typings.onsenui.mod

import typings.onsenui.mod.^
import typings.std.DocumentFragment
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def GestureDetector: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("GestureDetector").asInstanceOf[Any]
inline def GestureDetector_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GestureDetector")(x.asInstanceOf[js.Any])

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
inline def defaultPageLoader: PageLoader = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultPageLoader").asInstanceOf[PageLoader]
inline def defaultPageLoader_=(x: PageLoader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPageLoader")(x.asInstanceOf[js.Any])

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
  * @description Shows an instant Action Sheet and lets the user choose an action.
  * @return Will resolve when the action sheet is closed. The resolve value is either the index of the tapped button or -1 when canceled.
  */
inline def openActionSheet(args: Any*): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("openActionSheet")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Double]]

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
