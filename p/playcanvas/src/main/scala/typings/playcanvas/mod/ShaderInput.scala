package typings.playcanvas.mod

import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./graphics-device.js').GraphicsDevice} GraphicsDevice */
/**
  * Representation of a shader uniform.
  *
  * @ignore
  */
trait ShaderInput extends StObject {
  
  var array: js.Array[Any]
  
  var dataType: Double
  
  var locationId: Double | WebGLUniformLocation
  
  var scopeId: ScopeId
  
  var value: js.Array[Any]
  
  var version: Version_
}
object ShaderInput {
  
  inline def apply(
    array: js.Array[Any],
    dataType: Double,
    locationId: Double | WebGLUniformLocation,
    scopeId: ScopeId,
    value: js.Array[Any],
    version: Version_
  ): ShaderInput = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShaderInput] (val x: Self) extends AnyVal {
    
    inline def setArray(value: js.Array[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Any*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setDataType(value: Double): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setLocationId(value: Double | WebGLUniformLocation): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setScopeId(value: ScopeId): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setVersion(value: Version_): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
