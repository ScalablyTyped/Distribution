package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextKey[T] extends js.Object {
  
  def get(): js.UndefOr[T] = js.native
  
  def reset(): Unit = js.native
  
  def set(value: T): Unit = js.native
}
object IContextKey {
  
  @scala.inline
  def apply[T](get: () => js.UndefOr[T], reset: () => Unit, set: T => Unit): IContextKey[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IContextKey[T]]
  }
  
  @scala.inline
  implicit class IContextKeyOps[Self <: IContextKey[_], T] (val x: Self with IContextKey[T]) extends AnyVal {
    
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
    def setGet(value: () => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: T => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
