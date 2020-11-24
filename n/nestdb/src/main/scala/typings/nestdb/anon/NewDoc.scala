package typings.nestdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewDoc[T /* <: G */, G] extends js.Object {
  
  var newDoc: T = js.native
  
  var oldDoc: T = js.native
}
object NewDoc {
  
  @scala.inline
  def apply[T /* <: G */, G](newDoc: T, oldDoc: T): NewDoc[T, G] = {
    val __obj = js.Dynamic.literal(newDoc = newDoc.asInstanceOf[js.Any], oldDoc = oldDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDoc[T, G]]
  }
  
  @scala.inline
  implicit class NewDocOps[Self <: NewDoc[_, _], T /* <: G */, G] (val x: Self with (NewDoc[T, G])) extends AnyVal {
    
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
    def setNewDoc(value: T): Self = this.set("newDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldDoc(value: T): Self = this.set("oldDoc", value.asInstanceOf[js.Any])
  }
}
