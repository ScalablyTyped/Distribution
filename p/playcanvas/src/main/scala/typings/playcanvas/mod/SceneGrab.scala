package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal class abstracting the access to the depth and color texture of the scene.
  * color frame buffer is copied to a texture
  * For webgl 2 devices, the depth buffer is copied to a texture
  * for webgl 1 devices, the scene's depth is rendered to a separate RGBA texture
  *
  * TODO: implement mipmapped color buffer support for WebGL 1 as well, which requires
  * the texture to be a power of two, by first downscaling the captured framebuffer
  * texture to smaller power of 2 texture, and then generate mipmaps and use it for rendering
  * TODO: or even better, implement blur filter to have smoother lower levels
  *
  * @ignore
  */
trait SceneGrab extends StObject {
  
  def allocateRenderTarget(
    renderTarget: Any,
    sourceRenderTarget: Any,
    device: Any,
    format: Any,
    isDepth: Any,
    mipmaps: Any,
    isDepthUniforms: Any
  ): Any
  
  def allocateTexture(device: Any, source: Any, name: Any, format: Any, isDepth: Any, mipmaps: Any): Texture
  
  var device: GraphicsDevice
  
  def getSourceColorFormat(texture: Any): Any
  
  def initFallbackPath(): Unit
  
  def initMainPath(): Unit
  
  var layer: Layer
  
  def patch(layer: Any): Unit
  
  def releaseRenderTarget(rt: Any): Unit
  
  var scene: Scene_
  
  def setupUniform(device: Any, depth: Any, buffer: Any): Unit
  
  def shouldReallocate(targetRT: Any, sourceTexture: Any, testFormat: Any): Boolean
}
object SceneGrab {
  
  inline def apply(
    allocateRenderTarget: (Any, Any, Any, Any, Any, Any, Any) => Any,
    allocateTexture: (Any, Any, Any, Any, Any, Any) => Texture,
    device: GraphicsDevice,
    getSourceColorFormat: Any => Any,
    initFallbackPath: () => Unit,
    initMainPath: () => Unit,
    layer: Layer,
    patch: Any => Unit,
    releaseRenderTarget: Any => Unit,
    scene: Scene_,
    setupUniform: (Any, Any, Any) => Unit,
    shouldReallocate: (Any, Any, Any) => Boolean
  ): SceneGrab = {
    val __obj = js.Dynamic.literal(allocateRenderTarget = js.Any.fromFunction7(allocateRenderTarget), allocateTexture = js.Any.fromFunction6(allocateTexture), device = device.asInstanceOf[js.Any], getSourceColorFormat = js.Any.fromFunction1(getSourceColorFormat), initFallbackPath = js.Any.fromFunction0(initFallbackPath), initMainPath = js.Any.fromFunction0(initMainPath), layer = layer.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch), releaseRenderTarget = js.Any.fromFunction1(releaseRenderTarget), scene = scene.asInstanceOf[js.Any], setupUniform = js.Any.fromFunction3(setupUniform), shouldReallocate = js.Any.fromFunction3(shouldReallocate))
    __obj.asInstanceOf[SceneGrab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneGrab] (val x: Self) extends AnyVal {
    
    inline def setAllocateRenderTarget(value: (Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "allocateRenderTarget", js.Any.fromFunction7(value))
    
    inline def setAllocateTexture(value: (Any, Any, Any, Any, Any, Any) => Texture): Self = StObject.set(x, "allocateTexture", js.Any.fromFunction6(value))
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGetSourceColorFormat(value: Any => Any): Self = StObject.set(x, "getSourceColorFormat", js.Any.fromFunction1(value))
    
    inline def setInitFallbackPath(value: () => Unit): Self = StObject.set(x, "initFallbackPath", js.Any.fromFunction0(value))
    
    inline def setInitMainPath(value: () => Unit): Self = StObject.set(x, "initMainPath", js.Any.fromFunction0(value))
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Any => Unit): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
    
    inline def setReleaseRenderTarget(value: Any => Unit): Self = StObject.set(x, "releaseRenderTarget", js.Any.fromFunction1(value))
    
    inline def setScene(value: Scene_): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSetupUniform(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "setupUniform", js.Any.fromFunction3(value))
    
    inline def setShouldReallocate(value: (Any, Any, Any) => Boolean): Self = StObject.set(x, "shouldReallocate", js.Any.fromFunction3(value))
  }
}
