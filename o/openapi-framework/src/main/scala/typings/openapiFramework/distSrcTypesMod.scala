package typings.openapiFramework

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.distTypesMod.KeywordDefinition
import typings.openapiFramework.anon.Coercer
import typings.openapiFramework.anon.DefaultSetter
import typings.openapiFramework.distSrcBasePathMod.default
import typings.openapiSecurityHandler.mod.SecurityHandlers
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPIV2.Document
import typings.tsLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  @JSImport("openapi-framework/dist/src/types", "ConsoleDebugAdapterLogger")
  @js.native
  open class ConsoleDebugAdapterLogger ()
    extends StObject
       with Logger
  
  trait IOpenAPIFramework extends StObject {
    
    var featureType: String
    
    var loggingPrefix: String
    
    var name: String
  }
  object IOpenAPIFramework {
    
    inline def apply(featureType: String, loggingPrefix: String, name: String): IOpenAPIFramework = {
      val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any], loggingPrefix = loggingPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOpenAPIFramework]
    }
    
    extension [Self <: IOpenAPIFramework](x: Self) {
      
      inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      inline def setLoggingPrefix(value: String): Self = StObject.set(x, "loggingPrefix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type OpenAPIErrorTransformer = js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, js.Object]
  
  trait OpenAPIFrameworkAPIContext extends StObject {
    
    var basePaths: js.Array[default]
    
    def getApiDoc(): Any
  }
  object OpenAPIFrameworkAPIContext {
    
    inline def apply(basePaths: js.Array[default], getApiDoc: () => Any): OpenAPIFrameworkAPIContext = {
      val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc))
      __obj.asInstanceOf[OpenAPIFrameworkAPIContext]
    }
    
    extension [Self <: OpenAPIFrameworkAPIContext](x: Self) {
      
      inline def setBasePaths(value: js.Array[default]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
      
      inline def setBasePathsVarargs(value: default*): Self = StObject.set(x, "basePaths", js.Array(value*))
      
      inline def setGetApiDoc(value: () => Any): Self = StObject.set(x, "getApiDoc", js.Any.fromFunction0(value))
    }
  }
  
  trait OpenAPIFrameworkArgs extends StObject {
    
    var apiDoc: Document[js.Object] | typings.openapiTypes.mod.OpenAPIV3.Document[js.Object] | String
    
    var customFormats: js.UndefOr[StringDictionary[js.Function1[/* arg */ Any, Boolean]]] = js.undefined
    
    var customKeywords: js.UndefOr[StringDictionary[KeywordDefinition]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var enableObjectCoercion: js.UndefOr[Boolean] = js.undefined
    
    var errorTransformer: js.UndefOr[OpenAPIErrorTransformer] = js.undefined
    
    var externalSchemas: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
    
    var features: js.UndefOr[Coercer] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var operations: js.UndefOr[
        StringDictionary[
          (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.Function1[/* repeated */ Any, Any]])
        ]
      ] = js.undefined
    
    var pathSecurity: js.UndefOr[js.Array[PathSecurityTuple]] = js.undefined
    
    var paths: js.UndefOr[String | js.Array[OpenAPIFrameworkPathObject]] = js.undefined
    
    var pathsIgnore: js.UndefOr[js.RegExp] = js.undefined
    
    var routesGlob: js.UndefOr[String] = js.undefined
    
    var routesIndexFileRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    var securityHandlers: js.UndefOr[SecurityHandlers] = js.undefined
    
    var validateApiDoc: js.UndefOr[Boolean] = js.undefined
  }
  object OpenAPIFrameworkArgs {
    
    inline def apply(apiDoc: Document[js.Object] | typings.openapiTypes.mod.OpenAPIV3.Document[js.Object] | String): OpenAPIFrameworkArgs = {
      val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIFrameworkArgs]
    }
    
    extension [Self <: OpenAPIFrameworkArgs](x: Self) {
      
      inline def setApiDoc(value: Document[js.Object] | typings.openapiTypes.mod.OpenAPIV3.Document[js.Object] | String): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      inline def setCustomFormats(value: StringDictionary[js.Function1[/* arg */ Any, Boolean]]): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
      
      inline def setCustomFormatsUndefined: Self = StObject.set(x, "customFormats", js.undefined)
      
      inline def setCustomKeywords(value: StringDictionary[KeywordDefinition]): Self = StObject.set(x, "customKeywords", value.asInstanceOf[js.Any])
      
      inline def setCustomKeywordsUndefined: Self = StObject.set(x, "customKeywords", js.undefined)
      
      inline def setDependencies(value: StringDictionary[Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setEnableObjectCoercion(value: Boolean): Self = StObject.set(x, "enableObjectCoercion", value.asInstanceOf[js.Any])
      
      inline def setEnableObjectCoercionUndefined: Self = StObject.set(x, "enableObjectCoercion", js.undefined)
      
      inline def setErrorTransformer(value: (/* param0 */ js.Object, /* param1 */ js.Object) => js.Object): Self = StObject.set(x, "errorTransformer", js.Any.fromFunction2(value))
      
      inline def setErrorTransformerUndefined: Self = StObject.set(x, "errorTransformer", js.undefined)
      
      inline def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "externalSchemas", value.asInstanceOf[js.Any])
      
      inline def setExternalSchemasUndefined: Self = StObject.set(x, "externalSchemas", js.undefined)
      
      inline def setFeatures(value: Coercer): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOperations(
        value: StringDictionary[
              (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.Function1[/* repeated */ Any, Any]])
            ]
      ): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setPathSecurity(value: js.Array[PathSecurityTuple]): Self = StObject.set(x, "pathSecurity", value.asInstanceOf[js.Any])
      
      inline def setPathSecurityUndefined: Self = StObject.set(x, "pathSecurity", js.undefined)
      
      inline def setPathSecurityVarargs(value: PathSecurityTuple*): Self = StObject.set(x, "pathSecurity", js.Array(value*))
      
      inline def setPaths(value: String | js.Array[OpenAPIFrameworkPathObject]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsIgnore(value: js.RegExp): Self = StObject.set(x, "pathsIgnore", value.asInstanceOf[js.Any])
      
      inline def setPathsIgnoreUndefined: Self = StObject.set(x, "pathsIgnore", js.undefined)
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: OpenAPIFrameworkPathObject*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRoutesGlob(value: String): Self = StObject.set(x, "routesGlob", value.asInstanceOf[js.Any])
      
      inline def setRoutesGlobUndefined: Self = StObject.set(x, "routesGlob", js.undefined)
      
      inline def setRoutesIndexFileRegExp(value: js.RegExp): Self = StObject.set(x, "routesIndexFileRegExp", value.asInstanceOf[js.Any])
      
      inline def setRoutesIndexFileRegExpUndefined: Self = StObject.set(x, "routesIndexFileRegExp", js.undefined)
      
      inline def setSecurityHandlers(value: SecurityHandlers): Self = StObject.set(x, "securityHandlers", value.asInstanceOf[js.Any])
      
      inline def setSecurityHandlersUndefined: Self = StObject.set(x, "securityHandlers", js.undefined)
      
      inline def setValidateApiDoc(value: Boolean): Self = StObject.set(x, "validateApiDoc", value.asInstanceOf[js.Any])
      
      inline def setValidateApiDocUndefined: Self = StObject.set(x, "validateApiDoc", js.undefined)
    }
  }
  
  trait OpenAPIFrameworkConstructorArgs
    extends StObject
       with OpenAPIFrameworkArgs {
    
    var featureType: String
    
    var name: String
  }
  object OpenAPIFrameworkConstructorArgs {
    
    inline def apply(
      apiDoc: Document[js.Object] | typings.openapiTypes.mod.OpenAPIV3.Document[js.Object] | String,
      featureType: String,
      name: String
    ): OpenAPIFrameworkConstructorArgs = {
      val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIFrameworkConstructorArgs]
    }
    
    extension [Self <: OpenAPIFrameworkConstructorArgs](x: Self) {
      
      inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIFrameworkOperationContext extends StObject {
    
    var additionalFeatures: js.Array[Any]
    
    var allowsFeatures: Boolean
    
    var apiDoc: Any
    
    var basePaths: js.Array[default]
    
    var consumes: js.Array[String]
    
    var features: DefaultSetter
    
    var methodName: String
    
    var methodParameters: js.Array[Any]
    
    var operationDoc: Any
    
    var operationHandler: Any
    
    var path: String
  }
  object OpenAPIFrameworkOperationContext {
    
    inline def apply(
      additionalFeatures: js.Array[Any],
      allowsFeatures: Boolean,
      apiDoc: Any,
      basePaths: js.Array[default],
      consumes: js.Array[String],
      features: DefaultSetter,
      methodName: String,
      methodParameters: js.Array[Any],
      operationDoc: Any,
      operationHandler: Any,
      path: String
    ): OpenAPIFrameworkOperationContext = {
      val __obj = js.Dynamic.literal(additionalFeatures = additionalFeatures.asInstanceOf[js.Any], allowsFeatures = allowsFeatures.asInstanceOf[js.Any], apiDoc = apiDoc.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], consumes = consumes.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], methodParameters = methodParameters.asInstanceOf[js.Any], operationDoc = operationDoc.asInstanceOf[js.Any], operationHandler = operationHandler.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIFrameworkOperationContext]
    }
    
    extension [Self <: OpenAPIFrameworkOperationContext](x: Self) {
      
      inline def setAdditionalFeatures(value: js.Array[Any]): Self = StObject.set(x, "additionalFeatures", value.asInstanceOf[js.Any])
      
      inline def setAdditionalFeaturesVarargs(value: Any*): Self = StObject.set(x, "additionalFeatures", js.Array(value*))
      
      inline def setAllowsFeatures(value: Boolean): Self = StObject.set(x, "allowsFeatures", value.asInstanceOf[js.Any])
      
      inline def setApiDoc(value: Any): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      inline def setBasePaths(value: js.Array[default]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
      
      inline def setBasePathsVarargs(value: default*): Self = StObject.set(x, "basePaths", js.Array(value*))
      
      inline def setConsumes(value: js.Array[String]): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
      
      inline def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value*))
      
      inline def setFeatures(value: DefaultSetter): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setMethodParameters(value: js.Array[Any]): Self = StObject.set(x, "methodParameters", value.asInstanceOf[js.Any])
      
      inline def setMethodParametersVarargs(value: Any*): Self = StObject.set(x, "methodParameters", js.Array(value*))
      
      inline def setOperationDoc(value: Any): Self = StObject.set(x, "operationDoc", value.asInstanceOf[js.Any])
      
      inline def setOperationHandler(value: Any): Self = StObject.set(x, "operationHandler", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIFrameworkPathContext extends StObject {
    
    var basePaths: js.Array[default]
    
    def getApiDoc(): Any
    
    def getPathDoc(): Any
  }
  object OpenAPIFrameworkPathContext {
    
    inline def apply(basePaths: js.Array[default], getApiDoc: () => Any, getPathDoc: () => Any): OpenAPIFrameworkPathContext = {
      val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc), getPathDoc = js.Any.fromFunction0(getPathDoc))
      __obj.asInstanceOf[OpenAPIFrameworkPathContext]
    }
    
    extension [Self <: OpenAPIFrameworkPathContext](x: Self) {
      
      inline def setBasePaths(value: js.Array[default]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
      
      inline def setBasePathsVarargs(value: default*): Self = StObject.set(x, "basePaths", js.Array(value*))
      
      inline def setGetApiDoc(value: () => Any): Self = StObject.set(x, "getApiDoc", js.Any.fromFunction0(value))
      
      inline def setGetPathDoc(value: () => Any): Self = StObject.set(x, "getPathDoc", js.Any.fromFunction0(value))
    }
  }
  
  trait OpenAPIFrameworkPathObject extends StObject {
    
    var module: js.UndefOr[Any] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object OpenAPIFrameworkPathObject {
    
    inline def apply(): OpenAPIFrameworkPathObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenAPIFrameworkPathObject]
    }
    
    extension [Self <: OpenAPIFrameworkPathObject](x: Self) {
      
      inline def setModule(value: Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait OpenAPIFrameworkVisitor extends StObject {
    
    var visitApi: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkAPIContext, Unit]] = js.undefined
    
    var visitOperation: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkOperationContext, Unit]] = js.undefined
    
    var visitPath: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkPathContext, Unit]] = js.undefined
  }
  object OpenAPIFrameworkVisitor {
    
    inline def apply(): OpenAPIFrameworkVisitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenAPIFrameworkVisitor]
    }
    
    extension [Self <: OpenAPIFrameworkVisitor](x: Self) {
      
      inline def setVisitApi(value: /* context */ OpenAPIFrameworkAPIContext => Unit): Self = StObject.set(x, "visitApi", js.Any.fromFunction1(value))
      
      inline def setVisitApiUndefined: Self = StObject.set(x, "visitApi", js.undefined)
      
      inline def setVisitOperation(value: /* context */ OpenAPIFrameworkOperationContext => Unit): Self = StObject.set(x, "visitOperation", js.Any.fromFunction1(value))
      
      inline def setVisitOperationUndefined: Self = StObject.set(x, "visitOperation", js.undefined)
      
      inline def setVisitPath(value: /* context */ OpenAPIFrameworkPathContext => Unit): Self = StObject.set(x, "visitPath", js.Any.fromFunction1(value))
      
      inline def setVisitPathUndefined: Self = StObject.set(x, "visitPath", js.undefined)
    }
  }
  
  type PathSecurityTuple = js.Tuple2[js.RegExp, js.Array[SecurityRequirement]]
  
  type SecurityRequirement = StringDictionary[js.Array[SecurityScope]]
  
  type SecurityScope = String
}
