package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "getTouchTargetCoords")
@js.native
object getTouchTargetCoords extends js.Object {
  
  /**
    * Similar to {@link pc.getTargetCoords} for the MouseEvents.
    * This function takes a browser Touch object and returns the co-ordinates of the
    * touch relative to the target element.
    * @param touch - The browser Touch object.
    * @returns The co-ordinates of the touch relative to the touch.target element. In the format {x, y}.
    */
  def apply(touch: typings.playcanvas.pc.Touch): js.Any = js.native
}
