package typings.openapiRequestCoercer

import typings.openapiTypes.mod.OpenAPI.Parameters
import typings.openapiTypes.mod.OpenAPI.Request
import typings.openapiTypes.mod.OpenAPIV2.Parameter
import typings.openapiTypes.mod.OpenAPIV3.RequestBodyObject
import typings.openapiTypes.mod.OpenAPIV31.ParameterObject
import typings.openapiTypes.mod.OpenAPIV31.ReferenceObject
import typings.tsLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-request-coercer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OpenAPIRequestCoercer {
    def this(args: OpenAPIRequestCoercerArgs) = this()
    
    /* CompleteClass */
    override def coerce(request: Any): Unit = js.native
    /* CompleteClass */
    override def coerce(request: Request): Unit = js.native
    
    /* private */ /* CompleteClass */
    var coerceFormData: Any = js.native
    
    /* private */ /* CompleteClass */
    var coerceHeaders: Any = js.native
    
    /* private */ /* CompleteClass */
    var coerceParams: Any = js.native
    
    /* private */ /* CompleteClass */
    var coerceQuery: Any = js.native
  }
  
  trait CoercionStrategy extends StObject {
    
    var boolean: js.UndefOr[js.Function1[/* input */ Any, Any]] = js.undefined
    
    var integer: js.UndefOr[js.Function1[/* input */ Any, Any]] = js.undefined
    
    var number: js.UndefOr[js.Function1[/* input */ Any, Any]] = js.undefined
  }
  object CoercionStrategy {
    
    inline def apply(): CoercionStrategy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoercionStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoercionStrategy] (val x: Self) extends AnyVal {
      
      inline def setBoolean(value: /* input */ Any => Any): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setInteger(value: /* input */ Any => Any): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
      
      inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
      
      inline def setNumber(value: /* input */ Any => Any): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  trait IOpenAPIRequestCoercer extends StObject {
    
    def coerce(request: Request): Unit
  }
  object IOpenAPIRequestCoercer {
    
    inline def apply(coerce: Request => Unit): IOpenAPIRequestCoercer = {
      val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
      __obj.asInstanceOf[IOpenAPIRequestCoercer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOpenAPIRequestCoercer] (val x: Self) extends AnyVal {
      
      inline def setCoerce(value: Request => Unit): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenAPIRequestCoercer
    extends StObject
       with IOpenAPIRequestCoercer {
    
    def coerce(request: Any): Unit
    
    /* private */ var coerceFormData: Any
    
    /* private */ var coerceHeaders: Any
    
    /* private */ var coerceParams: Any
    
    /* private */ var coerceQuery: Any
  }
  object OpenAPIRequestCoercer {
    
    inline def apply(coerce: Any => Unit, coerceFormData: Any, coerceHeaders: Any, coerceParams: Any, coerceQuery: Any): OpenAPIRequestCoercer = {
      val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), coerceFormData = coerceFormData.asInstanceOf[js.Any], coerceHeaders = coerceHeaders.asInstanceOf[js.Any], coerceParams = coerceParams.asInstanceOf[js.Any], coerceQuery = coerceQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIRequestCoercer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenAPIRequestCoercer] (val x: Self) extends AnyVal {
      
      inline def setCoerce(value: Any => Unit): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
      
      inline def setCoerceFormData(value: Any): Self = StObject.set(x, "coerceFormData", value.asInstanceOf[js.Any])
      
      inline def setCoerceHeaders(value: Any): Self = StObject.set(x, "coerceHeaders", value.asInstanceOf[js.Any])
      
      inline def setCoerceParams(value: Any): Self = StObject.set(x, "coerceParams", value.asInstanceOf[js.Any])
      
      inline def setCoerceQuery(value: Any): Self = StObject.set(x, "coerceQuery", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIRequestCoercerArgs extends StObject {
    
    var coercionStrategy: js.UndefOr[CoercionStrategy] = js.undefined
    
    var enableObjectCoercion: js.UndefOr[Boolean] = js.undefined
    
    var extensionBase: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var loggingKey: js.UndefOr[String] = js.undefined
    
    var parameters: Parameters
    
    var requestBody: js.UndefOr[RequestBodyObject] = js.undefined
  }
  object OpenAPIRequestCoercerArgs {
    
    inline def apply(parameters: Parameters): OpenAPIRequestCoercerArgs = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIRequestCoercerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenAPIRequestCoercerArgs] (val x: Self) extends AnyVal {
      
      inline def setCoercionStrategy(value: CoercionStrategy): Self = StObject.set(x, "coercionStrategy", value.asInstanceOf[js.Any])
      
      inline def setCoercionStrategyUndefined: Self = StObject.set(x, "coercionStrategy", js.undefined)
      
      inline def setEnableObjectCoercion(value: Boolean): Self = StObject.set(x, "enableObjectCoercion", value.asInstanceOf[js.Any])
      
      inline def setEnableObjectCoercionUndefined: Self = StObject.set(x, "enableObjectCoercion", js.undefined)
      
      inline def setExtensionBase(value: String): Self = StObject.set(x, "extensionBase", value.asInstanceOf[js.Any])
      
      inline def setExtensionBaseUndefined: Self = StObject.set(x, "extensionBase", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      inline def setLoggingKeyUndefined: Self = StObject.set(x, "loggingKey", js.undefined)
      
      inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(
        value: (Parameter | ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject | ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV2.ReferenceObject)*
      ): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setRequestBody(value: RequestBodyObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    }
  }
}
