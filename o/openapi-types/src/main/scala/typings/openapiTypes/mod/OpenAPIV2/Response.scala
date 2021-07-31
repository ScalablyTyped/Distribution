package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.ResponseObject
  - typings.openapiTypes.mod.OpenAPIV2.ReferenceObject
*/
trait Response extends StObject
object Response {
  
  @scala.inline
  def ReferenceObject($ref: String): typings.openapiTypes.mod.OpenAPIV2.ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.ReferenceObject]
  }
  
  @scala.inline
  def ResponseObject(description: String): typings.openapiTypes.mod.OpenAPIV2.ResponseObject = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.ResponseObject]
  }
}
