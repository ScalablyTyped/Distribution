package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterBaseObject extends js.Object {
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
  var allowReserved: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[StringDictionary[MediaTypeObject]] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var example: js.UndefOr[js.Any] = js.undefined
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.undefined
  var explode: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[ReferenceObject | SchemaObject] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

object ParameterBaseObject {
  @scala.inline
  def apply(
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
  ): ParameterBaseObject = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[ParameterBaseObject]
  }
}

