package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoforientation extends StObject {
  
  /**
    * Registers the given event handler to orientation change events of the document's window.
    *
    * The event is fired whenever the screen orientation changes and the width of the document's window becomes
    * greater than its height or the other way round.
    *
    * The event handler is called with a single argument: a map `mParams` which provides the following information:
    *
    * 	 - `mParams.landscape`: If this flag is set to `true`, the screen is currently in landscape mode, otherwise
    *     in portrait mode.
    */
  def attachHandler(
    /**
    * The handler function to call when the event occurs. This function will be called in the context of the
    * `oListener` instance (if present) or on the `window` instance. A map with information about the orientation
    * is provided as a single argument to the handler (see details above).
    */
  fnFunction: js.Function
  ): Unit = js.native
  def attachHandler(
    /**
    * The handler function to call when the event occurs. This function will be called in the context of the
    * `oListener` instance (if present) or on the `window` instance. A map with information about the orientation
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
    * Removes a previously attached event handler from the orientation change events.
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
  
  val landscape: Boolean = js.native
  
  val portrait: Boolean = js.native
}
