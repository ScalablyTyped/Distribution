package typings.openapiFramework.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.KeywordDefinition
import typings.openapiSecurityHandler.mod.SecurityHandlers
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPIV2.Document
import typings.std.RegExp
import typings.tsLog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPIFrameworkArgs extends js.Object {
  
  var apiDoc: Document | typings.openapiTypes.mod.OpenAPIV3.Document | String = js.native
  
  var customFormats: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, Boolean]]] = js.native
  
  var customKeywords: js.UndefOr[StringDictionary[KeywordDefinition]] = js.native
  
  var dependencies: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var enableObjectCoercion: js.UndefOr[Boolean] = js.native
  
  var errorTransformer: js.UndefOr[OpenAPIErrorTransformer] = js.native
  
  var externalSchemas: js.UndefOr[StringDictionary[IJsonSchema]] = js.native
  
  var logger: js.UndefOr[Logger] = js.native
  
  var operations: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.native
  
  var pathSecurity: js.UndefOr[js.Array[PathSecurityTuple]] = js.native
  
  var paths: js.UndefOr[String | js.Array[OpenAPIFrameworkPathObject]] = js.native
  
  var pathsIgnore: js.UndefOr[RegExp] = js.native
  
  var routesGlob: js.UndefOr[String] = js.native
  
  var routesIndexFileRegExp: js.UndefOr[RegExp] = js.native
  
  var securityHandlers: js.UndefOr[SecurityHandlers] = js.native
  
  var validateApiDoc: js.UndefOr[Boolean] = js.native
}
object OpenAPIFrameworkArgs {
  
  @scala.inline
  def apply(apiDoc: Document | typings.openapiTypes.mod.OpenAPIV3.Document | String): OpenAPIFrameworkArgs = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFrameworkArgs]
  }
  
  @scala.inline
  implicit class OpenAPIFrameworkArgsOps[Self <: OpenAPIFrameworkArgs] (val x: Self) extends AnyVal {
    
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
    def setApiDoc(value: Document | typings.openapiTypes.mod.OpenAPIV3.Document | String): Self = this.set("apiDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFormats(value: StringDictionary[js.Function1[/* arg */ js.Any, Boolean]]): Self = this.set("customFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFormats: Self = this.set("customFormats", js.undefined)
    
    @scala.inline
    def setCustomKeywords(value: StringDictionary[KeywordDefinition]): Self = this.set("customKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomKeywords: Self = this.set("customKeywords", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[js.Any]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setEnableObjectCoercion(value: Boolean): Self = this.set("enableObjectCoercion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableObjectCoercion: Self = this.set("enableObjectCoercion", js.undefined)
    
    @scala.inline
    def setErrorTransformer(value: (/* has0 */ js.Object, /* has1 */ js.Object) => js.Object): Self = this.set("errorTransformer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteErrorTransformer: Self = this.set("errorTransformer", js.undefined)
    
    @scala.inline
    def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = this.set("externalSchemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalSchemas: Self = this.set("externalSchemas", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setOperations(value: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    
    @scala.inline
    def setPathSecurityVarargs(value: PathSecurityTuple*): Self = this.set("pathSecurity", js.Array(value :_*))
    
    @scala.inline
    def setPathSecurity(value: js.Array[PathSecurityTuple]): Self = this.set("pathSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathSecurity: Self = this.set("pathSecurity", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: OpenAPIFrameworkPathObject*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: String | js.Array[OpenAPIFrameworkPathObject]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setPathsIgnore(value: RegExp): Self = this.set("pathsIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathsIgnore: Self = this.set("pathsIgnore", js.undefined)
    
    @scala.inline
    def setRoutesGlob(value: String): Self = this.set("routesGlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutesGlob: Self = this.set("routesGlob", js.undefined)
    
    @scala.inline
    def setRoutesIndexFileRegExp(value: RegExp): Self = this.set("routesIndexFileRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutesIndexFileRegExp: Self = this.set("routesIndexFileRegExp", js.undefined)
    
    @scala.inline
    def setSecurityHandlers(value: SecurityHandlers): Self = this.set("securityHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityHandlers: Self = this.set("securityHandlers", js.undefined)
    
    @scala.inline
    def setValidateApiDoc(value: Boolean): Self = this.set("validateApiDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateApiDoc: Self = this.set("validateApiDoc", js.undefined)
  }
}
