package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class: ExternalWindow
  * An ExternalWindow is an OpenFin object representing a window that belongs to a non-openfin application.<br>
  * While External Windows don't have the complete functionality of an OpenFin Window object,
  * they can be used to tap into any application that is currently running in the OS.<br>
  * External Windows are useful for grouping, moving and resizing non-openfin applications
  * as well as listening to events that are dispatched by these applications.<br>
  * They are also compatible with OpenFin's Layouts service to facilitate
  * a complete positional control over all running applications.<br>
  */
@js.native
trait OpenFinExternalWindow extends js.Object {
  /**
    * The external window's name
    */
  var name: String = js.native
  /**
    * The external window's id
    */
  var uuid: String = js.native
  /**
    * Brings the external window to the front of the window stack.
    * @return {Promise.<void>}
    * @experimental
    */
  /**
    * Registers an event listener on the specified event.
    */
  def addEventListener(
    `type`: OpenFinExternalWindowEventType,
    listener: js.Function1[/* event */ ExternalWindowBaseEvent, Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinExternalWindowEventType,
    listener: js.Function1[/* event */ ExternalWindowBaseEvent, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinExternalWindowEventType,
    listener: js.Function1[/* event */ ExternalWindowBaseEvent, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def bringToFront(): js.Promise[Unit] = js.native
  /**
    * Closes the external window.
    * @return {Promise.<void>}
    * @experimental
    */
  def close(): js.Promise[Unit] = js.native
  /**
    * Prevents a user from changing an external window's size/position
    * when using the window's frame.
    * @return {Promise.<void>}
    * @experimental
    */
  def disableUserMovement(): js.Promise[Unit] = js.native
  /**
    * Re-enables user changes to an external window's size/position
    * when using the window's frame.
    * @return {Promise.<void>}
    * @experimental
    */
  def enableUserMovement(): js.Promise[Unit] = js.native
  /**
    * Flashes the external window’s frame and taskbar icon until stopFlashing is called.
    * @return {Promise.<void>}
    * @experimental
    */
  def flash(): js.Promise[Unit] = js.native
  /**
    * Gives focus to the external window.
    * @return {Promise.<void>}
    * @emits ExternalWindow#focused
    * @experimental
    */
  def focus(): js.Promise[Unit] = js.native
  /**
    * Gets the current bounds (top, left, etc.) of the external window.
    * @return {Promise.<Bounds>}
    * @experimental
    */
  def getBounds(): js.Promise[Bounds] = js.native
  /**
    * Retrieves an array containing wrapped external windows that are grouped
    * with this external window. If a window is not in a group an empty array
    * is returned.
    * @return {Promise.<Array<ExternalWindow|_Window>>}
    * @experimental
    */
  def getGroup(): js.Promise[js.Array[OpenFinExternalWindow | OpenFinWindow]] = js.native
  /**
    * Gets an information object for the window.
    * @return {Promise.<any>}
    * @experimental
    */
  def getInfo(): js.Promise[_] = js.native
  /**
    * Gets an external window's options.
    * @return {Promise.<any>}
    * @experimental
    */
  def getOptions(): js.Promise[_] = js.native
  /**
    * Gets the current state ("minimized", "maximized", or "restored") of
    * the external window.
    * @return {Promise.<string>}
    * @experimental
    */
  def getState(): js.Promise[String] = js.native
  /**
    * Hides the external window.
    * @return {Promise.<void>}
    * @experimental
    */
  def hide(): js.Promise[Unit] = js.native
  /**
    * Determines if the external window is currently showing.
    * @return {Promise.<boolean>}
    * @experimental
    */
  def isShowing(): js.Promise[Boolean] = js.native
  /**
    * Joins the same window group as the specified window.
    * @param { _Window | ExternalWindow } target The window whose group is to be joined
    * @return {Promise.<void>}
    * @experimental
    */
  def joinGroup(target: OpenFinExternalWindow): js.Promise[Unit] = js.native
  def joinGroup(target: OpenFinWindow): js.Promise[Unit] = js.native
  /**
    * Leaves the current window group so that the window can be moved
    * independently of those in the group.
    * @return {Promise.<void>}
    * @experimental
    */
  def leaveGroup(): js.Promise[Unit] = js.native
  /**
    * Maximizes the external window.
    * @return {Promise.<void>}
    * @experimental
    */
  def maximize(): js.Promise[Unit] = js.native
  /**
    * Merges the instance's window group with the same window group as the specified window
    * @param { _Window | ExternalWindow } target The window whose group is to be merged with
    * @return {Promise.<void>}
    * @experimental
    */
  def mergeGroups(target: OpenFinExternalWindow): js.Promise[Unit] = js.native
  def mergeGroups(target: OpenFinWindow): js.Promise[Unit] = js.native
  /**
    * Minimizes the external window.
    * @return {Promise.<void>}
    * @experimental
    */
  def minimize(): js.Promise[Unit] = js.native
  /**
    * Moves the external window by a specified amount.
    * @param { number } deltaLeft The change in the left position of the window
    * @param { number } deltaTop The change in the top position of the window
    * @return {Promise.<void>}
    * @experimental
    */
  def moveBy(deltaLeft: Double, deltaTop: Double): js.Promise[Unit] = js.native
  /**
    * Moves the external window to a specified location.
    * @param { number } left The left position of the window
    * @param { number } top The top position of the window
    * @return {Promise.<void>}
    * @experimental
    */
  def moveTo(left: Double, top: Double): js.Promise[Unit] = js.native
  /**
    * Removes a previously registered event listener from the specified event.
    */
  def removeEventListener(
    `type`: OpenFinExternalWindowEventType,
    listener: js.Function1[/* event */ ExternalWindowBaseEvent, Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinExternalWindowEventType,
    listener: js.Function1[/* event */ ExternalWindowBaseEvent, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinExternalWindowEventType,
    listener: js.Function1[/* event */ ExternalWindowBaseEvent, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  /**
    * Resizes the external window by a specified amount.
    * @param { number } deltaWidth The change in the width of the window
    * @param { number } deltaHeight The change in the height of the window
    * @param { AnchorType } anchor Specifies a corner to remain fixed during the resize.
    * Can take the values: "top-left", "top-right", "bottom-left", or "bottom-right".
    * If undefined, the default is "top-left".
    * @return {Promise.<void>}
    * @experimental
    */
  def resizeBy(deltaWidth: Double, deltaHeight: Double, anchor: AnchorType): js.Promise[Unit] = js.native
  /**
    * Resizes the external window to the specified dimensions.
    * @param { number } width The change in the width of the window
    * @param { number } height The change in the height of the window
    * @param { AnchorType } anchor Specifies a corner to remain fixed during the resize.
    * Can take the values: "top-left", "top-right", "bottom-left", or "bottom-right".
    * If undefined, the default is "top-left".
    * @return {Promise.<void>}
    * @experimental
    */
  def resizeTo(width: Double, height: Double, anchor: AnchorType): js.Promise[Unit] = js.native
  /**
    * Restores the external window to its normal state (i.e. unminimized, unmaximized).
    * @return {Promise.<void>}
    * @experimental
    */
  def restore(): js.Promise[Unit] = js.native
  /**
    * Will bring the external window to the front of the entire stack and
    * give it focus.
    * @return {Promise.<void>}
    * @experimental
    */
  def setAsForeground(): js.Promise[Unit] = js.native
  /**
    * Sets the external window's size and position.
    * @property { Bounds } bounds
    * @return {Promise.<void>}
    * @experimental
    */
  def setBounds(bounds: Bounds): js.Promise[Unit] = js.native
  /**
    * Shows the external window if it is hidden.
    * @return {Promise.<void>}
    * @experimental
    */
  def show(): js.Promise[Unit] = js.native
  /**
    * Shows the external window, if it is hidden, at the specified location.
    * If the toggle parameter is set to true, the external window will
    * alternate between showing and hiding.
    * @param { number } left The left position of the window
    * @param { number } top The top position of the window
    * @return {Promise.<void>}
    * @experimental
    */
  def showAt(left: Double, top: Double): js.Promise[Unit] = js.native
  /**
    * Stops the taskbar icon from flashing.
    * @return {Promise.<void>}
    * @experimental
    */
  def stopFlashing(): js.Promise[Unit] = js.native
  /**
    * Updates the external window using the passed options
    * @param {*} options Changes an external window's options
    * @return {Promise.<void>}
    * @experimental
    */
  def updateOptions(options: js.Any): js.Promise[Unit] = js.native
}

