package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolation extends js.Object {
  @JSName("apply")
  def apply(start: Double, end: Double, a: Double): Double
  /* protected */ def applyInternal(a: Double): Double
}

object Interpolation {
  @scala.inline
  def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double): Interpolation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal))
    __obj.asInstanceOf[Interpolation]
  }
}

