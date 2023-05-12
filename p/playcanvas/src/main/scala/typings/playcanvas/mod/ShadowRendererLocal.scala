package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
trait ShadowRendererLocal extends StObject {
  
  /**
    * Prepare render passes for rendering of shadows for local non-clustered lights. Each shadow face
    * is a separate render pass as it renders to a separate render target.
    */
  def buildNonClusteredRenderPasses(frameGraph: Any, lightsSpot: Any, lightsOmni: Any): Unit
  
  def cull(light: Any, drawCalls: Any): Unit
  
  /** @type {import('../../platform/graphics/graphics-device.js').GraphicsDevice} */
  var device: GraphicsDevice
  
  /**
    * Prepare render pass for rendering of shadows for local clustered lights. This is done inside
    * a single render pass, as all shadows are part of a single render target atlas.
    */
  def prepareClusteredRenderPass(renderPass: Any, lightsSpot: Any, lightsOmni: Any): Unit
  
  def prepareLights(shadowLights: Any, lights: Any): Any
  
  /** @type {import('./renderer.js').Renderer} */
  var renderer: Renderer
  
  def setupNonClusteredFaceRenderPass(frameGraph: Any, light: Any, face: Any, applyVsm: Any): Unit
  
  var shadowLights: js.Array[Any]
  
  /** @type {import('./shadow-renderer.js').ShadowRenderer} */
  var shadowRenderer: ShadowRenderer
}
object ShadowRendererLocal {
  
  inline def apply(
    buildNonClusteredRenderPasses: (Any, Any, Any) => Unit,
    cull: (Any, Any) => Unit,
    device: GraphicsDevice,
    prepareClusteredRenderPass: (Any, Any, Any) => Unit,
    prepareLights: (Any, Any) => Any,
    renderer: Renderer,
    setupNonClusteredFaceRenderPass: (Any, Any, Any, Any) => Unit,
    shadowLights: js.Array[Any],
    shadowRenderer: ShadowRenderer
  ): ShadowRendererLocal = {
    val __obj = js.Dynamic.literal(buildNonClusteredRenderPasses = js.Any.fromFunction3(buildNonClusteredRenderPasses), cull = js.Any.fromFunction2(cull), device = device.asInstanceOf[js.Any], prepareClusteredRenderPass = js.Any.fromFunction3(prepareClusteredRenderPass), prepareLights = js.Any.fromFunction2(prepareLights), renderer = renderer.asInstanceOf[js.Any], setupNonClusteredFaceRenderPass = js.Any.fromFunction4(setupNonClusteredFaceRenderPass), shadowLights = shadowLights.asInstanceOf[js.Any], shadowRenderer = shadowRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRendererLocal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowRendererLocal] (val x: Self) extends AnyVal {
    
    inline def setBuildNonClusteredRenderPasses(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "buildNonClusteredRenderPasses", js.Any.fromFunction3(value))
    
    inline def setCull(value: (Any, Any) => Unit): Self = StObject.set(x, "cull", js.Any.fromFunction2(value))
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setPrepareClusteredRenderPass(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "prepareClusteredRenderPass", js.Any.fromFunction3(value))
    
    inline def setPrepareLights(value: (Any, Any) => Any): Self = StObject.set(x, "prepareLights", js.Any.fromFunction2(value))
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSetupNonClusteredFaceRenderPass(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "setupNonClusteredFaceRenderPass", js.Any.fromFunction4(value))
    
    inline def setShadowLights(value: js.Array[Any]): Self = StObject.set(x, "shadowLights", value.asInstanceOf[js.Any])
    
    inline def setShadowLightsVarargs(value: Any*): Self = StObject.set(x, "shadowLights", js.Array(value*))
    
    inline def setShadowRenderer(value: ShadowRenderer): Self = StObject.set(x, "shadowRenderer", value.asInstanceOf[js.Any])
  }
}
