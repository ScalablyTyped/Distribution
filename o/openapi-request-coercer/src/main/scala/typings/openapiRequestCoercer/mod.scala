package typings.openapiRequestCoercer

import typings.openapiTypes.mod.OpenAPI.Parameters
import typings.openapiTypes.mod.OpenAPI.Request
import typings.openapiTypes.mod.OpenAPIV2.Parameter
import typings.openapiTypes.mod.OpenAPIV3.ParameterObject
import typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
import typings.tsLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-request-coercer", JSImport.Default)
  @js.native
  class default protected () extends OpenAPIRequestCoercer {
    def this(args: OpenAPIRequestCoercerArgs) = this()
  }
  
  @js.native
  trait CoercionStrategy extends StObject {
    
    var boolean: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
    
    var integer: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
    
    var number: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
  }
  object CoercionStrategy {
    
    @scala.inline
    def apply(): CoercionStrategy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoercionStrategy]
    }
    
    @scala.inline
    implicit class CoercionStrategyMutableBuilder[Self <: CoercionStrategy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: /* input */ js.Any => _): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setInteger(value: /* input */ js.Any => _): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
      
      @scala.inline
      def setNumber(value: /* input */ js.Any => _): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  @js.native
  trait IOpenAPIRequestCoercer extends StObject {
    
    def coerce(request: Request): Unit = js.native
  }
  object IOpenAPIRequestCoercer {
    
    @scala.inline
    def apply(coerce: Request => Unit): IOpenAPIRequestCoercer = {
      val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
      __obj.asInstanceOf[IOpenAPIRequestCoercer]
    }
    
    @scala.inline
    implicit class IOpenAPIRequestCoercerMutableBuilder[Self <: IOpenAPIRequestCoercer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoerce(value: Request => Unit): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OpenAPIRequestCoercer extends IOpenAPIRequestCoercer {
    
    def coerce(request: js.Any): Unit = js.native
    
    var coerceFormData: js.Any = js.native
    
    var coerceHeaders: js.Any = js.native
    
    var coerceParams: js.Any = js.native
    
    var coerceQuery: js.Any = js.native
  }
  object OpenAPIRequestCoercer {
    
    @scala.inline
    def apply(
      coerce: js.Any => Unit,
      coerceFormData: js.Any,
      coerceHeaders: js.Any,
      coerceParams: js.Any,
      coerceQuery: js.Any
    ): OpenAPIRequestCoercer = {
      val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), coerceFormData = coerceFormData.asInstanceOf[js.Any], coerceHeaders = coerceHeaders.asInstanceOf[js.Any], coerceParams = coerceParams.asInstanceOf[js.Any], coerceQuery = coerceQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIRequestCoercer]
    }
    
    @scala.inline
    implicit class OpenAPIRequestCoercerMutableBuilder[Self <: OpenAPIRequestCoercer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoerce(value: js.Any => Unit): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoerceFormData(value: js.Any): Self = StObject.set(x, "coerceFormData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoerceHeaders(value: js.Any): Self = StObject.set(x, "coerceHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoerceParams(value: js.Any): Self = StObject.set(x, "coerceParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoerceQuery(value: js.Any): Self = StObject.set(x, "coerceQuery", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenAPIRequestCoercerArgs extends StObject {
    
    var coercionStrategy: js.UndefOr[CoercionStrategy] = js.native
    
    var enableObjectCoercion: js.UndefOr[Boolean] = js.native
    
    var extensionBase: js.UndefOr[String] = js.native
    
    var logger: js.UndefOr[Logger] = js.native
    
    var loggingKey: js.UndefOr[String] = js.native
    
    var parameters: Parameters = js.native
  }
  object OpenAPIRequestCoercerArgs {
    
    @scala.inline
    def apply(parameters: Parameters): OpenAPIRequestCoercerArgs = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIRequestCoercerArgs]
    }
    
    @scala.inline
    implicit class OpenAPIRequestCoercerArgsMutableBuilder[Self <: OpenAPIRequestCoercerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoercionStrategy(value: CoercionStrategy): Self = StObject.set(x, "coercionStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoercionStrategyUndefined: Self = StObject.set(x, "coercionStrategy", js.undefined)
      
      @scala.inline
      def setEnableObjectCoercion(value: Boolean): Self = StObject.set(x, "enableObjectCoercion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableObjectCoercionUndefined: Self = StObject.set(x, "enableObjectCoercion", js.undefined)
      
      @scala.inline
      def setExtensionBase(value: String): Self = StObject.set(x, "extensionBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionBaseUndefined: Self = StObject.set(x, "extensionBase", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingKeyUndefined: Self = StObject.set(x, "loggingKey", js.undefined)
      
      @scala.inline
      def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersVarargs(
        value: (Parameter | ParameterObject | ReferenceObject | typings.openapiTypes.mod.OpenAPIV2.ReferenceObject)*
      ): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
}
