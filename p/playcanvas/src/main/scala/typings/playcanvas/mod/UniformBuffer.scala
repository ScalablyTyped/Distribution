package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A uniform buffer represents a GPU memory buffer storing the uniforms.
  *
  * @ignore
  */
trait UniformBuffer extends StObject {
  
  /**
    * Frees resources associated with this uniform buffer.
    */
  def destroy(): Unit
  
  var device: GraphicsDevice
  
  var format: UniformBufferFormat
  
  var impl: Any
  
  /**
    * Called when the rendering context was lost. It releases all context related resources.
    *
    * @ignore
    */
  def loseContext(): Unit
  
  /**
    * Assign a value to the uniform specified by name.
    *
    * @param {string} name - The name of the uniform.
    */
  def set(name: String): Unit
  
  /**
    * Assign a value to the uniform specified by its format. This is the fast version of assigning
    * a value to a uniform, avoiding any lookups.
    *
    * @param {import('./uniform-buffer-format.js').UniformFormat} uniformFormat - The format of
    * the uniform.
    */
  def setUniform(uniformFormat: UniformFormat): Unit
  
  var storage: js.typedarray.ArrayBuffer
  
  var storageFloat32: js.typedarray.Float32Array
  
  var storageInt32: js.typedarray.Int32Array
  
  def update(): Unit
}
object UniformBuffer {
  
  inline def apply(
    destroy: () => Unit,
    device: GraphicsDevice,
    format: UniformBufferFormat,
    impl: Any,
    loseContext: () => Unit,
    set: String => Unit,
    setUniform: UniformFormat => Unit,
    storage: js.typedarray.ArrayBuffer,
    storageFloat32: js.typedarray.Float32Array,
    storageInt32: js.typedarray.Int32Array,
    update: () => Unit
  ): UniformBuffer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), device = device.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], impl = impl.asInstanceOf[js.Any], loseContext = js.Any.fromFunction0(loseContext), set = js.Any.fromFunction1(set), setUniform = js.Any.fromFunction1(setUniform), storage = storage.asInstanceOf[js.Any], storageFloat32 = storageFloat32.asInstanceOf[js.Any], storageInt32 = storageInt32.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[UniformBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniformBuffer] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: UniformBufferFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setImpl(value: Any): Self = StObject.set(x, "impl", value.asInstanceOf[js.Any])
    
    inline def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
    
    inline def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUniform(value: UniformFormat => Unit): Self = StObject.set(x, "setUniform", js.Any.fromFunction1(value))
    
    inline def setStorage(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageFloat32(value: js.typedarray.Float32Array): Self = StObject.set(x, "storageFloat32", value.asInstanceOf[js.Any])
    
    inline def setStorageInt32(value: js.typedarray.Int32Array): Self = StObject.set(x, "storageInt32", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
