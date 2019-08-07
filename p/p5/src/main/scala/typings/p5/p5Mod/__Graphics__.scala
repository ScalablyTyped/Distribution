package typings.p5.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Work-around for p5.Graphics inheriting from both p5 and p5.Element
@js.native
trait __Graphics__ extends Element {
  /**
    *   Resets certain values such as those modified by
    *   functions in the Transform category and in the
    *   Lights category that are not automatically reset
    *   with graphics buffer objects. Calling this in
    *   draw() will copy the behavior of the standard
    *   canvas.
    */
  def reset(): Unit = js.native
}

