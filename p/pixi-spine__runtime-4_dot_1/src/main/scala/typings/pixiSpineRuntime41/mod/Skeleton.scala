package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.IAttachment
import typings.pixiSpineBase.mod.ISkeleton
import typings.pixiSpineBase.mod.Vector2
import typings.pixiSpineRuntime41.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "Skeleton")
@js.native
open class Skeleton protected ()
  extends StObject
     with ISkeleton[SkeletonData, Bone, Slot, Skin] {
  def this(data: SkeletonData) = this()
  
  /** The list of bones and constraints, sorted in the order they should be updated, as computed by {@link #updateCache()}. */
  var _updateCache: js.Array[Updatable] = js.native
  
  /* CompleteClass */
  var bones: js.Array[Bone] = js.native
  
  /** The color to tint all the skeleton's attachments. */
  var color: Color = js.native
  
  /* CompleteClass */
  var data: SkeletonData = js.native
  
  /* CompleteClass */
  var drawOrder: js.Array[Slot] = js.native
  
  /* CompleteClass */
  override def findBone(boneName: String): Bone = js.native
  
  /* CompleteClass */
  override def findBoneIndex(boneName: String): Double = js.native
  
  /** Finds an IK constraint by comparing each IK constraint's name. It is more efficient to cache the results of this method
    * than to call it repeatedly.
    * @return May be null. */
  def findIkConstraint(constraintName: String): IkConstraint = js.native
  
  /** Finds a path constraint by comparing each path constraint's name. It is more efficient to cache the results of this method
    * than to call it repeatedly.
    * @return May be null. */
  def findPathConstraint(constraintName: String): PathConstraint = js.native
  
  /* CompleteClass */
  override def findSlot(slotName: String): Slot = js.native
  
  /* CompleteClass */
  override def findSlotIndex(slotName: String): Double = js.native
  
  /** Finds a transform constraint by comparing each transform constraint's name. It is more efficient to cache the results of
    * this method than to call it repeatedly.
    * @return May be null. */
  def findTransformConstraint(constraintName: String): TransformConstraint = js.native
  
  def flipX: Boolean = js.native
  def flipX_=(value: Boolean): Unit = js.native
  
  def flipY: Boolean = js.native
  def flipY_=(value: Boolean): Unit = js.native
  
  /** Finds an attachment by looking in the {@link #skin} and {@link SkeletonData#defaultSkin} using the slot index and
    * attachment name. First the skin is checked and if the attachment was not found, the default skin is checked.
    *
    * See [Runtime skins](http://esotericsoftware.com/spine-runtime-skins) in the Spine Runtimes Guide.
    * @returns May be null. */
  def getAttachment(slotIndex: Double, attachmentName: String): Attachment | Null = js.native
  
  /* CompleteClass */
  override def getAttachmentByName(slotName: String, attachmentName: String): IAttachment = js.native
  
  /** Returns the axis aligned bounding box (AABB) of the region and mesh attachments for the current pose.
    * @param offset An output value, the distance from the skeleton origin to the bottom left corner of the AABB.
    * @param size An output value, the width and height of the AABB.
    * @param temp Working memory to temporarily store attachments' computed world vertices. */
  def getBounds(offset: Vector2, size: Vector2): Unit = js.native
  /* CompleteClass */
  override def getBounds(offset: Vector2, size: Vector2, temp: js.Array[Double]): Unit = js.native
  
  /** Returns the axis aligned bounding box (AABB) of the region and mesh attachments for the current pose as `{ x: number, y: number, width: number, height: number }`.
    * Note that this method will create temporary objects which can add to garbage collection pressure. Use `getBounds()` if garbage collection is a concern. */
  def getBoundsRect(): Height = js.native
  
  /** @returns May return null. */
  def getRootBone(): Bone = js.native
  
  /** The skeleton's IK constraints. */
  var ikConstraints: js.Array[IkConstraint] = js.native
  
  /** The skeleton's path constraints. */
  var pathConstraints: js.Array[PathConstraint] = js.native
  
  /** Scales the entire skeleton on the X axis. This affects all bones, even if the bone's transform mode disallows scale
    * inheritance. */
  var scaleX: Double = js.native
  
  /** Scales the entire skeleton on the Y axis. This affects all bones, even if the bone's transform mode disallows scale
    * inheritance. */
  var scaleY: Double = js.native
  
  /* CompleteClass */
  override def setAttachment(slotName: String, attachmentName: String): Unit = js.native
  
  /* CompleteClass */
  override def setBonesToSetupPose(): Unit = js.native
  
  /** Sets the skin used to look up attachments before looking in the {@link SkeletonData#defaultSkin default skin}. If the
    * skin is changed, {@link #updateCache()} is called.
    *
    * Attachments from the new skin are attached if the corresponding attachment from the old skin was attached. If there was no
    * old skin, each slot's setup mode attachment is attached from the new skin.
    *
    * After changing the skin, the visible attachments can be reset to those attached in the setup pose by calling
    * {@link #setSlotsToSetupPose()}. Also, often {@link AnimationState#apply()} is called before the next time the
    * skeleton is rendered to allow any attachment keys in the current animation(s) to hide or show attachments from the new skin.
    * @param newSkin May be null. */
  def setSkin(newSkin: Skin): Unit = js.native
  
  /* CompleteClass */
  override def setSkinByName(skinName: String): Unit = js.native
  
  /* CompleteClass */
  override def setSlotsToSetupPose(): Unit = js.native
  
  /* CompleteClass */
  override def setToSetupPose(): Unit = js.native
  
  /* CompleteClass */
  var skin: Skin = js.native
  /** The skeleton's current skin. May be null. */
  @JSName("skin")
  var skin_Skeleton: Skin | Null = js.native
  
  /* CompleteClass */
  var slots: js.Array[Slot] = js.native
  
  def sortBone(bone: Bone): Unit = js.native
  
  def sortIkConstraint(constraint: IkConstraint): Unit = js.native
  
  def sortPathConstraint(constraint: PathConstraint): Unit = js.native
  
  def sortPathConstraintAttachment(skin: Skin, slotIndex: Double, slotBone: Bone): Unit = js.native
  
  def sortPathConstraintAttachmentWith(attachment: Attachment, slotBone: Bone): Unit = js.native
  
  def sortReset(bones: js.Array[Bone]): Unit = js.native
  
  def sortTransformConstraint(constraint: TransformConstraint): Unit = js.native
  
  /** The skeleton's transform constraints. */
  var transformConstraints: js.Array[TransformConstraint] = js.native
  
  /** Caches information about bones and constraints. Must be called if the {@link #getSkin()} is modified or if bones,
    * constraints, or weighted path attachments are added or removed. */
  def updateCache(): Unit = js.native
  
  /* CompleteClass */
  override def updateWorldTransform(): Unit = js.native
  
  def updateWorldTransformWith(parent: Bone): Unit = js.native
  
  /** Sets the skeleton X position, which is added to the root bone worldX position. */
  var x: Double = js.native
  
  /** Sets the skeleton Y position, which is added to the root bone worldY position. */
  var y: Double = js.native
}
/* static members */
object Skeleton {
  
  @JSImport("@pixi-spine/runtime-4.1", "Skeleton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "Skeleton.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: Any = js.native
  inline def deprecatedWarning1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
}
