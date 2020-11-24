package typings.pouchdbLiveFind.PouchDB.LiveFind

import typings.pouchdbLiveFind.pouchdbLiveFindStrings.ADD
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.REMOVE
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEvent extends js.Object {
  
  var action: REMOVE | ADD | UPDATE = js.native
  
  var doc: js.Any = js.native
  
  var id: js.Any = js.native
  
  var rev: js.Any = js.native
}
object UpdateEvent {
  
  @scala.inline
  def apply(action: REMOVE | ADD | UPDATE, doc: js.Any, id: js.Any, rev: js.Any): UpdateEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvent]
  }
  
  @scala.inline
  implicit class UpdateEventOps[Self <: UpdateEvent] (val x: Self) extends AnyVal {
    
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
    def setAction(value: REMOVE | ADD | UPDATE): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc(value: js.Any): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: js.Any): Self = this.set("rev", value.asInstanceOf[js.Any])
  }
}
