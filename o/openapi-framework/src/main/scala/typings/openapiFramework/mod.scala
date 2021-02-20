package typings.openapiFramework

import typings.openapiFramework.typesMod.IOpenAPIFramework
import typings.openapiFramework.typesMod.OpenAPIFrameworkConstructorArgs
import typings.openapiFramework.typesMod.OpenAPIFrameworkVisitor
import typings.openapiTypes.mod.OpenAPIV3.ServerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-framework", JSImport.Default)
  @js.native
  class default () extends OpenAPIFramework {
    def this(args: OpenAPIFrameworkConstructorArgs) = this()
  }
  
  @JSImport("openapi-framework", "BasePath")
  @js.native
  class BasePath protected ()
    extends typings.openapiFramework.basePathMod.default {
    def this(server: ServerObject) = this()
  }
  
  @js.native
  trait OpenAPIFramework extends IOpenAPIFramework {
    
    val apiDoc: js.Any = js.native
    
    var args: OpenAPIFrameworkConstructorArgs = js.native
    
    val basePaths: js.Array[typings.openapiFramework.basePathMod.default] = js.native
    
    var customFormats: js.Any = js.native
    
    var customKeywords: js.Any = js.native
    
    var dependencies: js.Any = js.native
    
    var enableObjectCoercion: js.Any = js.native
    
    var errorTransformer: js.Any = js.native
    
    var externalSchemas: js.Any = js.native
    
    def initialize(visitor: OpenAPIFrameworkVisitor): Unit = js.native
    
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
  }
  object OpenAPIFramework {
    
    @scala.inline
    def apply(
      apiDoc: js.Any,
      args: OpenAPIFrameworkConstructorArgs,
      basePaths: js.Array[typings.openapiFramework.basePathMod.default],
      customFormats: js.Any,
      customKeywords: js.Any,
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
      val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], customFormats = customFormats.asInstanceOf[js.Any], customKeywords = customKeywords.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], enableObjectCoercion = enableObjectCoercion.asInstanceOf[js.Any], errorTransformer = errorTransformer.asInstanceOf[js.Any], externalSchemas = externalSchemas.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), logger = logger.asInstanceOf[js.Any], loggingPrefix = loggingPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], originalApiDoc = originalApiDoc.asInstanceOf[js.Any], pathSecurity = pathSecurity.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], pathsIgnore = pathsIgnore.asInstanceOf[js.Any], routesGlob = routesGlob.asInstanceOf[js.Any], routesIndexFileRegExp = routesIndexFileRegExp.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any], validateApiDoc = validateApiDoc.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIFramework]
    }
    
    @scala.inline
    implicit class OpenAPIFrameworkMutableBuilder[Self <: OpenAPIFramework] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiDoc(value: js.Any): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgs(value: OpenAPIFrameworkConstructorArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePaths(value: js.Array[typings.openapiFramework.basePathMod.default]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathsVarargs(value: typings.openapiFramework.basePathMod.default*): Self = StObject.set(x, "basePaths", js.Array(value :_*))
      
      @scala.inline
      def setCustomFormats(value: js.Any): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomKeywords(value: js.Any): Self = StObject.set(x, "customKeywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependencies(value: js.Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableObjectCoercion(value: js.Any): Self = StObject.set(x, "enableObjectCoercion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTransformer(value: js.Any): Self = StObject.set(x, "errorTransformer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalSchemas(value: js.Any): Self = StObject.set(x, "externalSchemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialize(value: OpenAPIFrameworkVisitor => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperations(value: js.Any): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalApiDoc(value: js.Any): Self = StObject.set(x, "originalApiDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSecurity(value: js.Any): Self = StObject.set(x, "pathSecurity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaths(value: js.Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsIgnore(value: js.Any): Self = StObject.set(x, "pathsIgnore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesGlob(value: js.Any): Self = StObject.set(x, "routesGlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesIndexFileRegExp(value: js.Any): Self = StObject.set(x, "routesIndexFileRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityHandlers(value: js.Any): Self = StObject.set(x, "securityHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateApiDoc(value: js.Any): Self = StObject.set(x, "validateApiDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(value: js.Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
