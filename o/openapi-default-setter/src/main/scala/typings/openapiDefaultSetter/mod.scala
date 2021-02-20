package typings.openapiDefaultSetter

import typings.openapiTypes.mod.OpenAPI.Request
import typings.openapiTypes.mod.OpenAPIV2.ParameterObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-default-setter", JSImport.Default)
  @js.native
  class default protected () extends OpenAPIDefaultSetter {
    def this(args: OpenAPIDefaultSetterArgs) = this()
  }
  
  @js.native
  trait IOpenAPIDefaultSetter extends StObject {
    
    def handle(request: Request): Unit = js.native
  }
  object IOpenAPIDefaultSetter {
    
    @scala.inline
    def apply(handle: Request => Unit): IOpenAPIDefaultSetter = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[IOpenAPIDefaultSetter]
    }
    
    @scala.inline
    implicit class IOpenAPIDefaultSetterMutableBuilder[Self <: IOpenAPIDefaultSetter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: Request => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OpenAPIDefaultSetter extends IOpenAPIDefaultSetter {
    
    var headersDefaults: js.Any = js.native
    
    var queryDefaults: js.Any = js.native
  }
  object OpenAPIDefaultSetter {
    
    @scala.inline
    def apply(handle: Request => Unit, headersDefaults: js.Any, queryDefaults: js.Any): OpenAPIDefaultSetter = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), headersDefaults = headersDefaults.asInstanceOf[js.Any], queryDefaults = queryDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIDefaultSetter]
    }
    
    @scala.inline
    implicit class OpenAPIDefaultSetterMutableBuilder[Self <: OpenAPIDefaultSetter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadersDefaults(value: js.Any): Self = StObject.set(x, "headersDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryDefaults(value: js.Any): Self = StObject.set(x, "queryDefaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenAPIDefaultSetterArgs extends StObject {
    
    var loggingKey: js.UndefOr[String] = js.native
    
    var parameters: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject] = js.native
  }
  object OpenAPIDefaultSetterArgs {
    
    @scala.inline
    def apply(parameters: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject]): OpenAPIDefaultSetterArgs = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIDefaultSetterArgs]
    }
    
    @scala.inline
    implicit class OpenAPIDefaultSetterArgsMutableBuilder[Self <: OpenAPIDefaultSetterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingKeyUndefined: Self = StObject.set(x, "loggingKey", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersVarargs(value: (ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
}
