package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document {
  var components: js.UndefOr[ComponentsObject] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var info: InfoObject
  var openapi: java.lang.String
  var paths: org.scalablytyped.runtime.StringDictionary[PathItemObject]
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    info: InfoObject,
    openapi: java.lang.String,
    paths: org.scalablytyped.runtime.StringDictionary[PathItemObject],
    components: ComponentsObject = null,
    externalDocs: ExternalDocumentationObject = null,
    security: js.Array[SecurityRequirementObject] = null,
    servers: js.Array[ServerObject] = null,
    tags: js.Array[TagObject] = null
  ): Document = {
    val __obj = js.Dynamic.literal(info = info, openapi = openapi, paths = paths)
    if (components != null) __obj.updateDynamic("components")(components)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    if (security != null) __obj.updateDynamic("security")(security)
    if (servers != null) __obj.updateDynamic("servers")(servers)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Document]
  }
}

