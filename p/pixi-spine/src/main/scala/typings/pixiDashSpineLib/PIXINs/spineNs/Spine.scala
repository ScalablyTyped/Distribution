package typings
package pixiDashSpineLib.PIXINs.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSGlobal("PIXI.spine.Spine")
@js.native
class Spine protected () extends js.Object {
  def this(spineData: pixiDashSpineLib.PIXINs.spineNs.coreNs.SkeletonData) = this()
  var autoUpdate: scala.Boolean = js.native
  val delayLimit: scala.Double = js.native
  var lastTime: scala.Double = js.native
  var localDelayLimit: scala.Double = js.native
  var setMeshRegion: js.Any = js.native
  var setSpriteRegion: js.Any = js.native
  var skeleton: pixiDashSpineLib.PIXINs.spineNs.coreNs.Skeleton = js.native
  var slotContainers: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Container */ _
  ] = js.native
  var spineData: pixiDashSpineLib.PIXINs.spineNs.coreNs.SkeletonData = js.native
  var state: pixiDashSpineLib.PIXINs.spineNs.coreNs.AnimationState = js.native
  var stateData: pixiDashSpineLib.PIXINs.spineNs.coreNs.AnimationStateData = js.native
  var tempClipContainers: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Container */ _
  ] = js.native
  var tint: scala.Double = js.native
  var tintRgb: stdLib.ArrayLike[scala.Double] = js.native
  def autoUpdateTransform(): scala.Unit = js.native
  def createGraphics(
    slot: pixiDashSpineLib.PIXINs.spineNs.coreNs.Slot,
    clip: pixiDashSpineLib.PIXINs.spineNs.coreNs.ClippingAttachment
  ): js.Any = js.native
  def createMesh(
    slot: pixiDashSpineLib.PIXINs.spineNs.coreNs.Slot,
    attachment: pixiDashSpineLib.PIXINs.spineNs.coreNs.MeshAttachment
  ): SpineMesh = js.native
  def createSprite(
    slot: pixiDashSpineLib.PIXINs.spineNs.coreNs.Slot,
    attachment: pixiDashSpineLib.PIXINs.spineNs.coreNs.RegionAttachment,
    defName: java.lang.String
  ): SpineSprite = js.native
  def destroy(): scala.Unit = js.native
  def destroy(options: js.Any): scala.Unit = js.native
  def hackAttachmentGroups(nameSuffix: java.lang.String, group: js.Any, outGroup: js.Any): js.Array[js.Array[_]] = js.native
  def hackTextureBySlotIndex(slotIndex: scala.Double): scala.Boolean = js.native
  def hackTextureBySlotIndex(
    slotIndex: scala.Double,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): scala.Boolean = js.native
  def hackTextureBySlotIndex(
    slotIndex: scala.Double,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    size: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): scala.Boolean = js.native
  def hackTextureBySlotName(slotName: java.lang.String): scala.Boolean = js.native
  def hackTextureBySlotName(
    slotName: java.lang.String,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): scala.Boolean = js.native
  def hackTextureBySlotName(
    slotName: java.lang.String,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    size: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): scala.Boolean = js.native
  def newContainer(): js.Any = js.native
  def newGraphics(): js.Any = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: stdLib.Float32Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: stdLib.Float32Array,
    uvs: stdLib.Float32Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: stdLib.Float32Array,
    uvs: stdLib.Float32Array,
    indices: stdLib.Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: stdLib.Float32Array,
    uvs: stdLib.Float32Array,
    indices: stdLib.Uint16Array,
    drawMode: scala.Double
  ): SpineMesh = js.native
  def newSprite(
    tex: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): SpineSprite = js.native
  def transformHack(): scala.Double = js.native
  def update(dt: scala.Double): scala.Unit = js.native
  def updateGraphics(
    slot: pixiDashSpineLib.PIXINs.spineNs.coreNs.Slot,
    clip: pixiDashSpineLib.PIXINs.spineNs.coreNs.ClippingAttachment
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.Spine")
@js.native
object Spine extends js.Object {
  var clippingPolygon: js.Array[scala.Double] = js.native
  var globalAutoUpdate: scala.Boolean = js.native
  var globalDelayLimit: scala.Double = js.native
}

