package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightTextureAtlas extends StObject {
  
  var _cookieAtlasTextureId: Any
  
  var _shadowAtlasParams: js.typedarray.Float32Array
  
  var _shadowAtlasParamsId: Any
  
  var _shadowAtlasTextureId: Any
  
  def allocateCookieAtlas(resolution: Any): Unit
  
  def allocateShadowAtlas(resolution: Any): Unit
  
  def allocateUniforms(): Unit
  
  def assignSlot(light: Any, slotIndex: Any, slotReassigned: Any): Unit
  
  var atlasSplit: js.Array[Any]
  
  def collectLights(spotLights: Any, omniLights: Any, lightingParams: Any): js.Array[Any]
  
  var cookieAtlas: Texture
  
  var cookieAtlasResolution: Double
  
  var cookieRenderTarget: RenderTarget
  
  var cubeSlotsOffsets: js.Array[Vec2]
  
  def destroy(): Unit
  
  def destroyCookieAtlas(): Unit
  
  def destroyShadowAtlas(): Unit
  
  var device: Any
  
  var scissorVec: Vec4
  
  def setupSlot(light: Any, rect: Any): Unit
  
  var shadowAtlas: ShadowMap
  
  var shadowAtlasResolution: Double
  
  var shadowEdgePixels: Double
  
  var slots: js.Array[Any]
  
  def subdivide(numLights: Any, lightingParams: Any): Unit
  
  def update(spotLights: Any, omniLights: Any, lightingParams: Any): Unit
  
  def updateUniforms(): Unit
  
  var version: Double
}
object LightTextureAtlas {
  
  inline def apply(
    _cookieAtlasTextureId: Any,
    _shadowAtlasParams: js.typedarray.Float32Array,
    _shadowAtlasParamsId: Any,
    _shadowAtlasTextureId: Any,
    allocateCookieAtlas: Any => Unit,
    allocateShadowAtlas: Any => Unit,
    allocateUniforms: () => Unit,
    assignSlot: (Any, Any, Any) => Unit,
    atlasSplit: js.Array[Any],
    collectLights: (Any, Any, Any) => js.Array[Any],
    cookieAtlas: Texture,
    cookieAtlasResolution: Double,
    cookieRenderTarget: RenderTarget,
    cubeSlotsOffsets: js.Array[Vec2],
    destroy: () => Unit,
    destroyCookieAtlas: () => Unit,
    destroyShadowAtlas: () => Unit,
    device: Any,
    scissorVec: Vec4,
    setupSlot: (Any, Any) => Unit,
    shadowAtlas: ShadowMap,
    shadowAtlasResolution: Double,
    shadowEdgePixels: Double,
    slots: js.Array[Any],
    subdivide: (Any, Any) => Unit,
    update: (Any, Any, Any) => Unit,
    updateUniforms: () => Unit,
    version: Double
  ): LightTextureAtlas = {
    val __obj = js.Dynamic.literal(_cookieAtlasTextureId = _cookieAtlasTextureId.asInstanceOf[js.Any], _shadowAtlasParams = _shadowAtlasParams.asInstanceOf[js.Any], _shadowAtlasParamsId = _shadowAtlasParamsId.asInstanceOf[js.Any], _shadowAtlasTextureId = _shadowAtlasTextureId.asInstanceOf[js.Any], allocateCookieAtlas = js.Any.fromFunction1(allocateCookieAtlas), allocateShadowAtlas = js.Any.fromFunction1(allocateShadowAtlas), allocateUniforms = js.Any.fromFunction0(allocateUniforms), assignSlot = js.Any.fromFunction3(assignSlot), atlasSplit = atlasSplit.asInstanceOf[js.Any], collectLights = js.Any.fromFunction3(collectLights), cookieAtlas = cookieAtlas.asInstanceOf[js.Any], cookieAtlasResolution = cookieAtlasResolution.asInstanceOf[js.Any], cookieRenderTarget = cookieRenderTarget.asInstanceOf[js.Any], cubeSlotsOffsets = cubeSlotsOffsets.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), destroyCookieAtlas = js.Any.fromFunction0(destroyCookieAtlas), destroyShadowAtlas = js.Any.fromFunction0(destroyShadowAtlas), device = device.asInstanceOf[js.Any], scissorVec = scissorVec.asInstanceOf[js.Any], setupSlot = js.Any.fromFunction2(setupSlot), shadowAtlas = shadowAtlas.asInstanceOf[js.Any], shadowAtlasResolution = shadowAtlasResolution.asInstanceOf[js.Any], shadowEdgePixels = shadowEdgePixels.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], subdivide = js.Any.fromFunction2(subdivide), update = js.Any.fromFunction3(update), updateUniforms = js.Any.fromFunction0(updateUniforms), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightTextureAtlas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LightTextureAtlas] (val x: Self) extends AnyVal {
    
    inline def setAllocateCookieAtlas(value: Any => Unit): Self = StObject.set(x, "allocateCookieAtlas", js.Any.fromFunction1(value))
    
    inline def setAllocateShadowAtlas(value: Any => Unit): Self = StObject.set(x, "allocateShadowAtlas", js.Any.fromFunction1(value))
    
    inline def setAllocateUniforms(value: () => Unit): Self = StObject.set(x, "allocateUniforms", js.Any.fromFunction0(value))
    
    inline def setAssignSlot(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "assignSlot", js.Any.fromFunction3(value))
    
    inline def setAtlasSplit(value: js.Array[Any]): Self = StObject.set(x, "atlasSplit", value.asInstanceOf[js.Any])
    
    inline def setAtlasSplitVarargs(value: Any*): Self = StObject.set(x, "atlasSplit", js.Array(value*))
    
    inline def setCollectLights(value: (Any, Any, Any) => js.Array[Any]): Self = StObject.set(x, "collectLights", js.Any.fromFunction3(value))
    
    inline def setCookieAtlas(value: Texture): Self = StObject.set(x, "cookieAtlas", value.asInstanceOf[js.Any])
    
    inline def setCookieAtlasResolution(value: Double): Self = StObject.set(x, "cookieAtlasResolution", value.asInstanceOf[js.Any])
    
    inline def setCookieRenderTarget(value: RenderTarget): Self = StObject.set(x, "cookieRenderTarget", value.asInstanceOf[js.Any])
    
    inline def setCubeSlotsOffsets(value: js.Array[Vec2]): Self = StObject.set(x, "cubeSlotsOffsets", value.asInstanceOf[js.Any])
    
    inline def setCubeSlotsOffsetsVarargs(value: Vec2*): Self = StObject.set(x, "cubeSlotsOffsets", js.Array(value*))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyCookieAtlas(value: () => Unit): Self = StObject.set(x, "destroyCookieAtlas", js.Any.fromFunction0(value))
    
    inline def setDestroyShadowAtlas(value: () => Unit): Self = StObject.set(x, "destroyShadowAtlas", js.Any.fromFunction0(value))
    
    inline def setDevice(value: Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setScissorVec(value: Vec4): Self = StObject.set(x, "scissorVec", value.asInstanceOf[js.Any])
    
    inline def setSetupSlot(value: (Any, Any) => Unit): Self = StObject.set(x, "setupSlot", js.Any.fromFunction2(value))
    
    inline def setShadowAtlas(value: ShadowMap): Self = StObject.set(x, "shadowAtlas", value.asInstanceOf[js.Any])
    
    inline def setShadowAtlasResolution(value: Double): Self = StObject.set(x, "shadowAtlasResolution", value.asInstanceOf[js.Any])
    
    inline def setShadowEdgePixels(value: Double): Self = StObject.set(x, "shadowEdgePixels", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: js.Array[Any]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsVarargs(value: Any*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setSubdivide(value: (Any, Any) => Unit): Self = StObject.set(x, "subdivide", js.Any.fromFunction2(value))
    
    inline def setUpdate(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    inline def setUpdateUniforms(value: () => Unit): Self = StObject.set(x, "updateUniforms", js.Any.fromFunction0(value))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def set_cookieAtlasTextureId(value: Any): Self = StObject.set(x, "_cookieAtlasTextureId", value.asInstanceOf[js.Any])
    
    inline def set_shadowAtlasParams(value: js.typedarray.Float32Array): Self = StObject.set(x, "_shadowAtlasParams", value.asInstanceOf[js.Any])
    
    inline def set_shadowAtlasParamsId(value: Any): Self = StObject.set(x, "_shadowAtlasParamsId", value.asInstanceOf[js.Any])
    
    inline def set_shadowAtlasTextureId(value: Any): Self = StObject.set(x, "_shadowAtlasTextureId", value.asInstanceOf[js.Any])
  }
}
