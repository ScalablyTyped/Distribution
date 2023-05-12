package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base renderer functionality to allow implementation of specialized renderers.
  *
  * @ignore
  */
@js.native
trait Renderer extends StObject {
  
  var _camerasRendered: Double = js.native
  
  var _cookieRenderer: CookieRenderer = js.native
  
  var _cullTime: Double = js.native
  
  var _instancedDrawCalls: Double = js.native
  
  var _layerCompositionUpdateTime: Double = js.native
  
  var _lightClusters: Double = js.native
  
  var _lightClustersTime: Double = js.native
  
  var _morphTime: Double = js.native
  
  var _numDrawCallsCulled: Double = js.native
  
  var _shadowDrawCalls: Double = js.native
  
  var _shadowMapTime: Double = js.native
  
  var _shadowMapUpdates: Double = js.native
  
  var _shadowRendererDirectional: ShadowRendererDirectional = js.native
  
  var _shadowRendererLocal: ShadowRendererLocal = js.native
  
  var _skinDrawCalls: Double = js.native
  
  var _skinTime: Double = js.native
  
  var alphaTestId: ScopeId = js.native
  
  /**
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition to update.
    * @param {boolean} lightsChanged - True if lights of the composition has changed.
    */
  def beginFrame(comp: LayerComposition, lightsChanged: Boolean): Unit = js.native
  
  var boneTextureId: ScopeId = js.native
  
  var boneTextureSizeId: ScopeId = js.native
  
  var cameraParams: js.typedarray.Float32Array = js.native
  
  var cameraParamsId: ScopeId = js.native
  
  /**
    * Clears the active render target. If the viewport is already set up, only its area is cleared.
    *
    * @param {import('../camera.js').Camera} camera - The camera supplying the value to clear to.
    * @param {boolean} [clearColor] - True if the color buffer should be cleared. Uses the value
    * from the camra if not supplied.
    * @param {boolean} [clearDepth] - True if the depth buffer should be cleared. Uses the value
    * from the camra if not supplied.
    * @param {boolean} [clearStencil] - True if the stencil buffer should be cleared. Uses the
    * value from the camra if not supplied.
    */
  def clear(camera: Camera): Unit = js.native
  def clear(camera: Camera, clearColor: Boolean): Unit = js.native
  def clear(camera: Camera, clearColor: Boolean, clearDepth: Boolean): Unit = js.native
  def clear(camera: Camera, clearColor: Boolean, clearDepth: Boolean, clearStencil: Boolean): Unit = js.native
  def clear(camera: Camera, clearColor: Boolean, clearDepth: Unit, clearStencil: Boolean): Unit = js.native
  def clear(camera: Camera, clearColor: Unit, clearDepth: Boolean): Unit = js.native
  def clear(camera: Camera, clearColor: Unit, clearDepth: Boolean, clearStencil: Boolean): Unit = js.native
  def clear(camera: Camera, clearColor: Unit, clearDepth: Unit, clearStencil: Boolean): Unit = js.native
  
  def clearView(camera: Any, target: Any, clear: Any, forceWrite: Any): Unit = js.native
  
  /** @type {boolean} */
  var clustersDebugRendered: Boolean = js.native
  
  def cull(camera: Any, drawCalls: Any, visibleList: Any): Double = js.native
  
  /**
    * visibility culling of lights, meshInstances, shadows casters
    * Also applies meshInstance.visible and camera.cullingMask
    *
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition.
    */
  def cullComposition(comp: LayerComposition): Unit = js.native
  
  def cullLights(camera: Any, lights: Any): Unit = js.native
  
  /**
    * Shadow map culling for directional and visible local lights
    * visible meshInstances are collected into light._renderData, and are marked as visible
    * for directional lights also shadow camera matrix is set up
    *
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition.
    */
  def cullShadowmaps(comp: LayerComposition): Unit = js.native
  
  def destroy(): Unit = js.native
  
  var device: GraphicsDevice = js.native
  
  def dispatchViewPos(position: Any): Unit = js.native
  
  def drawInstance(device: Any, meshInstance: Any, mesh: Any, style: Any, normal: Any): Unit = js.native
  
  def drawInstance2(device: Any, meshInstance: Any, mesh: Any, style: Any): Unit = js.native
  
  var exposureId: ScopeId = js.native
  
  var farClipId: ScopeId = js.native
  
  var flipYId: ScopeId = js.native
  
  def frameUpdate(): Unit = js.native
  
  def gpuUpdate(drawCalls: Any): Unit = js.native
  
  def initViewBindGroupFormat(): Unit = js.native
  
  var lightTextureAtlas: LightTextureAtlas = js.native
  
  var modelMatrixId: ScopeId = js.native
  
  var morphNormalTex: ScopeId = js.native
  
  var morphPositionTex: ScopeId = js.native
  
  var morphTexParams: ScopeId = js.native
  
  var morphWeightsA: ScopeId = js.native
  
  var morphWeightsB: ScopeId = js.native
  
  var nearClipId: ScopeId = js.native
  
  var normalMatrixId: ScopeId = js.native
  
  var opacityMapId: ScopeId = js.native
  
  var poseMatrixId: ScopeId = js.native
  
  var projId: ScopeId = js.native
  
  var projSkyboxId: ScopeId = js.native
  
  def renderCookies(lights: Any): Unit = js.native
  
  /** @type {import('../scene.js').Scene|null} */
  var scene: Scene_ | Null = js.native
  
  def setBaseConstants(device: Any, material: Any): Unit = js.native
  
  def setCamera(camera: Any, target: Any, clear: Any): Unit = js.native
  def setCamera(camera: Any, target: Any, clear: Any, renderAction: Any): Unit = js.native
  
  def setCameraUniforms(camera: Any, target: Any): Double = js.native
  
  def setMorphing(device: Any, morphInstance: Any): Unit = js.native
  
  def setSkinning(device: Any, meshInstance: Any): Unit = js.native
  
  def setVertexBuffers(device: Any, mesh: Any): Unit = js.native
  
  def setupCullMode(cullFaces: Any, flipFactor: Any, drawCall: Any): Unit = js.native
  
  def setupMeshUniformBuffers(meshInstance: Any, pass: Any): Unit = js.native
  
  def setupViewUniformBuffers(viewBindGroups: Any, viewUniformFormat: Any, viewBindGroupFormat: Any, viewCount: Any): Unit = js.native
  
  /**
    * Set up the viewport and the scissor for camera rendering.
    *
    * @param {import('../camera.js').Camera} camera - The camera containing the viewport
    * information.
    * @param {import('../../platform/graphics/render-target.js').RenderTarget} [renderTarget] - The
    * render target. NULL for the default one.
    */
  def setupViewport(camera: Camera): Unit = js.native
  def setupViewport(camera: Camera, renderTarget: RenderTarget): Unit = js.native
  
  var shadowMapCache: ShadowMapCache = js.native
  
  var shadowRenderer: ShadowRenderer = js.native
  
  def sortCompare(drawCallA: Any, drawCallB: Any): Double = js.native
  
  def sortCompareDepth(drawCallA: Any, drawCallB: Any): Double = js.native
  
  def sortCompareMesh(drawCallA: Any, drawCallB: Any): Double = js.native
  
  var tbnBasis: ScopeId = js.native
  
  var twoSidedLightingNegScaleFactorId: ScopeId = js.native
  
  def updateCameraFrustum(camera: Any): Unit = js.native
  
  /**
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition.
    */
  def updateClusters(comp: LayerComposition): Unit = js.native
  
  def updateCpuSkinMatrices(drawCalls: Any): Unit = js.native
  
  def updateGpuSkinMatrices(drawCalls: Any): Unit = js.native
  
  /**
    * Updates the layer composition for rendering.
    *
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition to update.
    * @param {boolean} clusteredLightingEnabled - True if clustered lighting is enabled.
    * @returns {number} - Flags of what was updated
    * @ignore
    */
  def updateLayerComposition(comp: LayerComposition, clusteredLightingEnabled: Boolean): Double = js.native
  
  /**
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition.
    */
  def updateLightTextureAtlas(comp: LayerComposition): Unit = js.native
  
  def updateMorphing(drawCalls: Any): Unit = js.native
  
  /**
    * @param {import('../mesh-instance.js').MeshInstance[]} drawCalls - Mesh instances.
    * @param {boolean} onlyLitShaders - Limits the update to shaders affected by lighting.
    */
  def updateShaders(drawCalls: js.Array[MeshInstance], onlyLitShaders: Boolean): Unit = js.native
  
  var viewBindGroupFormat: BindGroupFormat = js.native
  
  var viewId: ScopeId = js.native
  
  var viewId3: ScopeId = js.native
  
  var viewInvId: ScopeId = js.native
  
  var viewPos: js.typedarray.Float32Array = js.native
  
  var viewPosId: ScopeId = js.native
  
  var viewProjId: ScopeId = js.native
  
  var viewUniformFormat: UniformBufferFormat = js.native
}
