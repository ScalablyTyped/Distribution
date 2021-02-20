package typings.mobx

import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptUtilsMod {
  
  @JSImport("mobx/lib/types/intercept-utils", "hasInterceptors")
  @js.native
  def hasInterceptors(interceptable: IInterceptable[_]): Boolean = js.native
  
  @JSImport("mobx/lib/types/intercept-utils", "interceptChange")
  @js.native
  def interceptChange[T](interceptable: IInterceptable[T | Null]): T | Null = js.native
  @JSImport("mobx/lib/types/intercept-utils", "interceptChange")
  @js.native
  def interceptChange[T](interceptable: IInterceptable[T | Null], change: T): T | Null = js.native
  
  @JSImport("mobx/lib/types/intercept-utils", "registerInterceptor")
  @js.native
  def registerInterceptor[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = js.native
  
  @js.native
  trait IInterceptable[T] extends StObject {
    
    def intercept(handler: IInterceptor[T]): Lambda = js.native
    
    var interceptors: js.UndefOr[js.Array[IInterceptor[T]]] = js.native
  }
  object IInterceptable {
    
    @scala.inline
    def apply[T](intercept: IInterceptor[T] => Lambda): IInterceptable[T] = {
      val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction1(intercept))
      __obj.asInstanceOf[IInterceptable[T]]
    }
    
    @scala.inline
    implicit class IInterceptableMutableBuilder[Self <: IInterceptable[_], T] (val x: Self with IInterceptable[T]) extends AnyVal {
      
      @scala.inline
      def setIntercept(value: IInterceptor[T] => Lambda): Self = StObject.set(x, "intercept", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInterceptors(value: js.Array[IInterceptor[T]]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
      
      @scala.inline
      def setInterceptorsVarargs(value: IInterceptor[T]*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
    }
  }
  
  type IInterceptor[T] = js.Function1[/* change */ T, T | Null]
}
