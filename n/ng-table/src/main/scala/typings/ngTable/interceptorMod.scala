package typings.ngTable

import typings.ngTable.ngTableParamsMod.NgTableParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorMod {
  
  @js.native
  trait IInterceptor[T] extends StObject {
    
    var response: js.UndefOr[js.Function2[/* data */ js.Any, /* params */ NgTableParams[T], _]] = js.native
    
    var responseError: js.UndefOr[js.Function2[/* reason */ js.Any, /* params */ NgTableParams[T], _]] = js.native
  }
  object IInterceptor {
    
    @scala.inline
    def apply[T](): IInterceptor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInterceptor[T]]
    }
    
    @scala.inline
    implicit class IInterceptorMutableBuilder[Self <: IInterceptor[_], T] (val x: Self with IInterceptor[T]) extends AnyVal {
      
      @scala.inline
      def setResponse(value: (/* data */ js.Any, /* params */ NgTableParams[T]) => _): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResponseError(value: (/* reason */ js.Any, /* params */ NgTableParams[T]) => _): Self = StObject.set(x, "responseError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
