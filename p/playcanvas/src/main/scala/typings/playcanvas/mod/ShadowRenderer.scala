package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
@js.native
trait ShadowRenderer extends StObject {
  
  def applyVsmBlur(light: Any, camera: Any): Unit = js.native
  
  var blendStateNoWrite: BlendState = js.native
  
  var blendStateWrite: BlendState = js.native
  
  var blurPackedVsmShader: js.Array[js.Object] = js.native
  
  var blurPackedVsmShaderCode: js.Array[String] = js.native
  
  var blurVsmShader: js.Array[js.Object] = js.native
  
  var blurVsmShaderCode: js.Array[Any] = js.native
  
  def cullShadowCasters(meshInstances: Any, visible: Any, camera: Any): Unit = js.native
  
  var device: GraphicsDevice = js.native
  
  def dispatchUniforms(light: Any, shadowCam: Any, lightRenderData: Any, face: Any): Unit = js.native
  
  def frameUpdate(): Unit = js.native
  
  def getLightRenderData(light: Any, camera: Any, face: Any): Any = js.native
  
  def getShadowPass(light: Any): Double = js.native
  
  def getVsmBlurShader(isVsm8: Any, blurMode: Any, filterSize: Any): Any = js.native
  
  def initViewBindGroupFormat(): Unit = js.native
  
  /** @type {import('../lighting/light-texture-atlas.js').LightTextureAtlas} */
  var lightTextureAtlas: LightTextureAtlas = js.native
  
  def needsShadowRendering(light: Any): Any = js.native
  
  var pixelOffsetId: ScopeId = js.native
  
  var polygonOffset: js.typedarray.Float32Array = js.native
  
  var polygonOffsetId: ScopeId = js.native
  
  def prepareFace(light: Any, camera: Any, face: Any): Any = js.native
  
  def render(light: Any, camera: Any): Unit = js.native
  def render(light: Any, camera: Any, insideRenderPass: Boolean): Unit = js.native
  
  def renderFace(light: Any, camera: Any, face: Any, clear: Any): Unit = js.native
  def renderFace(light: Any, camera: Any, face: Any, clear: Any, insideRenderPass: Boolean): Unit = js.native
  
  def renderVsm(light: Any, camera: Any): Unit = js.native
  
  /** @type {import('./renderer.js').Renderer} */
  var renderer: Renderer = js.native
  
  def restoreRenderState(device: Any): Unit = js.native
  
  def setupRenderPass(renderPass: Any, shadowCamera: Any, clearRenderTarget: Any): Unit = js.native
  
  def setupRenderState(device: Any, light: Any): Unit = js.native
  
  var shadowMapLightRadiusId: ScopeId = js.native
  
  /**
    * A cache of shadow passes. First index is looked up by light type, second by shadow type.
    *
    * @type {import('../shader-pass.js').ShaderPassInfo[][]}
    * @private
    */
  /* private */ var shadowPassCache: Any = js.native
  
  var sourceId: ScopeId = js.native
  
  /**
    * @param {import('../mesh-instance.js').MeshInstance[]} visibleCasters - Visible mesh
    * instances.
    * @param {import('../light.js').Light} light - The light.
    */
  def submitCasters(visibleCasters: js.Array[MeshInstance], light: Light): Unit = js.native
  
  var viewBindGroupFormat: BindGroupFormat = js.native
  
  var viewUniformFormat: UniformBufferFormat = js.native
  
  var weightId: ScopeId = js.native
}
