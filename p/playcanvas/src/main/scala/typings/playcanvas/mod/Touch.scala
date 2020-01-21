package typings.playcanvas.mod

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
@JSImport("playcanvas", "Touch")
@js.native
class Touch protected ()
  extends typings.playcanvas.pc.Touch {
  def this(touch: typings.playcanvas.pc.Touch) = this()
}

