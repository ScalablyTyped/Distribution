package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformConstraint extends Updatable {
  var active: Boolean = js.native
  var bones: js.Array[Bone] = js.native
  var data: TransformConstraintData = js.native
  var rotateMix: Double = js.native
  var scaleMix: Double = js.native
  var shearMix: Double = js.native
  var target: Bone = js.native
  var temp: Vector2 = js.native
  var translateMix: Double = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def applyAbsoluteLocal(): Unit = js.native
  def applyAbsoluteWorld(): Unit = js.native
  def applyRelativeLocal(): Unit = js.native
  def applyRelativeWorld(): Unit = js.native
}

object TransformConstraint {
  @scala.inline
  def apply(
    active: Boolean,
    apply: () => Unit,
    applyAbsoluteLocal: () => Unit,
    applyAbsoluteWorld: () => Unit,
    applyRelativeLocal: () => Unit,
    applyRelativeWorld: () => Unit,
    bones: js.Array[Bone],
    data: TransformConstraintData,
    isActive: () => Boolean,
    rotateMix: Double,
    scaleMix: Double,
    shearMix: Double,
    target: Bone,
    temp: Vector2,
    translateMix: Double,
    update: () => Unit
  ): TransformConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], apply = js.Any.fromFunction0(apply), applyAbsoluteLocal = js.Any.fromFunction0(applyAbsoluteLocal), applyAbsoluteWorld = js.Any.fromFunction0(applyAbsoluteWorld), applyRelativeLocal = js.Any.fromFunction0(applyRelativeLocal), applyRelativeWorld = js.Any.fromFunction0(applyRelativeWorld), bones = bones.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), rotateMix = rotateMix.asInstanceOf[js.Any], scaleMix = scaleMix.asInstanceOf[js.Any], shearMix = shearMix.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], temp = temp.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TransformConstraint]
  }
  @scala.inline
  implicit class TransformConstraintOps[Self <: TransformConstraint] (val x: Self) extends AnyVal {
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
    def setApplyAbsoluteLocal(value: () => Unit): Self = this.set("applyAbsoluteLocal", js.Any.fromFunction0(value))
    @scala.inline
    def setApplyAbsoluteWorld(value: () => Unit): Self = this.set("applyAbsoluteWorld", js.Any.fromFunction0(value))
    @scala.inline
    def setApplyRelativeLocal(value: () => Unit): Self = this.set("applyRelativeLocal", js.Any.fromFunction0(value))
    @scala.inline
    def setApplyRelativeWorld(value: () => Unit): Self = this.set("applyRelativeWorld", js.Any.fromFunction0(value))
    @scala.inline
    def setBonesVarargs(value: Bone*): Self = this.set("bones", js.Array(value :_*))
    @scala.inline
    def setBones(value: js.Array[Bone]): Self = this.set("bones", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: TransformConstraintData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateMix(value: Double): Self = this.set("rotateMix", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleMix(value: Double): Self = this.set("scaleMix", value.asInstanceOf[js.Any])
    @scala.inline
    def setShearMix(value: Double): Self = this.set("shearMix", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Bone): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemp(value: Vector2): Self = this.set("temp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslateMix(value: Double): Self = this.set("translateMix", value.asInstanceOf[js.Any])
  }
  
}

