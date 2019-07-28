package typings.mina

import typings.mina.minaNs.AnimationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def mina(
    a: Double,
    A: Double,
    b: Double,
    B: Double,
    get: js.Function0[Double],
    set: js.Function1[/* time */ Double, Unit]
  ): AnimationDescriptor = js.native
  def mina(
    a: Double,
    A: Double,
    b: Double,
    B: Double,
    get: js.Function0[Double],
    set: js.Function1[/* time */ Double, Unit],
    easing: js.Function1[/* num */ Double, Double]
  ): AnimationDescriptor = js.native
}

