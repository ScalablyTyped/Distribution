package typings.playcanvas.global.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link Mouse#enablePointerLock} and {@link Application#disablePointerLock}.
  *
  * @callback LockMouseCallback
  */
/**
  * A Mouse Device, bound to a DOM Element.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.Mouse")
@js.native
/**
  * Create a new Mouse instance.
  *
  * @param {Element} [element] - The Element that the mouse events are attached to.
  */
open class Mouse ()
  extends typings.playcanvas.mod.Mouse {
  def this(element: Element) = this()
}
object Mouse {
  
  @JSGlobal("pc.Mouse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when the mouse is moved.
    *
    * @event Mouse#mousemove
    * @param {MouseEvent} event - The MouseEvent object.
    */
  /**
    * Fired when a mouse button is pressed.
    *
    * @event Mouse#mousedown
    * @param {MouseEvent} event - The MouseEvent object.
    */
  /**
    * Fired when a mouse button is released.
    *
    * @event Mouse#mouseup
    * @param {MouseEvent} event - The MouseEvent object.
    */
  /**
    * Fired when a mouse wheel is moved.
    *
    * @event Mouse#mousewheel
    * @param {MouseEvent} event - The MouseEvent object.
    */
  /**
    * Check if the mouse pointer has been locked, using {@link Mouse#enabledPointerLock}.
    *
    * @returns {boolean} True if locked.
    */
  /* static member */
  inline def isPointerLocked(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPointerLocked")().asInstanceOf[Boolean]
}
