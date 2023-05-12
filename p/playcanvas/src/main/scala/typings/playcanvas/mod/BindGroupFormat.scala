package typings.playcanvas.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
trait BindGroupFormat extends StObject {
  
  /** @type {BindBufferFormat[]} */
  var bufferFormats: js.Array[BindBufferFormat]
  
  /** @type {Map<string, number>} */
  var bufferFormatsMap: Map[String, Double]
  
  /**
    * Frees resources associated with this bind group.
    */
  def destroy(): Unit
  
  /** @type {import('./graphics-device.js').GraphicsDevice} */
  var device: GraphicsDevice
  
  def getShaderDeclarationTextures(bindGroup: Any): String
  
  /**
    * Returns format of texture with specified name.
    *
    * @param {string} name - The name of the texture slot.
    * @returns {BindTextureFormat} - The format.
    */
  def getTexture(name: String): BindTextureFormat
  
  var id: Double
  
  var impl: Any
  
  def loseContext(): Unit
  
  /** @type {BindTextureFormat[]} */
  var textureFormats: js.Array[BindTextureFormat]
  
  /** @type {Map<string, number>} */
  var textureFormatsMap: Map[String, Double]
}
object BindGroupFormat {
  
  inline def apply(
    bufferFormats: js.Array[BindBufferFormat],
    bufferFormatsMap: Map[String, Double],
    destroy: () => Unit,
    device: GraphicsDevice,
    getShaderDeclarationTextures: Any => String,
    getTexture: String => BindTextureFormat,
    id: Double,
    impl: Any,
    loseContext: () => Unit,
    textureFormats: js.Array[BindTextureFormat],
    textureFormatsMap: Map[String, Double]
  ): BindGroupFormat = {
    val __obj = js.Dynamic.literal(bufferFormats = bufferFormats.asInstanceOf[js.Any], bufferFormatsMap = bufferFormatsMap.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), device = device.asInstanceOf[js.Any], getShaderDeclarationTextures = js.Any.fromFunction1(getShaderDeclarationTextures), getTexture = js.Any.fromFunction1(getTexture), id = id.asInstanceOf[js.Any], impl = impl.asInstanceOf[js.Any], loseContext = js.Any.fromFunction0(loseContext), textureFormats = textureFormats.asInstanceOf[js.Any], textureFormatsMap = textureFormatsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindGroupFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindGroupFormat] (val x: Self) extends AnyVal {
    
    inline def setBufferFormats(value: js.Array[BindBufferFormat]): Self = StObject.set(x, "bufferFormats", value.asInstanceOf[js.Any])
    
    inline def setBufferFormatsMap(value: Map[String, Double]): Self = StObject.set(x, "bufferFormatsMap", value.asInstanceOf[js.Any])
    
    inline def setBufferFormatsVarargs(value: BindBufferFormat*): Self = StObject.set(x, "bufferFormats", js.Array(value*))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGetShaderDeclarationTextures(value: Any => String): Self = StObject.set(x, "getShaderDeclarationTextures", js.Any.fromFunction1(value))
    
    inline def setGetTexture(value: String => BindTextureFormat): Self = StObject.set(x, "getTexture", js.Any.fromFunction1(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpl(value: Any): Self = StObject.set(x, "impl", value.asInstanceOf[js.Any])
    
    inline def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
    
    inline def setTextureFormats(value: js.Array[BindTextureFormat]): Self = StObject.set(x, "textureFormats", value.asInstanceOf[js.Any])
    
    inline def setTextureFormatsMap(value: Map[String, Double]): Self = StObject.set(x, "textureFormatsMap", value.asInstanceOf[js.Any])
    
    inline def setTextureFormatsVarargs(value: BindTextureFormat*): Self = StObject.set(x, "textureFormats", js.Array(value*))
  }
}
