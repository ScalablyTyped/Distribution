package typings.openui5.global.sap.ui.core

import typings.openui5.sap.ui.base.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.ResizeHandler")
@js.native
object ResizeHandler extends js.Object {
  /**
    * Deregisters a previously registered handler for resize events with the given registration ID.
    * @param sId The registration ID of the handler to deregister. The ID was provided by function {@link
    * sap.ui.core.ResizeHandler.register}           when the handler was registered.
    */
  def deregister(sId: String): Unit = js.native
  /**
    * Returns a metadata object for class sap.ui.core.ResizeHandler.
    * @returns Metadata object describing this class
    */
  def getMetadata(): Metadata = js.native
  /**
    * Registers the given event handler for resize events on the given DOM element or control.<b>Note:</b>
    * This function must not be used before the UI5 framework is initialized.Please use the {@link
    * sap.ui.core.Core#attachInit init event} of UI5 if you are not sure whether this is the case.The
    * resize handler periodically checks the dimensions of the registered reference. Whenever it detects
    * changes, an event is fired.Be careful when changing dimensions within the event handler which might
    * cause another resize event and so on.The available parameters of the resize event
    * are:<ul><li><code>oEvent.target</code>: The DOM element of which the dimensions were
    * checked</li><li><code>oEvent.size.width</code>: The current width of the DOM element in
    * pixels</li><li><code>oEvent.size.height</code>: The current height of the DOM element in
    * pixels</li><li><code>oEvent.oldSize.width</code>: The previous width of the DOM element in
    * pixels</li><li><code>oEvent.oldSize.height</code>: The previous height of the DOM element in
    * pixels</li><li><code>oEvent.control</code>: The control which was given during registration of the
    * event handler (if present)</li></ul>
    * @param oRef The control or the DOM reference for which the given event handler should be registered
    * (beside the window)
    * @param fHandler The event handler which should be called whenever the size of the given reference is
    * changed.            The event object is passed as first argument to the event handler. See the
    * description of this function for more details about the available parameters of this event.
    * @returns A registration ID which can be used for deregistering the event handler, see {@link
    * sap.ui.core.ResizeHandler.deregister}.            If the UI5 framework is not yet initialized
    * <code>null</code> is returned.
    */
  def register(oRef: js.Any, fHandler: js.Any): String = js.native
  def register(oRef: typings.openui5.sap.ui.core.Control, fHandler: js.Any): String = js.native
}

