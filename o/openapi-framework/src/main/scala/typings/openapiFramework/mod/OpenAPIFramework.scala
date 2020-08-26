package typings.openapiFramework.mod

import typings.openapiFramework.typesMod.IOpenAPIFramework
import typings.openapiFramework.typesMod.OpenAPIFrameworkConstructorArgs
import typings.openapiFramework.typesMod.OpenAPIFrameworkVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFramework extends IOpenAPIFramework {
  val apiDoc: js.Any = js.native
  var args: OpenAPIFrameworkConstructorArgs = js.native
  val basePaths: js.Array[typings.openapiFramework.basePathMod.default] = js.native
  var customFormats: js.Any = js.native
  var dependencies: js.Any = js.native
  var enableObjectCoercion: js.Any = js.native
  var errorTransformer: js.Any = js.native
  var externalSchemas: js.Any = js.native
  var logger: js.Any = js.native
  var operations: js.Any = js.native
  var originalApiDoc: js.Any = js.native
  var pathSecurity: js.Any = js.native
  var paths: js.Any = js.native
  var pathsIgnore: js.Any = js.native
  var routesGlob: js.Any = js.native
  var routesIndexFileRegExp: js.Any = js.native
  var securityHandlers: js.Any = js.native
  var validateApiDoc: js.Any = js.native
  var validator: js.Any = js.native
  def initialize(visitor: OpenAPIFrameworkVisitor): Unit = js.native
}

object OpenAPIFramework {
  @scala.inline
  def apply(
    apiDoc: js.Any,
    args: OpenAPIFrameworkConstructorArgs,
    basePaths: js.Array[typings.openapiFramework.basePathMod.default],
    customFormats: js.Any,
    dependencies: js.Any,
    enableObjectCoercion: js.Any,
    errorTransformer: js.Any,
    externalSchemas: js.Any,
    featureType: String,
    initialize: OpenAPIFrameworkVisitor => Unit,
    logger: js.Any,
    loggingPrefix: String,
    name: String,
    operations: js.Any,
    originalApiDoc: js.Any,
    pathSecurity: js.Any,
    paths: js.Any,
    pathsIgnore: js.Any,
    routesGlob: js.Any,
    routesIndexFileRegExp: js.Any,
    securityHandlers: js.Any,
    validateApiDoc: js.Any,
    validator: js.Any
  ): OpenAPIFramework = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], customFormats = customFormats.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], enableObjectCoercion = enableObjectCoercion.asInstanceOf[js.Any], errorTransformer = errorTransformer.asInstanceOf[js.Any], externalSchemas = externalSchemas.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), logger = logger.asInstanceOf[js.Any], loggingPrefix = loggingPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], originalApiDoc = originalApiDoc.asInstanceOf[js.Any], pathSecurity = pathSecurity.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], pathsIgnore = pathsIgnore.asInstanceOf[js.Any], routesGlob = routesGlob.asInstanceOf[js.Any], routesIndexFileRegExp = routesIndexFileRegExp.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any], validateApiDoc = validateApiDoc.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFramework]
  }
  @scala.inline
  implicit class OpenAPIFrameworkOps[Self <: OpenAPIFramework] (val x: Self) extends AnyVal {
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
    def setApiDoc(value: js.Any): Self = this.set("apiDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: OpenAPIFrameworkConstructorArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePathsVarargs(value: typings.openapiFramework.basePathMod.default*): Self = this.set("basePaths", js.Array(value :_*))
    @scala.inline
    def setBasePaths(value: js.Array[typings.openapiFramework.basePathMod.default]): Self = this.set("basePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomFormats(value: js.Any): Self = this.set("customFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencies(value: js.Any): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableObjectCoercion(value: js.Any): Self = this.set("enableObjectCoercion", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorTransformer(value: js.Any): Self = this.set("errorTransformer", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalSchemas(value: js.Any): Self = this.set("externalSchemas", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialize(value: OpenAPIFrameworkVisitor => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperations(value: js.Any): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalApiDoc(value: js.Any): Self = this.set("originalApiDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSecurity(value: js.Any): Self = this.set("pathSecurity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaths(value: js.Any): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathsIgnore(value: js.Any): Self = this.set("pathsIgnore", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesGlob(value: js.Any): Self = this.set("routesGlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesIndexFileRegExp(value: js.Any): Self = this.set("routesIndexFileRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityHandlers(value: js.Any): Self = this.set("securityHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateApiDoc(value: js.Any): Self = this.set("validateApiDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidator(value: js.Any): Self = this.set("validator", value.asInstanceOf[js.Any])
  }
  
}

