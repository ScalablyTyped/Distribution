package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Document {
  var basePath: js.UndefOr[String] = js.undefined
  var consumes: js.UndefOr[MimeTypes] = js.undefined
  var definitions: js.UndefOr[DefinitionsObject] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var info: InfoObject
  var parameters: js.UndefOr[ParametersDefinitionsObject] = js.undefined
  var paths: PathsObject
  var produces: js.UndefOr[MimeTypes] = js.undefined
  var responses: js.UndefOr[ResponsesDefinitionsObject] = js.undefined
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  var securityDefinitions: js.UndefOr[SecurityDefinitionsObject] = js.undefined
  var swagger: String
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    info: InfoObject,
    paths: PathsObject,
    swagger: String,
    basePath: String = null,
    consumes: MimeTypes = null,
    definitions: DefinitionsObject = null,
    externalDocs: ExternalDocumentationObject = null,
    host: String = null,
    parameters: ParametersDefinitionsObject = null,
    produces: MimeTypes = null,
    responses: ResponsesDefinitionsObject = null,
    schemes: js.Array[String] = null,
    security: js.Array[SecurityRequirementObject] = null,
    securityDefinitions: SecurityDefinitionsObject = null,
    tags: js.Array[TagObject] = null
  ): Document = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (consumes != null) __obj.updateDynamic("consumes")(consumes.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (produces != null) __obj.updateDynamic("produces")(produces.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    if (schemes != null) __obj.updateDynamic("schemes")(schemes.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (securityDefinitions != null) __obj.updateDynamic("securityDefinitions")(securityDefinitions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

