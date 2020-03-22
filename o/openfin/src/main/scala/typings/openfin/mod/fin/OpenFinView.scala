package typings.openfin.mod.fin

import typings.openfin.PartialViewOptions
import typings.openfin.PickBoundsheightwidthtopl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinView extends js.Object {
  var identity: Identity = js.native
  /**
    * Attaches the current view to a the given window identity.
    * Identity must be the identity of a window in the same application.
    * This detaches the view from it's current window, and sets the view to be destroyed when its new window closes.
    * @param target {Identity}
    * @return {Promise.<void>}
    * @tutorial View.attach
    * @experimental
    */
  def attach(target: Identity): js.Promise[Unit] = js.native
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
    * Destroys the current view
    * @return {Promise.<void>}
    * @tutorial View.destroy
    * @experimental
    */
  def destroy(): js.Promise[Unit] = js.native
  /**
    * Retrieves the window the view is currently attached to.
    * @return {Promise.<OpenFinWindow>}
    * @tutorial View.getCurrentWindow
    * @experimental
    */
  def getCurrentWindow(): js.Promise[OpenFinWindow] = js.native
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
    * Sets a custom window handler.
    * @return {function}
    * @param { string | string[] } urls
    * @experimental
    */
  def setCustomWindowHandler(urls: String, handler: js.Function1[/* options */ WindowOption, Unit]): js.Promise[js.Function0[Unit]] = js.native
  def setCustomWindowHandler(urls: js.Array[String], handler: js.Function1[/* options */ WindowOption, Unit]): js.Promise[js.Function0[Unit]] = js.native
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

