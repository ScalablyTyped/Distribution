package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.MouseEvent")
@js.native
class MouseEvent protected () extends Event {
  def this(`type`: java.lang.String, event: paperLib.NativeMouseEvent, point: Point, target: Item, delta: Point) = this()
  /**
    * The current target for the event, as the event traverses the scene
    * graph. It always refers to the element the event handler has been
    * attached to as opposed to target which identifies the element on
    * which the event occurred.
    */
  var currentTarget: Item = js.native
  /**
    *
    */
  var delta: Point = js.native
  /**
    * The JavaScript mouse event
    */
  var event: paperLib.NativeMouseEvent = js.native
  /**
    * The last event's position of the mouse in project coordinates when
    * the event was fired.
    */
  var lastPoint: Point = js.native
  /**
    * The position of the mouse in project coordinates when the event was
    * fired.
    */
  var point: Point = js.native
  /**
    * The item that dispatched the event. It is different from
    * currentTarget when the event handler is called during the bubbling
    * phase of the event.
    */
  var target: Item = js.native
  /**
    * Type of mouse event
    */
  var `type`: paperLib.paperLibStrings.mousedown | paperLib.paperLibStrings.mouseup | paperLib.paperLibStrings.mousedrag | paperLib.paperLibStrings.click | paperLib.paperLibStrings.doubleclick | paperLib.paperLibStrings.mousemove | paperLib.paperLibStrings.mouseenter | paperLib.paperLibStrings.mouseleave = js.native
}

