package typings.openapiDashFramework.distSrcTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.openapiDashFramework.Anon_String
import typings.openapiDashSecurityDashHandler.openapiDashSecurityDashHandlerMod.SecurityHandlers
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.Document
import typings.std.RegExp
import typings.tsDashLog.tsDashLogMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkArgs extends js.Object {
  var apiDoc: Document | typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.Document | String
  var customFormats: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, Boolean]]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var enableObjectCoercion: js.UndefOr[Boolean] = js.undefined
  var errorTransformer: js.UndefOr[OpenAPIErrorTransformer] = js.undefined
  var externalSchemas: js.UndefOr[Anon_String] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var operations: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.undefined
  var pathSecurity: js.UndefOr[js.Array[PathSecurityTuple]] = js.undefined
  var paths: js.UndefOr[String | js.Array[OpenAPIFrameworkPathObject]] = js.undefined
  var pathsIgnore: js.UndefOr[RegExp] = js.undefined
  var routesGlob: js.UndefOr[String] = js.undefined
  var routesIndexFileRegExp: js.UndefOr[RegExp] = js.undefined
  var securityHandlers: js.UndefOr[SecurityHandlers] = js.undefined
  var validateApiDoc: js.UndefOr[Boolean] = js.undefined
}

object OpenAPIFrameworkArgs {
  @scala.inline
  def apply(
    apiDoc: Document | typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.Document | String,
    customFormats: StringDictionary[js.Function1[/* arg */ js.Any, Boolean]] = null,
    dependencies: StringDictionary[js.Any] = null,
    enableObjectCoercion: js.UndefOr[Boolean] = js.undefined,
    errorTransformer: (/* has0 */ js.Object, /* has1 */ js.Object) => js.Object = null,
    externalSchemas: Anon_String = null,
    logger: Logger = null,
    operations: StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null,
    pathSecurity: js.Array[PathSecurityTuple] = null,
    paths: String | js.Array[OpenAPIFrameworkPathObject] = null,
    pathsIgnore: RegExp = null,
    routesGlob: String = null,
    routesIndexFileRegExp: RegExp = null,
    securityHandlers: SecurityHandlers = null,
    validateApiDoc: js.UndefOr[Boolean] = js.undefined
  ): OpenAPIFrameworkArgs = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any])
    if (customFormats != null) __obj.updateDynamic("customFormats")(customFormats)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (!js.isUndefined(enableObjectCoercion)) __obj.updateDynamic("enableObjectCoercion")(enableObjectCoercion)
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(js.Any.fromFunction2(errorTransformer))
    if (externalSchemas != null) __obj.updateDynamic("externalSchemas")(externalSchemas)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (pathSecurity != null) __obj.updateDynamic("pathSecurity")(pathSecurity)
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (pathsIgnore != null) __obj.updateDynamic("pathsIgnore")(pathsIgnore)
    if (routesGlob != null) __obj.updateDynamic("routesGlob")(routesGlob)
    if (routesIndexFileRegExp != null) __obj.updateDynamic("routesIndexFileRegExp")(routesIndexFileRegExp)
    if (securityHandlers != null) __obj.updateDynamic("securityHandlers")(securityHandlers)
    if (!js.isUndefined(validateApiDoc)) __obj.updateDynamic("validateApiDoc")(validateApiDoc)
    __obj.asInstanceOf[OpenAPIFrameworkArgs]
  }
}

