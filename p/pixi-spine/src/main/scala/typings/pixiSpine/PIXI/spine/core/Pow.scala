package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pow extends Interpolation {
  var power: Double = js.native
}

object Pow {
  @scala.inline
  def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double, power: Double): Pow = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal), power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pow]
  }
  @scala.inline
  implicit class PowOps[Self <: Pow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
  }
  
}

