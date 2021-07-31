package typings.openapiFramework

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.mod.KeywordDefinition
import typings.openapiFramework.anon.Coercer
import typings.openapiFramework.basePathMod.default
import typings.openapiSecurityHandler.mod.SecurityHandlers
import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPIV2.Document
import typings.std.RegExp
import typings.tsLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("openapi-framework/dist/src/types", "ConsoleDebugAdapterLogger")
  @js.native
  class ConsoleDebugAdapterLogger ()
    extends StObject
       with Logger
  
  trait IOpenAPIFramework extends StObject {
    
    var featureType: String
    
    var loggingPrefix: String
    
    var name: String
  }
  object IOpenAPIFramework {
    
    @scala.inline
    def apply(featureType: String, loggingPrefix: String, name: String): IOpenAPIFramework = {
      val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any], loggingPrefix = loggingPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOpenAPIFramework]
    }
    
    @scala.inline
    implicit class IOpenAPIFrameworkMutableBuilder[Self <: IOpenAPIFramework] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingPrefix(value: String): Self = StObject.set(x, "loggingPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type OpenAPIErrorTransformer = js.Function2[/* has0 */ js.Object, /* has1 */ js.Object, js.Object]
  
  trait OpenAPIFrameworkAPIContext extends StObject {
    
    var basePaths: js.Array[default]
    
    def getApiDoc(): js.Any
  }
  object OpenAPIFrameworkAPIContext {
    
    @scala.inline
    def apply(basePaths: js.Array[default], getApiDoc: () => js.Any): OpenAPIFrameworkAPIContext = {
      val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc))
      __obj.asInstanceOf[OpenAPIFrameworkAPIContext]
    }
    
    @scala.inline
    implicit class OpenAPIFrameworkAPIContextMutableBuilder[Self <: OpenAPIFrameworkAPIContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePaths(value: js.Array[default]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathsVarargs(value: default*): Self = StObject.set(x, "basePaths", js.Array(value :_*))
      
      @scala.inline
      def setGetApiDoc(value: () => js.Any): Self = StObject.set(x, "getApiDoc", js.Any.fromFunction0(value))
    }
  }
  
  trait OpenAPIFrameworkArgs extends StObject {
    
    var apiDoc: Document | typings.openapiTypes.mod.OpenAPIV3.Document | String
    
    var customFormats: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, Boolean]]] = js.undefined
    
    var customKeywords: js.UndefOr[StringDictionary[KeywordDefinition]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var enableObjectCoercion: js.UndefOr[Boolean] = js.undefined
    
    var errorTransformer: js.UndefOr[OpenAPIErrorTransformer] = js.undefined
    
    var externalSchemas: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var operations: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]] = js.undefined
    
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
    def apply(apiDoc: Document | typings.openapiTypes.mod.OpenAPIV3.Document | String): OpenAPIFrameworkArgs = {
      val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIFrameworkArgs]
    }
    
    @scala.inline
    implicit class OpenAPIFrameworkArgsMutableBuilder[Self <: OpenAPIFrameworkArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiDoc(value: Document | typings.openapiTypes.mod.OpenAPIV3.Document | String): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFormats(value: StringDictionary[js.Function1[/* arg */ js.Any, Boolean]]): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFormatsUndefined: Self = StObject.set(x, "customFormats", js.undefined)
      
      @scala.inline
      def setCustomKeywords(value: StringDictionary[KeywordDefinition]): Self = StObject.set(x, "customKeywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomKeywordsUndefined: Self = StObject.set(x, "customKeywords", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[js.Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setEnableObjectCoercion(value: Boolean): Self = StObject.set(x, "enableObjectCoercion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableObjectCoercionUndefined: Self = StObject.set(x, "enableObjectCoercion", js.undefined)
      
      @scala.inline
      def setErrorTransformer(value: (/* has0 */ js.Object, /* has1 */ js.Object) => js.Object): Self = StObject.set(x, "errorTransformer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorTransformerUndefined: Self = StObject.set(x, "errorTransformer", js.undefined)
      
      @scala.inline
      def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "externalSchemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalSchemasUndefined: Self = StObject.set(x, "externalSchemas", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setOperations(value: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      @scala.inline
      def setPathSecurity(value: js.Array[PathSecurityTuple]): Self = StObject.set(x, "pathSecurity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSecurityUndefined: Self = StObject.set(x, "pathSecurity", js.undefined)
      
      @scala.inline
      def setPathSecurityVarargs(value: PathSecurityTuple*): Self = StObject.set(x, "pathSecurity", js.Array(value :_*))
      
      @scala.inline
      def setPaths(value: String | js.Array[OpenAPIFrameworkPathObject]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsIgnore(value: RegExp): Self = StObject.set(x, "pathsIgnore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsIgnoreUndefined: Self = StObject.set(x, "pathsIgnore", js.undefined)
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: OpenAPIFrameworkPathObject*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setRoutesGlob(value: String): Self = StObject.set(x, "routesGlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesGlobUndefined: Self = StObject.set(x, "routesGlob", js.undefined)
      
      @scala.inline
      def setRoutesIndexFileRegExp(value: RegExp): Self = StObject.set(x, "routesIndexFileRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesIndexFileRegExpUndefined: Self = StObject.set(x, "routesIndexFileRegExp", js.undefined)
      
      @scala.inline
      def setSecurityHandlers(value: SecurityHandlers): Self = StObject.set(x, "securityHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityHandlersUndefined: Self = StObject.set(x, "securityHandlers", js.undefined)
      
      @scala.inline
      def setValidateApiDoc(value: Boolean): Self = StObject.set(x, "validateApiDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateApiDocUndefined: Self = StObject.set(x, "validateApiDoc", js.undefined)
    }
  }
  
  trait OpenAPIFrameworkConstructorArgs
    extends StObject
       with OpenAPIFrameworkArgs {
    
    var featureType: String
    
    var name: String
  }
  object OpenAPIFrameworkConstructorArgs {
    
    @scala.inline
    def apply(
      apiDoc: Document | typings.openapiTypes.mod.OpenAPIV3.Document | String,
      featureType: String,
      name: String
    ): OpenAPIFrameworkConstructorArgs = {
      val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIFrameworkConstructorArgs]
    }
    
    @scala.inline
    implicit class OpenAPIFrameworkConstructorArgsMutableBuilder[Self <: OpenAPIFrameworkConstructorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIFrameworkOperationContext extends StObject {
    
    var additionalFeatures: js.Array[js.Any]
    
    var allowsFeatures: Boolean
    
    var apiDoc: js.Any
    
    var basePaths: js.Array[default]
    
    var consumes: js.Array[String]
    
    var features: Coercer
    
    var methodName: String
    
    var methodParameters: js.Array[js.Any]
    
    var operationDoc: js.Any
    
    var operationHandler: js.Any
    
    var path: String
  }
  object OpenAPIFrameworkOperationContext {
    
    @scala.inline
    def apply(
      additionalFeatures: js.Array[js.Any],
      allowsFeatures: Boolean,
      apiDoc: js.Any,
      basePaths: js.Array[default],
      consumes: js.Array[String],
      features: Coercer,
      methodName: String,
      methodParameters: js.Array[js.Any],
      operationDoc: js.Any,
      operationHandler: js.Any,
      path: String
    ): OpenAPIFrameworkOperationContext = {
      val __obj = js.Dynamic.literal(additionalFeatures = additionalFeatures.asInstanceOf[js.Any], allowsFeatures = allowsFeatures.asInstanceOf[js.Any], apiDoc = apiDoc.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], consumes = consumes.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], methodParameters = methodParameters.asInstanceOf[js.Any], operationDoc = operationDoc.asInstanceOf[js.Any], operationHandler = operationHandler.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIFrameworkOperationContext]
    }
    
    @scala.inline
    implicit class OpenAPIFrameworkOperationContextMutableBuilder[Self <: OpenAPIFrameworkOperationContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalFeatures(value: js.Array[js.Any]): Self = StObject.set(x, "additionalFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalFeaturesVarargs(value: js.Any*): Self = StObject.set(x, "additionalFeatures", js.Array(value :_*))
      
      @scala.inline
      def setAllowsFeatures(value: Boolean): Self = StObject.set(x, "allowsFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiDoc(value: js.Any): Self = StObject.set(x, "apiDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePaths(value: js.Array[default]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathsVarargs(value: default*): Self = StObject.set(x, "basePaths", js.Array(value :_*))
      
      @scala.inline
      def setConsumes(value: js.Array[String]): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value :_*))
      
      @scala.inline
      def setFeatures(value: Coercer): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodParameters(value: js.Array[js.Any]): Self = StObject.set(x, "methodParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodParametersVarargs(value: js.Any*): Self = StObject.set(x, "methodParameters", js.Array(value :_*))
      
      @scala.inline
      def setOperationDoc(value: js.Any): Self = StObject.set(x, "operationDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationHandler(value: js.Any): Self = StObject.set(x, "operationHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIFrameworkPathContext extends StObject {
    
    var basePaths: js.Array[default]
    
    def getApiDoc(): js.Any
    
    def getPathDoc(): js.Any
  }
  object OpenAPIFrameworkPathContext {
    
    @scala.inline
    def apply(basePaths: js.Array[default], getApiDoc: () => js.Any, getPathDoc: () => js.Any): OpenAPIFrameworkPathContext = {
      val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc), getPathDoc = js.Any.fromFunction0(getPathDoc))
      __obj.asInstanceOf[OpenAPIFrameworkPathContext]
    }
    
    @scala.inline
    implicit class OpenAPIFrameworkPathContextMutableBuilder[Self <: OpenAPIFrameworkPathContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePaths(value: js.Array[default]): Self = StObject.set(x, "basePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathsVarargs(value: default*): Self = StObject.set(x, "basePaths", js.Array(value :_*))
      
      @scala.inline
      def setGetApiDoc(value: () => js.Any): Self = StObject.set(x, "getApiDoc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPathDoc(value: () => js.Any): Self = StObject.set(x, "getPathDoc", js.Any.fromFunction0(value))
    }
  }
  
  trait OpenAPIFrameworkPathObject extends StObject {
    
    var module: js.UndefOr[js.Any] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object OpenAPIFrameworkPathObject {
    
    @scala.inline
    def apply(): OpenAPIFrameworkPathObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenAPIFrameworkPathObject]
    }
    
    @scala.inline
    implicit class OpenAPIFrameworkPathObjectMutableBuilder[Self <: OpenAPIFrameworkPathObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule(value: js.Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait OpenAPIFrameworkVisitor extends StObject {
    
    var visitApi: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkAPIContext, Unit]] = js.undefined
    
    var visitOperation: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkOperationContext, Unit]] = js.undefined
    
    var visitPath: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkPathContext, Unit]] = js.undefined
  }
  object OpenAPIFrameworkVisitor {
    
    @scala.inline
    def apply(): OpenAPIFrameworkVisitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenAPIFrameworkVisitor]
    }
    
    @scala.inline
    implicit class OpenAPIFrameworkVisitorMutableBuilder[Self <: OpenAPIFrameworkVisitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisitApi(value: /* context */ OpenAPIFrameworkAPIContext => Unit): Self = StObject.set(x, "visitApi", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitApiUndefined: Self = StObject.set(x, "visitApi", js.undefined)
      
      @scala.inline
      def setVisitOperation(value: /* context */ OpenAPIFrameworkOperationContext => Unit): Self = StObject.set(x, "visitOperation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitOperationUndefined: Self = StObject.set(x, "visitOperation", js.undefined)
      
      @scala.inline
      def setVisitPath(value: /* context */ OpenAPIFrameworkPathContext => Unit): Self = StObject.set(x, "visitPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitPathUndefined: Self = StObject.set(x, "visitPath", js.undefined)
    }
  }
  
  type PathSecurityTuple = js.Tuple2[RegExp, js.Array[SecurityRequirement]]
  
  type SecurityRequirement = StringDictionary[js.Array[SecurityScope]]
  
  type SecurityScope = String
}
