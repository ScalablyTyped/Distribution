package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.mod.OpenAPI._Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document[T /* <: js.Object */]
  extends StObject
     with _Document[T] {
  
  var components: js.UndefOr[ComponentsObject] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  
  var info: InfoObject
  
  var openapi: String
  
  var paths: PathsObject[T, js.Object]
  
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
  
  var `x-express-openapi-additional-middleware`: js.UndefOr[
    js.Array[
      js.Function3[/* request */ Any, /* response */ Any, /* next */ Any, js.Promise[Unit] | Unit]
    ]
  ] = js.undefined
  
  var `x-express-openapi-validation-strict`: js.UndefOr[Boolean] = js.undefined
}
object Document {
  
  inline def apply[T /* <: js.Object */](info: InfoObject, openapi: String, paths: PathsObject[T, js.Object]): Document[T] = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document[?], T /* <: js.Object */] (val x: Self & Document[T]) extends AnyVal {
    
    inline def setComponents(value: ComponentsObject): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setInfo(value: InfoObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setOpenapi(value: String): Self = StObject.set(x, "openapi", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: PathsObject[T, js.Object]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value*))
    
    inline def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value*))
    
    inline def setTags(value: js.Array[TagObject]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: TagObject*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def `setX-express-openapi-additional-middleware`(
      value: js.Array[
          js.Function3[/* request */ Any, /* response */ Any, /* next */ Any, js.Promise[Unit] | Unit]
        ]
    ): Self = StObject.set(x, "x-express-openapi-additional-middleware", value.asInstanceOf[js.Any])
    
    inline def `setX-express-openapi-additional-middlewareUndefined`: Self = StObject.set(x, "x-express-openapi-additional-middleware", js.undefined)
    
    inline def `setX-express-openapi-additional-middlewareVarargs`(
      value: (js.Function3[/* request */ Any, /* response */ Any, /* next */ Any, js.Promise[Unit] | Unit])*
    ): Self = StObject.set(x, "x-express-openapi-additional-middleware", js.Array(value*))
    
    inline def `setX-express-openapi-validation-strict`(value: Boolean): Self = StObject.set(x, "x-express-openapi-validation-strict", value.asInstanceOf[js.Any])
    
    inline def `setX-express-openapi-validation-strictUndefined`: Self = StObject.set(x, "x-express-openapi-validation-strict", js.undefined)
  }
}
