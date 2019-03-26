package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterObject
  extends ParameterBaseObject
     with openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Parameter {
  var in: java.lang.String
  var name: java.lang.String
}

object ParameterObject {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    allowEmptyValue: js.UndefOr[scala.Boolean] = js.undefined,
    allowReserved: js.UndefOr[scala.Boolean] = js.undefined,
    content: org.scalablytyped.runtime.StringDictionary[MediaTypeObject] = null,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    example: js.Any = null,
    examples: org.scalablytyped.runtime.StringDictionary[ReferenceObject | ExampleObject] = null,
    explode: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    schema: ReferenceObject | SchemaObject = null,
    style: java.lang.String = null
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

