package typings.openapiFramework.mod

import typings.openapiFramework.typesMod.IOpenAPIFramework
import typings.openapiFramework.typesMod.OpenAPIFrameworkConstructorArgs
import typings.openapiFramework.typesMod.OpenAPIFrameworkVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFramework extends IOpenAPIFramework {
  val apiDoc: js.Any
  var args: OpenAPIFrameworkConstructorArgs
  val basePaths: js.Array[typings.openapiFramework.basePathMod.default]
  var customFormats: js.Any
  var dependencies: js.Any
  var enableObjectCoercion: js.Any
  var errorTransformer: js.Any
  var externalSchemas: js.Any
  var logger: js.Any
  var operations: js.Any
  var originalApiDoc: js.Any
  var pathSecurity: js.Any
  var paths: js.Any
  var pathsIgnore: js.Any
  var routesGlob: js.Any
  var routesIndexFileRegExp: js.Any
  var securityHandlers: js.Any
  var validateApiDoc: js.Any
  var validator: js.Any
  def initialize(visitor: OpenAPIFrameworkVisitor): Unit
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
}

