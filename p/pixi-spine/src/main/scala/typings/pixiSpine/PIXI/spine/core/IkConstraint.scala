package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IkConstraint extends Updatable {
  var active: Boolean = js.native
  var bendDirection: Double = js.native
  var bones: js.Array[Bone] = js.native
  var compress: Boolean = js.native
  var data: IkConstraintData = js.native
  var mix: Double = js.native
  var softness: Double = js.native
  var stretch: Boolean = js.native
  var target: Bone = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def apply1(
    bone: Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit = js.native
}

object IkConstraint {
  @scala.inline
  def apply(
    active: Boolean,
    apply: () => Unit,
    apply1: (Bone, Double, Double, Boolean, Boolean, Boolean, Double) => Unit,
    apply2: (Bone, Bone, Double, Double, Double, Boolean, Double, Double) => Unit,
    bendDirection: Double,
    bones: js.Array[Bone],
    compress: Boolean,
    data: IkConstraintData,
    isActive: () => Boolean,
    mix: Double,
    softness: Double,
    stretch: Boolean,
    target: Bone,
    update: () => Unit
  ): IkConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], apply = js.Any.fromFunction0(apply), apply1 = js.Any.fromFunction7(apply1), apply2 = js.Any.fromFunction8(apply2), bendDirection = bendDirection.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), mix = mix.asInstanceOf[js.Any], softness = softness.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[IkConstraint]
  }
  @scala.inline
  implicit class IkConstraintOps[Self <: IkConstraint] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: () => Unit): Self = this.set("apply", js.Any.fromFunction0(value))
    @scala.inline
    def setApply1(value: (Bone, Double, Double, Boolean, Boolean, Boolean, Double) => Unit): Self = this.set("apply1", js.Any.fromFunction7(value))
    @scala.inline
    def setApply2(value: (Bone, Bone, Double, Double, Double, Boolean, Double, Double) => Unit): Self = this.set("apply2", js.Any.fromFunction8(value))
    @scala.inline
    def setBendDirection(value: Double): Self = this.set("bendDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setBonesVarargs(value: Bone*): Self = this.set("bones", js.Array(value :_*))
    @scala.inline
    def setBones(value: js.Array[Bone]): Self = this.set("bones", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: IkConstraintData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMix(value: Double): Self = this.set("mix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftness(value: Double): Self = this.set("softness", value.asInstanceOf[js.Any])
    @scala.inline
    def setStretch(value: Boolean): Self = this.set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Bone): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

