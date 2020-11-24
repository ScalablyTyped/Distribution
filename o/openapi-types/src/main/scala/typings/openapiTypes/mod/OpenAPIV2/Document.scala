package typings.openapiTypes.mod.OpenAPIV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document
  extends typings.openapiTypes.mod.OpenAPI.Document {
  
  var basePath: js.UndefOr[String] = js.native
  
  var consumes: js.UndefOr[MimeTypes] = js.native
  
  var definitions: js.UndefOr[DefinitionsObject] = js.native
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var info: InfoObject = js.native
  
  var parameters: js.UndefOr[ParametersDefinitionsObject] = js.native
  
  var paths: PathsObject = js.native
  
  var produces: js.UndefOr[MimeTypes] = js.native
  
  var responses: js.UndefOr[ResponsesDefinitionsObject] = js.native
  
  var schemes: js.UndefOr[js.Array[String]] = js.native
  
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.native
  
  var securityDefinitions: js.UndefOr[SecurityDefinitionsObject] = js.native
  
  var swagger: String = js.native
  
  var tags: js.UndefOr[js.Array[TagObject]] = js.native
  
  var `x-express-openapi-additional-middleware`: js.UndefOr[
    js.Array[
      js.Function3[/* request */ _, /* response */ _, /* next */ _, js.Promise[Unit] | Unit]
    ]
  ] = js.native
  
  var `x-express-openapi-validation-strict`: js.UndefOr[Boolean] = js.native
}
object Document {
  
  @scala.inline
  def apply(info: InfoObject, paths: PathsObject, swagger: String): Document = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
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
    def setPaths(value: PathsObject): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwagger(value: String): Self = this.set("swagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setConsumesVarargs(value: String*): Self = this.set("consumes", js.Array(value :_*))
    
    @scala.inline
    def setConsumes(value: MimeTypes): Self = this.set("consumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumes: Self = this.set("consumes", js.undefined)
    
    @scala.inline
    def setDefinitions(value: DefinitionsObject): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalDocs: Self = this.set("externalDocs", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersDefinitionsObject): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setProducesVarargs(value: String*): Self = this.set("produces", js.Array(value :_*))
    
    @scala.inline
    def setProduces(value: MimeTypes): Self = this.set("produces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduces: Self = this.set("produces", js.undefined)
    
    @scala.inline
    def setResponses(value: ResponsesDefinitionsObject): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
    
    @scala.inline
    def setSchemesVarargs(value: String*): Self = this.set("schemes", js.Array(value :_*))
    
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = this.set("schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemes: Self = this.set("schemes", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: SecurityRequirementObject*): Self = this.set("security", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[SecurityRequirementObject]): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSecurityDefinitions(value: SecurityDefinitionsObject): Self = this.set("securityDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityDefinitions: Self = this.set("securityDefinitions", js.undefined)
    
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
