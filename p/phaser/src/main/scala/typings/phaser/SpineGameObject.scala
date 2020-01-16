package typings.phaser

import typings.phaser.Phaser.Scene
import typings.phaser.spine.Animation
import typings.phaser.spine.AnimationState
import typings.phaser.spine.AnimationStateData
import typings.phaser.spine.Attachment
import typings.phaser.spine.Bone
import typings.phaser.spine.EventData
import typings.phaser.spine.IkConstraintData
import typings.phaser.spine.PathConstraintData
import typings.phaser.spine.Skeleton
import typings.phaser.spine.SkeletonData
import typings.phaser.spine.Skin
import typings.phaser.spine.Slot
import typings.phaser.spine.TrackEntry
import typings.phaser.spine.TransformConstraintData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SpineGameObject")
@js.native
class SpineGameObject protected () extends js.Object {
  def this(scene: Scene, pluginManager: SpinePlugin, x: Double, y: Double) = this()
  def this(scene: Scene, pluginManager: SpinePlugin, x: Double, y: Double, key: String) = this()
  def this(scene: Scene, pluginManager: SpinePlugin, x: Double, y: Double, key: String, animationName: String) = this()
  def this(
    scene: Scene,
    pluginManager: SpinePlugin,
    x: Double,
    y: Double,
    key: String,
    animationName: String,
    loop: Boolean
  ) = this()
  var alpha: Double = js.native
  val blendMode: Double = js.native
  var blue: Double = js.native
  var bounds: js.Any = js.native
  var displayOriginX: Double = js.native
  var displayOriginY: Double = js.native
  var drawDebug: Boolean = js.native
  var green: Double = js.native
  var plugin: SpinePlugin = js.native
  var preMultipliedAlpha: Boolean = js.native
  var red: Double = js.native
  var root: Bone = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var skeleton: Skeleton = js.native
  var skeletonData: SkeletonData = js.native
  var state: AnimationState = js.native
  var stateData: AnimationStateData = js.native
  var timeScale: Double = js.native
  def addAnimation(trackIndex: integer, animationName: String): TrackEntry = js.native
  def addAnimation(trackIndex: integer, animationName: String, loop: Boolean): TrackEntry = js.native
  def addAnimation(trackIndex: integer, animationName: String, loop: Boolean, delay: integer): TrackEntry = js.native
  def angleBoneToXY(bone: Bone, worldX: Double, worldY: Double): SpineGameObject = js.native
  def angleBoneToXY(bone: Bone, worldX: Double, worldY: Double, offset: Double): SpineGameObject = js.native
  def angleBoneToXY(bone: Bone, worldX: Double, worldY: Double, offset: Double, minAngle: Double): SpineGameObject = js.native
  def angleBoneToXY(bone: Bone, worldX: Double, worldY: Double, offset: Double, minAngle: Double, maxAngle: Double): SpineGameObject = js.native
  def clearTrack(trackIndex: integer): SpineGameObject = js.native
  def clearTracks(): SpineGameObject = js.native
  def findAnimation(animationName: String): Animation = js.native
  def findBone(boneName: String): Bone = js.native
  def findBoneIndex(boneName: String): Double = js.native
  def findEvent(eventDataName: String): EventData = js.native
  def findIkConstraint(constraintName: String): IkConstraintData = js.native
  def findPathConstraint(constraintName: String): PathConstraintData = js.native
  def findPathConstraintIndex(constraintName: String): Double = js.native
  def findSkin(skinName: String): Skin = js.native
  def findSlot(slotName: String): Slot = js.native
  def findSlotIndex(slotName: String): Double = js.native
  def findTransformConstraint(constraintName: String): TransformConstraintData = js.native
  def getAnimationList(): js.Array[String] = js.native
  def getAttachment(slotIndex: integer, attachmentName: String): Attachment = js.native
  def getAttachmentByName(slotName: String, attachmentName: String): Attachment = js.native
  def getBoneList(): js.Array[String] = js.native
  def getBounds(): js.Any = js.native
  def getCurrentAnimation(): Animation = js.native
  def getCurrentAnimation(trackIndex: integer): Animation = js.native
  def getRootBone(): Bone = js.native
  def getSkinList(): js.Array[String] = js.native
  def getSlotList(): js.Array[String] = js.native
  def play(animationName: String): SpineGameObject = js.native
  def play(animationName: String, loop: Boolean): SpineGameObject = js.native
  def play(animationName: String, loop: Boolean, ignoreIfPlaying: Boolean): SpineGameObject = js.native
  /* protected */ def preDestroy(): Unit = js.native
  /* protected */ def preUpdate(time: Double, delta: Double): Unit = js.native
  def refresh(): SpineGameObject = js.native
  def setAlpha(): SpineGameObject = js.native
  def setAlpha(value: Double): SpineGameObject = js.native
  def setAnimation(trackIndex: integer, animationName: String): TrackEntry = js.native
  def setAnimation(trackIndex: integer, animationName: String, loop: Boolean): TrackEntry = js.native
  def setAnimation(trackIndex: integer, animationName: String, loop: Boolean, ignoreIfPlaying: Boolean): TrackEntry = js.native
  def setAttachment(slotName: String, attachmentName: String): SpineGameObject = js.native
  def setBonesToSetupPose(): SpineGameObject = js.native
  def setColor(): SpineGameObject = js.native
  def setColor(color: integer): SpineGameObject = js.native
  def setColor(color: integer, slotName: String): SpineGameObject = js.native
  def setEmptyAnimation(trackIndex: integer): TrackEntry = js.native
  def setEmptyAnimation(trackIndex: integer, mixDuration: integer): TrackEntry = js.native
  def setMix(fromName: String, toName: String): SpineGameObject = js.native
  def setMix(fromName: String, toName: String, duration: Double): SpineGameObject = js.native
  def setOffset(): SpineGameObject = js.native
  def setOffset(offsetX: Double): SpineGameObject = js.native
  def setOffset(offsetX: Double, offsetY: Double): SpineGameObject = js.native
  def setSize(): SpineGameObject = js.native
  def setSize(width: Double): SpineGameObject = js.native
  def setSize(width: Double, height: Double): SpineGameObject = js.native
  def setSize(width: Double, height: Double, offsetX: Double): SpineGameObject = js.native
  def setSize(width: Double, height: Double, offsetX: Double, offsetY: Double): SpineGameObject = js.native
  def setSkeleton(atlasDataKey: String, skeletonJSON: js.Object): SpineGameObject = js.native
  def setSkeleton(atlasDataKey: String, skeletonJSON: js.Object, animationName: String): SpineGameObject = js.native
  def setSkeleton(atlasDataKey: String, skeletonJSON: js.Object, animationName: String, loop: Boolean): SpineGameObject = js.native
  def setSkeletonFromJSON(atlasDataKey: String, skeletonJSON: js.Object): SpineGameObject = js.native
  def setSkeletonFromJSON(atlasDataKey: String, skeletonJSON: js.Object, animationName: String): SpineGameObject = js.native
  def setSkeletonFromJSON(atlasDataKey: String, skeletonJSON: js.Object, animationName: String, loop: Boolean): SpineGameObject = js.native
  def setSkin(newSkin: Skin): SpineGameObject = js.native
  def setSkinByName(skinName: String): SpineGameObject = js.native
  def setSlotsToSetupPose(): SpineGameObject = js.native
  def setToSetupPose(): SpineGameObject = js.native
  def updateSize(): SpineGameObject = js.native
  def willRender(): Boolean = js.native
}

