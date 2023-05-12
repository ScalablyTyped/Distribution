package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Info about a shader pass. Shader pass is represented by a unique index and a name, and the
  * index is used to access the shader required for the pass, from an array stored in the
  * material or mesh instance.
  *
  * @ignore
  */
trait ShaderPassInfo extends StObject {
  
  /** @type {number} */
  var index: Double
  
  def initShaderDefines(): Unit
  
  /** @type {string} */
  var name: String
  
  /** @type {string} */
  var shaderDefine: String
  
  var shaderDefines: String
}
object ShaderPassInfo {
  
  inline def apply(
    index: Double,
    initShaderDefines: () => Unit,
    name: String,
    shaderDefine: String,
    shaderDefines: String
  ): ShaderPassInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], initShaderDefines = js.Any.fromFunction0(initShaderDefines), name = name.asInstanceOf[js.Any], shaderDefine = shaderDefine.asInstanceOf[js.Any], shaderDefines = shaderDefines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderPassInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShaderPassInfo] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInitShaderDefines(value: () => Unit): Self = StObject.set(x, "initShaderDefines", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShaderDefine(value: String): Self = StObject.set(x, "shaderDefine", value.asInstanceOf[js.Any])
    
    inline def setShaderDefines(value: String): Self = StObject.set(x, "shaderDefines", value.asInstanceOf[js.Any])
  }
}
