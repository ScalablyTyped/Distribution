package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Revision[Content /* <: js.Object */] extends js.Object {
  
  var ok: Document[Content] with RevisionIdMeta = js.native
}
object Revision {
  
  @scala.inline
  def apply[Content /* <: js.Object */](ok: Document[Content] with RevisionIdMeta): Revision[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision[Content]]
  }
  
  @scala.inline
  implicit class RevisionOps[Self <: Revision[_], Content /* <: js.Object */] (val x: Self with Revision[Content]) extends AnyVal {
    
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
    def setOk(value: Document[Content] with RevisionIdMeta): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
}
