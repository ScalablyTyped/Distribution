package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonData extends js.Object {
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
  @scala.inline
  implicit class SkeletonDataOps[Self <: SkeletonData] (val x: Self) extends AnyVal {
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
    def setAnimationsVarargs(value: Animation*): Self = this.set("animations", js.Array(value :_*))
    @scala.inline
    def setAnimations(value: js.Array[Animation]): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioPath(value: String): Self = this.set("audioPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setBonesVarargs(value: BoneData*): Self = this.set("bones", js.Array(value :_*))
    @scala.inline
    def setBones(value: js.Array[BoneData]): Self = this.set("bones", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSkin(value: Skin): Self = this.set("defaultSkin", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: EventData*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[EventData]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindAnimation(value: String => Animation): Self = this.set("findAnimation", js.Any.fromFunction1(value))
    @scala.inline
    def setFindBone(value: String => BoneData): Self = this.set("findBone", js.Any.fromFunction1(value))
    @scala.inline
    def setFindBoneIndex(value: String => Double): Self = this.set("findBoneIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setFindEvent(value: String => EventData): Self = this.set("findEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setFindIkConstraint(value: String => IkConstraintData): Self = this.set("findIkConstraint", js.Any.fromFunction1(value))
    @scala.inline
    def setFindPathConstraint(value: String => PathConstraintData): Self = this.set("findPathConstraint", js.Any.fromFunction1(value))
    @scala.inline
    def setFindPathConstraintIndex(value: String => Double): Self = this.set("findPathConstraintIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setFindSkin(value: String => Skin): Self = this.set("findSkin", js.Any.fromFunction1(value))
    @scala.inline
    def setFindSlot(value: String => SlotData): Self = this.set("findSlot", js.Any.fromFunction1(value))
    @scala.inline
    def setFindSlotIndex(value: String => Double): Self = this.set("findSlotIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setFindTransformConstraint(value: String => TransformConstraintData): Self = this.set("findTransformConstraint", js.Any.fromFunction1(value))
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIkConstraintsVarargs(value: IkConstraintData*): Self = this.set("ikConstraints", js.Array(value :_*))
    @scala.inline
    def setIkConstraints(value: js.Array[IkConstraintData]): Self = this.set("ikConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesPath(value: String): Self = this.set("imagesPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathConstraintsVarargs(value: PathConstraintData*): Self = this.set("pathConstraints", js.Array(value :_*))
    @scala.inline
    def setPathConstraints(value: js.Array[PathConstraintData]): Self = this.set("pathConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkinsVarargs(value: Skin*): Self = this.set("skins", js.Array(value :_*))
    @scala.inline
    def setSkins(value: js.Array[Skin]): Self = this.set("skins", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotsVarargs(value: SlotData*): Self = this.set("slots", js.Array(value :_*))
    @scala.inline
    def setSlots(value: js.Array[SlotData]): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformConstraintsVarargs(value: TransformConstraintData*): Self = this.set("transformConstraints", js.Array(value :_*))
    @scala.inline
    def setTransformConstraints(value: js.Array[TransformConstraintData]): Self = this.set("transformConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

