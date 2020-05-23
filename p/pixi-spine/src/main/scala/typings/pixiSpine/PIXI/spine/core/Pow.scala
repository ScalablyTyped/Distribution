package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pow extends Interpolation {
  var power: Double
}

object Pow {
  @scala.inline
  def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double, power: Double): Pow = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal), power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pow]
  }
}

