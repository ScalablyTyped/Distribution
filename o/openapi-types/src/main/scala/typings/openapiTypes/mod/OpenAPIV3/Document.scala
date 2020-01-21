package typings.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends typings.openapiTypes.mod.OpenAPI.Document {
  var components: js.UndefOr[ComponentsObject] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var info: InfoObject
  var openapi: String
  var paths: PathsObject
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    info: InfoObject,
    openapi: String,
    paths: PathsObject,
    components: ComponentsObject = null,
    externalDocs: ExternalDocumentationObject = null,
    security: js.Array[SecurityRequirementObject] = null,
    servers: js.Array[ServerObject] = null,
    tags: js.Array[TagObject] = null
  ): Document = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

