package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonData extends js.Object {
  var animations: js.Array[Animation]
  var audioPath: String
  var bones: js.Array[BoneData]
  var defaultSkin: Skin
  var events: js.Array[EventData]
  var fps: Double
  var hash: String
  var height: Double
  var ikConstraints: js.Array[IkConstraintData]
  var imagesPath: String
  var name: String
  var pathConstraints: js.Array[PathConstraintData]
  var skins: js.Array[Skin]
  var slots: js.Array[SlotData]
  var transformConstraints: js.Array[TransformConstraintData]
  var version: String
  var width: Double
  var x: Double
  var y: Double
  def findAnimation(animationName: String): Animation
  def findBone(boneName: String): BoneData
  def findBoneIndex(boneName: String): Double
  def findEvent(eventDataName: String): EventData
  def findIkConstraint(constraintName: String): IkConstraintData
  def findPathConstraint(constraintName: String): PathConstraintData
  def findPathConstraintIndex(pathConstraintName: String): Double
  def findSkin(skinName: String): Skin
  def findSlot(slotName: String): SlotData
  def findSlotIndex(slotName: String): Double
  def findTransformConstraint(constraintName: String): TransformConstraintData
}

object SkeletonData {
  @scala.inline
  def apply(
    animations: js.Array[Animation],
    audioPath: String,
    bones: js.Array[BoneData],
    defaultSkin: Skin,
    events: js.Array[EventData],
    findAnimation: String => Animation,
    findBone: String => BoneData,
    findBoneIndex: String => Double,
    findEvent: String => EventData,
    findIkConstraint: String => IkConstraintData,
    findPathConstraint: String => PathConstraintData,
    findPathConstraintIndex: String => Double,
    findSkin: String => Skin,
    findSlot: String => SlotData,
    findSlotIndex: String => Double,
    findTransformConstraint: String => TransformConstraintData,
    fps: Double,
    hash: String,
    height: Double,
    ikConstraints: js.Array[IkConstraintData],
    imagesPath: String,
    name: String,
    pathConstraints: js.Array[PathConstraintData],
    skins: js.Array[Skin],
    slots: js.Array[SlotData],
    transformConstraints: js.Array[TransformConstraintData],
    version: String,
    width: Double,
    x: Double,
    y: Double
  ): SkeletonData = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], audioPath = audioPath.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], defaultSkin = defaultSkin.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], findAnimation = js.Any.fromFunction1(findAnimation), findBone = js.Any.fromFunction1(findBone), findBoneIndex = js.Any.fromFunction1(findBoneIndex), findEvent = js.Any.fromFunction1(findEvent), findIkConstraint = js.Any.fromFunction1(findIkConstraint), findPathConstraint = js.Any.fromFunction1(findPathConstraint), findPathConstraintIndex = js.Any.fromFunction1(findPathConstraintIndex), findSkin = js.Any.fromFunction1(findSkin), findSlot = js.Any.fromFunction1(findSlot), findSlotIndex = js.Any.fromFunction1(findSlotIndex), findTransformConstraint = js.Any.fromFunction1(findTransformConstraint), fps = fps.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], ikConstraints = ikConstraints.asInstanceOf[js.Any], imagesPath = imagesPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pathConstraints = pathConstraints.asInstanceOf[js.Any], skins = skins.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], transformConstraints = transformConstraints.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonData]
  }
}

