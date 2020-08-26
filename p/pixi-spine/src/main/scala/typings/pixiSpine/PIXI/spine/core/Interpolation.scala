package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interpolation extends js.Object {
  @JSName("apply")
  def apply(start: Double, end: Double, a: Double): Double = js.native
  /* protected */ def applyInternal(a: Double): Double = js.native
}

object Interpolation {
  @scala.inline
  def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double): Interpolation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal))
    __obj.asInstanceOf[Interpolation]
  }
  @scala.inline
  implicit class InterpolationOps[Self <: Interpolation] (val x: Self) extends AnyVal {
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
    def setApply(value: (Double, Double, Double) => Double): Self = this.set("apply", js.Any.fromFunction3(value))
    @scala.inline
    def setApplyInternal(value: Double => Double): Self = this.set("applyInternal", js.Any.fromFunction1(value))
  }
  
}

