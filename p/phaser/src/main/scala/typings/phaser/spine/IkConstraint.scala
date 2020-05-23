package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IkConstraint extends Updatable {
  var active: Boolean
  var bendDirection: Double
  var bones: js.Array[Bone]
  var compress: Boolean
  var data: IkConstraintData
  var mix: Double
  var softness: Double
  var stretch: Boolean
  var target: Bone
  @JSName("apply")
  def apply(): Unit
  def apply1(
    bone: Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit
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
}

