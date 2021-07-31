package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def GestureDetector: js.Any = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GestureDetector").asInstanceOf[js.Any]
@scala.inline
def GestureDetector_=(x: js.Any): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GestureDetector")(x.asInstanceOf[js.Any])

/**
  * @description Create a alert dialog instance from a template.
  * @return Promise object that resolves to the alert dialog component object.
  */
@scala.inline
def createAlertDialog(page: java.lang.String): js.Promise[typings.std.HTMLElement] = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createAlertDialog")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.HTMLElement]]
@scala.inline
def createAlertDialog(page: java.lang.String, options: typings.onsenui.mod.OnsOptions): js.Promise[typings.std.HTMLElement] = (typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createAlertDialog")(page.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.HTMLElement]]

/**
  * @description Create a dialog instance from a template.
  * @return Promise object that resolves to the dialog component object.
  */
@scala.inline
def createDialog(page: java.lang.String): js.Promise[typings.std.HTMLElement] = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createDialog")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.HTMLElement]]
@scala.inline
def createDialog(page: java.lang.String, options: typings.onsenui.mod.OnsOptions): js.Promise[typings.std.HTMLElement] = (typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createDialog")(page.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.HTMLElement]]

/**
  * @description Create a new element from a template. Both inline HTML and external files are supported although the return value differs.
  * @return If the provided template was an inline HTML string, it returns the new element. Otherwise, it returns a promise that resolves to the new element.
  */
@scala.inline
def createElement(args: js.Any*): typings.std.HTMLElement | js.Promise[typings.std.HTMLElement] = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(args.asInstanceOf[js.Any]).asInstanceOf[typings.std.HTMLElement | js.Promise[typings.std.HTMLElement]]

/**
  * @description Create a popover instance from a template.
  * @return Promise object that resolves to the popover component object.
  */
@scala.inline
def createPopover(page: java.lang.String): js.Promise[typings.std.HTMLElement] = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPopover")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.HTMLElement]]
@scala.inline
def createPopover(page: java.lang.String, options: typings.onsenui.mod.OnsOptions): js.Promise[typings.std.HTMLElement] = (typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPopover")(page.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.HTMLElement]]

/**
  * @description Default page loader that load page template
  */
@scala.inline
def defaultPageLoader: typings.onsenui.mod.PageLoader = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultPageLoader").asInstanceOf[typings.onsenui.mod.PageLoader]
@scala.inline
def defaultPageLoader_=(x: typings.onsenui.mod.PageLoader): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultPageLoader")(x.asInstanceOf[js.Any])

/**
  * @description Disable all animations. Could be handy for testing and older devices.
  */
@scala.inline
def disableAnimations(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disableAnimations")().asInstanceOf[scala.Unit]

/**
  * @description Disable status bar fill feature on iOS7 and above (except for iPhone X)
  */
@scala.inline
def disableAutoStatusBarFill(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoStatusBarFill")().asInstanceOf[scala.Unit]

/**
  * @description Disable automatic styling.
  */
@scala.inline
def disableAutoStyling(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoStyling")().asInstanceOf[scala.Unit]

/**
  * @description Disable device back button event handler
  */
@scala.inline
def disableDeviceBackButtonHandler(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disableDeviceBackButtonHandler")().asInstanceOf[scala.Unit]

/**
  * @description Disable adding `fa-` prefix automatically to `ons-icon` classes. Useful when including custom icon packs.
  */
@scala.inline
def disableIconAutoPrefix(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disableIconAutoPrefix")().asInstanceOf[scala.Unit]

/**
  * @description Enable animations (default).
  */
@scala.inline
def enableAnimations(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableAnimations")().asInstanceOf[scala.Unit]

/**
  * @description Enable status bar fill feature on iOS7 and above (except for iPhone X)
  */
@scala.inline
def enableAutoStatusBarFill(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableAutoStatusBarFill")().asInstanceOf[scala.Unit]

/**
  * @description Enable automatic styling based on OS (default).
  */
@scala.inline
def enableAutoStyling(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableAutoStyling")().asInstanceOf[scala.Unit]

/**
  * @description Enable device back button event handler
  */
@scala.inline
def enableDeviceBackButtonHandler(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableDeviceBackButtonHandler")().asInstanceOf[scala.Unit]

/**
  * @description Refresh styling for the given platform. Only useful for demos. Use `ons.platform.select(...)` for development and production.
  */
@scala.inline
def forcePlatformStyling(platform: java.lang.String): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forcePlatformStyling")(platform.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * @description Access the last created page from the current `script` scope. Only works inside `<script></script>` tags that are direct children of `ons-page` element. Use this to add lifecycle hooks to a page.
  * @return Returns the corresponding page element.
  */
@scala.inline
def getScriptPage(): typings.std.HTMLElement | scala.Null = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getScriptPage")().asInstanceOf[typings.std.HTMLElement | scala.Null]

/**
  * @return {Boolean} Will be true if Onsen UI is initialized
  * @description Returns true if Onsen UI is initialized
  */
@scala.inline
def isReady(): scala.Boolean = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isReady")().asInstanceOf[scala.Boolean]

/**
  * @return {Boolean} Will be true if the app is running in Cordova
  * @description Returns true if running inside Cordova
  */
@scala.inline
def isWebView(): scala.Boolean = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isWebView")().asInstanceOf[scala.Boolean]

/**
  * @description Creates a static element similar to iOS status bar. Only useful for browser testing
  */
@scala.inline
def mockStatusBar(): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mockStatusBar")().asInstanceOf[scala.Unit]

/**
  * @description Shows an instant Action Sheet and lets the user choose an action.
  * @return Will resolve when the action sheet is closed. The resolve value is either the index of the tapped button or -1 when canceled.
  */
@scala.inline
def openActionSheet(args: js.Any*): js.Promise[scala.Double] = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openActionSheet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Double]]

/**
  * @description Separated files need to be requested on demand and this can slightly delay pushing new pages. This method requests and caches templates for later use.
  * @return Promise that resolves when all the templates are cached.
  */
@scala.inline
def preload(args: js.Any*): js.Promise[js.Array[typings.std.DocumentFragment]] = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("preload")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.std.DocumentFragment]]]

/**
  * @description Method used to wait for app initialization. The callback will not be executed until Onsen UI has been completely initialized
  * @param {Function} callback Function that executes after Onsen UI has been initialized
  */
@scala.inline
def ready(callback: js.Function): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * @description If no page is defined for the `ons-loading-placeholder` attribute it will wait for this method being called before loading the page.
  */
@scala.inline
def resolveLoadingPlaceholder(page: java.lang.String): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveLoadingPlaceholder")(page.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * @param {Function} listener Function that executes when device back button is pressed
  * @description Set default handler for device back button
  */
@scala.inline
def setDefaultDeviceBackButtonListener(listener: js.Function1[/* eventObject */ js.Any, js.Any]): scala.Unit = typings.onsenui.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultDeviceBackButtonListener")(listener.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
