package typings.openapiFramework

import typings.openapiFramework.basePathMod.default
import typings.openapiFramework.openapiFrameworkNumbers.`-1`
import typings.openapiFramework.openapiFrameworkNumbers.`0`
import typings.openapiFramework.openapiFrameworkNumbers.`1`
import typings.openapiFramework.typesMod.IOpenAPIFramework
import typings.openapiTypes.mod.OpenAPIV3.ServerObject
import typings.tsLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("openapi-framework/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object METHOD_ALIASES {
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.DELETE")
    @js.native
    def DELETE_ : String = js.native
    
    inline def DELETE__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.GET")
    @js.native
    def GET_ : String = js.native
    
    inline def GET__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.HEAD")
    @js.native
    def HEAD_ : String = js.native
    
    inline def HEAD__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEAD")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.OPTIONS")
    @js.native
    def OPTIONS_ : String = js.native
    
    inline def OPTIONS__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.PATCH")
    @js.native
    def PATCH_ : String = js.native
    
    inline def PATCH__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATCH")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.POST")
    @js.native
    def POST_ : String = js.native
    
    inline def POST__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POST")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.PUT")
    @js.native
    def PUT_ : String = js.native
    
    inline def PUT__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.del")
    @js.native
    def del: String = js.native
    inline def del_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("del")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.delete")
    @js.native
    def delete: String = js.native
    inline def delete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delete")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.get")
    @js.native
    def get: String = js.native
    inline def get_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.head")
    @js.native
    def head: String = js.native
    inline def head_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.options")
    @js.native
    def options: String = js.native
    inline def options_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.patch")
    @js.native
    def patch: String = js.native
    inline def patch_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("patch")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.post")
    @js.native
    def post: String = js.native
    inline def post_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("post")(x.asInstanceOf[js.Any])
    
    @JSImport("openapi-framework/dist/src/util", "METHOD_ALIASES.put")
    @js.native
    def put: String = js.native
    inline def put_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("put")(x.asInstanceOf[js.Any])
  }
  
  inline def addOperationTagToApiDoc(apiDoc: Any, tag: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOperationTagToApiDoc")(apiDoc.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def allowsCoercionFeature(framework: IOpenAPIFramework, docs: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowsCoercionFeature")(List(framework.asInstanceOf[js.Any]).`++`(docs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def allowsDefaultsFeature(framework: IOpenAPIFramework, docs: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowsDefaultsFeature")(List(framework.asInstanceOf[js.Any]).`++`(docs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def allowsFeatures(framework: IOpenAPIFramework, docs: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowsFeatures")(List(framework.asInstanceOf[js.Any]).`++`(docs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def allowsResponseValidationFeature(framework: IOpenAPIFramework, docs: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowsResponseValidationFeature")(List(framework.asInstanceOf[js.Any]).`++`(docs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def allowsValidationFeature(framework: IOpenAPIFramework, docs: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowsValidationFeature")(List(framework.asInstanceOf[js.Any]).`++`(docs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def assertRegExpAndSecurity(framework: Any, tuple: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertRegExpAndSecurity")(framework.asInstanceOf[js.Any], tuple.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def byDefault(param: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("byDefault")(param.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def byDirectory(el: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("byDirectory")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def byMethods(name: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("byMethods")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def byRoute(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byRoute")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def byString(el: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("byString")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def byTag(a: Any, b: Any): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("byTag")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  
  inline def copy(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getAdditionalFeatures(framework: IOpenAPIFramework, logger: Logger, docs: Any*): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalFeatures")((List(framework.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).`++`(docs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
  
  inline def getBasePathsFromServers(servers: js.Array[ServerObject]): js.Array[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBasePathsFromServers")(servers.asInstanceOf[js.Any]).asInstanceOf[js.Array[default]]
  
  inline def getMethodDoc(operationHandler: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMethodDoc")(operationHandler.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getSecurityDefinitionByPath(openapiPath: Any, pathSecurity: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityDefinitionByPath")(openapiPath.asInstanceOf[js.Any], pathSecurity.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def handleFilePath(filePath: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handleFilePath")(filePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def handleYaml(apiDoc: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handleYaml")(apiDoc.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def injectDependencies(handlers: Any, dependencies: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("injectDependencies")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isDynamicRoute(route: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicRoute")(route.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveParameterRefs(framework: IOpenAPIFramework, parameters: Any, apiDoc: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveParameterRefs")(framework.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], apiDoc.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def resolveRequestBodyRefs(framework: IOpenAPIFramework, requestBody: Any, apiDoc: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRequestBodyRefs")(framework.asInstanceOf[js.Any], requestBody.asInstanceOf[js.Any], apiDoc.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def resolveResponseRefs(framework: IOpenAPIFramework, responses: Any, apiDoc: Any, route: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveResponseRefs")(framework.asInstanceOf[js.Any], responses.asInstanceOf[js.Any], apiDoc.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def sortApiDocTags(apiDoc: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortApiDocTags")(apiDoc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sortOperationDocTags(operationDoc: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortOperationDocTags")(operationDoc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toAbsolutePath(part: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toAbsolutePath")(part.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def withNoDuplicates(arr: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNoDuplicates")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
