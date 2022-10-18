package typings.playcanvas.mod

import typings.playcanvas.anon.DrawCalls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The forward renderer renders {@link Scene}s.
  *
  * @ignore
  */
@js.native
trait ForwardRenderer extends StObject {
  
  var _camerasRendered: Double = js.native
  
  var _cookieRenderer: CookieRenderer = js.native
  
  var _cullTime: Double = js.native
  
  var _depthMapTime: Double = js.native
  
  var _forwardDrawCalls: Double = js.native
  
  var _forwardTime: Double = js.native
  
  var _instancedDrawCalls: Double = js.native
  
  var _layerCompositionUpdateTime: Double = js.native
  
  var _lightClusters: Double = js.native
  
  var _lightClustersTime: Double = js.native
  
  var _materialSwitches: Double = js.native
  
  var _morphTime: Double = js.native
  
  var _numDrawCallsCulled: Double = js.native
  
  def _resolveLight(scope: Any, i: Any): Unit = js.native
  
  var _screenSize: js.typedarray.Float32Array = js.native
  
  var _shadowDrawCalls: Double = js.native
  
  var _shadowMapTime: Double = js.native
  
  var _shadowMapUpdates: Double = js.native
  
  var _shadowRenderer: ShadowRenderer = js.native
  
  var _skinDrawCalls: Double = js.native
  
  var _skinTime: Double = js.native
  
  var _sortTime: Double = js.native
  
  /**
    * @param {FrameGraph} frameGraph - The frame graph
    * @param {LayerComposition} layerComposition - The layer composition.
    */
  def addMainRenderPass(
    frameGraph: FrameGraph,
    layerComposition: LayerComposition,
    renderTarget: Any,
    startIndex: Any,
    endIndex: Any,
    isGrabPass: Any
  ): Unit = js.native
  
  var alphaTestId: ScopeId = js.native
  
  var ambientColor: js.typedarray.Float32Array = js.native
  
  var ambientId: ScopeId = js.native
  
  /**
    * @param {LayerComposition} comp - The layer composition to update.
    * @param {boolean} lightsChanged - True if lights of the composition has changed.
    */
  def beginFrame(comp: LayerComposition, lightsChanged: Boolean): Unit = js.native
  
  var boneTextureId: ScopeId = js.native
  
  var boneTextureSizeId: ScopeId = js.native
  
  /**
    * Builds a frame graph for the rendering of the whole frame.
    *
    * @param {FrameGraph} frameGraph - The frame-graph that is built.
    * @param {LayerComposition} layerComposition - The layer composition used to build the frame graph.
    * @ignore
    */
  def buildFrameGraph(frameGraph: FrameGraph, layerComposition: LayerComposition): Unit = js.native
  
  var cameraParams: js.typedarray.Float32Array = js.native
  
  var cameraParamsId: ScopeId = js.native
  
  /**
    * Clear the current render target, using currently set up viewport.
    *
    * @param {RenderAction} renderAction - Render action containing the clear flags.
    * @param {Camera} camera - Camera containing the clear values.
    */
  def clear(renderAction: RenderAction, camera: Camera): Unit = js.native
  
  def clearView(camera: Any, target: Any, clear: Any, forceWrite: Any): Unit = js.native
  
  /** @type {boolean} */
  var clustersDebugRendered: Boolean = js.native
  
  def cull(camera: Any, drawCalls: Any, visibleList: Any): Double = js.native
  
  /**
    * visibility culling of lights, meshInstances, shadows casters
    * Also applies meshInstance.visible and camera.cullingMask
    *
    * @param {LayerComposition} comp - The layer composition.
    */
  def cullComposition(comp: LayerComposition): Unit = js.native
  
  def cullLights(camera: Any, lights: Any): Unit = js.native
  
  /**
    * Shadow map culling for directional and visible local lights
    * visible meshInstances are collected into light._renderData, and are marked as visible
    * for directional lights also shadow camera matrix is set up
    *
    * @param {LayerComposition} comp - The layer composition.
    */
  def cullShadowmaps(comp: LayerComposition): Unit = js.native
  
  def depthSortCompare(drawCallA: Any, drawCallB: Any): Double = js.native
  
  def destroy(): Unit = js.native
  
  var device: GraphicsDevice = js.native
  
  def dispatchDirectLights(dirs: Any, scene: Any, mask: Any, camera: Any): Double = js.native
  
  /**
    * @param {Scene} scene - The scene.
    */
  def dispatchGlobalLights(scene: Scene_): Unit = js.native
  
  def dispatchLocalLights(sortedLights: Any, scene: Any, mask: Any, usedDirLights: Any, staticLightList: Any): Unit = js.native
  
  def dispatchOmniLight(scene: Any, scope: Any, omni: Any, cnt: Any): Unit = js.native
  
  def dispatchSpotLight(scene: Any, scope: Any, spot: Any, cnt: Any): Unit = js.native
  
  def dispatchViewPos(position: Any): Unit = js.native
  
  def drawInstance(device: Any, meshInstance: Any, mesh: Any, style: Any, normal: Any): Unit = js.native
  
  def drawInstance2(device: Any, meshInstance: Any, mesh: Any, style: Any): Unit = js.native
  
  var exposureId: ScopeId = js.native
  
  var farClipId: ScopeId = js.native
  
  var flipYId: ScopeId = js.native
  
  var fogColor: js.typedarray.Float32Array = js.native
  
  var fogColorId: ScopeId = js.native
  
  var fogDensityId: ScopeId = js.native
  
  var fogEndId: ScopeId = js.native
  
  var fogStartId: ScopeId = js.native
  
  def gpuUpdate(drawCalls: Any): Unit = js.native
  
  def initViewBindGroupFormat(): Unit = js.native
  
  var library: ProgramLibrary = js.native
  
  var lightColorId: js.Array[Any] = js.native
  
  var lightCookieId: js.Array[Any] = js.native
  
  var lightCookieIntId: js.Array[Any] = js.native
  
  var lightCookieMatrixId: js.Array[Any] = js.native
  
  var lightCookieOffsetId: js.Array[Any] = js.native
  
  var lightDir: js.Array[Any] = js.native
  
  var lightDirId: js.Array[Any] = js.native
  
  var lightHeight: js.Array[Any] = js.native
  
  var lightHeightId: js.Array[Any] = js.native
  
  var lightInAngleId: js.Array[Any] = js.native
  
  var lightOutAngleId: js.Array[Any] = js.native
  
  var lightPos: js.Array[Any] = js.native
  
  var lightPosId: js.Array[Any] = js.native
  
  var lightRadiusId: js.Array[Any] = js.native
  
  var lightShadowIntensity: js.Array[Any] = js.native
  
  var lightShadowMapId: js.Array[Any] = js.native
  
  var lightShadowMatrixId: js.Array[Any] = js.native
  
  var lightShadowParamsId: js.Array[Any] = js.native
  
  var lightTextureAtlas: LightTextureAtlas = js.native
  
  var lightWidth: js.Array[Any] = js.native
  
  var lightWidthId: js.Array[Any] = js.native
  
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
  
  def renderForward(
    camera: Any,
    allDrawCalls: Any,
    allDrawCallsCount: Any,
    sortedLights: Any,
    pass: Any,
    cullingMask: Any,
    drawCallback: Any,
    layer: Any,
    flipFaces: Any
  ): Unit = js.native
  
  def renderForwardInternal(camera: Any, preparedCalls: Any, sortedLights: Any, pass: Any, drawCallback: Any, flipFaces: Any): Unit = js.native
  
  def renderForwardPrepareMaterials(
    camera: Any,
    drawCalls: Any,
    drawCallsCount: Any,
    sortedLights: Any,
    cullingMask: Any,
    layer: Any,
    pass: Any
  ): DrawCalls = js.native
  
  /**
    * Render pass for directional shadow maps of the camera.
    *
    * @param {RenderAction} renderAction - The render action.
    * @param {LayerComposition} layerComposition - The layer composition.
    * @ignore
    */
  def renderPassDirectionalShadows(renderAction: RenderAction, layerComposition: LayerComposition): Unit = js.native
  
  def renderPassPostprocessing(renderAction: Any, layerComposition: Any): Unit = js.native
  
  /**
    * Render pass representing the layer composition's render actions in the specified range.
    *
    * @param {LayerComposition} comp - the layer composition to render.
    * @ignore
    */
  def renderPassRenderActions(comp: LayerComposition, range: Any): Unit = js.native
  
  /**
    * @param {LayerComposition} comp - The layer composition.
    * @param {RenderAction} renderAction - The render action.
    * @param {boolean} firstRenderAction - True if this is the first render action in the render pass.
    */
  def renderRenderAction(comp: LayerComposition, renderAction: RenderAction, firstRenderAction: Boolean): Unit = js.native
  
  def renderShadows(lights: Any, camera: Any): Unit = js.native
  
  /** @type {Scene|null} */
  var scene: Scene_ | Null = js.native
  
  var screenSizeId: ScopeId = js.native
  
  def setBaseConstants(device: Any, material: Any): Unit = js.native
  
  def setCamera(camera: Any, target: Any, clear: Any): Unit = js.native
  def setCamera(camera: Any, target: Any, clear: Any, renderAction: Any): Unit = js.native
  
  def setCameraUniforms(camera: Any, target: Any, renderAction: Any): Unit = js.native
  
  def setCullMode(cullFaces: Any, flip: Any, drawCall: Any): Unit = js.native
  
  def setLTCDirectionalLight(wtm: Any, cnt: Any, dir: Any, campos: Any, far: Any): Unit = js.native
  
  def setLTCPositionalLight(wtm: Any, cnt: Any): Unit = js.native
  
  def setMorphing(device: Any, morphInstance: Any): Unit = js.native
  
  def setSceneConstants(): Unit = js.native
  
  def setSkinning(device: Any, meshInstance: Any, material: Any): Unit = js.native
  
  def setVertexBuffers(device: Any, mesh: Any): Unit = js.native
  
  def setupViewUniformBuffers(renderAction: Any, viewCount: Any): Unit = js.native
  
  /**
    * Set up the viewport and the scissor for camera rendering.
    *
    * @param {Camera} camera - The camera containing the viewport infomation.
    * @param {RenderTarget} [renderTarget] - The render target. NULL for the default one.
    */
  def setupViewport(camera: Camera): Unit = js.native
  def setupViewport(camera: Camera, renderTarget: RenderTarget): Unit = js.native
  
  var shadowCascadeCountId: js.Array[Any] = js.native
  
  var shadowCascadeDistancesId: js.Array[Any] = js.native
  
  var shadowMatrixPaletteId: js.Array[Any] = js.native
  
  var skyboxIntensityId: ScopeId = js.native
  
  def sortCompare(drawCallA: Any, drawCallB: Any): Double = js.native
  
  def sortCompareMesh(drawCallA: Any, drawCallB: Any): Double = js.native
  
  var tbnBasis: ScopeId = js.native
  
  var twoSidedLightingNegScaleFactorId: ScopeId = js.native
  
  /**
    * @param {LayerComposition} comp - The layer composition.
    */
  def update(comp: LayerComposition): Unit = js.native
  
  def updateCameraFrustum(camera: Any): Unit = js.native
  
  /**
    * @param {LayerComposition} comp - The layer composition.
    */
  def updateClusters(comp: LayerComposition): Unit = js.native
  
  def updateCpuSkinMatrices(drawCalls: Any): Unit = js.native
  
  def updateGpuSkinMatrices(drawCalls: Any): Unit = js.native
  
  /**
    * Updates the layer composition for rendering.
    *
    * @param {LayerComposition} comp - The layer composition to update.
    * @param {boolean} clusteredLightingEnabled - True if clustered lighting is enabled.
    * @returns {number} - Flags of what was updated
    * @ignore
    */
  def updateLayerComposition(comp: LayerComposition, clusteredLightingEnabled: Boolean): Double = js.native
  
  /**
    * @param {LayerComposition} comp - The layer composition.
    * @param {number} compUpdatedFlags - Flags of what was updated.
    */
  def updateLightStats(comp: LayerComposition, compUpdatedFlags: Double): Unit = js.native
  
  /**
    * @param {LayerComposition} comp - The layer composition.
    */
  def updateLightTextureAtlas(comp: LayerComposition): Unit = js.native
  
  def updateMorphing(drawCalls: Any): Unit = js.native
  
  /**
    * @param {MeshInstance[]} drawCalls - Mesh instances.
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
