package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformConstraintData extends ConstraintData {
  var bones: js.Array[BoneData]
  var local: Boolean
  var offsetRotation: Double
  var offsetScaleX: Double
  var offsetScaleY: Double
  var offsetShearY: Double
  var offsetX: Double
  var offsetY: Double
  var relative: Boolean
  var rotateMix: Double
  var scaleMix: Double
  var shearMix: Double
  var target: BoneData
  var translateMix: Double
}

object TransformConstraintData {
  @scala.inline
  def apply(
    bones: js.Array[BoneData],
    local: Boolean,
    name: String,
    offsetRotation: Double,
    offsetScaleX: Double,
    offsetScaleY: Double,
    offsetShearY: Double,
    offsetX: Double,
    offsetY: Double,
    order: Double,
    relative: Boolean,
    rotateMix: Double,
    scaleMix: Double,
    shearMix: Double,
    skinRequired: Boolean,
    target: BoneData,
    translateMix: Double
  ): TransformConstraintData = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], offsetScaleX = offsetScaleX.asInstanceOf[js.Any], offsetScaleY = offsetScaleY.asInstanceOf[js.Any], offsetShearY = offsetShearY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], scaleMix = scaleMix.asInstanceOf[js.Any], shearMix = shearMix.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformConstraintData]
  }
}

