package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
trait ShadowRendererDirectional extends StObject {
  
  def addLightRenderPasses(frameGraph: Any, light: Any, camera: Any): Unit
  
  /**
    * Builds a frame graph for rendering of directional shadows for the render action.
    *
    * @param {import('../frame-graph.js').FrameGraph} frameGraph - The frame-graph that is built.
    * @param {import('../composition/render-action.js').RenderAction} renderAction - The render
    * action.
    * @param {import('../../framework/components/camera/component.js').CameraComponent} camera - The camera.
    */
  def buildFrameGraph(frameGraph: FrameGraph, renderAction: RenderAction, camera: CameraComponent): Unit
  
  def cull(light: Any, drawCalls: Any, camera: Any): Unit
  
  /** @type {import('../../platform/graphics/graphics-device.js').GraphicsDevice} */
  var device: GraphicsDevice
  
  def generateSplitDistances(light: Any, nearDist: Any, farDist: Any): Unit
  
  /** @type {import('./renderer.js').Renderer} */
  var renderer: Renderer
  
  /** @type {import('./shadow-renderer.js').ShadowRenderer} */
  var shadowRenderer: ShadowRenderer
}
object ShadowRendererDirectional {
  
  inline def apply(
    addLightRenderPasses: (Any, Any, Any) => Unit,
    buildFrameGraph: (FrameGraph, RenderAction, CameraComponent) => Unit,
    cull: (Any, Any, Any) => Unit,
    device: GraphicsDevice,
    generateSplitDistances: (Any, Any, Any) => Unit,
    renderer: Renderer,
    shadowRenderer: ShadowRenderer
  ): ShadowRendererDirectional = {
    val __obj = js.Dynamic.literal(addLightRenderPasses = js.Any.fromFunction3(addLightRenderPasses), buildFrameGraph = js.Any.fromFunction3(buildFrameGraph), cull = js.Any.fromFunction3(cull), device = device.asInstanceOf[js.Any], generateSplitDistances = js.Any.fromFunction3(generateSplitDistances), renderer = renderer.asInstanceOf[js.Any], shadowRenderer = shadowRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRendererDirectional]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowRendererDirectional] (val x: Self) extends AnyVal {
    
    inline def setAddLightRenderPasses(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "addLightRenderPasses", js.Any.fromFunction3(value))
    
    inline def setBuildFrameGraph(value: (FrameGraph, RenderAction, CameraComponent) => Unit): Self = StObject.set(x, "buildFrameGraph", js.Any.fromFunction3(value))
    
    inline def setCull(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "cull", js.Any.fromFunction3(value))
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGenerateSplitDistances(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "generateSplitDistances", js.Any.fromFunction3(value))
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setShadowRenderer(value: ShadowRenderer): Self = StObject.set(x, "shadowRenderer", value.asInstanceOf[js.Any])
  }
}
