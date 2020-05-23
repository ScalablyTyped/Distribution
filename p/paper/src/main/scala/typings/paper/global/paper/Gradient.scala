package typings.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Gradient object.
  */
@JSGlobal("paper.Gradient")
@js.native
class Gradient ()
  extends typings.paper.paper.Gradient {
  /** 
    * Specifies whether the gradient is radial or linear.
    */
  /* CompleteClass */
  override var radial: Boolean = js.native
  /** 
    * The gradient stops on the gradient ramp.
    */
  /* CompleteClass */
  override var stops: js.Array[typings.paper.paper.GradientStop] = js.native
  /** 
    * Checks whether the gradient is equal to the supplied gradient.
    * 
    * @return true if they are equal
    */
  /* CompleteClass */
  override def equals(gradient: typings.paper.paper.Gradient): Boolean = js.native
}

