package typings.nano.anon

import typings.nano.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id[V, D] extends js.Object {
  
  var doc: js.UndefOr[D with Document] = js.native
  
  var id: String = js.native
  
  var key: String = js.native
  
  var value: V = js.native
}
object Id {
  
  @scala.inline
  def apply[V, D](id: String, key: String, value: V): Id[V, D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[V, D]]
  }
  
  @scala.inline
  implicit class IdOps[Self <: Id[_, _], V, D] (val x: Self with (Id[V, D])) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc(value: D with Document): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
  }
}
