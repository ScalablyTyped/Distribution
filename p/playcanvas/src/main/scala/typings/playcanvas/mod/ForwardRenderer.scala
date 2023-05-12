package typings.playcanvas.mod

import typings.playcanvas.anon.Clear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The forward renderer renders {@link Scene}s.
  *
  * @ignore
  */
@JSImport("playcanvas", "ForwardRenderer")
@js.native
open class ForwardRenderer ()
  extends StObject
     with Renderer {
  
  var _depthMapTime: Double = js.native
  
  var _forwardDrawCalls: Double = js.native
  
  var _forwardTime: Double = js.native
  
  var _materialSwitches: Double = js.native
  
  def _resolveLight(scope: Any, i: Any): Unit = js.native
  
  var _screenSize: js.typedarray.Float32Array = js.native
  
  var _sortTime: Double = js.native
  
  /**
    * @param {import('../frame-graph.js').FrameGraph} frameGraph - The frame graph.
    * @param {import('../composition/layer-composition.js').LayerComposition} layerComposition - The
    * layer composition.
    */
  def addMainRenderPass(
    frameGraph: FrameGraph,
    layerComposition: LayerComposition,
    renderTarget: Any,
    startIndex: Any,
    endIndex: Any,
    isGrabPass: Any
  ): Unit = js.native
  
  var ambientColor: js.typedarray.Float32Array = js.native
  
  var ambientId: ScopeId = js.native
  
  /**
    * Builds a frame graph for the rendering of the whole frame.
    *
    * @param {import('../frame-graph.js').FrameGraph} frameGraph - The frame-graph that is built.
    * @param {import('../composition/layer-composition.js').LayerComposition} layerComposition - The
    * layer composition used to build the frame graph.
    * @ignore
    */
  def buildFrameGraph(frameGraph: FrameGraph, layerComposition: LayerComposition): Unit = js.native
  
  var cubeMapRotationMatrixId: ScopeId = js.native
  
  def dispatchDirectLights(dirs: Any, scene: Any, mask: Any, camera: Any): Double = js.native
  
  /**
    * @param {import('../scene.js').Scene} scene - The scene.
    */
  def dispatchGlobalLights(scene: Scene_): Unit = js.native
  
  def dispatchLocalLights(sortedLights: Any, scene: Any, mask: Any, usedDirLights: Any, staticLightList: Any): Unit = js.native
  
  def dispatchOmniLight(scene: Any, scope: Any, omni: Any, cnt: Any): Unit = js.native
  
  def dispatchSpotLight(scene: Any, scope: Any, spot: Any, cnt: Any): Unit = js.native
  
  var fogColor: js.typedarray.Float32Array = js.native
  
  var fogColorId: ScopeId = js.native
  
  var fogDensityId: ScopeId = js.native
  
  var fogEndId: ScopeId = js.native
  
  var fogStartId: ScopeId = js.native
  
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
  
  var lightWidth: js.Array[Any] = js.native
  
  var lightWidthId: js.Array[Any] = js.native
  
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
  ): Clear = js.native
  
  def renderPassPostprocessing(renderAction: Any, layerComposition: Any): Unit = js.native
  
  /**
    * Render pass representing the layer composition's render actions in the specified range.
    *
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition to render.
    * @ignore
    */
  def renderPassRenderActions(comp: LayerComposition, range: Any): Unit = js.native
  
  /**
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition.
    * @param {import('../composition/render-action.js').RenderAction} renderAction - The render
    * action.
    * @param {boolean} firstRenderAction - True if this is the first render action in the render pass.
    */
  def renderRenderAction(comp: LayerComposition, renderAction: RenderAction, firstRenderAction: Boolean): Unit = js.native
  
  var screenSizeId: ScopeId = js.native
  
  def setLTCDirectionalLight(wtm: Any, cnt: Any, dir: Any, campos: Any, far: Any): Unit = js.native
  
  def setLTCPositionalLight(wtm: Any, cnt: Any): Unit = js.native
  
  def setSceneConstants(): Unit = js.native
  
  var shadowCascadeCountId: js.Array[Any] = js.native
  
  var shadowCascadeDistancesId: js.Array[Any] = js.native
  
  var shadowMatrixPaletteId: js.Array[Any] = js.native
  
  var skyboxIntensityId: ScopeId = js.native
  
  /**
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition.
    */
  def update(comp: LayerComposition): Unit = js.native
  
  /**
    * @param {import('../composition/layer-composition.js').LayerComposition} comp - The layer
    * composition.
    * @param {number} compUpdatedFlags - Flags of what was updated.
    */
  def updateLightStats(comp: LayerComposition, compUpdatedFlags: Double): Unit = js.native
}
object ForwardRenderer {
  
  @JSImport("playcanvas", "ForwardRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("playcanvas", "ForwardRenderer.skipRenderAfter")
  @js.native
  def skipRenderAfter: Double = js.native
  inline def skipRenderAfter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipRenderAfter")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("playcanvas", "ForwardRenderer.skipRenderCamera")
  @js.native
  def skipRenderCamera: Any = js.native
  inline def skipRenderCamera_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipRenderCamera")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("playcanvas", "ForwardRenderer._skipRenderCounter")
  @js.native
  def skipRenderCounter: Double = js.native
  
  inline def skipRenderCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_skipRenderCounter")(x.asInstanceOf[js.Any])
}
