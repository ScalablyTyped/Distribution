package typings.playcanvas.pcNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Touch
  * @classdesc A instance of a single point touch on a {@link pc.TouchDevice}
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
  def this(touch: Touch) = this()
  /**
    * The identifier of the touch
    */
  var id: Double = js.native
  /**
    * The target element of the touch event
    */
  var target: Element = js.native
  /**
    * The original browser Touch object
    */
  var touch: Touch = js.native
  /**
    * The x co-ordinate relative to the element that the TouchDevice is attached to
    */
  var x: Double = js.native
  /**
    * The y co-ordinate relative to the element that the TouchDevice is attached to
    */
  var y: Double = js.native
}

