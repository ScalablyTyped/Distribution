package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends js.Object {
  
  def hide(): Unit = js.native
  
  def init(): Unit = js.native
  
  def search(`val`: String): js.Array[js.Object] = js.native
  
  def show(v: String): Unit = js.native
}
object Search {
  
  @scala.inline
  def apply(hide: () => Unit, init: () => Unit, search: String => js.Array[js.Object], show: String => Unit): Search = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), search = js.Any.fromFunction1(search), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearch(value: String => js.Array[js.Object]): Self = this.set("search", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: String => Unit): Self = this.set("show", js.Any.fromFunction1(value))
  }
}
