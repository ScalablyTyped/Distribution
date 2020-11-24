package typings.mobx.interceptUtilsMod

import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInterceptable[T] extends js.Object {
  
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
  implicit class IInterceptableOps[Self <: IInterceptable[_], T] (val x: Self with IInterceptable[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntercept(value: IInterceptor[T] => Lambda): Self = this.set("intercept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInterceptorsVarargs(value: IInterceptor[T]*): Self = this.set("interceptors", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors(value: js.Array[IInterceptor[T]]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptors: Self = this.set("interceptors", js.undefined)
  }
}
