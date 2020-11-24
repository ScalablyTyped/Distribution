package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends js.Object {
  
  def add(name: String, handler: js.Function0[Unit]): Unit = js.native
  
  def get(name: String): js.Function0[Unit] = js.native
  
  def invoke(name: String, args: js.Any): Unit = js.native
  
  def list(): js.Array[Id] = js.native
  
  def remove(name: String): Unit = js.native
}
object Actions {
  
  @scala.inline
  def apply(
    add: (String, js.Function0[Unit]) => Unit,
    get: String => js.Function0[Unit],
    invoke: (String, js.Any) => Unit,
    list: () => js.Array[Id],
    remove: String => Unit
  ): Actions = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), invoke = js.Any.fromFunction2(invoke), list = js.Any.fromFunction0(list), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (String, js.Function0[Unit]) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: String => js.Function0[Unit]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvoke(value: (String, js.Any) => Unit): Self = this.set("invoke", js.Any.fromFunction2(value))
    
    @scala.inline
    def setList(value: () => js.Array[Id]): Self = this.set("list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
