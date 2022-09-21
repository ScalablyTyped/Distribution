package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISkeletonData[BoneData /* <: IBoneData */, SlotData /* <: ISlotData */, Skin /* <: ISkin */, Animation /* <: IAnimation[ITimeline] */, EventData /* <: IEventData */, IkConstraintData /* <: IIkConstraintData */, TransformConstraintData /* <: ITransformConstraintData */, PathConstraintData /* <: IPathConstraintData */] extends StObject {
  
  var animations: js.Array[Animation]
  
  var bones: js.Array[BoneData]
  
  var defaultSkin: Skin
  
  var events: js.Array[EventData]
  
  def findAnimation(animationName: String): Animation | Null
  
  def findBone(boneName: String): BoneData | Null
  
  def findBoneIndex(boneName: String): Double
  
  def findEvent(eventDataName: String): EventData | Null
  
  def findIkConstraint(constraintName: String): IkConstraintData | Null
  
  def findPathConstraint(constraintName: String): PathConstraintData | Null
  
  def findSkin(skinName: String): Skin | Null
  
  def findSlot(slotName: String): SlotData | Null
  
  def findSlotIndex(slotName: String): Double
  
  def findTransformConstraint(constraintName: String): TransformConstraintData | Null
  
  var hash: String
  
  var height: Double
  
  var ikConstraints: js.Array[IkConstraintData]
  
  var name: String
  
  var pathConstraints: js.Array[PathConstraintData]
  
  var skins: js.Array[Skin]
  
  var slots: js.Array[SlotData]
  
  var transformConstraints: js.Array[TransformConstraintData]
  
  var version: String
  
  var width: Double
}
object ISkeletonData {
  
  inline def apply[BoneData /* <: IBoneData */, SlotData /* <: ISlotData */, Skin /* <: ISkin */, Animation /* <: IAnimation[ITimeline] */, EventData /* <: IEventData */, IkConstraintData /* <: IIkConstraintData */, TransformConstraintData /* <: ITransformConstraintData */, PathConstraintData /* <: IPathConstraintData */](
    animations: js.Array[Animation],
    bones: js.Array[BoneData],
    defaultSkin: Skin,
    events: js.Array[EventData],
    findAnimation: String => Animation | Null,
    findBone: String => BoneData | Null,
    findBoneIndex: String => Double,
    findEvent: String => EventData | Null,
    findIkConstraint: String => IkConstraintData | Null,
    findPathConstraint: String => PathConstraintData | Null,
    findSkin: String => Skin | Null,
    findSlot: String => SlotData | Null,
    findSlotIndex: String => Double,
    findTransformConstraint: String => TransformConstraintData | Null,
    hash: String,
    height: Double,
    ikConstraints: js.Array[IkConstraintData],
    name: String,
    pathConstraints: js.Array[PathConstraintData],
    skins: js.Array[Skin],
    slots: js.Array[SlotData],
    transformConstraints: js.Array[TransformConstraintData],
    version: String,
    width: Double
  ): ISkeletonData[
    BoneData, 
    SlotData, 
    Skin, 
    Animation, 
    EventData, 
    IkConstraintData, 
    TransformConstraintData, 
    PathConstraintData
  ] = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], defaultSkin = defaultSkin.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], findAnimation = js.Any.fromFunction1(findAnimation), findBone = js.Any.fromFunction1(findBone), findBoneIndex = js.Any.fromFunction1(findBoneIndex), findEvent = js.Any.fromFunction1(findEvent), findIkConstraint = js.Any.fromFunction1(findIkConstraint), findPathConstraint = js.Any.fromFunction1(findPathConstraint), findSkin = js.Any.fromFunction1(findSkin), findSlot = js.Any.fromFunction1(findSlot), findSlotIndex = js.Any.fromFunction1(findSlotIndex), findTransformConstraint = js.Any.fromFunction1(findTransformConstraint), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], ikConstraints = ikConstraints.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pathConstraints = pathConstraints.asInstanceOf[js.Any], skins = skins.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], transformConstraints = transformConstraints.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkeletonData[
    BoneData, 
    SlotData, 
    Skin, 
    Animation, 
    EventData, 
    IkConstraintData, 
    TransformConstraintData, 
    PathConstraintData
  ]]
  }
  
  extension [Self <: ISkeletonData[?, ?, ?, ?, ?, ?, ?, ?], BoneData /* <: IBoneData */, SlotData /* <: ISlotData */, Skin /* <: ISkin */, Animation /* <: IAnimation[ITimeline] */, EventData /* <: IEventData */, IkConstraintData /* <: IIkConstraintData */, TransformConstraintData /* <: ITransformConstraintData */, PathConstraintData /* <: IPathConstraintData */](x: Self & (ISkeletonData[
        BoneData, 
        SlotData, 
        Skin, 
        Animation, 
        EventData, 
        IkConstraintData, 
        TransformConstraintData, 
        PathConstraintData
      ])) {
    
    inline def setAnimations(value: js.Array[Animation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsVarargs(value: Animation*): Self = StObject.set(x, "animations", js.Array(value*))
    
    inline def setBones(value: js.Array[BoneData]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: BoneData*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setDefaultSkin(value: Skin): Self = StObject.set(x, "defaultSkin", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[EventData]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: EventData*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFindAnimation(value: String => Animation | Null): Self = StObject.set(x, "findAnimation", js.Any.fromFunction1(value))
    
    inline def setFindBone(value: String => BoneData | Null): Self = StObject.set(x, "findBone", js.Any.fromFunction1(value))
    
    inline def setFindBoneIndex(value: String => Double): Self = StObject.set(x, "findBoneIndex", js.Any.fromFunction1(value))
    
    inline def setFindEvent(value: String => EventData | Null): Self = StObject.set(x, "findEvent", js.Any.fromFunction1(value))
    
    inline def setFindIkConstraint(value: String => IkConstraintData | Null): Self = StObject.set(x, "findIkConstraint", js.Any.fromFunction1(value))
    
    inline def setFindPathConstraint(value: String => PathConstraintData | Null): Self = StObject.set(x, "findPathConstraint", js.Any.fromFunction1(value))
    
    inline def setFindSkin(value: String => Skin | Null): Self = StObject.set(x, "findSkin", js.Any.fromFunction1(value))
    
    inline def setFindSlot(value: String => SlotData | Null): Self = StObject.set(x, "findSlot", js.Any.fromFunction1(value))
    
    inline def setFindSlotIndex(value: String => Double): Self = StObject.set(x, "findSlotIndex", js.Any.fromFunction1(value))
    
    inline def setFindTransformConstraint(value: String => TransformConstraintData | Null): Self = StObject.set(x, "findTransformConstraint", js.Any.fromFunction1(value))
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIkConstraints(value: js.Array[IkConstraintData]): Self = StObject.set(x, "ikConstraints", value.asInstanceOf[js.Any])
    
    inline def setIkConstraintsVarargs(value: IkConstraintData*): Self = StObject.set(x, "ikConstraints", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPathConstraints(value: js.Array[PathConstraintData]): Self = StObject.set(x, "pathConstraints", value.asInstanceOf[js.Any])
    
    inline def setPathConstraintsVarargs(value: PathConstraintData*): Self = StObject.set(x, "pathConstraints", js.Array(value*))
    
    inline def setSkins(value: js.Array[Skin]): Self = StObject.set(x, "skins", value.asInstanceOf[js.Any])
    
    inline def setSkinsVarargs(value: Skin*): Self = StObject.set(x, "skins", js.Array(value*))
    
    inline def setSlots(value: js.Array[SlotData]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsVarargs(value: SlotData*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setTransformConstraints(value: js.Array[TransformConstraintData]): Self = StObject.set(x, "transformConstraints", value.asInstanceOf[js.Any])
    
    inline def setTransformConstraintsVarargs(value: TransformConstraintData*): Self = StObject.set(x, "transformConstraints", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
