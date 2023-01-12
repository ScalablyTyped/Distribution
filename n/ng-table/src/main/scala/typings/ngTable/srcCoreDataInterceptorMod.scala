package typings.ngTable

import typings.ngTable.srcCoreNgTableParamsMod.NgTableParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreDataInterceptorMod {
  
  trait IInterceptor[T] extends StObject {
    
    var response: js.UndefOr[js.Function2[/* data */ Any, /* params */ NgTableParams[T], Any]] = js.undefined
    
    var responseError: js.UndefOr[js.Function2[/* reason */ Any, /* params */ NgTableParams[T], Any]] = js.undefined
  }
  object IInterceptor {
    
    inline def apply[T](): IInterceptor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInterceptor[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInterceptor[?], T] (val x: Self & IInterceptor[T]) extends AnyVal {
      
      inline def setResponse(value: (/* data */ Any, /* params */ NgTableParams[T]) => Any): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
      
      inline def setResponseError(value: (/* reason */ Any, /* params */ NgTableParams[T]) => Any): Self = StObject.set(x, "responseError", js.Any.fromFunction2(value))
      
      inline def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
