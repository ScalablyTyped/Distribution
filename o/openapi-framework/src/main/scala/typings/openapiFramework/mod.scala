package typings.openapiFramework

import typings.openapiFramework.typesMod.IOpenAPIFramework
import typings.openapiFramework.typesMod.OpenAPIFrameworkConstructorArgs
import typings.openapiFramework.typesMod.OpenAPIFrameworkVisitor
import typings.openapiTypes.mod.OpenAPIV3.ServerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-framework", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OpenAPIFramework {
    def this(args: OpenAPIFrameworkConstructorArgs) = this()
    
    /* CompleteClass */
    override val apiDoc: Any = js.native
    
    /* protected */ /* CompleteClass */
    var args: OpenAPIFrameworkConstructorArgs = js.native
    
    /* CompleteClass */
    override val basePaths: js.Array[typings.openapiFramework.basePathMod.default] = js.native
    
    /* private */ /* CompleteClass */
    var customFormats: Any = js.native
    
    /* private */ /* CompleteClass */
    var customKeywords: Any = js.native
    
    /* private */ /* CompleteClass */
    var dependencies: Any = js.native
    
    /* private */ /* CompleteClass */
    var enableObjectCoercion: Any = js.native
    
    /* private */ /* CompleteClass */
    var errorTransformer: Any = js.native
    
    /* private */ /* CompleteClass */
    var externalSchemas: Any = js.native
    
    /* CompleteClass */
    var featureType: String = js.native
    
    /* private */ /* CompleteClass */
    var features: Any = js.native
    
    /* CompleteClass */
    override def initialize(visitor: OpenAPIFrameworkVisitor): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var logger: Any = js.native
    
    /* CompleteClass */
    var loggingPrefix: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var operations: Any = js.native
    
    /* private */ /* CompleteClass */
    var originalApiDoc: Any = js.native
    
    /* private */ /* CompleteClass */
    var pathSecurity: Any = js.native
    
    /* private */ /* CompleteClass */
    var paths: Any = js.native
    
    /* private */ /* CompleteClass */
    var pathsIgnore: Any = js.native
    
    /* private */ /* CompleteClass */
    var routesGlob: Any = js.native
    
    /* private */ /* CompleteClass */
    var routesIndexFileRegExp: Any = js.native
    
    /* private */ /* CompleteClass */
    var securityHandlers: Any = js.native
    
    /* private */ /* CompleteClass */
    var validateApiDoc: Any = js.native
    
    /* private */ /* CompleteClass */
    var validator: Any = js.native
  }
  
  @JSImport("openapi-framework", "BasePath")
  @js.native
  open class BasePath protected ()
    extends typings.openapiFramework.basePathMod.default {
    def this(server: ServerObject) = this()
  }
  
  trait OpenAPIFramework
    extends StObject
       with IOpenAPIFramework {
    
    val apiDoc: Any
    
    /* protected */ var args: OpenAPIFrameworkConstructorArgs
    
    val basePaths: js.Array[typings.openapiFramework.basePathMod.default]
    
    /* private */ var customFormats: Any
    
    /* private */ var customKeywords: Any
    
    /* private */ var dependencies: Any
    
    /* private */ var enableObjectCoercion: Any
    
    /* private */ var errorTransformer: Any
    
    /* private */ var externalSchemas: Any
    
    /* private */ var features: Any
    
    def initialize(visitor: OpenAPIFrameworkVisitor): js.Promise[Unit]
    
    /* private */ var logger: Any
    
    /* private */ var operations: Any
    
    /* private */ var originalApiDoc: Any
    
    /* private */ var pathSecurity: Any
    
    /* private */ var paths: Any
    
    /* private */ var pathsIgnore: Any
    
    /* private */ var routesGlob: Any
    
    /* private */ var routesIndexFileRegExp: Any
    
    /* private */ var securityHandlers: Any
    
    /* private */ var validateApiDoc: Any
    
    /* private */ var validator: Any
  }
  object OpenAPIFramework {
    
    inline def apply(
      apiDoc: Any,
      args: OpenAPIFrameworkConstructorArgs,
      basePaths: js.Array[typings.openapiFramework.basePathMod.default],
      customFormats: Any,
      customKeywords: Any,
      dependencies: Any,
      enableObjectCoercion: Any,
      errorTransformer: Any,
      externalSchemas: Any,
      featureType: String,
      features: Any,
      initialize: OpenAPIFrameworkVisitor => js.Promise[Unit],
      logger: Any,
      loggingPrefix: String,
      name: String,
      operations: Any,
      originalApiDoc: Any,
      pathSecurity: Any,
      paths: Any,
      pathsIgnore: Any,
      routesGlob: Any,
      routesIndexFileRegExp: Any,
      securityHandlers: Any,
      validateApiDoc: Any,
      validator: Any
    ): OpenAPIFramework = {
      val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], customFormats = customFormats.asInstanceOf[js.Any], customKeywords = customKeywords.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], enableObjectCoercion = enableObjectCoercion.asInstanceOf[js.Any], errorTransformer = errorTransformer.asInstanceOf[js.Any], externalSchemas = externalSchemas.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), logger = logger.asInstanceOf[js.Any], loggingPrefix = loggingPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], originalApiDoc = originalApiDoc.asInstanceOf[js.Any], pathSecurity = pathSecurity.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], pathsIgnore = pathsIgnore.asInstanceOf[js.Any], routesGlob = routesGlob.asInstanceOf[js.Any], routesIndexFileRegExp = routesIndexFileRegExp.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any], validateApiDoc = validateApiDoc.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIFramework]
    }
    
    extension [Self <: OpenAPIFramework](x: Self) {
      
      inline def setApiDoc(value: Any): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: OpenAPIFrameworkConstructorArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setBasePaths(value: js.Array[typings.openapiFramework.basePathMod.default]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
      
      inline def setBasePathsVarargs(value: typings.openapiFramework.basePathMod.default*): Self = StObject.set(x, "basePaths", js.Array(value*))
      
      inline def setCustomFormats(value: Any): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
      
      inline def setCustomKeywords(value: Any): Self = StObject.set(x, "customKeywords", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setEnableObjectCoercion(value: Any): Self = StObject.set(x, "enableObjectCoercion", value.asInstanceOf[js.Any])
      
      inline def setErrorTransformer(value: Any): Self = StObject.set(x, "errorTransformer", value.asInstanceOf[js.Any])
      
      inline def setExternalSchemas(value: Any): Self = StObject.set(x, "externalSchemas", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: Any): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: OpenAPIFrameworkVisitor => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOperations(value: Any): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOriginalApiDoc(value: Any): Self = StObject.set(x, "originalApiDoc", value.asInstanceOf[js.Any])
      
      inline def setPathSecurity(value: Any): Self = StObject.set(x, "pathSecurity", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsIgnore(value: Any): Self = StObject.set(x, "pathsIgnore", value.asInstanceOf[js.Any])
      
      inline def setRoutesGlob(value: Any): Self = StObject.set(x, "routesGlob", value.asInstanceOf[js.Any])
      
      inline def setRoutesIndexFileRegExp(value: Any): Self = StObject.set(x, "routesIndexFileRegExp", value.asInstanceOf[js.Any])
      
      inline def setSecurityHandlers(value: Any): Self = StObject.set(x, "securityHandlers", value.asInstanceOf[js.Any])
      
      inline def setValidateApiDoc(value: Any): Self = StObject.set(x, "validateApiDoc", value.asInstanceOf[js.Any])
      
      inline def setValidator(value: Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
