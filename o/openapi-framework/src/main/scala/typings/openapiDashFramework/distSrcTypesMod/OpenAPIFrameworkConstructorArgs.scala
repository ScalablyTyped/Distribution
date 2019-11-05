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

trait OpenAPIFrameworkConstructorArgs extends OpenAPIFrameworkArgs {
  var featureType: String
  var name: String
}

object OpenAPIFrameworkConstructorArgs {
  @scala.inline
  def apply(
    apiDoc: Document | typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.Document | String,
    featureType: String,
    name: String,
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
  ): OpenAPIFrameworkConstructorArgs = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], featureType = featureType, name = name)
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
    __obj.asInstanceOf[OpenAPIFrameworkConstructorArgs]
  }
}

