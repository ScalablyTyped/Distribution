package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.IAttachment
import typings.pixiSpineBase.mod.ISkeleton
import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "Skeleton")
@js.native
open class Skeleton protected ()
  extends StObject
     with ISkeleton[SkeletonData, Bone, Slot, Skin] {
  def this(data: SkeletonData) = this()
  
  var _updateCache: js.Array[Updatable] = js.native
  
  /* CompleteClass */
  var bones: js.Array[Bone] = js.native
  
  var color: Color = js.native
  
  /* CompleteClass */
  var data: SkeletonData = js.native
  
  /* CompleteClass */
  var drawOrder: js.Array[Slot] = js.native
  
  /* CompleteClass */
  override def findBone(boneName: String): Bone = js.native
  
  /* CompleteClass */
  override def findBoneIndex(boneName: String): Double = js.native
  
  /** @return May be null. */
  def findIkConstraint(constraintName: String): IkConstraint = js.native
  
  /** @return May be null. */
  def findPathConstraint(constraintName: String): PathConstraint = js.native
  
  /* CompleteClass */
  override def findSlot(slotName: String): Slot = js.native
  
  /* CompleteClass */
  override def findSlotIndex(slotName: String): Double = js.native
  
  /** @return May be null. */
  def findTransformConstraint(constraintName: String): TransformConstraint = js.native
  
  def flipX: Boolean = js.native
  def flipX_=(value: Boolean): Unit = js.native
  
  def flipY: Boolean = js.native
  def flipY_=(value: Boolean): Unit = js.native
  
  /** @return May be null. */
  def getAttachment(slotIndex: Double, attachmentName: String): Attachment = js.native
  
  /* CompleteClass */
  override def getAttachmentByName(slotName: String, attachmentName: String): IAttachment = js.native
  
  /** Returns the axis aligned bounding box (AABB) of the region and mesh attachments for the current pose.
    * @param offset The distance from the skeleton origin to the bottom left corner of the AABB.
    * @param size The width and height of the AABB.
    * @param temp Working memory */
  def getBounds(offset: Vector2, size: Vector2): Unit = js.native
  /* CompleteClass */
  override def getBounds(offset: Vector2, size: Vector2, temp: js.Array[Double]): Unit = js.native
  
  /** @return May return null. */
  def getRootBone(): Bone = js.native
  
  var ikConstraints: js.Array[IkConstraint] = js.native
  
  var pathConstraints: js.Array[PathConstraint] = js.native
  
  var scaleX: Double = js.native
  
  var scaleY: Double = js.native
  
  /** @param attachmentName May be null. */
  def setAttachment(slotName: String): Unit = js.native
  /* CompleteClass */
  override def setAttachment(slotName: String, attachmentName: String): Unit = js.native
  
  /* CompleteClass */
  override def setBonesToSetupPose(): Unit = js.native
  
  /** Sets the skin used to look up attachments before looking in the {@link SkeletonData#getDefaultSkin() default skin}.
    * Attachments from the new skin are attached if the corresponding attachment from the old skin was attached. If there was no
    * old skin, each slot's setup mode attachment is attached from the new skin.
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
  
  /* CompleteClass */
  var slots: js.Array[Slot] = js.native
  
  def sortBone(bone: Bone): Unit = js.native
  
  def sortIkConstraint(constraint: IkConstraint): Unit = js.native
  
  def sortPathConstraint(constraint: PathConstraint): Unit = js.native
  
  def sortPathConstraintAttachment(skin: Skin, slotIndex: Double, slotBone: Bone): Unit = js.native
  
  def sortPathConstraintAttachmentWith(attachment: Attachment, slotBone: Bone): Unit = js.native
  
  def sortReset(bones: js.Array[Bone]): Unit = js.native
  
  def sortTransformConstraint(constraint: TransformConstraint): Unit = js.native
  
  var time: Double = js.native
  
  var transformConstraints: js.Array[TransformConstraint] = js.native
  
  def update(delta: Double): Unit = js.native
  
  def updateCache(): Unit = js.native
  
  var updateCacheReset: js.Array[Updatable] = js.native
  
  /* CompleteClass */
  override def updateWorldTransform(): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
/* static members */
object Skeleton {
  
  @JSImport("@pixi-spine/runtime-3.8", "Skeleton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "Skeleton.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: Any = js.native
  inline def deprecatedWarning1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
}
