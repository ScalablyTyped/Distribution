package typings.openapiTypes.mod.OpenAPI

import typings.openapiTypes.mod.OpenAPIV2.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
  - typings.openapiTypes.mod.OpenAPIV3.ParameterObject
  - typings.openapiTypes.mod.OpenAPIV2.ReferenceObject
  - typings.openapiTypes.mod.OpenAPIV2.Parameter
*/
trait Parameter extends js.Object

object Parameter {
  @scala.inline
  def ReferenceObject($ref: String): Parameter = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  def ParameterObject(in: String, name: String): Parameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  def GeneralParameterObject(in: String, name: String, `type`: String): Parameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  def InBodyParameterObject(in: String, name: String, schema: Schema): Parameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

