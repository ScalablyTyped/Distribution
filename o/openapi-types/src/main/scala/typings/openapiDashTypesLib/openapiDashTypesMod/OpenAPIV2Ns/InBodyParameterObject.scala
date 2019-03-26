package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InBodyParameterObject
  extends Parameter
     with ParameterObject {
  var schema: Schema
}

object InBodyParameterObject {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    schema: Schema,
    description: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): InBodyParameterObject = {
    val __obj = js.Dynamic.literal(in = in, name = name, schema = schema)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[InBodyParameterObject]
  }
}

