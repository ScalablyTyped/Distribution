package typings.octokitTypes

import typings.octokitTypes.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRequestErrorMod {
  
  trait RequestError extends StObject {
    
    var documentation_url: String
    
    var errors: js.UndefOr[js.Array[Code]] = js.undefined
    
    var name: String
    
    var status: Double
  }
  object RequestError {
    
    inline def apply(documentation_url: String, name: String, status: Double): RequestError = {
      val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestError]
    }
    
    extension [Self <: RequestError](x: Self) {
      
      inline def setDocumentation_url(value: String): Self = StObject.set(x, "documentation_url", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[Code]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: Code*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
