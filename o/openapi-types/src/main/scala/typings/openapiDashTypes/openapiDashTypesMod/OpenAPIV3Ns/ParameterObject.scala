package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

import org.scalablytyped.runtime.StringDictionary
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPINs.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterObject
  extends ParameterBaseObject
     with Parameter {
  var in: String
  var name: String
}

object ParameterObject {
  @scala.inline
  def apply(
    in: String,
    name: String,
    allowEmptyValue: js.UndefOr[Boolean] = js.undefined,
    allowReserved: js.UndefOr[Boolean] = js.undefined,
    content: StringDictionary[MediaTypeObject] = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    example: js.Any = null,
    examples: StringDictionary[ReferenceObject | ExampleObject] = null,
    explode: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    schema: ReferenceObject | SchemaObject = null,
    style: String = null
  ): ParameterObject = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue)
    if (!js.isUndefined(allowReserved)) __obj.updateDynamic("allowReserved")(allowReserved)
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (example != null) __obj.updateDynamic("example")(example)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (!js.isUndefined(explode)) __obj.updateDynamic("explode")(explode)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ParameterObject]
  }
}

