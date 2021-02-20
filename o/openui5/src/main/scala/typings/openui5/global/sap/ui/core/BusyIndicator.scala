package typings.openui5.global.sap.ui.core

import typings.openui5.anon.TypeofBusyIndicator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BusyIndicator {
  
  /**
    * Registers a handler for the "close" event
    * @param fnFunction The function to call, when the event occurs.           This function will be
    * called on the oListener-instance (if           present) or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  @JSGlobal("sap.ui.core.BusyIndicator.attachClose")
  @js.native
  def attachClose(fnFunction: js.Any): TypeofBusyIndicator = js.native
  @JSGlobal("sap.ui.core.BusyIndicator.attachClose")
  @js.native
  def attachClose(fnFunction: js.Any, oListener: js.Any): TypeofBusyIndicator = js.native
  
  /**
    * Registers a handler for the "open" event.
    * @param fnFunction The function to call, when the event occurs. This           function will be
    * called on the oListener-instance (if present)           or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  @JSGlobal("sap.ui.core.BusyIndicator.attachOpen")
  @js.native
  def attachOpen(fnFunction: js.Any): TypeofBusyIndicator = js.native
  @JSGlobal("sap.ui.core.BusyIndicator.attachOpen")
  @js.native
  def attachOpen(fnFunction: js.Any, oListener: js.Any): TypeofBusyIndicator = js.native
  
  /**
    * Unregisters a handler for the "close" event
    * @param fnFunction The callback function to unregister
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  @JSGlobal("sap.ui.core.BusyIndicator.detachClose")
  @js.native
  def detachClose(fnFunction: js.Any, oListener: js.Any): TypeofBusyIndicator = js.native
  
  /**
    * Unregisters a handler for the "open" event
    * @param fnFunction The callback function to unregister
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  @JSGlobal("sap.ui.core.BusyIndicator.detachOpen")
  @js.native
  def detachOpen(fnFunction: js.Any, oListener: js.Any): TypeofBusyIndicator = js.native
  
  /**
    * Removes the BusyIndicator from the screen
    */
  @JSGlobal("sap.ui.core.BusyIndicator.hide")
  @js.native
  def hide(): Unit = js.native
  
  /**
    * Displays the BusyIndicator and starts blocking all user input.This only happens after some delay and
    * if after that delay theBusyIndicator.hide() has not yet been called in the meantime.There is a
    * certain default value for the delay, but that one can beoverridden.
    * @param iDelay The delay in milliseconds before opening the                      BusyIndicator. It is
    * not opened if hide() is called                      before end of the delay. If no delay (or no
    * valid                      delay) is given, the default value is used.
    */
  @JSGlobal("sap.ui.core.BusyIndicator.show")
  @js.native
  def show(iDelay: Double): Unit = js.native
}
