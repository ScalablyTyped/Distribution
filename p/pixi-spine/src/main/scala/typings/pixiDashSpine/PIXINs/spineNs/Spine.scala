package typings.pixiDashSpine.PIXINs.spineNs

import typings.pixiDashSpine.PIXINs.spineNs.coreNs.AnimationState
import typings.pixiDashSpine.PIXINs.spineNs.coreNs.AnimationStateData
import typings.pixiDashSpine.PIXINs.spineNs.coreNs.ClippingAttachment
import typings.pixiDashSpine.PIXINs.spineNs.coreNs.MeshAttachment
import typings.pixiDashSpine.PIXINs.spineNs.coreNs.RegionAttachment
import typings.pixiDashSpine.PIXINs.spineNs.coreNs.Skeleton
import typings.pixiDashSpine.PIXINs.spineNs.coreNs.SkeletonData
import typings.pixiDashSpine.PIXINs.spineNs.coreNs.Slot
import typings.std.ArrayLike
import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Container * / any */ @JSGlobal("PIXI.spine.Spine")
@js.native
class Spine protected () extends js.Object {
  def this(spineData: SkeletonData) = this()
  var autoUpdate: Boolean = js.native
  val delayLimit: Double = js.native
  var lastTime: Double = js.native
  var localDelayLimit: Double = js.native
  var setMeshRegion: js.Any = js.native
  var setSpriteRegion: js.Any = js.native
  var skeleton: Skeleton = js.native
  var slotContainers: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Container */ _
  ] = js.native
  var spineData: SkeletonData = js.native
  var state: AnimationState = js.native
  var stateData: AnimationStateData = js.native
  var tempClipContainers: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Container */ _
  ] = js.native
  var tint: Double = js.native
  var tintRgb: ArrayLike[Double] = js.native
  def autoUpdateTransform(): Unit = js.native
  def createGraphics(slot: Slot, clip: ClippingAttachment): js.Any = js.native
  def createMesh(slot: Slot, attachment: MeshAttachment): SpineMesh = js.native
  def createSprite(slot: Slot, attachment: RegionAttachment, defName: String): SpineSprite = js.native
  def destroy(): Unit = js.native
  def destroy(options: js.Any): Unit = js.native
  def hackAttachmentGroups(nameSuffix: String, group: js.Any, outGroup: js.Any): js.Array[js.Array[_]] = js.native
  def hackTextureBySlotIndex(slotIndex: Double): Boolean = js.native
  def hackTextureBySlotIndex(
    slotIndex: Double,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): Boolean = js.native
  def hackTextureBySlotIndex(
    slotIndex: Double,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    size: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): Boolean = js.native
  def hackTextureBySlotName(slotName: String): Boolean = js.native
  def hackTextureBySlotName(
    slotName: String,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): Boolean = js.native
  def hackTextureBySlotName(
    slotName: String,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    size: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): Boolean = js.native
  def newContainer(): js.Any = js.native
  def newGraphics(): js.Any = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: Float32Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: Float32Array,
    uvs: Float32Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: Float32Array,
    uvs: Float32Array,
    indices: Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: Float32Array,
    uvs: Float32Array,
    indices: Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  def newSprite(
    tex: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): SpineSprite = js.native
  def transformHack(): Double = js.native
  def update(dt: Double): Unit = js.native
  def updateGraphics(slot: Slot, clip: ClippingAttachment): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.Spine")
@js.native
object Spine extends js.Object {
  var clippingPolygon: js.Array[Double] = js.native
  var globalAutoUpdate: Boolean = js.native
  var globalDelayLimit: Double = js.native
}

