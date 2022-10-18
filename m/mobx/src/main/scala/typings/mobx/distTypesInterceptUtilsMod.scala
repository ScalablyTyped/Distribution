package typings.mobx

import typings.mobx.distUtilsUtilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInterceptUtilsMod {
  
  @JSImport("mobx/dist/types/intercept-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasInterceptors(interceptable: IInterceptable[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInterceptors")(interceptable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def interceptChange[T](interceptable: IInterceptable[T | Null]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptChange")(interceptable.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  inline def interceptChange[T](interceptable: IInterceptable[T | Null], change: T): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptChange")(interceptable.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def registerInterceptor[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInterceptor")(interceptable.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  trait IInterceptable[T] extends StObject {
    
    var interceptors_ : js.UndefOr[js.Array[IInterceptor[T]]] = js.undefined
  }
  object IInterceptable {
    
    inline def apply[T](): IInterceptable[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInterceptable[T]]
    }
    
    extension [Self <: IInterceptable[?], T](x: Self & IInterceptable[T]) {
      
      inline def setInterceptors_(value: js.Array[IInterceptor[T]]): Self = StObject.set(x, "interceptors_", value.asInstanceOf[js.Any])
      
      inline def setInterceptors_Undefined: Self = StObject.set(x, "interceptors_", js.undefined)
      
      inline def setInterceptors_Varargs(value: IInterceptor[T]*): Self = StObject.set(x, "interceptors_", js.Array(value*))
    }
  }
  
  type IInterceptor[T] = js.Function1[/* change */ T, T | Null]
}
