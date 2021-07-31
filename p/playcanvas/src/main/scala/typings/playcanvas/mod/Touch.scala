package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.playcanvas.pc.Touch {
  def this(touch: typings.playcanvas.pc.Touch) = this()
  
  /**
    * The identifier of the touch.
    */
  /* CompleteClass */
  var id: Double = js.native
  
  /**
    * The target element of the touch event.
    */
  /* CompleteClass */
  var target: Element = js.native
  
  /**
    * The original browser Touch object.
    */
  /* CompleteClass */
  var touch: typings.playcanvas.pc.Touch = js.native
  
  /**
    * The x co-ordinate relative to the element that the TouchDevice is attached to.
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * The y co-ordinate relative to the element that the TouchDevice is attached to.
    */
  /* CompleteClass */
  var y: Double = js.native
}
