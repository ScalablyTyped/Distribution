package typings.playcanvas.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Touch object from the browser Touch.
  * @property id - The identifier of the touch.
  * @property x - The x co-ordinate relative to the element that the TouchDevice is attached to.
  * @property y - The y co-ordinate relative to the element that the TouchDevice is attached to.
  * @property target - The target element of the touch event.
  * @property touch - The original browser Touch object.
  * @param touch - The browser Touch object.
  */
@JSImport("playcanvas", "Touch")
@js.native
class Touch protected ()
  extends typings.playcanvas.pc.Touch {
  def this(touch: typings.playcanvas.pc.Touch) = this()
  /**
    * The identifier of the touch.
    */
  /* CompleteClass */
  override var id: Double = js.native
  /**
    * The target element of the touch event.
    */
  /* CompleteClass */
  override var target: Element = js.native
  /**
    * The original browser Touch object.
    */
  /* CompleteClass */
  override var touch: typings.playcanvas.pc.Touch = js.native
  /**
    * The x co-ordinate relative to the element that the TouchDevice is attached to.
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * The y co-ordinate relative to the element that the TouchDevice is attached to.
    */
  /* CompleteClass */
  override var y: Double = js.native
}

