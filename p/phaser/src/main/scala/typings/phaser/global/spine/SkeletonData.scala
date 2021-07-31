package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SkeletonData")
@js.native
class SkeletonData ()
  extends StObject
     with typings.phaser.spine.SkeletonData {
  
  /* CompleteClass */
  var animations: js.Array[typings.phaser.spine.Animation] = js.native
  
  /* CompleteClass */
  var audioPath: String = js.native
  
  /* CompleteClass */
  var bones: js.Array[typings.phaser.spine.BoneData] = js.native
  
  /* CompleteClass */
  var defaultSkin: typings.phaser.spine.Skin = js.native
  
  /* CompleteClass */
  var events: js.Array[typings.phaser.spine.EventData] = js.native
  
  /* CompleteClass */
  override def findAnimation(animationName: String): typings.phaser.spine.Animation = js.native
  
  /* CompleteClass */
  override def findBone(boneName: String): typings.phaser.spine.BoneData = js.native
  
  /* CompleteClass */
  override def findBoneIndex(boneName: String): Double = js.native
  
  /* CompleteClass */
  override def findEvent(eventDataName: String): typings.phaser.spine.EventData = js.native
  
  /* CompleteClass */
  override def findIkConstraint(constraintName: String): typings.phaser.spine.IkConstraintData = js.native
  
  /* CompleteClass */
  override def findPathConstraint(constraintName: String): typings.phaser.spine.PathConstraintData = js.native
  
  /* CompleteClass */
  override def findPathConstraintIndex(pathConstraintName: String): Double = js.native
  
  /* CompleteClass */
  override def findSkin(skinName: String): typings.phaser.spine.Skin = js.native
  
  /* CompleteClass */
  override def findSlot(slotName: String): typings.phaser.spine.SlotData = js.native
  
  /* CompleteClass */
  override def findSlotIndex(slotName: String): Double = js.native
  
  /* CompleteClass */
  override def findTransformConstraint(constraintName: String): typings.phaser.spine.TransformConstraintData = js.native
  
  /* CompleteClass */
  var fps: Double = js.native
  
  /* CompleteClass */
  var hash: String = js.native
  
  /* CompleteClass */
  var height: Double = js.native
  
  /* CompleteClass */
  var ikConstraints: js.Array[typings.phaser.spine.IkConstraintData] = js.native
  
  /* CompleteClass */
  var imagesPath: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var pathConstraints: js.Array[typings.phaser.spine.PathConstraintData] = js.native
  
  /* CompleteClass */
  var skins: js.Array[typings.phaser.spine.Skin] = js.native
  
  /* CompleteClass */
  var slots: js.Array[typings.phaser.spine.SlotData] = js.native
  
  /* CompleteClass */
  var transformConstraints: js.Array[typings.phaser.spine.TransformConstraintData] = js.native
  
  /* CompleteClass */
  var version: String = js.native
  
  /* CompleteClass */
  var width: Double = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
