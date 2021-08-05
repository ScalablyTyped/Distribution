package typings.openapiRequestCoercer

import typings.openapiTypes.mod.OpenAPI.Parameters
import typings.openapiTypes.mod.OpenAPI.Request
import typings.openapiTypes.mod.OpenAPIV2.Parameter
import typings.openapiTypes.mod.OpenAPIV3.ParameterObject
import typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
import typings.tsLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-request-coercer", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with OpenAPIRequestCoercer {
    def this(args: OpenAPIRequestCoercerArgs) = this()
    
    /* CompleteClass */
    override def coerce(request: js.Any): Unit = js.native
    /* CompleteClass */
    override def coerce(request: Request): Unit = js.native
    
    /* private */ /* CompleteClass */
    var coerceFormData: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var coerceHeaders: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var coerceParams: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var coerceQuery: js.Any = js.native
  }
  
  trait CoercionStrategy extends StObject {
    
    var boolean: js.UndefOr[js.Function1[/* input */ js.Any, js.Any]] = js.undefined
    
    var integer: js.UndefOr[js.Function1[/* input */ js.Any, js.Any]] = js.undefined
    
    var number: js.UndefOr[js.Function1[/* input */ js.Any, js.Any]] = js.undefined
  }
  object CoercionStrategy {
    
    inline def apply(): CoercionStrategy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoercionStrategy]
    }
    
    extension [Self <: CoercionStrategy](x: Self) {
      
      inline def setBoolean(value: /* input */ js.Any => js.Any): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setInteger(value: /* input */ js.Any => js.Any): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
      
      inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
      
      inline def setNumber(value: /* input */ js.Any => js.Any): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
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
    
    extension [Self <: IOpenAPIRequestCoercer](x: Self) {
      
      inline def setCoerce(value: Request => Unit): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenAPIRequestCoercer
    extends StObject
       with IOpenAPIRequestCoercer {
    
    def coerce(request: js.Any): Unit
    
    /* private */ var coerceFormData: js.Any
    
    /* private */ var coerceHeaders: js.Any
    
    /* private */ var coerceParams: js.Any
    
    /* private */ var coerceQuery: js.Any
  }
  object OpenAPIRequestCoercer {
    
    inline def apply(
      coerce: js.Any => Unit,
      coerceFormData: js.Any,
      coerceHeaders: js.Any,
      coerceParams: js.Any,
      coerceQuery: js.Any
    ): OpenAPIRequestCoercer = {
      val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), coerceFormData = coerceFormData.asInstanceOf[js.Any], coerceHeaders = coerceHeaders.asInstanceOf[js.Any], coerceParams = coerceParams.asInstanceOf[js.Any], coerceQuery = coerceQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIRequestCoercer]
    }
    
    extension [Self <: OpenAPIRequestCoercer](x: Self) {
      
      inline def setCoerce(value: js.Any => Unit): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
      
      inline def setCoerceFormData(value: js.Any): Self = StObject.set(x, "coerceFormData", value.asInstanceOf[js.Any])
      
      inline def setCoerceHeaders(value: js.Any): Self = StObject.set(x, "coerceHeaders", value.asInstanceOf[js.Any])
      
      inline def setCoerceParams(value: js.Any): Self = StObject.set(x, "coerceParams", value.asInstanceOf[js.Any])
      
      inline def setCoerceQuery(value: js.Any): Self = StObject.set(x, "coerceQuery", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIRequestCoercerArgs extends StObject {
    
    var coercionStrategy: js.UndefOr[CoercionStrategy] = js.undefined
    
    var enableObjectCoercion: js.UndefOr[Boolean] = js.undefined
    
    var extensionBase: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var loggingKey: js.UndefOr[String] = js.undefined
    
    var parameters: Parameters
  }
  object OpenAPIRequestCoercerArgs {
    
    inline def apply(parameters: Parameters): OpenAPIRequestCoercerArgs = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIRequestCoercerArgs]
    }
    
    extension [Self <: OpenAPIRequestCoercerArgs](x: Self) {
      
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
        value: (Parameter | ParameterObject | ReferenceObject | typings.openapiTypes.mod.OpenAPIV2.ReferenceObject)*
      ): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
}
