package typings.openapiDefaultSetter

import typings.openapiTypes.mod.OpenAPI.Request
import typings.openapiTypes.mod.OpenAPIV2.ParameterObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-default-setter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OpenAPIDefaultSetter {
    def this(args: OpenAPIDefaultSetterArgs) = this()
    
    /* CompleteClass */
    override def handle(request: Request): Unit = js.native
    
    /* private */ /* CompleteClass */
    var headersDefaults: Any = js.native
    
    /* private */ /* CompleteClass */
    var queryDefaults: Any = js.native
  }
  
  trait IOpenAPIDefaultSetter extends StObject {
    
    def handle(request: Request): Unit
  }
  object IOpenAPIDefaultSetter {
    
    inline def apply(handle: Request => Unit): IOpenAPIDefaultSetter = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[IOpenAPIDefaultSetter]
    }
    
    extension [Self <: IOpenAPIDefaultSetter](x: Self) {
      
      inline def setHandle(value: Request => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenAPIDefaultSetter
    extends StObject
       with IOpenAPIDefaultSetter {
    
    /* private */ var headersDefaults: Any
    
    /* private */ var queryDefaults: Any
  }
  object OpenAPIDefaultSetter {
    
    inline def apply(handle: Request => Unit, headersDefaults: Any, queryDefaults: Any): OpenAPIDefaultSetter = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), headersDefaults = headersDefaults.asInstanceOf[js.Any], queryDefaults = queryDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIDefaultSetter]
    }
    
    extension [Self <: OpenAPIDefaultSetter](x: Self) {
      
      inline def setHeadersDefaults(value: Any): Self = StObject.set(x, "headersDefaults", value.asInstanceOf[js.Any])
      
      inline def setQueryDefaults(value: Any): Self = StObject.set(x, "queryDefaults", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPIDefaultSetterArgs extends StObject {
    
    var loggingKey: js.UndefOr[String] = js.undefined
    
    var parameters: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject]
  }
  object OpenAPIDefaultSetterArgs {
    
    inline def apply(parameters: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject]): OpenAPIDefaultSetterArgs = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIDefaultSetterArgs]
    }
    
    extension [Self <: OpenAPIDefaultSetterArgs](x: Self) {
      
      inline def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      inline def setLoggingKeyUndefined: Self = StObject.set(x, "loggingKey", js.undefined)
      
      inline def setParameters(value: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: (ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject)*): Self = StObject.set(x, "parameters", js.Array(value*))
    }
  }
}
