package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
trait ShadowRenderer extends StObject {
  
  def applyVsmBlur(light: Any, camera: Any): Unit
  
  var blurPackedVsmShader: js.Array[js.Object]
  
  var blurPackedVsmShaderCode: js.Array[String]
  
  var blurVsmShader: js.Array[js.Object]
  
  var blurVsmShaderCode: js.Array[Any]
  
  def cullDirectional(light: Any, drawCalls: Any, camera: Any): Unit
  
  def cullLocal(light: Any, drawCalls: Any): Unit
  
  def cullShadowCasters(meshInstances: Any, visible: Any, camera: Any): Unit
  
  def destroy(): Unit
  
  var device: GraphicsDevice
  
  def dispatchUniforms(light: Any, shadowCam: Any, lightRenderData: Any, face: Any): Unit
  
  /** @type {ForwardRenderer} */
  var forwardRenderer: ForwardRenderer
  
  def generateSplitDistances(light: Any, nearDist: Any, farDist: Any): Unit
  
  def getVsmBlurShader(isVsm8: Any, blurMode: Any, filterSize: Any): Any
  
  /** @type {LightTextureAtlas} */
  var lightTextureAtlas: LightTextureAtlas
  
  var pixelOffsetId: ScopeId
  
  var polygonOffset: js.typedarray.Float32Array
  
  var polygonOffsetId: ScopeId
  
  def render(light: Any, camera: Any): Unit
  
  def restoreRenderState(device: Any): Unit
  
  def setupRenderState(device: Any, light: Any): Unit
  
  var shadowMapCache: ShadowMapCache
  
  var shadowMapLightRadiusId: ScopeId
  
  var sourceId: ScopeId
  
  /**
    * @param {MeshInstance[]} visibleCasters - Visible mesh instances.
    * @param {Light} light - The light.
    */
  def submitCasters(visibleCasters: js.Array[MeshInstance], light: Light): Unit
  
  var weightId: ScopeId
}
object ShadowRenderer {
  
  inline def apply(
    applyVsmBlur: (Any, Any) => Unit,
    blurPackedVsmShader: js.Array[js.Object],
    blurPackedVsmShaderCode: js.Array[String],
    blurVsmShader: js.Array[js.Object],
    blurVsmShaderCode: js.Array[Any],
    cullDirectional: (Any, Any, Any) => Unit,
    cullLocal: (Any, Any) => Unit,
    cullShadowCasters: (Any, Any, Any) => Unit,
    destroy: () => Unit,
    device: GraphicsDevice,
    dispatchUniforms: (Any, Any, Any, Any) => Unit,
    forwardRenderer: ForwardRenderer,
    generateSplitDistances: (Any, Any, Any) => Unit,
    getVsmBlurShader: (Any, Any, Any) => Any,
    lightTextureAtlas: LightTextureAtlas,
    pixelOffsetId: ScopeId,
    polygonOffset: js.typedarray.Float32Array,
    polygonOffsetId: ScopeId,
    render: (Any, Any) => Unit,
    restoreRenderState: Any => Unit,
    setupRenderState: (Any, Any) => Unit,
    shadowMapCache: ShadowMapCache,
    shadowMapLightRadiusId: ScopeId,
    sourceId: ScopeId,
    submitCasters: (js.Array[MeshInstance], Light) => Unit,
    weightId: ScopeId
  ): ShadowRenderer = {
    val __obj = js.Dynamic.literal(applyVsmBlur = js.Any.fromFunction2(applyVsmBlur), blurPackedVsmShader = blurPackedVsmShader.asInstanceOf[js.Any], blurPackedVsmShaderCode = blurPackedVsmShaderCode.asInstanceOf[js.Any], blurVsmShader = blurVsmShader.asInstanceOf[js.Any], blurVsmShaderCode = blurVsmShaderCode.asInstanceOf[js.Any], cullDirectional = js.Any.fromFunction3(cullDirectional), cullLocal = js.Any.fromFunction2(cullLocal), cullShadowCasters = js.Any.fromFunction3(cullShadowCasters), destroy = js.Any.fromFunction0(destroy), device = device.asInstanceOf[js.Any], dispatchUniforms = js.Any.fromFunction4(dispatchUniforms), forwardRenderer = forwardRenderer.asInstanceOf[js.Any], generateSplitDistances = js.Any.fromFunction3(generateSplitDistances), getVsmBlurShader = js.Any.fromFunction3(getVsmBlurShader), lightTextureAtlas = lightTextureAtlas.asInstanceOf[js.Any], pixelOffsetId = pixelOffsetId.asInstanceOf[js.Any], polygonOffset = polygonOffset.asInstanceOf[js.Any], polygonOffsetId = polygonOffsetId.asInstanceOf[js.Any], render = js.Any.fromFunction2(render), restoreRenderState = js.Any.fromFunction1(restoreRenderState), setupRenderState = js.Any.fromFunction2(setupRenderState), shadowMapCache = shadowMapCache.asInstanceOf[js.Any], shadowMapLightRadiusId = shadowMapLightRadiusId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], submitCasters = js.Any.fromFunction2(submitCasters), weightId = weightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowRenderer] (val x: Self) extends AnyVal {
    
    inline def setApplyVsmBlur(value: (Any, Any) => Unit): Self = StObject.set(x, "applyVsmBlur", js.Any.fromFunction2(value))
    
    inline def setBlurPackedVsmShader(value: js.Array[js.Object]): Self = StObject.set(x, "blurPackedVsmShader", value.asInstanceOf[js.Any])
    
    inline def setBlurPackedVsmShaderCode(value: js.Array[String]): Self = StObject.set(x, "blurPackedVsmShaderCode", value.asInstanceOf[js.Any])
    
    inline def setBlurPackedVsmShaderCodeVarargs(value: String*): Self = StObject.set(x, "blurPackedVsmShaderCode", js.Array(value*))
    
    inline def setBlurPackedVsmShaderVarargs(value: js.Object*): Self = StObject.set(x, "blurPackedVsmShader", js.Array(value*))
    
    inline def setBlurVsmShader(value: js.Array[js.Object]): Self = StObject.set(x, "blurVsmShader", value.asInstanceOf[js.Any])
    
    inline def setBlurVsmShaderCode(value: js.Array[Any]): Self = StObject.set(x, "blurVsmShaderCode", value.asInstanceOf[js.Any])
    
    inline def setBlurVsmShaderCodeVarargs(value: Any*): Self = StObject.set(x, "blurVsmShaderCode", js.Array(value*))
    
    inline def setBlurVsmShaderVarargs(value: js.Object*): Self = StObject.set(x, "blurVsmShader", js.Array(value*))
    
    inline def setCullDirectional(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "cullDirectional", js.Any.fromFunction3(value))
    
    inline def setCullLocal(value: (Any, Any) => Unit): Self = StObject.set(x, "cullLocal", js.Any.fromFunction2(value))
    
    inline def setCullShadowCasters(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "cullShadowCasters", js.Any.fromFunction3(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDispatchUniforms(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "dispatchUniforms", js.Any.fromFunction4(value))
    
    inline def setForwardRenderer(value: ForwardRenderer): Self = StObject.set(x, "forwardRenderer", value.asInstanceOf[js.Any])
    
    inline def setGenerateSplitDistances(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "generateSplitDistances", js.Any.fromFunction3(value))
    
    inline def setGetVsmBlurShader(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getVsmBlurShader", js.Any.fromFunction3(value))
    
    inline def setLightTextureAtlas(value: LightTextureAtlas): Self = StObject.set(x, "lightTextureAtlas", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetId(value: ScopeId): Self = StObject.set(x, "pixelOffsetId", value.asInstanceOf[js.Any])
    
    inline def setPolygonOffset(value: js.typedarray.Float32Array): Self = StObject.set(x, "polygonOffset", value.asInstanceOf[js.Any])
    
    inline def setPolygonOffsetId(value: ScopeId): Self = StObject.set(x, "polygonOffsetId", value.asInstanceOf[js.Any])
    
    inline def setRender(value: (Any, Any) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    inline def setRestoreRenderState(value: Any => Unit): Self = StObject.set(x, "restoreRenderState", js.Any.fromFunction1(value))
    
    inline def setSetupRenderState(value: (Any, Any) => Unit): Self = StObject.set(x, "setupRenderState", js.Any.fromFunction2(value))
    
    inline def setShadowMapCache(value: ShadowMapCache): Self = StObject.set(x, "shadowMapCache", value.asInstanceOf[js.Any])
    
    inline def setShadowMapLightRadiusId(value: ScopeId): Self = StObject.set(x, "shadowMapLightRadiusId", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: ScopeId): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSubmitCasters(value: (js.Array[MeshInstance], Light) => Unit): Self = StObject.set(x, "submitCasters", js.Any.fromFunction2(value))
    
    inline def setWeightId(value: ScopeId): Self = StObject.set(x, "weightId", value.asInstanceOf[js.Any])
  }
}
