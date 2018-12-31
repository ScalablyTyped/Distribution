package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Touch
  * @class A instance of a single point touch on a {@link pc.TouchDevice}
  * @description Create a new Touch object from the browser Touch
  * @param {Touch} touch The browser Touch object
  * @property {Number} id The identifier of the touch
  * @property {Number} x The x co-ordinate relative to the element that the TouchDevice is attached to
  * @property {Number} y The y co-ordinate relative to the element that the TouchDevice is attached to
  * @property {Element} target The target element of the touch event
  * @property {Touch} touch The original browser Touch object
  */
@JSGlobal("pc.Touch")
@js.native
class Touch protected () extends js.Object {
  def this(touch: playcanvasLib.BrowserTouch) = this()
  var id: scala.Double = js.native
  var target: stdLib.Element = js.native
  var touch: playcanvasLib.BrowserTouch = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
}

