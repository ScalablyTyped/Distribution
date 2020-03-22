package typings.openfin

import typings.openfin.baseMod.Base
import typings.openfin.baseMod.EmitterBase
import typings.openfin.externalWindowMod.ExternalWindowEvents
import typings.openfin.identityMod.Identity
import typings.openfin.shapesMod.AnchorType
import typings.openfin.shapesMod.Bounds
import typings.openfin.windowWindowMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/external-window/external-window", JSImport.Namespace)
@js.native
object externalWindowExternalWindowMod extends js.Object {
  @js.native
  class ExternalWindow protected () extends EmitterBase[ExternalWindowEvents] {
    def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
    /**
      * Brings the external window to the front of the window stack.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.bringToFront
      */
    def bringToFront(): js.Promise[Unit] = js.native
    /**
      * Closes the external window.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.close
      */
    def close(): js.Promise[Unit] = js.native
    /**
      * Flashes the external window’s frame and taskbar icon until stopFlashing is called.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.flash
      */
    def flash(): js.Promise[Unit] = js.native
    /**
      * Gives focus to the external window.
      * @return {Promise.<void>}
      * @emits ExternalWindow#focused
      * @experimental
      * @tutorial Window.focus
      */
    def focus(): js.Promise[Unit] = js.native
    /**
      * Gets the current bounds (top, left, etc.) of the external window.
      * @return {Promise.<Bounds>}
      * @experimental
      * @tutorial Window.getBounds
      */
    def getBounds(): js.Promise[Bounds] = js.native
    /**
      * Retrieves an array containing wrapped external windows that are grouped
      * with this external window. If a window is not in a group an empty array
      * is returned.
      * @return {Promise.<Array<ExternalWindow|_Window>>}
      * @experimental
      * @tutorial Window.getGroup
      */
    def getGroup(): js.Promise[js.Array[ExternalWindow | Window]] = js.native
    /**
      * Gets an information object for the window.
      * @return {Promise.<any>}
      * @experimental
      * @tutorial Window.getInfo
      */
    def getInfo(): js.Promise[_] = js.native
    /**
      * Gets an external window's options.
      * @return {Promise.<any>}
      * @experimental
      * @tutorial Window.getOptions
      */
    def getOptions(): js.Promise[_] = js.native
    /**
      * Gets the current state ("minimized", "maximized", or "restored") of
      * the external window.
      * @return {Promise.<string>}
      * @experimental
      * @tutorial Window.getState
      */
    def getState(): js.Promise[String] = js.native
    /**
      * Hides the external window.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.hide
      */
    def hide(): js.Promise[Unit] = js.native
    /**
      * Determines if the external window is currently showing.
      * @return {Promise.<boolean>}
      * @experimental
      * @tutorial Window.isShowing
      */
    def isShowing(): js.Promise[Boolean] = js.native
    /**
      * Joins the same window group as the specified window. Currently unsupported (method will nack).
      * @param { _Window | ExternalWindow } target The window whose group is to be joined
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.joinGroup
      */
    def joinGroup(target: ExternalWindow): js.Promise[Unit] = js.native
    def joinGroup(target: Window): js.Promise[Unit] = js.native
    /**
      * Leaves the current window group so that the window can be moved
      * independently of those in the group.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.leaveGroup
      */
    def leaveGroup(): js.Promise[Unit] = js.native
    /**
      * Maximizes the external window.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.maximize
      */
    def maximize(): js.Promise[Unit] = js.native
    /**
      * Merges the instance's window group with the same window group as the specified window
      * @param { _Window | ExternalWindow } target The window whose group is to be merged with
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.mergeGroups
      */
    def mergeGroups(target: ExternalWindow): js.Promise[Unit] = js.native
    def mergeGroups(target: Window): js.Promise[Unit] = js.native
    /**
      * Minimizes the external window.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.minimize
      */
    def minimize(): js.Promise[Unit] = js.native
    /**
      * Moves the external window by a specified amount.
      * @param { number } deltaLeft The change in the left position of the window
      * @param { number } deltaTop The change in the top position of the window
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.moveBy
      */
    def moveBy(deltaLeft: Double, deltaTop: Double): js.Promise[Unit] = js.native
    /**
      * Moves the external window to a specified location.
      * @param { number } left The left position of the window
      * @param { number } top The top position of the window
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.moveTo
      */
    def moveTo(left: Double, top: Double): js.Promise[Unit] = js.native
    /**
      * Resizes the external window by a specified amount.
      * @param { number } deltaWidth The change in the width of the window
      * @param { number } deltaHeight The change in the height of the window
      * @param { AnchorType } anchor Specifies a corner to remain fixed during the resize.
      * Can take the values: "top-left", "top-right", "bottom-left", or "bottom-right".
      * If undefined, the default is "top-left".
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.resizeBy
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
      * @tutorial Window.resizeTo
      */
    def resizeTo(width: Double, height: Double, anchor: AnchorType): js.Promise[Unit] = js.native
    /**
      * Restores the external window to its normal state (i.e. unminimized, unmaximized).
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.restore
      */
    def restore(): js.Promise[Unit] = js.native
    /**
      * Will bring the external window to the front of the entire stack and
      * give it focus.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.setAsForeground
      */
    def setAsForeground(): js.Promise[Unit] = js.native
    /**
      * Sets the external window's size and position.
      * @property { Bounds } bounds
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.setBounds
      */
    def setBounds(bounds: Bounds): js.Promise[Unit] = js.native
    /**
      * Shows the external window if it is hidden.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.show
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
      * @tutorial Window.showAt
      */
    def showAt(left: Double, top: Double): js.Promise[Unit] = js.native
    /**
      * Stops the taskbar icon from flashing.
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.stopFlashing
      */
    def stopFlashing(): js.Promise[Unit] = js.native
    /**
      * Updates the external window using the passed options
      * @param {*} options Changes an external window's options
      * @return {Promise.<void>}
      * @experimental
      * @tutorial Window.updateOptions
      */
    def updateOptions(options: js.Any): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait ExternalWindowModule extends Base {
    /**
      * Asynchronously returns an external window object that represents
      * an existing external window.<br>
      * Note: This method is restricted by default and must be enabled via
      * <a href="https://developers.openfin.co/docs/api-security">API security settings</a>.
      * @param { ExternalWindowIdentity } identity
      * @return {Promise.<ExternalWindow>}
      * @static
      * @experimental
      * @tutorial ExternalWindow.wrap
      */
    def wrap(identity: Identity): js.Promise[ExternalWindow] = js.native
  }
  
  @js.native
  class default () extends ExternalWindowModule
  
}

