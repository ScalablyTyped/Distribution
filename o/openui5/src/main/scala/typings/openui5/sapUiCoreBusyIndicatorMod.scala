package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreBusyIndicatorMod extends Shortcut {
  
  @JSImport("sap/ui/core/BusyIndicator", JSImport.Default)
  @js.native
  val default: BusyIndicator = js.native
  
  /**
    * Provides methods to show or hide a waiting animation covering the whole page and blocking user interaction.
    */
  @js.native
  trait BusyIndicator extends StObject {
    
    /**
      * Registers a handler for the {@link #event:Close Close} event.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to `sap.ui.core.BusyIndicator`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to `sap.ui.core.BusyIndicator`
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Registers a handler for the {@link #event:Open Open} event.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to `sap.ui.core.BusyIndicator`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with; defaults to `sap.ui.core.BusyIndicator`
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Unregisters a handler from the {@link #event:Close Close} event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(/**
      * The callback function to unregister
      */
    fnFunction: js.Function): this.type = js.native
    def detachClose(
      /**
      * The callback function to unregister
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Unregisters a handler from the {@link #event:Open Open} event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpen(/**
      * The callback function to unregister
      */
    fnFunction: js.Function): this.type = js.native
    def detachOpen(
      /**
      * The callback function to unregister
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Removes the BusyIndicator from the screen.
      */
    def hide(): Unit = js.native
    
    /**
      * Displays the `BusyIndicator` and starts blocking all user input. This only happens after some delay,
      * and if, after that delay, the `BusyIndicator.hide()` has not yet been called in the meantime.
      *
      * There is a certain default value for the delay, which can be overridden.
      */
    def show(): Unit = js.native
    def show(
      /**
      * The delay in milliseconds before opening the `BusyIndicator`; It is not opened if `hide()` is called
      * before the delay ends. If no delay (or no valid delay) is given, a delay of 1000 milliseconds is used.
      */
    iDelay: int
    ): Unit = js.native
  }
  
  type _To = BusyIndicator
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreBusyIndicatorMod.foo` */
  override def _to: BusyIndicator = default
}
