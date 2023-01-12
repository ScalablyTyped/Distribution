package typings.openapiTypes.mod.OpenAPIV31

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openapi-types.openapi-types.OpenAPIV3_1.Modify<openapi-types.openapi-types.OpenAPIV3.ServerObject, {  url :string,   description :string | undefined,   variables :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ServerVariableObject> | undefined}> */
trait ServerObject extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var url: String
  
  var variables: js.UndefOr[Record[String, ServerVariableObject]] = js.undefined
}
object ServerObject {
  
  inline def apply(url: String): ServerObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerObject] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Record[String, ServerVariableObject]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
