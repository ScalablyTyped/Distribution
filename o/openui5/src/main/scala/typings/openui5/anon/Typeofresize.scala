package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofresize extends StObject {
  
  /**
    * Registers the given event handler to resize change events of the document's window.
    *
    * The event is fired whenever the document's window size changes.
    *
    * The event handler is called with a single argument: a map `mParams` which provides the following information:
    *
    * 	 - `mParams.height`: The height of the document's window in pixels.
    * 	 - `mParams.width`: The width of the document's window in pixels.
    */
  def attachHandler(
    /**
    * The handler function to call when the event occurs. This function will be called in the context of the
    * `oListener` instance (if present) or on the `window` instance. A map with information about the size
    * is provided as a single argument to the handler (see details above).
    */
  fnFunction: js.Function
  ): Unit = js.native
  def attachHandler(
    /**
    * The handler function to call when the event occurs. This function will be called in the context of the
    * `oListener` instance (if present) or on the `window` instance. A map with information about the size
    * is provided as a single argument to the handler (see details above).
    */
  fnFunction: js.Function,
    /**
    * The object that wants to be notified when the event occurs (`this` context within the handler function).
    * If it is not specified, the handler function is called in the context of the `window`.
    */
  oListener: js.Object
  ): Unit = js.native
  
  /**
    * Removes a previously attached event handler from the resize events.
    *
    * The passed parameters must match those used for registration with {@link #.attachHandler} beforehand.
    */
  def detachHandler(/**
    * The handler function to detach from the event
    */
  fnFunction: js.Function): Unit = js.native
  def detachHandler(
    /**
    * The handler function to detach from the event
    */
  fnFunction: js.Function,
    /**
    * The object that wanted to be notified when the event occurred
    */
  oListener: js.Object
  ): Unit = js.native
  
  val height: int = js.native
  
  val width: int = js.native
}
