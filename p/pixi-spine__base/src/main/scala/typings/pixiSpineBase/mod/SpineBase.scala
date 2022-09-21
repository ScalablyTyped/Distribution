package typings.pixiSpineBase.mod

import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiDisplay.anon.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiGraphics.mod.Graphics
import typings.pixiMath.mod.Rectangle
import typings.pixiSpineBase.GlobalMixins.Spine
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "SpineBase")
@js.native
abstract class SpineBase[Skeleton /* <: ISkeleton[
ISkeletonData[
  IBoneData, 
  ISlotData, 
  ISkin, 
  IAnimation[ITimeline], 
  IEventData, 
  IIkConstraintData, 
  ITransformConstraintData, 
  IPathConstraintData
], 
IBone, 
ISlot, 
ISkin] */, SkeletonData /* <: ISkeletonData[
IBoneData, 
ISlotData, 
ISkin, 
IAnimation[ITimeline], 
IEventData, 
IIkConstraintData, 
ITransformConstraintData, 
IPathConstraintData] */, AnimationState /* <: IAnimationState[
IAnimationStateData[
  ISkeletonData[
    IBoneData, 
    ISlotData, 
    ISkin, 
    IAnimation[ITimeline], 
    IEventData, 
    IIkConstraintData, 
    ITransformConstraintData, 
    IPathConstraintData
  ], 
  IAnimation[ITimeline]
]] */, AnimationStateData /* <: IAnimationStateData[
ISkeletonData[
  IBoneData, 
  ISlotData, 
  ISkin, 
  IAnimation[ITimeline], 
  IEventData, 
  IIkConstraintData, 
  ITransformConstraintData, 
  IPathConstraintData
], 
IAnimation[ITimeline]] */] protected ()
  extends Container[DisplayObject]
     with Spine {
  def this(spineData: SkeletonData) = this()
  
  /* private */ var _autoUpdate: Any = js.native
  
  /* protected */ var _visible: Boolean = js.native
  
  /**
    * If this flag is set to true, the spine animation will be automatically updated every
    * time the object id drawn. The down side of this approach is that the delta time is
    * automatically calculated and you could miss out on cool effects like slow motion,
    * pause, skip ahead and the sorts. Most of these effects can be achieved even with
    * autoUpdate enabled but are harder to achieve.
    *
    * @member {boolean}
    * @memberof spine.Spine#
    * @default true
    */
  def autoUpdate: Boolean = js.native
  
  /**
    * When autoupdate is set to yes this function is used as pixi's updateTransform function
    *
    * @private
    */
  def autoUpdateTransform(): Unit = js.native
  
  def autoUpdate_=(value: Boolean): Unit = js.native
  
  def createGraphics(slot: ISlot, clip: IClippingAttachment): Graphics = js.native
  
  /**
    * Creates a Strip from the spine data
    * @param slot {spine.Slot} The slot to which the attachment is parented
    * @param attachment {spine.RegionAttachment} The attachment that the sprite will represent
    * @private
    */
  def createMesh(slot: ISlot, attachment: IMeshAttachment): SpineMesh = js.native
  
  def createSkeleton(
    spineData: ISkeletonData[
      IBoneData, 
      ISlotData, 
      ISkin, 
      IAnimation[ITimeline], 
      IEventData, 
      IIkConstraintData, 
      ITransformConstraintData, 
      IPathConstraintData
    ]
  ): Any = js.native
  
  /**
    * Create a new sprite to be used with core.RegionAttachment
    *
    * @param slot {spine.Slot} The slot to which the attachment is parented
    * @param attachment {spine.RegionAttachment} The attachment that the sprite will represent
    * @private
    */
  def createSprite(slot: ISlot, attachment: IRegionAttachment, defName: String): SpineSprite = js.native
  
  /**
    * Limit value for the update dt with Spine.globalDelayLimit
    * that can be overridden with localDelayLimit
    * @return {number} - Maximum processed dt value for the update
    */
  def delayLimit: Double = js.native
  
  def destroy(options: Any): Unit = js.native
  
  /**
    * Hack for pixi-display and pixi-lights. Every attachment name ending with a suffix will be added to different layer
    * @param nameSuffix
    * @param group
    * @param outGroup
    */
  def hackAttachmentGroups(nameSuffix: String, group: Any, outGroup: Any): js.Array[js.Array[Any]] = js.native
  
  /**
    * Changes texture of an attachment
    *
    * PIXI runtime feature, it was made to satisfy our users.
    *
    * @param slotName {string}
    * @param attachmentName {string}
    * @param [texture = null] {PIXI.Texture} If null, take default (original) texture
    * @param [size = null] {PIXI.Point} sometimes we need new size for region attachment, you can pass 'texture.orig' there
    * @returns {boolean} Success flag
    */
  def hackTextureAttachment(slotName: String, attachmentName: String, texture: Any): Boolean = js.native
  def hackTextureAttachment(slotName: String, attachmentName: String, texture: Any, size: Rectangle): Boolean = js.native
  
  /**
    * Changes texture in attachment in specific slot.
    *
    * PIXI runtime feature, it was made to satisfy our users.
    *
    * @param slotIndex {number}
    * @param [texture = null] {PIXI.Texture} If null, take default (original) texture
    * @param [size = null] {PIXI.Point} sometimes we need new size for region attachment, you can pass 'texture.orig' there
    * @returns {boolean} Success flag
    */
  def hackTextureBySlotIndex(slotIndex: Double): Boolean = js.native
  def hackTextureBySlotIndex(slotIndex: Double, texture: Unit, size: Rectangle): Boolean = js.native
  def hackTextureBySlotIndex(slotIndex: Double, texture: Texture[Resource]): Boolean = js.native
  def hackTextureBySlotIndex(slotIndex: Double, texture: Texture[Resource], size: Rectangle): Boolean = js.native
  
  /**
    * Changes texture in attachment in specific slot.
    *
    * PIXI runtime feature, it was made to satisfy our users.
    *
    * @param slotName {string}
    * @param [texture = null] {PIXI.Texture} If null, take default (original) texture
    * @param [size = null] {PIXI.Point} sometimes we need new size for region attachment, you can pass 'texture.orig' there
    * @returns {boolean} Success flag
    */
  def hackTextureBySlotName(slotName: String): Boolean = js.native
  def hackTextureBySlotName(slotName: String, texture: Unit, size: Rectangle): Boolean = js.native
  def hackTextureBySlotName(slotName: String, texture: Texture[Resource]): Boolean = js.native
  def hackTextureBySlotName(slotName: String, texture: Texture[Resource], size: Rectangle): Boolean = js.native
  
  /* protected */ var lastTime: Double = js.native
  
  var localDelayLimit: Double = js.native
  
  def newContainer(): Container[DisplayObject] = js.native
  
  def newGraphics(): Graphics = js.native
  
  def newMesh(texture: Texture[Resource]): SpineMesh = js.native
  def newMesh(texture: Texture[Resource], vertices: js.typedarray.Float32Array): SpineMesh = js.native
  def newMesh(texture: Texture[Resource], vertices: js.typedarray.Float32Array, uvs: js.typedarray.Float32Array): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: Unit,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: Unit,
    indices: js.typedarray.Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: Unit,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: js.typedarray.Float32Array,
    uvs: Unit,
    indices: Unit,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(texture: Texture[Resource], vertices: Unit, uvs: js.typedarray.Float32Array): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: Unit,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: Unit,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: Unit,
    uvs: js.typedarray.Float32Array,
    indices: Unit,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: js.typedarray.Uint16Array): SpineMesh = js.native
  def newMesh(
    texture: Texture[Resource],
    vertices: Unit,
    uvs: Unit,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: Unit, drawMode: Double): SpineMesh = js.native
  
  def newSprite(tex: Texture[Resource]): SpineSprite = js.native
  
  /* private */ var setMeshRegion: Any = js.native
  
  /* private */ var setSpriteRegion: Any = js.native
  
  var skeleton: Skeleton = js.native
  
  var slotContainers: js.Array[Container[DisplayObject]] = js.native
  
  var spineData: SkeletonData = js.native
  
  var state: AnimationState = js.native
  
  var stateData: AnimationStateData = js.native
  
  var tempClipContainers: js.Array[Container[DisplayObject]] = js.native
  
  /**
    * The tint applied to the spine object. This is a hex value. A value of 0xFFFFFF will remove any tint effect.
    *
    * @member {number}
    * @memberof spine.Spine#
    * @default 0xFFFFFF
    */
  def tint: Double = js.native
  
  var tintRgb: ArrayLike[Double] = js.native
  
  def tint_=(value: Double): Unit = js.native
  
  def transformHack(): Double = js.native
  
  /**
    * Update the spine skeleton and its animations by delta time (dt)
    *
    * @param dt {number} Delta time. Time by which the animation should be updated
    */
  def update(dt: Double): Unit = js.native
  
  def updateGraphics(slot: ISlot, clip: IClippingAttachment): Unit = js.native
}
/* static members */
object SpineBase {
  
  @JSImport("@pixi-spine/base", "SpineBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/base", "SpineBase.clippingPolygon")
  @js.native
  def clippingPolygon: js.Array[Double] = js.native
  inline def clippingPolygon_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clippingPolygon")(x.asInstanceOf[js.Any])
}
