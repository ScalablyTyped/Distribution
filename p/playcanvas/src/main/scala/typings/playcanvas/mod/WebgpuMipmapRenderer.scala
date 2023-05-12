package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGPU helper class implementing texture mipmap generation.
  *
  * @ignore
  */
trait WebgpuMipmapRenderer extends StObject {
  
  /** @type {import('./webgpu-graphics-device.js').WebgpuGraphicsDevice} */
  var device: WebgpuGraphicsDevice
  
  /**
    * Generates mipmaps for the specified WebGPU texture.
    *
    * @param {import('./webgpu-texture.js').WebgpuTexture} webgpuTexture - The texture to generate mipmaps for.
    */
  def generate(webgpuTexture: WebgpuTexture): Unit
  
  var minSampler: Any
  
  var shader: Shader
}
object WebgpuMipmapRenderer {
  
  inline def apply(device: WebgpuGraphicsDevice, generate: WebgpuTexture => Unit, minSampler: Any, shader: Shader): WebgpuMipmapRenderer = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate), minSampler = minSampler.asInstanceOf[js.Any], shader = shader.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebgpuMipmapRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebgpuMipmapRenderer] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: WebgpuGraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGenerate(value: WebgpuTexture => Unit): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
    
    inline def setMinSampler(value: Any): Self = StObject.set(x, "minSampler", value.asInstanceOf[js.Any])
    
    inline def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
  }
}
