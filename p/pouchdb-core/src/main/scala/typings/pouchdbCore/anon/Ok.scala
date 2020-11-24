package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.GetMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ok[Content /* <: js.Object */] extends js.Object {
  
  var ok: Content with GetMeta = js.native
}
object Ok {
  
  @scala.inline
  def apply[Content /* <: js.Object */](ok: Content with GetMeta): Ok[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok[Content]]
  }
  
  @scala.inline
  implicit class OkOps[Self <: Ok[_], Content /* <: js.Object */] (val x: Self with Ok[Content]) extends AnyVal {
    
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
    def setOk(value: Content with GetMeta): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
}
