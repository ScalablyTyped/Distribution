package typings.openapiTypes.mod.OpenAPIV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.InBodyParameterObject
  - typings.openapiTypes.mod.OpenAPIV2.GeneralParameterObject
*/
trait Parameter
  extends typings.openapiTypes.mod.OpenAPI.Parameter

object Parameter {
  @scala.inline
  def InBodyParameterObject(in: String, name: String, schema: Schema): Parameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  def GeneralParameterObject(in: String, name: String, `type`: String): Parameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

