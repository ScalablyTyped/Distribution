package typings.onsenui.onsenuiMod

import typings.std.DocumentFragment
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onsenui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GestureDetector: js.Any = js.native
  /**
    * @description Default page loader that load page template
    */
  var defaultPageLoader: PageLoader = js.native
  /**
    * @description Create a alert dialog instance from a template.
    * @return Promise object that resolves to the alert dialog component object.
    */
  def createAlertDialog(page: String): js.Promise[HTMLElement] = js.native
  def createAlertDialog(page: String, options: OnsOptions): js.Promise[HTMLElement] = js.native
  /**
    * @description Create a dialog instance from a template.
    * @return Promise object that resolves to the dialog component object.
    */
  def createDialog(page: String): js.Promise[HTMLElement] = js.native
  def createDialog(page: String, options: OnsOptions): js.Promise[HTMLElement] = js.native
  /**
    * @description Create a new element from a template. Both inline HTML and external files are supported although the return value differs.
    * @return If the provided template was an inline HTML string, it returns the new element. Otherwise, it returns a promise that resolves to the new element.
    */
  def createElement(args: js.Any*): HTMLElement | js.Promise[HTMLElement] = js.native
  /**
    * @description Create a popover instance from a template.
    * @return Promise object that resolves to the popover component object.
    */
  def createPopover(page: String): js.Promise[HTMLElement] = js.native
  def createPopover(page: String, options: OnsOptions): js.Promise[HTMLElement] = js.native
  /**
    * @description Disable all animations. Could be handy for testing and older devices.
    */
  def disableAnimations(): Unit = js.native
  /**
    * @description Disable status bar fill feature on iOS7 and above (except for iPhone X)
    */
  def disableAutoStatusBarFill(): Unit = js.native
  /**
    * @description Disable automatic styling.
    */
  def disableAutoStyling(): Unit = js.native
  /**
    * @description Disable device back button event handler
    */
  def disableDeviceBackButtonHandler(): Unit = js.native
  /**
    * @description Disable adding `fa-` prefix automatically to `ons-icon` classes. Useful when including custom icon packs.
    */
  def disableIconAutoPrefix(): Unit = js.native
  /**
    * @description Enable animations (default).
    */
  def enableAnimations(): Unit = js.native
  /**
    * @description Enable status bar fill feature on iOS7 and above (except for iPhone X)
    */
  def enableAutoStatusBarFill(): Unit = js.native
  /**
    * @description Enable automatic styling based on OS (default).
    */
  def enableAutoStyling(): Unit = js.native
  /**
    * @description Enable device back button event handler
    */
  def enableDeviceBackButtonHandler(): Unit = js.native
  /**
    * @description Refresh styling for the given platform. Only useful for demos. Use `ons.platform.select(...)` for development and production.
    */
  def forcePlatformStyling(platform: String): Unit = js.native
  /**
    * @param {Boolean} force Enable or disable the fix.
    * @description Applies a fix for iOS UIWebView which prevents scroll events jumping to pages under the top layer. This may visually affect normal scrolling of UIWebView if you open a dialog/menu before the scroll momentum finished. Disabled by default.
    */
  def forceUIWebViewScrollFix(force: Boolean): Unit = js.native
  /**
    * @description Access the last created page from the current `script` scope. Only works inside `<script></script>` tags that are direct children of `ons-page` element. Use this to add lifecycle hooks to a page.
    * @return Returns the corresponding page element.
    */
  def getScriptPage(): HTMLElement | Null = js.native
  /**
    * @return {Boolean} Will be true if Onsen UI is initialized
    * @description Returns true if Onsen UI is initialized
    */
  def isReady(): Boolean = js.native
  /**
    * @return {Boolean} Will be true if the app is running in Cordova
    * @description Returns true if running inside Cordova
    */
  def isWebView(): Boolean = js.native
  /**
    * @description Creates a static element similar to iOS status bar. Only useful for browser testing
    */
  def mockStatusBar(): Unit = js.native
  /**
    * @description Shows an instant Action Sheet and lets the user choose an action.
    * @return Will resolve when the action sheet is closed. The resolve value is either the index of the tapped button or -1 when canceled.
    */
  def openActionSheet(args: js.Any*): js.Promise[Double] = js.native
  /**
    * @description Separated files need to be requested on demand and this can slightly delay pushing new pages. This method requests and caches templates for later use.
    * @return Promise that resolves when all the templates are cached.
    */
  def preload(args: js.Any*): js.Promise[js.Array[DocumentFragment]] = js.native
  /**
    * @description Method used to wait for app initialization. The callback will not be executed until Onsen UI has been completely initialized
    * @param {Function} callback Function that executes after Onsen UI has been initialized
    */
  def ready(callback: js.Function): Unit = js.native
  /**
    * @description If no page is defined for the `ons-loading-placeholder` attribute it will wait for this method being called before loading the page.
    */
  def resolveLoadingPlaceholder(page: String): Unit = js.native
  /**
    * @param {Function} listener Function that executes when device back button is pressed
    * @description Set default handler for device back button
    */
  def setDefaultDeviceBackButtonListener(listener: js.Function1[/* eventObject */ js.Any, _]): Unit = js.native
}

