package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document
  extends StObject
     with typings.openapiTypes.mod.OpenAPI.Document {
  
  var components: js.UndefOr[ComponentsObject] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  
  var info: InfoObject
  
  var openapi: String
  
  var paths: PathsObject
  
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
  
  var `x-express-openapi-additional-middleware`: js.UndefOr[
    js.Array[
      js.Function3[
        /* request */ js.Any, 
        /* response */ js.Any, 
        /* next */ js.Any, 
        js.Promise[Unit] | Unit
      ]
    ]
  ] = js.undefined
  
  var `x-express-openapi-validation-strict`: js.UndefOr[Boolean] = js.undefined
}
object Document {
  
  @scala.inline
  def apply(info: InfoObject, openapi: String, paths: PathsObject): Document = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: ComponentsObject): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setInfo(value: InfoObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenapi(value: String): Self = StObject.set(x, "openapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: PathsObject): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value :_*))
    
    @scala.inline
    def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[TagObject]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagObject*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def `setX-express-openapi-additional-middleware`(
      value: js.Array[
          js.Function3[
            /* request */ js.Any, 
            /* response */ js.Any, 
            /* next */ js.Any, 
            js.Promise[Unit] | Unit
          ]
        ]
    ): Self = StObject.set(x, "x-express-openapi-additional-middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-express-openapi-additional-middlewareUndefined`: Self = StObject.set(x, "x-express-openapi-additional-middleware", js.undefined)
    
    @scala.inline
    def `setX-express-openapi-additional-middlewareVarargs`(
      value: (js.Function3[
          /* request */ js.Any, 
          /* response */ js.Any, 
          /* next */ js.Any, 
          js.Promise[Unit] | Unit
        ])*
    ): Self = StObject.set(x, "x-express-openapi-additional-middleware", js.Array(value :_*))
    
    @scala.inline
    def `setX-express-openapi-validation-strict`(value: Boolean): Self = StObject.set(x, "x-express-openapi-validation-strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-express-openapi-validation-strictUndefined`: Self = StObject.set(x, "x-express-openapi-validation-strict", js.undefined)
  }
}
