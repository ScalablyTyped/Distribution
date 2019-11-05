package typings.openapiDashFramework.openapiDashFrameworkMod

import typings.openapiDashFramework.distSrcTypesMod.IOpenAPIFramework
import typings.openapiDashFramework.distSrcTypesMod.OpenAPIFrameworkConstructorArgs
import typings.openapiDashFramework.distSrcTypesMod.OpenAPIFrameworkVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFramework extends IOpenAPIFramework {
  val apiDoc: js.Any
  var args: OpenAPIFrameworkConstructorArgs
  val basePaths: js.Array[typings.openapiDashFramework.distSrcBasePathMod.default]
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
    basePaths: js.Array[typings.openapiDashFramework.distSrcBasePathMod.default],
    customFormats: js.Any,
    dependencies: js.Any,
    enableObjectCoercion: js.Any,
    errorTransformer: js.Any,
    externalSchemas: js.Any,
    featureType: js.Any,
    initialize: OpenAPIFrameworkVisitor => Unit,
    logger: js.Any,
    loggingPrefix: js.Any,
    name: js.Any,
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
    val __obj = js.Dynamic.literal(apiDoc = apiDoc, args = args, basePaths = basePaths, customFormats = customFormats, dependencies = dependencies, enableObjectCoercion = enableObjectCoercion, errorTransformer = errorTransformer, externalSchemas = externalSchemas, featureType = featureType, initialize = js.Any.fromFunction1(initialize), logger = logger, loggingPrefix = loggingPrefix, name = name, operations = operations, originalApiDoc = originalApiDoc, pathSecurity = pathSecurity, paths = paths, pathsIgnore = pathsIgnore, routesGlob = routesGlob, routesIndexFileRegExp = routesIndexFileRegExp, securityHandlers = securityHandlers, validateApiDoc = validateApiDoc, validator = validator)
  
    __obj.asInstanceOf[OpenAPIFramework]
  }
}

