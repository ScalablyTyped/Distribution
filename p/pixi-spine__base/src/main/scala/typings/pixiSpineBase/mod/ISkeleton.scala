package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISkeleton[SkeletonData /* <: ISkeletonData[
IBoneData, 
ISlotData, 
ISkin, 
IAnimation[ITimeline], 
IEventData, 
IIkConstraintData, 
ITransformConstraintData, 
IPathConstraintData] */, Bone /* <: IBone */, Slot /* <: ISlot */, Skin /* <: ISkin */] extends StObject {
  
  var bones: js.Array[Bone]
  
  var data: SkeletonData
  
  var drawOrder: js.Array[Slot]
  
  def findBone(boneName: String): Bone
  
  def findBoneIndex(boneName: String): Double
  
  def findSlot(slotName: String): Slot
  
  def findSlotIndex(slotName: String): Double
  
  def getAttachmentByName(slotName: String, attachmentName: String): IAttachment
  
  def getBounds(offset: Vector2, size: Vector2, temp: js.Array[Double]): Unit
  
  def setAttachment(slotName: String, attachmentName: String): Unit
  
  def setBonesToSetupPose(): Unit
  
  def setSkinByName(skinName: String): Unit
  
  def setSlotsToSetupPose(): Unit
  
  def setToSetupPose(): Unit
  
  var skin: Skin
  
  var slots: js.Array[Slot]
  
  def updateWorldTransform(): Unit
}
object ISkeleton {
  
  inline def apply[SkeletonData /* <: ISkeletonData[
    IBoneData, 
    ISlotData, 
    ISkin, 
    IAnimation[ITimeline], 
    IEventData, 
    IIkConstraintData, 
    ITransformConstraintData, 
    IPathConstraintData
  ] */, Bone /* <: IBone */, Slot /* <: ISlot */, Skin /* <: ISkin */](
    bones: js.Array[Bone],
    data: SkeletonData,
    drawOrder: js.Array[Slot],
    findBone: String => Bone,
    findBoneIndex: String => Double,
    findSlot: String => Slot,
    findSlotIndex: String => Double,
    getAttachmentByName: (String, String) => IAttachment,
    getBounds: (Vector2, Vector2, js.Array[Double]) => Unit,
    setAttachment: (String, String) => Unit,
    setBonesToSetupPose: () => Unit,
    setSkinByName: String => Unit,
    setSlotsToSetupPose: () => Unit,
    setToSetupPose: () => Unit,
    skin: Skin,
    slots: js.Array[Slot],
    updateWorldTransform: () => Unit
  ): ISkeleton[SkeletonData, Bone, Slot, Skin] = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], drawOrder = drawOrder.asInstanceOf[js.Any], findBone = js.Any.fromFunction1(findBone), findBoneIndex = js.Any.fromFunction1(findBoneIndex), findSlot = js.Any.fromFunction1(findSlot), findSlotIndex = js.Any.fromFunction1(findSlotIndex), getAttachmentByName = js.Any.fromFunction2(getAttachmentByName), getBounds = js.Any.fromFunction3(getBounds), setAttachment = js.Any.fromFunction2(setAttachment), setBonesToSetupPose = js.Any.fromFunction0(setBonesToSetupPose), setSkinByName = js.Any.fromFunction1(setSkinByName), setSlotsToSetupPose = js.Any.fromFunction0(setSlotsToSetupPose), setToSetupPose = js.Any.fromFunction0(setToSetupPose), skin = skin.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], updateWorldTransform = js.Any.fromFunction0(updateWorldTransform))
    __obj.asInstanceOf[ISkeleton[SkeletonData, Bone, Slot, Skin]]
  }
  
  extension [Self <: ISkeleton[?, ?, ?, ?], SkeletonData /* <: ISkeletonData[
    IBoneData, 
    ISlotData, 
    ISkin, 
    IAnimation[ITimeline], 
    IEventData, 
    IIkConstraintData, 
    ITransformConstraintData, 
    IPathConstraintData
  ] */, Bone /* <: IBone */, Slot /* <: ISlot */, Skin /* <: ISkin */](x: Self & (ISkeleton[SkeletonData, Bone, Slot, Skin])) {
    
    inline def setBones(value: js.Array[Bone]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: Bone*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setData(value: SkeletonData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDrawOrder(value: js.Array[Slot]): Self = StObject.set(x, "drawOrder", value.asInstanceOf[js.Any])
    
    inline def setDrawOrderVarargs(value: Slot*): Self = StObject.set(x, "drawOrder", js.Array(value*))
    
    inline def setFindBone(value: String => Bone): Self = StObject.set(x, "findBone", js.Any.fromFunction1(value))
    
    inline def setFindBoneIndex(value: String => Double): Self = StObject.set(x, "findBoneIndex", js.Any.fromFunction1(value))
    
    inline def setFindSlot(value: String => Slot): Self = StObject.set(x, "findSlot", js.Any.fromFunction1(value))
    
    inline def setFindSlotIndex(value: String => Double): Self = StObject.set(x, "findSlotIndex", js.Any.fromFunction1(value))
    
    inline def setGetAttachmentByName(value: (String, String) => IAttachment): Self = StObject.set(x, "getAttachmentByName", js.Any.fromFunction2(value))
    
    inline def setGetBounds(value: (Vector2, Vector2, js.Array[Double]) => Unit): Self = StObject.set(x, "getBounds", js.Any.fromFunction3(value))
    
    inline def setSetAttachment(value: (String, String) => Unit): Self = StObject.set(x, "setAttachment", js.Any.fromFunction2(value))
    
    inline def setSetBonesToSetupPose(value: () => Unit): Self = StObject.set(x, "setBonesToSetupPose", js.Any.fromFunction0(value))
    
    inline def setSetSkinByName(value: String => Unit): Self = StObject.set(x, "setSkinByName", js.Any.fromFunction1(value))
    
    inline def setSetSlotsToSetupPose(value: () => Unit): Self = StObject.set(x, "setSlotsToSetupPose", js.Any.fromFunction0(value))
    
    inline def setSetToSetupPose(value: () => Unit): Self = StObject.set(x, "setToSetupPose", js.Any.fromFunction0(value))
    
    inline def setSkin(value: Skin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: js.Array[Slot]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsVarargs(value: Slot*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setUpdateWorldTransform(value: () => Unit): Self = StObject.set(x, "updateWorldTransform", js.Any.fromFunction0(value))
  }
}
