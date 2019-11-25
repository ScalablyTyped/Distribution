package typings.openapiDashTypes.openapiDashTypesMod.OpenAPI

import org.scalablytyped.runtime.StringDictionary
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.CallbackObject
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ExternalDocumentationObject
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ParameterObject
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ReferenceObject
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.RequestBodyObject
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ResponsesObject
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.SecurityRequirementObject
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ServerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.OperationObject
  - typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.OperationObject
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def OperationObject(
    callbacks: StringDictionary[ReferenceObject | CallbackObject] = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    externalDocs: ExternalDocumentationObject = null,
    operationId: String = null,
    parameters: js.Array[ReferenceObject | ParameterObject] = null,
    requestBody: ReferenceObject | RequestBodyObject = null,
    responses: ResponsesObject = null,
    security: js.Array[SecurityRequirementObject] = null,
    servers: js.Array[ServerObject] = null,
    summary: String = null,
    tags: js.Array[String] = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

