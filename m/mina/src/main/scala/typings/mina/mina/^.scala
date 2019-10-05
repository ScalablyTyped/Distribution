package typings.mina.mina

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mina")
@js.native
object ^ extends js.Object {
  def apply(
    a: Double,
    A: Double,
    b: Double,
    B: Double,
    get: js.Function0[Double],
    set: js.Function1[/* time */ Double, Unit]
  ): AnimationDescriptor = js.native
  def apply(
    a: Double,
    A: Double,
    b: Double,
    B: Double,
    get: js.Function0[Double],
    set: js.Function1[/* time */ Double, Unit],
    easing: js.Function1[/* num */ Double, Double]
  ): AnimationDescriptor = js.native
}

