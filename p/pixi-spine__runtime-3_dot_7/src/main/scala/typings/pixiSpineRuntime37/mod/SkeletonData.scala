package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ISkeletonData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "SkeletonData")
@js.native
open class SkeletonData ()
  extends StObject
     with ISkeletonData[
      BoneData, 
      SlotData, 
      Skin, 
      Animation2, 
      EventData, 
      IkConstraintData, 
      TransformConstraintData, 
      PathConstraintData
    ] {
  
  /* CompleteClass */
  var animations: js.Array[Animation2] = js.native
  
  /* CompleteClass */
  var bones: js.Array[BoneData] = js.native
  
  /* CompleteClass */
  var defaultSkin: Skin = js.native
  
  /* CompleteClass */
  var events: js.Array[EventData] = js.native
  
  /* CompleteClass */
  override def findAnimation(animationName: String): Animation2 | Null = js.native
  
  /* CompleteClass */
  override def findBone(boneName: String): BoneData | Null = js.native
  
  /* CompleteClass */
  override def findBoneIndex(boneName: String): Double = js.native
  
  /* CompleteClass */
  override def findEvent(eventDataName: String): EventData | Null = js.native
  
  /* CompleteClass */
  override def findIkConstraint(constraintName: String): IkConstraintData | Null = js.native
  
  /* CompleteClass */
  override def findPathConstraint(constraintName: String): PathConstraintData | Null = js.native
  
  def findPathConstraintIndex(pathConstraintName: String): Double = js.native
  
  /* CompleteClass */
  override def findSkin(skinName: String): Skin | Null = js.native
  
  /* CompleteClass */
  override def findSlot(slotName: String): SlotData | Null = js.native
  
  /* CompleteClass */
  override def findSlotIndex(slotName: String): Double = js.native
  
  /* CompleteClass */
  override def findTransformConstraint(constraintName: String): TransformConstraintData | Null = js.native
  
  var fps: Double = js.native
  
  /* CompleteClass */
  var hash: String = js.native
  
  /* CompleteClass */
  var height: Double = js.native
  
  /* CompleteClass */
  var ikConstraints: js.Array[IkConstraintData] = js.native
  
  var imagesPath: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var pathConstraints: js.Array[PathConstraintData] = js.native
  
  /* CompleteClass */
  var skins: js.Array[Skin] = js.native
  
  /* CompleteClass */
  var slots: js.Array[SlotData] = js.native
  
  /* CompleteClass */
  var transformConstraints: js.Array[TransformConstraintData] = js.native
  
  /* CompleteClass */
  var version: String = js.native
  
  /* CompleteClass */
  var width: Double = js.native
}
