package typings.mobx

import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptUtilsMod {
  
  @JSImport("mobx/lib/types/intercept-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasInterceptors(interceptable: IInterceptable[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInterceptors")(interceptable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def interceptChange[T](interceptable: IInterceptable[T | Null]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptChange")(interceptable.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  inline def interceptChange[T](interceptable: IInterceptable[T | Null], change: T): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptChange")(interceptable.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def registerInterceptor[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInterceptor")(interceptable.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  trait IInterceptable[T] extends StObject {
    
    def intercept(handler: IInterceptor[T]): Lambda
    
    var interceptors: js.UndefOr[js.Array[IInterceptor[T]]] = js.undefined
  }
  object IInterceptable {
    
    inline def apply[T](intercept: IInterceptor[T] => Lambda): IInterceptable[T] = {
      val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction1(intercept))
      __obj.asInstanceOf[IInterceptable[T]]
    }
    
    extension [Self <: IInterceptable[?], T](x: Self & IInterceptable[T]) {
      
      inline def setIntercept(value: IInterceptor[T] => Lambda): Self = StObject.set(x, "intercept", js.Any.fromFunction1(value))
      
      inline def setInterceptors(value: js.Array[IInterceptor[T]]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      inline def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
      
      inline def setInterceptorsVarargs(value: IInterceptor[T]*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
    }
  }
  
  type IInterceptor[T] = js.Function1[/* change */ T, T | Null]
}
