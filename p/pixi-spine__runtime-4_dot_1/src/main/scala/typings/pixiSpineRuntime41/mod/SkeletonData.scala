package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.ISkeletonData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "SkeletonData")
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
  
  /** The path to the audio directory as defined in Spine. Available only when nonessential data was exported. May be null. */
  var audioPath: String | Null = js.native
  
  /* CompleteClass */
  var bones: js.Array[BoneData] = js.native
  
  /* CompleteClass */
  var defaultSkin: Skin = js.native
  /** The skeleton's default skin. By default this skin contains all attachments that were not in a skin in Spine.
    *
    * See {@link Skeleton#getAttachmentByName()}.
    * May be null. */
  @JSName("defaultSkin")
  var defaultSkin_SkeletonData: Skin | Null = js.native
  
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
  
  /** removed from spine-ts runtime **/ def findPathConstraintIndex(pathConstraintName: String): Double = js.native
  
  /* CompleteClass */
  override def findSkin(skinName: String): Skin | Null = js.native
  
  /* CompleteClass */
  override def findSlot(slotName: String): SlotData | Null = js.native
  
  /* CompleteClass */
  override def findSlotIndex(slotName: String): Double = js.native
  
  /* CompleteClass */
  override def findTransformConstraint(constraintName: String): TransformConstraintData | Null = js.native
  
  /** The dopesheet FPS in Spine. Available only when nonessential data was exported. */
  var fps: Double = js.native
  
  /* CompleteClass */
  var hash: String = js.native
  /** The skeleton data hash. This value will change if any of the skeleton data has changed. May be null. */
  @JSName("hash")
  var hash_SkeletonData: String | Null = js.native
  
  /* CompleteClass */
  var height: Double = js.native
  
  /* CompleteClass */
  var ikConstraints: js.Array[IkConstraintData] = js.native
  
  /** The path to the images directory as defined in Spine. Available only when nonessential data was exported. May be null. */
  var imagesPath: String | Null = js.native
  
  /* CompleteClass */
  var name: String = js.native
  /** The skeleton's name, which by default is the name of the skeleton data file, if possible. May be null. */
  @JSName("name")
  var name_SkeletonData: String | Null = js.native
  
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
  /** The Spine version used to export the skeleton data, or null. */
  @JSName("version")
  var version_SkeletonData: String | Null = js.native
  
  /* CompleteClass */
  var width: Double = js.native
  
  /** The X coordinate of the skeleton's axis aligned bounding box in the setup pose. */
  var x: Double = js.native
  
  /** The Y coordinate of the skeleton's axis aligned bounding box in the setup pose. */
  var y: Double = js.native
}
