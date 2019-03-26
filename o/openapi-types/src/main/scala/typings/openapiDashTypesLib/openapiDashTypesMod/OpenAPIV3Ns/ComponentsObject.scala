package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentsObject extends js.Object {
  var callbacks: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | CallbackObject]] = js.undefined
  var examples: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | ExampleObject]] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  var links: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | LinkObject]] = js.undefined
  var parameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | ParameterObject]] = js.undefined
  var requestBodies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | RequestBodyObject]] = js.undefined
  var responses: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | ResponseObject]] = js.undefined
  var schemas: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | SchemaObject]] = js.undefined
  var securitySchemes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[ReferenceObject | SecuritySchemeObject]
  ] = js.undefined
}

object ComponentsObject {
  @scala.inline
  def apply(
    callbacks: org.scalablytyped.runtime.StringDictionary[ReferenceObject | CallbackObject] = null,
    examples: org.scalablytyped.runtime.StringDictionary[ReferenceObject | ExampleObject] = null,
    headers: org.scalablytyped.runtime.StringDictionary[ReferenceObject | HeaderObject] = null,
    links: org.scalablytyped.runtime.StringDictionary[ReferenceObject | LinkObject] = null,
    parameters: org.scalablytyped.runtime.StringDictionary[ReferenceObject | ParameterObject] = null,
    requestBodies: org.scalablytyped.runtime.StringDictionary[ReferenceObject | RequestBodyObject] = null,
    responses: org.scalablytyped.runtime.StringDictionary[ReferenceObject | ResponseObject] = null,
    schemas: org.scalablytyped.runtime.StringDictionary[ReferenceObject | SchemaObject] = null,
    securitySchemes: org.scalablytyped.runtime.StringDictionary[ReferenceObject | SecuritySchemeObject] = null
  ): ComponentsObject = {
    val __obj = js.Dynamic.literal()
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (links != null) __obj.updateDynamic("links")(links)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (requestBodies != null) __obj.updateDynamic("requestBodies")(requestBodies)
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    if (securitySchemes != null) __obj.updateDynamic("securitySchemes")(securitySchemes)
    __obj.asInstanceOf[ComponentsObject]
  }
}

