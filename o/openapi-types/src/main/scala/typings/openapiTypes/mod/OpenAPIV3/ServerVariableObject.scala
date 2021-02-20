package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerVariableObject extends StObject {
  
  var default: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var enum: js.UndefOr[js.Array[String]] = js.native
}
object ServerVariableObject {
  
  @scala.inline
  def apply(default: String): ServerVariableObject = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerVariableObject]
  }
  
  @scala.inline
  implicit class ServerVariableObjectMutableBuilder[Self <: ServerVariableObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
  }
}
