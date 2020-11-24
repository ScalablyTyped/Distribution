package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rev extends js.Object {
  
  var id: String = js.native
  
  var rev: js.UndefOr[RevisionId] = js.native
}
object Rev {
  
  @scala.inline
  def apply(id: String): Rev = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
  
  @scala.inline
  implicit class RevOps[Self <: Rev] (val x: Self) extends AnyVal {
    
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
    def setRev(value: RevisionId): Self = this.set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRev: Self = this.set("rev", js.undefined)
  }
}
