package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SkeletonData")
@js.native
class SkeletonData () extends js.Object {
  var animations: js.Array[Animation] = js.native
  var audioPath: String = js.native
  var bones: js.Array[BoneData] = js.native
  var defaultSkin: Skin = js.native
  var events: js.Array[EventData] = js.native
  var fps: Double = js.native
  var hash: String = js.native
  var height: Double = js.native
  var ikConstraints: js.Array[IkConstraintData] = js.native
  var imagesPath: String = js.native
  var name: String = js.native
  var pathConstraints: js.Array[PathConstraintData] = js.native
  var skins: js.Array[Skin] = js.native
  var slots: js.Array[SlotData] = js.native
  var transformConstraints: js.Array[TransformConstraintData] = js.native
  var version: String = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def findAnimation(animationName: String): Animation = js.native
  def findBone(boneName: String): BoneData = js.native
  def findBoneIndex(boneName: String): Double = js.native
  def findEvent(eventDataName: String): EventData = js.native
  def findIkConstraint(constraintName: String): IkConstraintData = js.native
  def findPathConstraint(constraintName: String): PathConstraintData = js.native
  def findPathConstraintIndex(pathConstraintName: String): Double = js.native
  def findSkin(skinName: String): Skin = js.native
  def findSlot(slotName: String): SlotData = js.native
  def findSlotIndex(slotName: String): Double = js.native
  def findTransformConstraint(constraintName: String): TransformConstraintData = js.native
}

