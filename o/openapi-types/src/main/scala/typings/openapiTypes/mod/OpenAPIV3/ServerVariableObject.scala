package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerVariableObject extends StObject {
  
  var default: String
  
  var description: js.UndefOr[String] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[String]] = js.undefined
}
object ServerVariableObject {
  
  inline def apply(default: String): ServerVariableObject = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerVariableObject]
  }
  
  extension [Self <: ServerVariableObject](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
  }
}
