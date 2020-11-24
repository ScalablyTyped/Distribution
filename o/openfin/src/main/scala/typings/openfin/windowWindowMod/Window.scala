package typings.openfin.windowWindowMod

import typings.openfin.applicationMod.Application
import typings.openfin.externalWindowExternalWindowMod.ExternalWindow
import typings.openfin.identityMod.Identity
import typings.openfin.shapesMod.AnchorType
import typings.openfin.shapesMod.Bounds
import typings.openfin.shapesMod.Transition
import typings.openfin.shapesMod.TransitionOptions
import typings.openfin.viewViewMod.View
import typings.openfin.webcontentsWebcontentsMod.WebContents
import typings.openfin.windowMod.WindowEvents
import typings.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/window/window", "_Window")
@js.native
class Window protected () extends WebContents[WindowEvents] {
  def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
  
  /**
    * Performs the specified window transitions.
    * @param {Transition} transitions - Describes the animations to perform. See the tutorial.
    * @param {TransitionOptions} options - Options for the animation. See the tutorial.
    * @return {Promise.<void>}
    * @tutorial Window.animate
    */
  def animate(transitions: Transition, options: TransitionOptions): js.Promise[Unit] = js.native
  
  /**
    * Provides credentials to authentication requests
    * @param { string } userName userName to provide to the authentication challenge
    * @param { string } password password to provide to the authentication challenge
    * @return {Promise.<void>}
    * @tutorial Window.authenticate
    */
  def authenticate(userName: String, password: String): js.Promise[Unit] = js.native
  
  /**
    * Removes focus from the window.
    * @return {Promise.<void>}
    * @tutorial Window.blur
    */
  def blur(): js.Promise[Unit] = js.native
  
  /**
    * Brings the window to the front of the window stack.
    * @return {Promise.<void>}
    * @tutorial Window.bringToFront
    */
  def bringToFront(): js.Promise[Unit] = js.native
  
  /**
    * Centers the window on its current screen.
    * @return {Promise.<void>}
    * @tutorial Window.center
    */
  def center(): js.Promise[Unit] = js.native
  
  /**
    * closes the window application
    * @param { boolean } [force = false] Close will be prevented from closing when force is false and
    *  ‘close-requested’ has been subscribed to for application’s main window.
    * @return {Promise.<void>}
    * @tutorial Window.close
    */
  def close(): js.Promise[Unit] = js.native
  def close(force: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - Called whenever an event of the specified type occurs.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function addListener
    * @memberof Window
    * @instance
    * @tutorial Window.EventEmitter
    */
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - Called whenever an event of the specified type occurs.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function on
    * @memberof Window
    * @instance
    * @tutorial Window.EventEmitter
    */
  /**
    * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function once
    * @memberof Window
    * @instance
    * @tutorial Window.EventEmitter
    */
  /**
    * Adds a listener to the beginning of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function prependListener
    * @memberof Window
    * @instance
    * @tutorial Window.EventEmitter
    */
  /**
    * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
    * The listener is added to the beginning of the listeners array.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function prependOnceListener
    * @memberof Window
    * @instance
    * @tutorial Window.EventEmitter
    */
  /**
    * Remove a listener from the listener array for the specified event.
    * Caution: Calling this method changes the array indices in the listener array behind the listener.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function removeListener
    * @memberof Window
    * @instance
    * @tutorial Window.EventEmitter
    */
  /**
    * Removes all listeners, or those of the specified event.
    * @param { string | symbol } [eventType]  - The type of the event.
    * @return {Promise.<this>}
    * @function removeAllListeners
    * @memberof Window
    * @instance
    * @tutorial Window.EventEmitter
    */
  /**
    * Gets a base64 encoded image of the window or a part of it.
    * @function capturePage
    * @param { CapturePageOptions } [options] options for capturePage call.
    * @return {Promise.<string>}
    * @memberof Window
    * @instance
    * @tutorial Window.capturePage
    */
  /**
    * Executes Javascript on the window, restricted to windows you own or windows owned by
    * applications you have created.
    * @param { string } code JavaScript code to be executed on the window.
    * @function executeJavaScript
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.executeJavaScript
    */
  /**
    * Gives focus to the window.
    * @return {Promise.<void>}
    * @function focus
    * @emits focused
    * @memberOf Window
    * @instance
    * @tutorial Window.focus
    */
  /**
    * Returns the zoom level of the window.
    * @function getZoomLevel
    * @memberOf Window
    * @instance
    * @return {Promise.<number>}
    * @tutorial Window.getZoomLevel
    */
  /**
    * Sets the zoom level of the window.
    * @param { number } level The zoom level
    * @function setZoomLevel
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.setZoomLevel
    */
  /**
    * Find and highlight text on a page.
    * @param { string } searchTerm Term to find in page
    * @param { FindInPageOptions } options Search options
    * @function findInPage
    * @memberOf Window
    * @instance
    * @return {Promise.<number>}
    * @tutorial Window.findInPage
    */
  /**
    * Stops any findInPage call with the provided action.
    * @param {string} action
    * Action to execute when stopping a find in page:<br>
    * "clearSelection" - Clear the selection.<br>
    * "keepSelection" - Translate the selection into a normal selection.<br>
    * "activateSelection" - Focus and click the selection node.<br>
    * @function stopFindInPage
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.stopFindInPage
    */
  /**
    * Navigates the window to a specified URL. The url must contain the protocol prefix such as http:// or https://.
    * @param {string} url - The URL to navigate the window to.
    * @function navigate
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.navigate
    */
  /**
    * Navigates the window back one page.
    * @function navigateBack
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.navigateBack
    */
  /**
    * Navigates the window forward one page.
    * @function navigateForward
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.navigateForward
    */
  /**
    * Stops any current navigation the window is performing.
    * @function stopNavigation
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.stopNavigation
    */
  /**
    * Reloads the window current page
    * @function reload
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.reload
    */
  /**
    * Prints the window's web page
    * @param { PrintOptions } [options] Printer Options
    * @function print
    * @memberOf Window
    * @instance
    * @return {Promise.<void>}
    * @tutorial Window.print
    */
  /**
    * Returns an array with all system printers
    * @function getPrinters
    * @memberOf Window
    * @instance
    * @return { Promise.Array.<PrinterInfo> }
    * @tutorial Window.getPrinters
    */
  def createWindow(options: WindowOption): js.Promise[Window] = js.native
  
  def disableFrame(): js.Promise[Unit] = js.native
  
  /**
    * Prevents a user from changing a window's size/position when using the window's frame.
    * @return {Promise.<void>}
    * @tutorial Window.disableUserMovement
    */
  def disableUserMovement(): js.Promise[Unit] = js.native
  
  def enableFrame(): js.Promise[Unit] = js.native
  
  /**
    * Re-enables user changes to a window's size/position when using the window's frame.
    * @return {Promise.<void>}
    * @tutorial Window.enableUserMovement
    */
  def enableUserMovement(): js.Promise[Unit] = js.native
  
  /**
    * Flashes the window’s frame and taskbar icon until stopFlashing is called or until a focus event is fired.
    * @return {Promise.<void>}
    * @tutorial Window.flash
    */
  def flash(): js.Promise[Unit] = js.native
  
  def focusedWebViewWasChanged(): js.Promise[Unit] = js.native
  
  /**
    * Retrieves an array of frame info objects representing the main frame and any
    * iframes that are currently on the page.
    * @return {Promise.<Array<FrameInfo>>}
    * @tutorial Window.getAllFrames
    */
  def getAllFrames(): js.Promise[js.Array[FrameInfo]] = js.native
  
  /**
    * Gets the current bounds (top, bottom, right, left, width, height) of the window.
    * @return {Promise.<Bounds>}
    * @tutorial Window.getBounds
    */
  def getBounds(): js.Promise[Bounds] = js.native
  
  /**
    * Retrieves window's attached views.
    * @experimental
    * @return {Promise.Array.<View>}
    * @tutorial Window.getCurrentViews
    */
  def getCurrentViews(): js.Promise[js.Array[View]] = js.native
  
  /**
    * Retrieves an array containing wrapped fin.Windows that are grouped with this window.
    * If a window is not in a group an empty array is returned. Please note that
    * calling window is included in the result array.
    * @return {Promise.<Array<_Window|ExternalWindow>>}
    * @tutorial Window.getGroup
    */
  def getGroup(): js.Promise[js.Array[Window | ExternalWindow]] = js.native
  
  /**
    * Gets an information object for the window.
    * @return {Promise.<WindowInfo>}
    * @tutorial Window.getInfo
    */
  def getInfo(): js.Promise[WindowInfo] = js.native
  
  /**
    * Returns the native OS level Id.
    * In Windows, it will return the Windows [handle](https://docs.microsoft.com/en-us/windows/desktop/WinProg/windows-data-types#HWND).
    * @return {Promise.<string>}
    * @tutorial Window.getNativeId
    */
  def getNativeId(): js.Promise[String] = js.native
  
  /**
    * Gets the current settings of the window.
    * @return {Promise.<any>}
    * @tutorial Window.getOptions
    */
  def getOptions(): js.Promise[_] = js.native
  
  /**
    * Gets the parent application.
    * @return {Promise.<Application>}
    * @tutorial Window.getParentApplication
    */
  def getParentApplication(): js.Promise[Application] = js.native
  
  /**
    * Gets the parent window.
    * @return {Promise.<_Window>}
    * @tutorial Window.getParentWindow
    */
  def getParentWindow(): js.Promise[Window] = js.native
  
  /**
    * ***DEPRECATED - please use Window.capturePage.***
    * Gets a base64 encoded PNG image of the window or just part a of it.
    * @param { Area } [area] The area of the window to be captured.
    * Omitting it will capture the whole visible window.
    * @return {Promise.<string>}
    * @tutorial Window.capturePage
    */
  def getSnapshot(): js.Promise[String] = js.native
  def getSnapshot(area: Area): js.Promise[String] = js.native
  
  /**
    * Gets the current state ("minimized", "maximized", or "restored") of the window.
    * @return {Promise.<string>}
    * @tutorial Window.getState
    */
  def getState(): js.Promise[String] = js.native
  
  /**
    * Gets the [Window Object](https://developer.mozilla.org/en-US/docs/Web/API/Window) previously getNativeWindow
    * @return {object}
    * @tutorial Window.getWebWindow
    */
  def getWebWindow(): typings.std.Window = js.native
  
  /**
    * Hides the window.
    * @return {Promise.<void>}
    * @tutorial Window.hide
    */
  def hide(): js.Promise[Unit] = js.native
  
  /**
    * Determines if the window is a main window.
    * @return {boolean}
    * @tutorial Window.isMainWindow
    */
  def isMainWindow(): Boolean = js.native
  
  /**
    * Determines if the window is currently showing.
    * @return {Promise.<boolean>}
    * @tutorial Window.isShowing
    */
  def isShowing(): js.Promise[Boolean] = js.native
  
  def joinGroup(target: ExternalWindow): js.Promise[Unit] = js.native
  /**
    * Joins the same window group as the specified window.
    * Joining a group with native windows is currently not supported(method will nack).
    * @param { _Window | ExternalWindow } target The window whose group is to be joined
    * @return {Promise.<void>}
    * @tutorial Window.joinGroup
    */
  def joinGroup(target: Window): js.Promise[Unit] = js.native
  
  /**
    * Leaves the current window group so that the window can be move independently of those in the group.
    * @return {Promise.<void>}
    * @tutorial Window.leaveGroup
    */
  def leaveGroup(): js.Promise[Unit] = js.native
  
  /**
    * Maximizes the window
    * @return {Promise.<void>}
    * @tutorial Window.maximize
    */
  def maximize(): js.Promise[Unit] = js.native
  
  def mergeGroups(target: ExternalWindow): js.Promise[Unit] = js.native
  /**
    * Merges the instance's window group with the same window group as the specified window
    * @param { _Window | ExternalWindow } target The window whose group is to be merged with
    * @return {Promise.<void>}
    * @tutorial Window.mergeGroups
    */
  def mergeGroups(target: Window): js.Promise[Unit] = js.native
  
  /**
    * Minimizes the window.
    * @return {Promise.<void>}
    * @tutorial Window.minimize
    */
  def minimize(): js.Promise[Unit] = js.native
  
  /**
    * Moves the window by a specified amount.
    * @param { number } deltaLeft The change in the left position of the window
    * @param { number } deltaTop The change in the top position of the window
    * @param { WindowMovementOptions } options Optional parameters to modify window movement
    * @return {Promise.<void>}
    * @tutorial Window.moveBy
    */
  def moveBy(deltaLeft: Double, deltaTop: Double): js.Promise[Unit] = js.native
  def moveBy(deltaLeft: Double, deltaTop: Double, options: WindowMovementOptions): js.Promise[Unit] = js.native
  
  /**
    * Moves the window to a specified location.
    * @param { number } left The left position of the window
    * @param { number } top The top position of the window
    * @param { WindowMovementOptions } options Optional parameters to modify window movement
    * @return {Promise.<void>}
    * @tutorial Window.moveTo
    */
  def moveTo(left: Double, top: Double): js.Promise[Unit] = js.native
  def moveTo(left: Double, top: Double, options: WindowMovementOptions): js.Promise[Unit] = js.native
  
  /**
    * Resizes the window by a specified amount.
    * @param { number } deltaWidth The change in the width of the window
    * @param { number } deltaHeight The change in the height of the window
    * @param { AnchorType } anchor Specifies a corner to remain fixed during the resize.
    * Can take the values: "top-left", "top-right", "bottom-left", or "bottom-right".
    * If undefined, the default is "top-left"
    * @param { WindowMovementOptions } options Optional parameters to modify window movement
    * @return {Promise.<void>}
    * @tutorial Window.resizeBy
    */
  def resizeBy(deltaWidth: Double, deltaHeight: Double, anchor: AnchorType): js.Promise[Unit] = js.native
  def resizeBy(deltaWidth: Double, deltaHeight: Double, anchor: AnchorType, options: WindowMovementOptions): js.Promise[Unit] = js.native
  
  /**
    * Resizes the window to the specified dimensions.
    * @param { number } width The change in the width of the window
    * @param { number } height The change in the height of the window
    * @param { AnchorType } anchor Specifies a corner to remain fixed during the resize.
    * Can take the values: "top-left", "top-right", "bottom-left", or "bottom-right".
    * If undefined, the default is "top-left"
    * @param { WindowMovementOptions } options Optional parameters to modify window movement
    * @return {Promise.<void>}
    * @tutorial Window.resizeTo
    */
  def resizeTo(width: Double, height: Double, anchor: AnchorType): js.Promise[Unit] = js.native
  def resizeTo(width: Double, height: Double, anchor: AnchorType, options: WindowMovementOptions): js.Promise[Unit] = js.native
  
  /**
    * Restores the window to its normal state (i.e., unminimized, unmaximized).
    * @return {Promise.<void>}
    * @tutorial Window.restore
    */
  def restore(): js.Promise[Unit] = js.native
  
  /**
    * Will bring the window to the front of the entire stack and give it focus.
    * @return {Promise.<void>}
    * @tutorial Window.setAsForeground
    */
  def setAsForeground(): js.Promise[Unit] = js.native
  
  /**
    * Sets the window's size and position.
    * @property { Bounds } bounds This is a * @type {string} name - name of the window.object that holds the propertys of
    * @param { WindowMovementOptions } options Optional parameters to modify window movement
    * @return {Promise.<void>}
    * @tutorial Window.setBounds
    */
  def setBounds(bounds: Bounds): js.Promise[Unit] = js.native
  def setBounds(bounds: Bounds, options: WindowMovementOptions): js.Promise[Unit] = js.native
  
  /**
    * Shows the window if it is hidden.
    * @param { boolean } [force = false] Show will be prevented from showing when force is false and
    *  ‘show-requested’ has been subscribed to for application’s main window.
    * @return {Promise.<void>}
    * @tutorial Window.show
    */
  def show(): js.Promise[Unit] = js.native
  def show(force: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Shows the window if it is hidden at the specified location.
    * If the toggle parameter is set to true, the window will
    * alternate between showing and hiding.
    * @param { number } left The left position of the window
    * @param { number } top The right position of the window
    * @param { boolean } force Show will be prevented from closing when force is false and
    * ‘show-requested’ has been subscribed to for application’s main window
    * @param { WindowMovementOptions } options Optional parameters to modify window movement
    * @return {Promise.<void>}
    * @tutorial Window.showAt
    */
  def showAt(left: Double, top: Double): js.Promise[Unit] = js.native
  def showAt(left: Double, top: Double, force: js.UndefOr[scala.Nothing], options: WindowMovementOptions): js.Promise[Unit] = js.native
  def showAt(left: Double, top: Double, force: Boolean): js.Promise[Unit] = js.native
  def showAt(left: Double, top: Double, force: Boolean, options: WindowMovementOptions): js.Promise[Unit] = js.native
  
  /**
    * Stops the taskbar icon from flashing.
    * @return {Promise.<void>}
    * @tutorial Window.stopFlashing
    */
  def stopFlashing(): js.Promise[Unit] = js.native
  
  /**
    * Shows the Chromium Developer Tools
    * @return {Promise.<void>}
    * @tutorial Window.showDeveloperTools
    */
  /**
    * Updates the window using the passed options.
    * Values that are objects are deep-merged, overwriting only the values that are provided.
    * @param {*} options Changes a window's options that were defined upon creation. See tutorial
    * @return {Promise.<void>}
    * @tutorial Window.updateOptions
    */
  def updateOptions(options: js.Any): js.Promise[Unit] = js.native
  
  var windowListFromNameList: js.Any = js.native
}
