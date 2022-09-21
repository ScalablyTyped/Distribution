package typings.playcanvas.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A descriptor that defines the layout of of data inside the {@link UniformBuffer}.
  *
  * @ignore
  */
trait UniformBufferFormat extends StObject {
  
  /** @type {number} */
  var byteSize: Double
  
  /**
    * Returns format of a uniform with specified name.
    *
    * @param {string} name - The name of the uniform.
    * @returns {UniformFormat} - The format of the uniform.
    */
  def get(name: String): UniformFormat
  
  def getShaderDeclaration(bindGroup: Any, bindIndex: Any): String
  
  /** @type {Map<string,UniformFormat>} */
  var map: Map[String, UniformFormat]
  
  var scope: ScopeSpace
  
  /** @type {UniformFormat[]} */
  var uniforms: js.Array[UniformFormat]
}
object UniformBufferFormat {
  
  inline def apply(
    byteSize: Double,
    get: String => UniformFormat,
    getShaderDeclaration: (Any, Any) => String,
    map: Map[String, UniformFormat],
    scope: ScopeSpace,
    uniforms: js.Array[UniformFormat]
  ): UniformBufferFormat = {
    val __obj = js.Dynamic.literal(byteSize = byteSize.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getShaderDeclaration = js.Any.fromFunction2(getShaderDeclaration), map = map.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformBufferFormat]
  }
  
  extension [Self <: UniformBufferFormat](x: Self) {
    
    inline def setByteSize(value: Double): Self = StObject.set(x, "byteSize", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => UniformFormat): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetShaderDeclaration(value: (Any, Any) => String): Self = StObject.set(x, "getShaderDeclaration", js.Any.fromFunction2(value))
    
    inline def setMap(value: Map[String, UniformFormat]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setScope(value: ScopeSpace): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setUniforms(value: js.Array[UniformFormat]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsVarargs(value: UniformFormat*): Self = StObject.set(x, "uniforms", js.Array(value*))
  }
}
