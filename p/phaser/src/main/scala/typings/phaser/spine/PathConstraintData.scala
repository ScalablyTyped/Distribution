package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathConstraintData extends ConstraintData {
  var bones: js.Array[BoneData] = js.native
  var offsetRotation: Double = js.native
  var position: Double = js.native
  var positionMode: PositionMode = js.native
  var rotateMix: Double = js.native
  var rotateMode: RotateMode = js.native
  var spacing: Double = js.native
  var spacingMode: SpacingMode = js.native
  var target: SlotData = js.native
  var translateMix: Double = js.native
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
  @scala.inline
  implicit class PathConstraintDataOps[Self <: PathConstraintData] (val x: Self) extends AnyVal {
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
    def setBonesVarargs(value: BoneData*): Self = this.set("bones", js.Array(value :_*))
    @scala.inline
    def setBones(value: js.Array[BoneData]): Self = this.set("bones", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetRotation(value: Double): Self = this.set("offsetRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionMode(value: PositionMode): Self = this.set("positionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateMix(value: Double): Self = this.set("rotateMix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateMode(value: RotateMode): Self = this.set("rotateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacingMode(value: SpacingMode): Self = this.set("spacingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: SlotData): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslateMix(value: Double): Self = this.set("translateMix", value.asInstanceOf[js.Any])
  }
  
}

