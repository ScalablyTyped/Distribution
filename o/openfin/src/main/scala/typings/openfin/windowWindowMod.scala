package typings.openfin

import typings.openfin.applicationMod.Application
import typings.openfin.baseMod.Base
import typings.openfin.externalWindowExternalWindowMod.ExternalWindow
import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.custom
import typings.openfin.openfinStrings.longEdge
import typings.openfin.openfinStrings.none
import typings.openfin.openfinStrings.printableArea
import typings.openfin.openfinStrings.shortEdge
import typings.openfin.openfinStrings.simplex
import typings.openfin.shapesMod.AnchorType
import typings.openfin.shapesMod.Bounds
import typings.openfin.shapesMod.Transition
import typings.openfin.shapesMod.TransitionOptions
import typings.openfin.viewViewMod.View
import typings.openfin.webcontentsWebcontentsMod.WebContents
import typings.openfin.windowMod.WindowEvents
import typings.openfin.windowOptionMod.WindowOption
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowWindowMod {
  
  @JSImport("openfin/_v2/api/window/window", JSImport.Default)
  @js.native
  class default () extends WindowModule
  
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
    def getOptions(): js.Promise[js.Any] = js.native
    
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
    def showAt(left: Double, top: Double, force: Boolean): js.Promise[Unit] = js.native
    def showAt(left: Double, top: Double, force: Boolean, options: WindowMovementOptions): js.Promise[Unit] = js.native
    def showAt(left: Double, top: Double, force: Unit, options: WindowMovementOptions): js.Promise[Unit] = js.native
    
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
  
  trait Area extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Area {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Area = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Area]
    }
    
    @scala.inline
    implicit class AreaMutableBuilder[Self <: Area] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloseEventShape extends StObject {
    
    var name: String
    
    var topic: String
    
    var `type`: String
    
    var uuid: String
  }
  object CloseEventShape {
    
    @scala.inline
    def apply(name: String, topic: String, `type`: String, uuid: String): CloseEventShape = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseEventShape]
    }
    
    @scala.inline
    implicit class CloseEventShapeMutableBuilder[Self <: CloseEventShape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dpi extends StObject {
    
    var horizontal: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Double] = js.undefined
  }
  object Dpi {
    
    @scala.inline
    def apply(): Dpi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dpi]
    }
    
    @scala.inline
    implicit class DpiMutableBuilder[Self <: Dpi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait FindInPageOptions extends StObject {
    
    var findNext: js.UndefOr[Boolean] = js.undefined
    
    var forward: js.UndefOr[Boolean] = js.undefined
    
    var matchCase: js.UndefOr[Boolean] = js.undefined
    
    var medialCapitalAsWordStart: js.UndefOr[Boolean] = js.undefined
    
    var wordStart: js.UndefOr[Boolean] = js.undefined
  }
  object FindInPageOptions {
    
    @scala.inline
    def apply(): FindInPageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindInPageOptions]
    }
    
    @scala.inline
    implicit class FindInPageOptionsMutableBuilder[Self <: FindInPageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindNext(value: Boolean): Self = StObject.set(x, "findNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindNextUndefined: Self = StObject.set(x, "findNext", js.undefined)
      
      @scala.inline
      def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      @scala.inline
      def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
      
      @scala.inline
      def setMedialCapitalAsWordStart(value: Boolean): Self = StObject.set(x, "medialCapitalAsWordStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedialCapitalAsWordStartUndefined: Self = StObject.set(x, "medialCapitalAsWordStart", js.undefined)
      
      @scala.inline
      def setWordStart(value: Boolean): Self = StObject.set(x, "wordStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordStartUndefined: Self = StObject.set(x, "wordStart", js.undefined)
    }
  }
  
  trait FrameInfo extends StObject {
    
    var entityType: EntityType
    
    var name: String
    
    var parent: js.UndefOr[Identity] = js.undefined
    
    var uuid: String
  }
  object FrameInfo {
    
    @scala.inline
    def apply(entityType: EntityType, name: String, uuid: String): FrameInfo = {
      val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameInfo]
    }
    
    @scala.inline
    implicit class FrameInfoMutableBuilder[Self <: FrameInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Identity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Margins extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var marginType: js.UndefOr[typings.openfin.openfinStrings.default | none | printableArea | custom] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Margins {
    
    @scala.inline
    def apply(): Margins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Margins]
    }
    
    @scala.inline
    implicit class MarginsMutableBuilder[Self <: Margins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMarginType(value: typings.openfin.openfinStrings.default | none | printableArea | custom): Self = StObject.set(x, "marginType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTypeUndefined: Self = StObject.set(x, "marginType", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait PrintOptions extends StObject {
    
    var collate: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var copies: js.UndefOr[Double] = js.undefined
    
    var deviceName: js.UndefOr[String] = js.undefined
    
    var dpi: js.UndefOr[Dpi] = js.undefined
    
    var duplexMode: js.UndefOr[simplex | shortEdge | longEdge] = js.undefined
    
    var landscape: js.UndefOr[Boolean] = js.undefined
    
    var margins: js.UndefOr[Margins] = js.undefined
    
    var pageRanges: js.UndefOr[Record[String, Double]] = js.undefined
    
    var pagesPerSheet: js.UndefOr[Double] = js.undefined
    
    var printBackground: js.UndefOr[Boolean] = js.undefined
    
    var scaleFactor: js.UndefOr[Double] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object PrintOptions {
    
    @scala.inline
    def apply(): PrintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintOptions]
    }
    
    @scala.inline
    implicit class PrintOptionsMutableBuilder[Self <: PrintOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollate(value: Boolean): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
      
      @scala.inline
      def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCopies(value: Double): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopiesUndefined: Self = StObject.set(x, "copies", js.undefined)
      
      @scala.inline
      def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
      
      @scala.inline
      def setDpi(value: Dpi): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
      
      @scala.inline
      def setDuplexMode(value: simplex | shortEdge | longEdge): Self = StObject.set(x, "duplexMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplexModeUndefined: Self = StObject.set(x, "duplexMode", js.undefined)
      
      @scala.inline
      def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
      
      @scala.inline
      def setMargins(value: Margins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
      
      @scala.inline
      def setPageRanges(value: Record[String, Double]): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
      
      @scala.inline
      def setPagesPerSheet(value: Double): Self = StObject.set(x, "pagesPerSheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesPerSheetUndefined: Self = StObject.set(x, "pagesPerSheet", js.undefined)
      
      @scala.inline
      def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait PrinterInfo extends StObject {
    
    var description: String
    
    var isDefault: Boolean
    
    var name: String
    
    var status: Double
  }
  object PrinterInfo {
    
    @scala.inline
    def apply(description: String, isDefault: Boolean, name: String, status: Double): PrinterInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrinterInfo]
    }
    
    @scala.inline
    implicit class PrinterInfoMutableBuilder[Self <: PrinterInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait WindowInfo extends StObject {
    
    var canNavigateBack: Boolean
    
    var canNavigateForward: Boolean
    
    var preloadScripts: js.Array[js.Any]
    
    var title: String
    
    var url: String
  }
  object WindowInfo {
    
    @scala.inline
    def apply(
      canNavigateBack: Boolean,
      canNavigateForward: Boolean,
      preloadScripts: js.Array[js.Any],
      title: String,
      url: String
    ): WindowInfo = {
      val __obj = js.Dynamic.literal(canNavigateBack = canNavigateBack.asInstanceOf[js.Any], canNavigateForward = canNavigateForward.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowInfo]
    }
    
    @scala.inline
    implicit class WindowInfoMutableBuilder[Self <: WindowInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanNavigateBack(value: Boolean): Self = StObject.set(x, "canNavigateBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanNavigateForward(value: Boolean): Self = StObject.set(x, "canNavigateForward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadScripts(value: js.Array[js.Any]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadScriptsVarargs(value: js.Any*): Self = StObject.set(x, "preloadScripts", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WindowModule extends Base {
    
    /**
      * Creates a new Window.
      * @param { Window~options } options - Window creation options
      * @return {Promise.<_Window>}
      * @tutorial Window.create
      * @static
      */
    def create(options: WindowOption): js.Promise[Window] = js.native
    
    /**
      * Asynchronously returns a Window object that represents the current window
      * @return {Promise.<_Window>}
      * @tutorial Window.getCurrent
      * @static
      */
    def getCurrent(): js.Promise[Window] = js.native
    
    /**
      * Synchronously returns a Window object that represents the current window
      * @return {_Window}
      * @tutorial Window.getCurrentSync
      * @static
      */
    def getCurrentSync(): Window = js.native
    
    /**
      * Asynchronously returns a Window object that represents an existing window.
      * @param { Identity } identity
      * @return {Promise.<_Window>}
      * @tutorial Window.wrap
      * @static
      */
    def wrap(identity: Identity): js.Promise[Window] = js.native
    
    /**
      * Synchronously returns a Window object that represents an existing window.
      * @param { Identity } identity
      * @return {_Window}
      * @tutorial Window.wrapSync
      * @static
      */
    def wrapSync(identity: Identity): Window = js.native
  }
  
  trait WindowMovementOptions extends StObject {
    
    var moveIndependently: Boolean
  }
  object WindowMovementOptions {
    
    @scala.inline
    def apply(moveIndependently: Boolean): WindowMovementOptions = {
      val __obj = js.Dynamic.literal(moveIndependently = moveIndependently.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowMovementOptions]
    }
    
    @scala.inline
    implicit class WindowMovementOptionsMutableBuilder[Self <: WindowMovementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMoveIndependently(value: Boolean): Self = StObject.set(x, "moveIndependently", value.asInstanceOf[js.Any])
    }
  }
}
