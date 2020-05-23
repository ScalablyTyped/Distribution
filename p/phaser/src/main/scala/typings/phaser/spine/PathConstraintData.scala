package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathConstraintData extends ConstraintData {
  var bones: js.Array[BoneData]
  var offsetRotation: Double
  var position: Double
  var positionMode: PositionMode
  var rotateMix: Double
  var rotateMode: RotateMode
  var spacing: Double
  var spacingMode: SpacingMode
  var target: SlotData
  var translateMix: Double
}

object PathConstraintData {
  @scala.inline
  def apply(
    bones: js.Array[BoneData],
    name: String,
    offsetRotation: Double,
    order: Double,
    position: Double,
    positionMode: PositionMode,
    rotateMix: Double,
    rotateMode: RotateMode,
    skinRequired: Boolean,
    spacing: Double,
    spacingMode: SpacingMode,
    target: SlotData,
    translateMix: Double
  ): PathConstraintData = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionMode = positionMode.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], rotateMode = rotateMode.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], spacingMode = spacingMode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConstraintData]
  }
}

