package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ElementTouchEvent
  * @class Represents a TouchEvent fired on a {@link pc.ElementComponent}.
  * @extends pc.ElementInputEvent
  * @description Create an instance of a pc.ElementTouchEvent.
  * @param {TouchEvent} event The TouchEvent that was originally raised.
  * @param {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
  * @param {pc.ElementInput} input The pc.ElementInput instance
  * @property {Touch[]} touches The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
  * @property {Touch[]} changedTouches The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
  */
@JSGlobal("pc.ElementTouchEvent")
@js.native
class ElementTouchEvent protected () extends ElementInputEvent {
  def this(event: playcanvasLib.BrowserTouchEvent, element: ElementComponent, input: ElementInput) = this()
  var changedTouches: js.Array[playcanvasLib.BrowserTouch] = js.native
  var touches: js.Array[playcanvasLib.BrowserTouch] = js.native
}

