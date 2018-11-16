package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @name pc.ElementInputEvent
     * @class Represents an input event fired on a {@link pc.ElementComponent}. When an event is raised on an ElementComponent it bubbles up to its parent ElementComponents unless we call stopPropagation().
     * @description Create an instance of a pc.ElementInputEvent.
     * @param {MouseEvent|TouchEvent} event The MouseEvent or TouchEvent that was originally raised.
     * @property {MouseEvent|TouchEvent} event The MouseEvent or TouchEvent that was originally raised.
     * @property {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
     */
@JSGlobal("pc.ElementInputEvent")
@js.native
class ElementInputEvent protected () extends js.Object {
  def this(event: playcanvasLib.BrowserMouseEvent, element: ElementComponent) = this()
  def this(event: playcanvasLib.BrowserTouchEvent, element: ElementComponent) = this()
  var element: ElementComponent = js.native
  var event: playcanvasLib.BrowserMouseEvent | playcanvasLib.BrowserTouchEvent = js.native
  /**
           * @function
           * @name pc.ElementInputEvent#stopPropagation
           * @description Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
           */
  def stopPropagation(): scala.Unit = js.native
}

