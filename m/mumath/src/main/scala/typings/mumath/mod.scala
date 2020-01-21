package typings.mumath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mumath", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object clamp extends js.Object {
    def apply(value: Double, left: Double, right: Double): Double = js.native
  }
  
  @js.native
  object closest extends js.Object {
    def apply(value: Double, list: js.Array[Double]): Double = js.native
  }
  
  @js.native
  object isMultiple extends js.Object {
    def apply(a: Double, b: Double): Boolean = js.native
    def apply(a: Double, b: Double, eps: Double): Boolean = js.native
  }
  
  @js.native
  object len extends js.Object {
    def apply(a: Double, b: Double): Double = js.native
  }
  
  @js.native
  object lerp extends js.Object {
    def apply(x: Double, y: Double, ratio: Double): Double = js.native
  }
  
  @js.native
  object mod extends js.Object {
    def apply(value: Double, max: Double): Double = js.native
    def apply(value: Double, max: Double, min: Double): Double = js.native
  }
  
  @js.native
  object order extends js.Object {
    def apply(value: Double): Double = js.native
  }
  
  @js.native
  object precision extends js.Object {
    def apply(value: Double): Double = js.native
  }
  
  @js.native
  object round extends js.Object {
    def apply(value: Double): Double = js.native
    def apply(value: Double, step: Double): Double = js.native
  }
  
  @js.native
  object scale extends js.Object {
    def apply(value: Double, list: js.Array[Double]): Double = js.native
  }
  
  @js.native
  object within extends js.Object {
    def apply(value: Double, left: Double, right: Double): Double = js.native
  }
  
}

