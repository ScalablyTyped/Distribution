package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "ImageElement")
@js.native
open class ImageElement protected () extends StObject {
  def this(element: Any) = this()
  
  var _atlasRect: Vec4 = js.native
  
  var _atlasRectUniform: js.typedarray.Float32Array = js.native
  
  def _bindMaterialAsset(asset: Any): Unit = js.native
  
  def _bindSprite(sprite: Any): Unit = js.native
  
  def _bindSpriteAsset(asset: Any): Unit = js.native
  
  def _bindTextureAsset(asset: Any): Unit = js.native
  
  var _color: Color = js.native
  
  var _colorUniform: js.typedarray.Float32Array = js.native
  
  def _createMesh(): Mesh = js.native
  
  var _defaultMesh: Mesh = js.native
  
  var _element: Any = js.native
  
  var _entity: Any = js.native
  
  def _hasUserMaterial(): Boolean = js.native
  
  var _innerOffset: Vec4 = js.native
  
  var _innerOffsetUniform: js.typedarray.Float32Array = js.native
  
  var _mask: Boolean = js.native
  
  var _maskRef: Double = js.native
  
  var _material: Any = js.native
  
  var _materialAsset: Any = js.native
  
  var _meshDirty: Boolean = js.native
  
  def _onAtlasTextureChange(): Unit = js.native
  
  def _onDrawOrderChange(order: Any): Unit = js.native
  
  def _onMaterialAdded(asset: Any): Unit = js.native
  
  def _onMaterialChange(): Unit = js.native
  
  def _onMaterialLoad(asset: Any): Unit = js.native
  
  def _onMaterialRemove(): Unit = js.native
  
  def _onParentResizeOrPivotChange(): Unit = js.native
  
  def _onResolutionChange(res: Any): Unit = js.native
  
  def _onScreenChange(screen: Any, previous: Any): Unit = js.native
  
  def _onScreenSpaceChange(value: Any): Unit = js.native
  
  def _onSpriteAssetAdded(asset: Any): Unit = js.native
  
  def _onSpriteAssetChange(asset: Any): Unit = js.native
  
  def _onSpriteAssetLoad(asset: Any): Unit = js.native
  
  def _onSpriteAssetRemove(asset: Any): Unit = js.native
  
  def _onSpriteMeshesChange(): Unit = js.native
  
  def _onSpritePpuChange(): Unit = js.native
  
  def _onTextureAdded(asset: Any): Unit = js.native
  
  def _onTextureAtlasLoad(atlasAsset: Any): Unit = js.native
  
  def _onTextureChange(asset: Any): Unit = js.native
  
  def _onTextureLoad(asset: Any): Unit = js.native
  
  def _onTextureRemove(asset: Any): Unit = js.native
  
  var _outerScale: Vec2 = js.native
  
  var _outerScaleUniform: js.typedarray.Float32Array = js.native
  
  var _pixelsPerUnit: Any = js.native
  
  var _rect: Vec4 = js.native
  
  var _renderable: ImageRenderable = js.native
  
  def _setStencil(stencilParams: Any): Unit = js.native
  
  var _sprite: Any = js.native
  
  var _spriteAsset: Any = js.native
  
  var _spriteFrame: Double = js.native
  
  var _system: Any = js.native
  
  var _targetAspectRatio: Double = js.native
  
  var _texture: Any = js.native
  
  var _textureAsset: Any = js.native
  
  def _toggleMask(): Unit = js.native
  
  def _unbindMaterialAsset(asset: Any): Unit = js.native
  
  def _unbindSprite(sprite: Any): Unit = js.native
  
  def _unbindSpriteAsset(asset: Any): Unit = js.native
  
  def _unbindTextureAsset(asset: Any): Unit = js.native
  
  def _updateAabb(aabb: Any): Any = js.native
  
  var _updateAabbFunc: Any = js.native
  
  def _updateMaterial(screenSpace: Any): Unit = js.native
  
  def _updateMesh(mesh: Any): Unit = js.native
  
  def _updateSprite(): Unit = js.native
  
  def _use9Slicing(): Boolean = js.native
  
  def aabb: Any = js.native
  
  def color: Color = js.native
  def color_=(arg: Color): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def mask: Boolean = js.native
  def mask_=(arg: Boolean): Unit = js.native
  
  def material: Any = js.native
  
  def materialAsset: Any = js.native
  def materialAsset_=(arg: Any): Unit = js.native
  
  def material_=(arg: Any): Unit = js.native
  
  def mesh: Any = js.native
  def mesh_=(arg: Any): Unit = js.native
  
  def onDisable(): Unit = js.native
  
  def onEnable(): Unit = js.native
  
  def opacity: Double = js.native
  def opacity_=(arg: Double): Unit = js.native
  
  def pixelsPerUnit: Any = js.native
  def pixelsPerUnit_=(arg: Any): Unit = js.native
  
  def rect: Vec4 = js.native
  def rect_=(arg: Vec4): Unit = js.native
  
  def refreshMesh(): Unit = js.native
  
  def sprite: Any = js.native
  
  def spriteAsset: Any = js.native
  def spriteAsset_=(arg: Any): Unit = js.native
  
  def spriteFrame: Double = js.native
  def spriteFrame_=(arg: Double): Unit = js.native
  
  def sprite_=(arg: Any): Unit = js.native
  
  def texture: Any = js.native
  
  def textureAsset: Any = js.native
  def textureAsset_=(arg: Any): Unit = js.native
  
  def texture_=(arg: Any): Unit = js.native
}
