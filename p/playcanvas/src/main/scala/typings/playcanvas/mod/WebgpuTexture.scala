package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGPU implementation of the Texture.
  *
  * @ignore
  */
@js.native
trait WebgpuTexture extends StObject {
  
  def create(device: Any): Unit = js.native
  
  def createView(viewDescr: Any): Any = js.native
  
  /**
    * @type {GPUTextureDescriptor}
    * @private
    */
  /* private */ var descr: Any = js.native
  
  def destroy(device: Any): Unit = js.native
  
  /**
    * @type {GPUTextureFormat}
    * @private
    */
  /* private */ var format: Any = js.native
  
  /**
    * @param {any} device - The Graphics Device.
    * @param {number} [sampleType] - A sample type for the sampler, SAMPLETYPE_*** constant. If not
    * specified, the sampler type is based on the texture format / texture sampling type.
    * @returns {any} - Returns the sampler.
    */
  def getSampler(device: Any): Any = js.native
  def getSampler(device: Any, sampleType: Double): Any = js.native
  
  /**
    * @param {any} device - The Graphics Device.
    * @returns {any} - Returns the view.
    */
  def getView(device: Any): Any = js.native
  
  /**
    * @type {GPUTexture}
    * @private
    */
  /* private */ var gpuTexture: Any = js.native
  
  def isExternalImage(image: Any): Boolean = js.native
  
  def loseContext(): Unit = js.native
  
  def propertyChanged(flag: Any): Unit = js.native
  
  /**
    * An array of samplers, addressed by SAMPLETYPE_*** constant, allowing texture to be sampled
    * using different samplers. Most textures are sampled as interpolated floats, but some can
    * additionally be sampled using non-interpolated floats (raw data) or compare sampling
    * (shadow maps).
    *
    * @type {GPUSampler[]}
    * @private
    */
  /* private */ var samplers: Any = js.native
  
  /** @type {import('../texture.js').Texture} */
  var texture: Texture = js.native
  
  /**
    * @param {import('./webgpu-graphics-device.js').WebgpuGraphicsDevice} device - The graphics
    * device.
    */
  def uploadData(device: WebgpuGraphicsDevice): Unit = js.native
  
  def uploadExternalImage(device: Any, image: Any, mipLevel: Any, face: Any): Unit = js.native
  
  /**
    * @param {import('./webgpu-graphics-device.js').WebgpuGraphicsDevice} device - The graphics
    * device.
    * @param {import('../texture.js').Texture} texture - The texture.
    */
  def uploadImmediate(device: WebgpuGraphicsDevice, texture: Texture): Unit = js.native
  
  def uploadTypedArrayData(wgpu: Any, data: Any, mipLevel: Any, face: Any): Unit = js.native
  
  /**
    * @type {GPUTextureView}
    * @private
    */
  /* private */ var view: Any = js.native
}
