package typings.memfs.volumeLocalstorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStore extends js.Object {
  
  def getItem(key: String): js.Any = js.native
  
  def removeItem(key: String): js.Any = js.native
  
  def setItem(key: String, json: js.Any): js.Any = js.native
}
object IStore {
  
  @scala.inline
  def apply(getItem: String => js.Any, removeItem: String => js.Any, setItem: (String, js.Any) => js.Any): IStore = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[IStore]
  }
  
  @scala.inline
  implicit class IStoreOps[Self <: IStore] (val x: Self) extends AnyVal {
    
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
    def setGetItem(value: String => js.Any): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItem(value: String => js.Any): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, js.Any) => js.Any): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
}
