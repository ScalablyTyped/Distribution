package typings.openapiTypes.mod.OpenAPI

import typings.openapiTypes.mod.OpenAPIV3.ComponentsObject
import typings.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject
import typings.openapiTypes.mod.OpenAPIV3.InfoObject
import typings.openapiTypes.mod.OpenAPIV3.PathsObject
import typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
import typings.openapiTypes.mod.OpenAPIV3.ServerObject
import typings.openapiTypes.mod.OpenAPIV3.TagObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.Document
  - typings.openapiTypes.mod.OpenAPIV3.Document
*/
trait Document extends js.Object

object Document {
  @scala.inline
  def apply(info: InfoObject, openapi: String, paths: PathsObject): Document = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfo(value: InfoObject): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenapi(value: String): Self = this.set("openapi", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaths(value: PathsObject): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponents(value: ComponentsObject): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDocs: Self = this.set("externalDocs", js.undefined)
    @scala.inline
    def setSecurityVarargs(value: SecurityRequirementObject*): Self = this.set("security", js.Array(value :_*))
    @scala.inline
    def setSecurity(value: js.Array[SecurityRequirementObject]): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setServersVarargs(value: ServerObject*): Self = this.set("servers", js.Array(value :_*))
    @scala.inline
    def setServers(value: js.Array[ServerObject]): Self = this.set("servers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServers: Self = this.set("servers", js.undefined)
    @scala.inline
    def setTagsVarargs(value: TagObject*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[TagObject]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def `setX-express-openapi-additional-middlewareVarargs`(value: (js.Function3[js.Any, js.Any, js.Any, js.Promise[Unit] | Unit])*): Self = this.set("x-express-openapi-additional-middleware", js.Array(value :_*))
    @scala.inline
    def `setX-express-openapi-additional-middleware`(
      value: js.Array[
          js.Function3[/* request */ _, /* response */ _, /* next */ _, js.Promise[Unit] | Unit]
        ]
    ): Self = this.set("x-express-openapi-additional-middleware", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-express-openapi-additional-middleware`: Self = this.set("x-express-openapi-additional-middleware", js.undefined)
    @scala.inline
    def `setX-express-openapi-validation-strict`(value: Boolean): Self = this.set("x-express-openapi-validation-strict", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-express-openapi-validation-strict`: Self = this.set("x-express-openapi-validation-strict", js.undefined)
  }
  
}

