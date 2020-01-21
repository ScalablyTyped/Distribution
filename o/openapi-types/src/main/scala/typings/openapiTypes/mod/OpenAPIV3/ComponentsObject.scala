package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentsObject extends js.Object {
  var callbacks: js.UndefOr[StringDictionary[ReferenceObject | CallbackObject]] = js.undefined
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.undefined
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.undefined
  var parameters: js.UndefOr[StringDictionary[ReferenceObject | ParameterObject]] = js.undefined
  var requestBodies: js.UndefOr[StringDictionary[ReferenceObject | RequestBodyObject]] = js.undefined
  var responses: js.UndefOr[StringDictionary[ReferenceObject | ResponseObject]] = js.undefined
  var schemas: js.UndefOr[StringDictionary[ReferenceObject | SchemaObject]] = js.undefined
  var securitySchemes: js.UndefOr[StringDictionary[ReferenceObject | SecuritySchemeObject]] = js.undefined
}

object ComponentsObject {
  @scala.inline
  def apply(
    callbacks: StringDictionary[ReferenceObject | CallbackObject] = null,
    examples: StringDictionary[ReferenceObject | ExampleObject] = null,
    headers: StringDictionary[ReferenceObject | HeaderObject] = null,
    links: StringDictionary[ReferenceObject | LinkObject] = null,
    parameters: StringDictionary[ReferenceObject | ParameterObject] = null,
    requestBodies: StringDictionary[ReferenceObject | RequestBodyObject] = null,
    responses: StringDictionary[ReferenceObject | ResponseObject] = null,
    schemas: StringDictionary[ReferenceObject | SchemaObject] = null,
    securitySchemes: StringDictionary[ReferenceObject | SecuritySchemeObject] = null
  ): ComponentsObject = {
    val __obj = js.Dynamic.literal()
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (requestBodies != null) __obj.updateDynamic("requestBodies")(requestBodies.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (securitySchemes != null) __obj.updateDynamic("securitySchemes")(securitySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsObject]
  }
}

