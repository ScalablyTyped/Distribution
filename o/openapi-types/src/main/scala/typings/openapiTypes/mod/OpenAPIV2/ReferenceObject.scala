package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.mod.OpenAPI._Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceObject
  extends StObject
     with Response
     with Schema
     with _Parameter {
  
  @JSName("$ref")
  var $ref: String
}
object ReferenceObject {
  
  inline def apply($ref: String): ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
  
  extension [Self <: ReferenceObject](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
