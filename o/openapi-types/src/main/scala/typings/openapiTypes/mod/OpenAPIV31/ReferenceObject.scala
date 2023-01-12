package typings.openapiTypes.mod.OpenAPIV31

import typings.openapiTypes.mod.OpenAPI._Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openapi-types.openapi-types.OpenAPIV3_1.Modify<openapi-types.openapi-types.OpenAPIV3.ReferenceObject, {  summary :string | undefined,   description :string | undefined}> */
trait ReferenceObject
  extends StObject
     with _Parameter {
  
  @JSName("$ref")
  var $ref: String
  
  var description: js.UndefOr[String] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
}
object ReferenceObject {
  
  inline def apply($ref: String): ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceObject] (val x: Self) extends AnyVal {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
