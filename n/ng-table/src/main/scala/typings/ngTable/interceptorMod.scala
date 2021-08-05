package typings.ngTable

import typings.ngTable.ngTableParamsMod.NgTableParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorMod {
  
  trait IInterceptor[T] extends StObject {
    
    var response: js.UndefOr[js.Function2[/* data */ js.Any, /* params */ NgTableParams[T], js.Any]] = js.undefined
    
    var responseError: js.UndefOr[js.Function2[/* reason */ js.Any, /* params */ NgTableParams[T], js.Any]] = js.undefined
  }
  object IInterceptor {
    
    inline def apply[T](): IInterceptor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInterceptor[T]]
    }
    
    extension [Self <: IInterceptor[?], T](x: Self & IInterceptor[T]) {
      
      inline def setResponse(value: (/* data */ js.Any, /* params */ NgTableParams[T]) => js.Any): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
      
      inline def setResponseError(value: (/* reason */ js.Any, /* params */ NgTableParams[T]) => js.Any): Self = StObject.set(x, "responseError", js.Any.fromFunction2(value))
      
      inline def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
