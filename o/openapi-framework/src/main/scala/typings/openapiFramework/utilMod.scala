package typings.openapiFramework

import typings.openapiFramework.basePathMod.default
import typings.openapiFramework.openapiFrameworkNumbers.`-1`
import typings.openapiFramework.openapiFrameworkNumbers.`0`
import typings.openapiFramework.openapiFrameworkNumbers.`1`
import typings.openapiFramework.typesMod.IOpenAPIFramework
import typings.openapiTypes.mod.OpenAPIV3.ServerObject
import typings.tsLog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openapi-framework/dist/src/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def addOperationTagToApiDoc(apiDoc: js.Any, tag: js.Any): Unit = js.native
  
  def allowsCoercionFeature(framework: IOpenAPIFramework, docs: js.Any*): Boolean = js.native
  
  def allowsDefaultsFeature(framework: IOpenAPIFramework, docs: js.Any*): Boolean = js.native
  
  def allowsFeatures(framework: IOpenAPIFramework, docs: js.Any*): Boolean = js.native
  
  def allowsResponseValidationFeature(framework: IOpenAPIFramework, docs: js.Any*): Boolean = js.native
  
  def allowsValidationFeature(framework: IOpenAPIFramework, docs: js.Any*): Boolean = js.native
  
  def assertRegExpAndSecurity(framework: js.Any, tuple: js.Any): Unit = js.native
  
  def byDefault(param: js.Any): Boolean = js.native
  
  def byDirectory(el: js.Any): js.Any = js.native
  
  def byMethods(name: js.Any): Boolean = js.native
  
  def byRoute(a: js.Any, b: js.Any): Double = js.native
  
  def byString(el: js.Any): Boolean = js.native
  
  def byTag(a: js.Any, b: js.Any): `1` | `-1` | `0` = js.native
  
  def copy(obj: js.Any): js.Any = js.native
  
  def getAdditionalFeatures(framework: IOpenAPIFramework, logger: Logger, docs: js.Any*): js.Array[_] = js.native
  
  def getBasePathsFromServers(servers: js.Array[ServerObject]): js.Array[default] = js.native
  
  def getMethodDoc(operationHandler: js.Any): js.Any = js.native
  
  def getSecurityDefinitionByPath(openapiPath: js.Any, pathSecurity: js.Any): js.Any = js.native
  
  def handleFilePath(filePath: js.Any): js.Any = js.native
  
  def handleYaml(apiDoc: js.Any): js.Any = js.native
  
  def injectDependencies(handlers: js.Any, dependencies: js.Any): js.Any = js.native
  
  def isDynamicRoute(route: js.Any): Boolean = js.native
  
  def resolveParameterRefs(framework: IOpenAPIFramework, parameters: js.Any, apiDoc: js.Any): js.Any = js.native
  
  def resolveRequestBodyRefs(framework: IOpenAPIFramework, requestBody: js.Any, apiDoc: js.Any): js.Any = js.native
  
  def resolveResponseRefs(framework: IOpenAPIFramework, responses: js.Any, apiDoc: js.Any, route: js.Any): js.Object = js.native
  
  def sortApiDocTags(apiDoc: js.Any): Unit = js.native
  
  def sortOperationDocTags(operationDoc: js.Any): Unit = js.native
  
  def toAbsolutePath(part: js.Any): js.Any = js.native
  
  def withNoDuplicates(arr: js.Any): js.Array[_] = js.native
  
  @js.native
  object METHOD_ALIASES extends js.Object {
    
    var DELETE: String = js.native
    
    var GET: String = js.native
    
    var HEAD: String = js.native
    
    var OPTIONS: String = js.native
    
    var PATCH: String = js.native
    
    var POST: String = js.native
    
    var PUT: String = js.native
    
    var del: String = js.native
    
    var delete: String = js.native
    
    var get: String = js.native
    
    var head: String = js.native
    
    var options: String = js.native
    
    var patch: String = js.native
    
    var post: String = js.native
    
    var put: String = js.native
  }
}
