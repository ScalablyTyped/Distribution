package typings.openfin.mod.fin

import typings.openfin.anon.PartialViewOptions
import typings.openfin.anon.PickBoundsheightwidthtopl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinView extends js.Object {
  /**
    * Executes Javascript on the view, restricted to contents you own or contents owned by
    * applications you have created.
    * @param { string } code JavaScript code to be executed on the view.
    * @function executeJavaScript
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.executeJavaScript
    */
  /**
    * Focuses the view
    * @return {Promise.<void>}
    * @function focus
    * @memberof View
    * @emits focused
    * @instance
    * @tutorial View.focus
    * @experimental
    */
  /**
    * Returns the zoom level of the view.
    * @function getZoomLevel
    * @memberOf View
    * @instance
    * @return {Promise.<number>}
    * @tutorial View.getZoomLevel
    */
  /**
    * Sets the zoom level of the view.
    * @param { number } level The zoom level
    * @function setZoomLevel
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.setZoomLevel
    */
  /**
    * Find and highlight text on a page.
    * @param { string } searchTerm Term to find in page
    * @param { FindInPageOptions } options Search options
    * @function findInPage
    * @memberOf View
    * @instance
    * @return {Promise.<number>}
    * @tutorial View.findInPage
    */
  /**
    * Stops any findInPage call with the provided action.
    * @param {string} action
    * Action to execute when stopping a find in page:<br>
    * "clearSelection" - Clear the selection.<br>
    * "keepSelection" - Translate the selection into a normal selection.<br>
    * "activateSelection" - Focus and click the selection node.<br>
    * @function stopFindInPage
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.stopFindInPage
    */
  /**
    * Navigates the view to a specified URL. The url must contain the protocol prefix such as http:// or https://.
    * @param { string } url - The URL to navigate the view to.
    * @return {Promise.<void>}
    * @function navigate
    * @memberof View
    * @instance
    * @tutorial View.navigate
    * @experimental
    */
  /**
    * Navigates the view back one page.
    * @function navigateBack
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.navigateBack
    */
  /**
    * Navigates the view forward one page.
    * @function navigateForward
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.navigateForward
    */
  /**
    * Stops any current navigation the view is performing.
    * @function stopNavigation
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.stopNavigation
    */
  /**
    * Reloads the view current page
    * @function reload
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.reload
    */
  /**
    * Prints the view's web page
    * @param { PrintOptions } [options] Printer Options
    * @function print
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.print
    */
  /**
    * Returns an array with all system printers
    * @function getPrinters
    * @memberOf View
    * @instance
    * @return { Promise.Array.<PrinterInfo> }
    * @tutorial View.getPrinters
    */
  /**
    * Shows the Chromium Developer Tools
    * @function showDeveloperTools
    * @memberOf View
    * @instance
    * @return {Promise.<void>}
    * @tutorial View.showDeveloperTools
    */
  /**
    * Attaches the current view to a the given window identity.
    * Identity must be the identity of a window in the same application.
    * This detaches the view from its current window, and sets the view to be destroyed when its new window closes.
    * @param target {Identity}
    * @return {Promise.<void>}
    * @tutorial View.attach
    * @experimental
    */
  def attach(target: Identity): js.Promise[Unit] = js.native
  /**
    * Destroys the current view
    * @return {Promise.<void>}
    * @tutorial View.destroy
    * @experimental
    */
  def destroy(): js.Promise[Unit] = js.native
  /**
    * Gets the bounds (top, left, width, height) of the view relative to its window.
    * @return {Promise.<Bounds>}
    * @tutorial View.getBounds
    * @experimental
    */
  def getBounds(): js.Promise[_] = js.native
  /**
    * Retrieves the window the view is currently attached to.
    * @return {Promise.<_Window>}
    * @experimental
    */
  def getCurrentWindow(): js.Promise[_Window] = js.native
  /**
    * Gets the View's info.
    * @return {Promise.<ViewInfo>}
    * @tutorial View.getInfo
    * @experimental
    */
  def getInfo(): js.Promise[_] = js.native
  /**
    * Gets the View's options.
    * @return {Promise<ViewCreationOptions>}
    * @tutorial View.getOptions
    * @experimental
    */
  def getOptions(): js.Promise[ViewCreationOptions] = js.native
  /**
    * Hides the current view if it is currently visible.
    * @return {Promise.<void>}
    * @tutorial View.hide
    * @experimental
    */
  def hide(): js.Promise[Unit] = js.native
  /**
    * Sets the bounds (top, left, width, height) of the view relative to its window.
    * @param bounds {Bounds}
    * @return {Promise.<void>}
    * @tutorial View.setBounds
    * @experimental
    */
  def setBounds(bounds: PickBoundsheightwidthtopl): js.Promise[Unit] = js.native
  /**
    * Sets a custom window handler. Only works if experimental child windows are enabled for the view.
    * Takes a match pattern or array of match patterns for which to call the handler.
    * If multiple handlers are set that match a url, only the first set one will be called.
    * This can be used to "cascade" listeners.
    * Returns a function to unsubscribe this handler.
    * @tutorial View.setCustomWindowHandler
    * @param { string | string[] } urls Url match pattern or array of match patterns
    * see (https://developer.chrome.com/extensions/match_patterns)
    * @param {Function} handler function that will be called with the window options that match the url.
    * @return {Function}
    * @experimental
    */
  def setCustomWindowHandler(urls: String, handler: js.Function1[/* options */ WindowOption, Unit]): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
  def setCustomWindowHandler(urls: js.Array[String], handler: js.Function1[/* options */ WindowOption, Unit]): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
  /**
    * Shows the current view if it is currently hidden.
    * @return {Promise.<void>}
    * @tutorial View.show
    * @experimental
    */
  def show(): js.Promise[Unit] = js.native
  /**
    * Gets the view's info.
    * @param { Partial<ViewOptions> } options
    * @return {Promise.<void>}
    * @tutorial View.updateOptions
    * @experimental
    */
  def updateOptions(options: PartialViewOptions): js.Promise[_] = js.native
}

