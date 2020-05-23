package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformConstraint extends Updatable {
  var active: Boolean
  var bones: js.Array[Bone]
  var data: TransformConstraintData
  var rotateMix: Double
  var scaleMix: Double
  var shearMix: Double
  var target: Bone
  var temp: Vector2
  var translateMix: Double
  @JSName("apply")
  def apply(): Unit
  def applyAbsoluteLocal(): Unit
  def applyAbsoluteWorld(): Unit
  def applyRelativeLocal(): Unit
  def applyRelativeWorld(): Unit
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
}

