package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
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
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setConsumes(value: MimeTypes): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
    
    @scala.inline
    def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: DefinitionsObject): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setInfo(value: InfoObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ParametersDefinitionsObject): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setPaths(value: PathsObject): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduces(value: MimeTypes): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
    
    @scala.inline
    def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: ResponsesDefinitionsObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    
    @scala.inline
    def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
    
    @scala.inline
    def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDefinitions(value: SecurityDefinitionsObject): Self = StObject.set(x, "securityDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDefinitionsUndefined: Self = StObject.set(x, "securityDefinitions", js.undefined)
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value :_*))
    
    @scala.inline
    def setSwagger(value: String): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[TagObject]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagObject*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def `setX-express-openapi-additional-middleware`(
      value: js.Array[
          js.Function3[/* request */ _, /* response */ _, /* next */ _, js.Promise[Unit] | Unit]
        ]
    ): Self = StObject.set(x, "x-express-openapi-additional-middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-express-openapi-additional-middlewareUndefined`: Self = StObject.set(x, "x-express-openapi-additional-middleware", js.undefined)
    
    @scala.inline
    def `setX-express-openapi-additional-middlewareVarargs`(value: (js.Function3[js.Any, js.Any, js.Any, js.Promise[Unit] | Unit])*): Self = StObject.set(x, "x-express-openapi-additional-middleware", js.Array(value :_*))
    
    @scala.inline
    def `setX-express-openapi-validation-strict`(value: Boolean): Self = StObject.set(x, "x-express-openapi-validation-strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-express-openapi-validation-strictUndefined`: Self = StObject.set(x, "x-express-openapi-validation-strict", js.undefined)
  }
}
