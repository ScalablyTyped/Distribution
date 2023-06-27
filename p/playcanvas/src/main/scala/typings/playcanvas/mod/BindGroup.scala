package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bind group represents an collection of {@link UniformBuffer} and {@link Texture} instance,
  * which can be bind on a GPU for rendering.
  *
  * @ignore
  */
trait BindGroup extends StObject {
  
  /** @type {import('./uniform-buffer.js').UniformBuffer} */
  var defaultUniformBuffer: UniformBuffer
  
  /**
    * Frees resources associated with this bind group.
    */
  def destroy(): Unit
  
  var device: GraphicsDevice
  
  var dirty: Boolean
  
  var format: BindGroupFormat
  
  var id: Double
  
  var impl: Any
  
  /**
    * A render version the bind group was last updated on.
    *
    * @type {number}
    * @ignore
    */
  var renderVersionUpdated: Double
  
  /**
    * Assign a texture to a named slot.
    *
    * @param {string} name - The name of the texture slot.
    * @param {import('./texture.js').Texture} texture - Texture to assign to the slot.
    */
  def setTexture(name: String, texture: Texture): Unit
  
  /**
    * Assign a uniform buffer to a slot.
    *
    * @param {string} name - The name of the uniform buffer slot
    * @param {import('./uniform-buffer.js').UniformBuffer} uniformBuffer - The Uniform buffer to
    * assign to the slot.
    */
  def setUniformBuffer(name: String, uniformBuffer: UniformBuffer): Unit
  
  var textures: js.Array[Any]
  
  var uniformBuffers: js.Array[Any]
  
  /**
    * Applies any changes made to the bind group's properties.
    */
  def update(): Unit
}
object BindGroup {
  
  inline def apply(
    defaultUniformBuffer: UniformBuffer,
    destroy: () => Unit,
    device: GraphicsDevice,
    dirty: Boolean,
    format: BindGroupFormat,
    id: Double,
    impl: Any,
    renderVersionUpdated: Double,
    setTexture: (String, Texture) => Unit,
    setUniformBuffer: (String, UniformBuffer) => Unit,
    textures: js.Array[Any],
    uniformBuffers: js.Array[Any],
    update: () => Unit
  ): BindGroup = {
    val __obj = js.Dynamic.literal(defaultUniformBuffer = defaultUniformBuffer.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), device = device.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impl = impl.asInstanceOf[js.Any], renderVersionUpdated = renderVersionUpdated.asInstanceOf[js.Any], setTexture = js.Any.fromFunction2(setTexture), setUniformBuffer = js.Any.fromFunction2(setUniformBuffer), textures = textures.asInstanceOf[js.Any], uniformBuffers = uniformBuffers.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[BindGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindGroup] (val x: Self) extends AnyVal {
    
    inline def setDefaultUniformBuffer(value: UniformBuffer): Self = StObject.set(x, "defaultUniformBuffer", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: BindGroupFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpl(value: Any): Self = StObject.set(x, "impl", value.asInstanceOf[js.Any])
    
    inline def setRenderVersionUpdated(value: Double): Self = StObject.set(x, "renderVersionUpdated", value.asInstanceOf[js.Any])
    
    inline def setSetTexture(value: (String, Texture) => Unit): Self = StObject.set(x, "setTexture", js.Any.fromFunction2(value))
    
    inline def setSetUniformBuffer(value: (String, UniformBuffer) => Unit): Self = StObject.set(x, "setUniformBuffer", js.Any.fromFunction2(value))
    
    inline def setTextures(value: js.Array[Any]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesVarargs(value: Any*): Self = StObject.set(x, "textures", js.Array(value*))
    
    inline def setUniformBuffers(value: js.Array[Any]): Self = StObject.set(x, "uniformBuffers", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffersVarargs(value: Any*): Self = StObject.set(x, "uniformBuffers", js.Array(value*))
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
