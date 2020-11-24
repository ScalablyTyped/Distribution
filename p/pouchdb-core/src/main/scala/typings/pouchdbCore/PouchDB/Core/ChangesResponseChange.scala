package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.RevString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesResponseChange[Content /* <: js.Object */] extends js.Object {
  
  var changes: js.Array[RevString] = js.native
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var doc: js.UndefOr[ExistingDocument[Content with ChangesMeta]] = js.native
  
  var id: String = js.native
  
  var seq: Double | String = js.native
}
object ChangesResponseChange {
  
  @scala.inline
  def apply[Content /* <: js.Object */](changes: js.Array[RevString], id: String, seq: Double | String): ChangesResponseChange[Content] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesResponseChange[Content]]
  }
  
  @scala.inline
  implicit class ChangesResponseChangeOps[Self <: ChangesResponseChange[_], Content /* <: js.Object */] (val x: Self with ChangesResponseChange[Content]) extends AnyVal {
    
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
    def setChangesVarargs(value: RevString*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[RevString]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: Double | String): Self = this.set("seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDoc(value: ExistingDocument[Content with ChangesMeta]): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
  }
}
