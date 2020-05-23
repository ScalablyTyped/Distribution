package typings.openfin.mod.fin

import typings.openfin.openfinStrings.maximized
import typings.openfin.openfinStrings.minimized
import typings.openfin.openfinStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Window
  * A basic window that wraps a native HTML window. Provides more fine-grained control over the window state such as the ability to minimize,
  * maximize, restore, etc. By default a window does not show upon instantiation; instead the window's show() method must be invoked manually.
  * The new window appears in the same process as the parent window.
  */
@js.native
trait OpenFinWindow extends js.Object {
  /**
    * Name of window
    */
  var name: String = js.native
  /**
    * uuid of the application that the window belongs to.
    */
  var uuid: String = js.native
  /**
    * Registers an event listener on the specified event.
    */
  def addEventListener(
    `type`: OpenFinWindowEventType,
    listener: js.Function1[
      /* event */ WindowBaseEvent | WindowAuthRequestedEvent | WindowBoundsEvent | WindowExternalProcessStartedEvent | WindowExternalProcessExited | WindowGroupChangedEvent | WindowHiddenEvent | Window_NavigationRejectedEvent, 
      Unit
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinWindowEventType,
    listener: js.Function1[
      /* event */ WindowBaseEvent | WindowAuthRequestedEvent | WindowBoundsEvent | WindowExternalProcessStartedEvent | WindowExternalProcessExited | WindowGroupChangedEvent | WindowHiddenEvent | Window_NavigationRejectedEvent, 
      Unit
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinWindowEventType,
    listener: js.Function1[
      /* event */ WindowBaseEvent | WindowAuthRequestedEvent | WindowBoundsEvent | WindowExternalProcessStartedEvent | WindowExternalProcessExited | WindowGroupChangedEvent | WindowHiddenEvent | Window_NavigationRejectedEvent, 
      Unit
    ],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Performs the specified window transitions
    */
  def animate(transitions: Transition, options: TransitionOptions): Unit = js.native
  def animate(
    transitions: Transition,
    options: TransitionOptions,
    callback: js.Function1[/* event */ js.Any, Unit]
  ): Unit = js.native
  def animate(
    transitions: Transition,
    options: TransitionOptions,
    callback: js.Function1[/* event */ js.Any, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Provides credentials to authentication requests
    */
  def authenticate(userName: String, password: String): Unit = js.native
  def authenticate(userName: String, password: String, callback: js.Function0[Unit]): Unit = js.native
  def authenticate(
    userName: String,
    password: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  /**
    * Removes focus from the window.
    */
  def blur(): Unit = js.native
  def blur(callback: js.Function0[Unit]): Unit = js.native
  def blur(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Brings the window to the front of the OpenFin window stack.
    */
  def bringToFront(): Unit = js.native
  def bringToFront(callback: js.Function0[Unit]): Unit = js.native
  def bringToFront(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Closes the window.
    * @param Close will be prevented from closing when force is false and 'close-requested' has been subscribed to for application's main window.
    */
  def close(): Unit = js.native
  def close(force: Boolean): Unit = js.native
  def close(force: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def close(
    force: Boolean,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Prevents a user from changing a window's size/position when using the window's frame.
    * 'disabled-frame-bounds-changing' is generated at the start of and during a user move/size operation.
    * 'disabled-frame-bounds-changed' is generated after a user move/size operation.
    * The events provide the bounds that would have been applied if the frame was enabled.
    * 'frame-disabled' is generated when an enabled frame becomes disabled.
    */
  def disableFrame(): Unit = js.native
  def disableFrame(callback: js.Function0[Unit]): Unit = js.native
  def disableFrame(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Re-enables user changes to a window's size/position when using the window's frame.
    * 'disabled-frame-bounds-changing' is generated at the start of and during a user move/size operation.
    * 'disabled-frame-bounds-changed' is generated after a user move/size operation.
    * The events provide the bounds that would have been applied if the frame was enabled.
    * 'frame-enabled' is generated when a disabled frame has becomes enabled.
    */
  def enableFrame(): Unit = js.native
  def enableFrame(callback: js.Function0[Unit]): Unit = js.native
  def enableFrame(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Executes Javascript on the window, restricted to windows you own or windows owned by applications you have created.
    * @param code JavaScript code to be executed on the window.
    */
  def executeJavaScript(code: String): Unit = js.native
  def executeJavaScript(code: String, callback: js.Function0[Unit]): Unit = js.native
  def executeJavaScript(code: String, callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Flashes the window's frame and taskbar icon until the window is activated.
    */
  def flash(): Unit = js.native
  def flash(options: js.Any): Unit = js.native
  def flash(options: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def flash(
    options: js.Any,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Gives focus to the window.
    */
  def focus(): Unit = js.native
  def focus(callback: js.Function0[Unit]): Unit = js.native
  def focus(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Retrieves an array of frame info objects representing the main frame and any
    * iframes that are currently on the page.
    */
  def getAllFrames(): Unit = js.native
  def getAllFrames(callback: js.Function1[/* frames */ js.Array[FrameInfo], Unit]): Unit = js.native
  def getAllFrames(
    callback: js.Function1[/* frames */ js.Array[FrameInfo], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Gets the current bounds (top, left, width, height) of the window.
    */
  def getBounds(): Unit = js.native
  def getBounds(callback: js.Function1[/* bounds */ Bounds, Unit]): Unit = js.native
  def getBounds(
    callback: js.Function1[/* bounds */ Bounds, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Retrieves an array containing wrapped fin.desktop.Windows that are grouped with this window. If a window is not in a group an empty array is returned.
    * Please note that calling window is included in the result array.
    */
  def getGroup(): Unit = js.native
  def getGroup(callback: js.Function1[/* group */ js.Array[this.type], Unit]): Unit = js.native
  def getGroup(
    callback: js.Function1[/* group */ js.Array[this.type], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Gets an information object for the window.
    */
  def getInfo(): Unit = js.native
  def getInfo(callback: js.Function1[/* info */ WindowInfo, Unit]): Unit = js.native
  def getInfo(
    callback: js.Function1[/* info */ WindowInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Returns the native JavaScript "window" object for the window. This method can only be used by the parent application or the window itself,
    * otherwise it will return undefined. The same Single-Origin-Policy (SOP) rules apply for child windows created by window.open(url) in that the
    * contents of the window object are only accessible if the URL has the same origin as the invoking window. See example below.
    * Also, will not work with fin.desktop.Window objects created with fin.desktop.Window.wrap().
    * @returns Native window
    */
  def getNativeWindow(): typings.std.Window = js.native
  /**
    * Gets the current settings of the window.
    */
  def getOptions(): Unit = js.native
  def getOptions(callback: js.Function1[/* options */ WindowOption, Unit]): Unit = js.native
  def getOptions(
    callback: js.Function1[/* options */ WindowOption, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Gets the parent application.
    * @returns Parent application
    */
  def getParentApplication(): OpenFinApplication = js.native
  /**
    * Gets the parent window.
    */
  def getParentWindow(): OpenFinWindow = js.native
  /**
    * Gets a base64 encoded PNG snapshot of the window.
    */
  def getSnapshot(): Unit = js.native
  def getSnapshot(callback: js.Function1[/* base64Snapshot */ String, Unit]): Unit = js.native
  def getSnapshot(
    callback: js.Function1[/* base64Snapshot */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Gets the current state ("minimized", "maximized", or "normal") of the window.
    */
  def getState(): Unit = js.native
  def getState(callback: js.Function1[/* state */ minimized | maximized | normal, Unit]): Unit = js.native
  def getState(
    callback: js.Function1[/* state */ minimized | maximized | normal, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Returns the zoom level of the window.
    */
  def getZoomLevel(): Unit = js.native
  def getZoomLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = js.native
  def getZoomLevel(
    callback: js.Function1[/* level */ Double, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Hides the window.
    */
  def hide(): Unit = js.native
  def hide(callback: js.Function0[Unit]): Unit = js.native
  def hide(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Determines if the window is currently showing.
    */
  def isShowing(): Unit = js.native
  def isShowing(callback: js.Function1[/* showing */ Boolean, Unit]): Unit = js.native
  def isShowing(
    callback: js.Function1[/* showing */ Boolean, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Joins the same window group as the specified window.
    */
  def joinGroup(target: OpenFinWindow): Unit = js.native
  def joinGroup(target: OpenFinWindow, callback: js.Function0[Unit]): Unit = js.native
  def joinGroup(
    target: OpenFinWindow,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Leaves the current window group so that the window can be move independently of those in the group.
    */
  def leaveGroup(): Unit = js.native
  def leaveGroup(callback: js.Function0[Unit]): Unit = js.native
  def leaveGroup(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Maximizes the window.
    */
  def maximize(): Unit = js.native
  def maximize(callback: js.Function0[Unit]): Unit = js.native
  def maximize(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Merges the instance's window group with the same window group as the specified window
    */
  def mergeGroups(target: OpenFinWindow): Unit = js.native
  def mergeGroups(target: OpenFinWindow, callback: js.Function0[Unit]): Unit = js.native
  def mergeGroups(
    target: OpenFinWindow,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Minimizes the window.
    */
  def minimize(): Unit = js.native
  def minimize(callback: js.Function0[Unit]): Unit = js.native
  def minimize(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Moves the window by a specified amount.
    */
  def moveBy(deltaLeft: Double, deltaTop: Double): Unit = js.native
  def moveBy(deltaLeft: Double, deltaTop: Double, callback: js.Function0[Unit]): Unit = js.native
  def moveBy(
    deltaLeft: Double,
    deltaTop: Double,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Moves the window to a specified location.
    */
  def moveTo(left: Double, top: Double): Unit = js.native
  def moveTo(left: Double, top: Double, callback: js.Function0[Unit]): Unit = js.native
  def moveTo(
    left: Double,
    top: Double,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Navigates the window to a specified URL.
    */
  def navigate(url: String): Unit = js.native
  def navigate(url: String, callback: js.Function0[Unit]): Unit = js.native
  def navigate(url: String, callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Navigates the window back one page.
    */
  def navigateBack(): Unit = js.native
  def navigateBack(callback: js.Function0[Unit]): Unit = js.native
  def navigateBack(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Navigates the window forward one page.
    */
  def navigateForward(): Unit = js.native
  def navigateForward(callback: js.Function0[Unit]): Unit = js.native
  def navigateForward(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Reloads the window current page.
    */
  def reload(): Unit = js.native
  def reload(ignoreCacheopt: Boolean): Unit = js.native
  def reload(ignoreCacheopt: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def reload(
    ignoreCacheopt: Boolean,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Removes a previously registered event listener from the specified event.
    */
  def removeEventListener(
    `type`: OpenFinWindowEventType,
    listener: js.Function1[
      /* event */ WindowBaseEvent | WindowAuthRequestedEvent | WindowBoundsEvent | WindowExternalProcessStartedEvent | WindowExternalProcessExited | WindowGroupChangedEvent | WindowHiddenEvent | Window_NavigationRejectedEvent, 
      Unit
    ]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinWindowEventType,
    listener: js.Function1[
      /* event */ WindowBaseEvent | WindowAuthRequestedEvent | WindowBoundsEvent | WindowExternalProcessStartedEvent | WindowExternalProcessExited | WindowGroupChangedEvent | WindowHiddenEvent | Window_NavigationRejectedEvent, 
      Unit
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinWindowEventType,
    listener: js.Function1[
      /* event */ WindowBaseEvent | WindowAuthRequestedEvent | WindowBoundsEvent | WindowExternalProcessStartedEvent | WindowExternalProcessExited | WindowGroupChangedEvent | WindowHiddenEvent | Window_NavigationRejectedEvent, 
      Unit
    ],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Resizes the window by a specified amount.
    */
  def resizeBy(deltaWidth: Double, deltaHeight: Double, anchor: AnchorType): Unit = js.native
  def resizeBy(deltaWidth: Double, deltaHeight: Double, anchor: AnchorType, callback: js.Function0[Unit]): Unit = js.native
  def resizeBy(
    deltaWidth: Double,
    deltaHeight: Double,
    anchor: AnchorType,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Resizes the window by a specified amount.
    */
  def resizeTo(width: Double, height: Double, anchor: AnchorType): Unit = js.native
  def resizeTo(width: Double, height: Double, anchor: AnchorType, callback: js.Function0[Unit]): Unit = js.native
  def resizeTo(
    width: Double,
    height: Double,
    anchor: AnchorType,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Restores the window to its normal state (i.e., unminimized, unmaximized).
    */
  def restore(): Unit = js.native
  def restore(callback: js.Function0[Unit]): Unit = js.native
  def restore(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Will bring the window to the front of the entire stack and give it focus.
    */
  def setAsForeground(): Unit = js.native
  def setAsForeground(callback: js.Function0[Unit]): Unit = js.native
  def setAsForeground(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Sets the window's size and position
    */
  def setBounds(left: Double, top: Double, width: Double, height: Double): Unit = js.native
  def setBounds(left: Double, top: Double, width: Double, height: Double, callback: js.Function0[Unit]): Unit = js.native
  def setBounds(
    left: Double,
    top: Double,
    width: Double,
    height: Double,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Sets the zoom level of the window.
    */
  def setZoomLevel(level: Double): Unit = js.native
  def setZoomLevel(level: Double, callback: js.Function0[Unit]): Unit = js.native
  def setZoomLevel(
    level: Double,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Shows the window if it is hidden.
    * @param Show will be prevented from closing when force is false and 'show-requested' has been subscribed to for application's main window.
    */
  def show(): Unit = js.native
  def show(force: Boolean): Unit = js.native
  def show(force: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def show(
    force: Boolean,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Shows the window if it is hidden at the specified location. If the toggle parameter is set to true, the window will alternate between showing and hiding.
    */
  def showAt(left: Double, top: Double): Unit = js.native
  def showAt(left: Double, top: Double, force: Boolean): Unit = js.native
  def showAt(left: Double, top: Double, force: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def showAt(
    left: Double,
    top: Double,
    force: Boolean,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Stops the taskbar icon from flashing.
    */
  def stopFlashing(): Unit = js.native
  def stopFlashing(callback: js.Function0[Unit]): Unit = js.native
  def stopFlashing(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Stops any current navigation the window is performing.
    */
  def stopNavigation(): Unit = js.native
  def stopNavigation(callback: js.Function0[Unit]): Unit = js.native
  def stopNavigation(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  /**
    * Updates the window using the passed options
    */
  def updateOptions(options: WindowOption): Unit = js.native
  def updateOptions(options: WindowOption, callback: js.Function0[Unit]): Unit = js.native
  def updateOptions(
    options: WindowOption,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
}

