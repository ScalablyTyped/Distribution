package typings.openapiTypes.mod

import typings.openapiTypes.mod.OpenAPIV2.OperationObject
import typings.openapiTypes.mod.OpenAPIV2.Schema
import typings.openapiTypes.mod.OpenAPIV3.ComponentsObject
import typings.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject
import typings.openapiTypes.mod.OpenAPIV3.InfoObject
import typings.openapiTypes.mod.OpenAPIV3.PathsObject
import typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
import typings.openapiTypes.mod.OpenAPIV3.ServerObject
import typings.openapiTypes.mod.OpenAPIV3.TagObject
import typings.openapiTypes.mod.OpenAPIV31.ParameterObject
import typings.openapiTypes.mod.OpenAPIV31.ReferenceObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpenAPI {
  
  /* Rewritten from type alias, can be one of: 
    - typings.openapiTypes.mod.OpenAPIV2.Document[T]
    - typings.openapiTypes.mod.OpenAPIV3.Document[T]
    - typings.openapiTypes.mod.OpenAPIV31.Document[T]
  */
  type Document[T /* <: js.Object */] = _Document[T] | typings.openapiTypes.mod.OpenAPIV31.Document[T]
  
  type Operation[T /* <: js.Object */] = OperationObject[T] | typings.openapiTypes.mod.OpenAPIV3.OperationObject[T] | typings.openapiTypes.mod.OpenAPIV31.OperationObject[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.openapiTypes.mod.OpenAPIV31.ReferenceObject
    - typings.openapiTypes.mod.OpenAPIV31.ParameterObject
    - typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
    - typings.openapiTypes.mod.OpenAPIV3.ParameterObject
    - typings.openapiTypes.mod.OpenAPIV2.ReferenceObject
    - typings.openapiTypes.mod.OpenAPIV2.Parameter
  */
  type Parameter = _Parameter | ParameterObject
  
  type Parameters = js.Array[
    typings.openapiTypes.mod.OpenAPIV2.Parameter | ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject | ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV2.ReferenceObject
  ]
  
  trait Request extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var query: js.UndefOr[js.Object] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait _Document[T /* <: js.Object */] extends StObject
  object _Document {
    
    inline def apply[T /* <: js.Object */](info: InfoObject, openapi: String, paths: PathsObject[T, js.Object]): _Document[T] = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[_Document[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _Document[?], T /* <: js.Object */] (val x: Self & _Document[T]) extends AnyVal {
      
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
  
  trait _Parameter extends StObject
  object _Parameter {
    
    inline def GeneralParameterObject(in: String, name: String, `type`: String): typings.openapiTypes.mod.OpenAPIV2.GeneralParameterObject = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.GeneralParameterObject]
    }
    
    inline def InBodyParameterObject(in: String, name: String, schema: Schema): typings.openapiTypes.mod.OpenAPIV2.InBodyParameterObject = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.InBodyParameterObject]
    }
    
    inline def ParameterObject(in: String, name: String): typings.openapiTypes.mod.OpenAPIV3.ParameterObject = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV3.ParameterObject]
    }
    
    inline def ReferenceObject($ref: String): typings.openapiTypes.mod.OpenAPIV3.ReferenceObject = {
      val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV3.ReferenceObject]
    }
  }
}
