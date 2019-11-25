package typings.openui5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBusyIndicator extends js.Object {
  val tils: js.Any = js.native
  /**
    * Registers a handler for the "close" event
    * @param fnFunction The function to call, when the event occurs.           This function will be
    * called on the oListener-instance (if           present) or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  def attachClose(fnFunction: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
  def attachClose(fnFunction: js.Any, oListener: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
  /**
    * Registers a handler for the "open" event.
    * @param fnFunction The function to call, when the event occurs. This           function will be
    * called on the oListener-instance (if present)           or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  def attachOpen(fnFunction: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
  def attachOpen(fnFunction: js.Any, oListener: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
  /**
    * Unregisters a handler for the "close" event
    * @param fnFunction The callback function to unregister
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachClose(fnFunction: js.Any, oListener: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
  /**
    * Unregisters a handler for the "open" event
    * @param fnFunction The callback function to unregister
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachOpen(fnFunction: js.Any, oListener: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
  /**
    * Removes the BusyIndicator from the screen
    */
  def hide(): Unit = js.native
  /**
    * Displays the BusyIndicator and starts blocking all user input.This only happens after some delay and
    * if after that delay theBusyIndicator.hide() has not yet been called in the meantime.There is a
    * certain default value for the delay, but that one can beoverridden.
    * @param iDelay The delay in milliseconds before opening the                      BusyIndicator. It is
    * not opened if hide() is called                      before end of the delay. If no delay (or no
    * valid                      delay) is given, the default value is used.
    */
  def show(iDelay: Double): Unit = js.native
}

