package typings.openui5.global.sap.ui.core

import typings.openui5.anon.TypeofBusyIndicator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BusyIndicator {
  
  @JSGlobal("sap.ui.core.BusyIndicator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Registers a handler for the "close" event
    * @param fnFunction The function to call, when the event occurs.           This function will be
    * called on the oListener-instance (if           present) or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  @scala.inline
  def attachClose(fnFunction: js.Any): TypeofBusyIndicator = ^.asInstanceOf[js.Dynamic].applyDynamic("attachClose")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[TypeofBusyIndicator]
  @scala.inline
  def attachClose(fnFunction: js.Any, oListener: js.Any): TypeofBusyIndicator = (^.asInstanceOf[js.Dynamic].applyDynamic("attachClose")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[TypeofBusyIndicator]
  
  /**
    * Registers a handler for the "open" event.
    * @param fnFunction The function to call, when the event occurs. This           function will be
    * called on the oListener-instance (if present)           or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  @scala.inline
  def attachOpen(fnFunction: js.Any): TypeofBusyIndicator = ^.asInstanceOf[js.Dynamic].applyDynamic("attachOpen")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[TypeofBusyIndicator]
  @scala.inline
  def attachOpen(fnFunction: js.Any, oListener: js.Any): TypeofBusyIndicator = (^.asInstanceOf[js.Dynamic].applyDynamic("attachOpen")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[TypeofBusyIndicator]
  
  /**
    * Unregisters a handler for the "close" event
    * @param fnFunction The callback function to unregister
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  @scala.inline
  def detachClose(fnFunction: js.Any, oListener: js.Any): TypeofBusyIndicator = (^.asInstanceOf[js.Dynamic].applyDynamic("detachClose")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[TypeofBusyIndicator]
  
  /**
    * Unregisters a handler for the "open" event
    * @param fnFunction The callback function to unregister
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  @scala.inline
  def detachOpen(fnFunction: js.Any, oListener: js.Any): TypeofBusyIndicator = (^.asInstanceOf[js.Dynamic].applyDynamic("detachOpen")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[TypeofBusyIndicator]
  
  /**
    * Removes the BusyIndicator from the screen
    */
  @scala.inline
  def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  /**
    * Displays the BusyIndicator and starts blocking all user input.This only happens after some delay and
    * if after that delay theBusyIndicator.hide() has not yet been called in the meantime.There is a
    * certain default value for the delay, but that one can beoverridden.
    * @param iDelay The delay in milliseconds before opening the                      BusyIndicator. It is
    * not opened if hide() is called                      before end of the delay. If no delay (or no
    * valid                      delay) is given, the default value is used.
    */
  @scala.inline
  def show(iDelay: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(iDelay.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
