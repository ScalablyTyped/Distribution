package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesMeta extends StObject {
  
  var _attachments: js.UndefOr[Attachments] = js.native
  
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.native
  
  var _deleted: js.UndefOr[Boolean] = js.native
}
object ChangesMeta {
  
  @scala.inline
  def apply(): ChangesMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangesMeta]
  }
  
  @scala.inline
  implicit class ChangesMetaMutableBuilder[Self <: ChangesMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_attachments(value: Attachments): Self = StObject.set(x, "_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_attachmentsUndefined: Self = StObject.set(x, "_attachments", js.undefined)
    
    @scala.inline
    def set_conflicts(value: js.Array[RevisionId]): Self = StObject.set(x, "_conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_conflictsUndefined: Self = StObject.set(x, "_conflicts", js.undefined)
    
    @scala.inline
    def set_conflictsVarargs(value: RevisionId*): Self = StObject.set(x, "_conflicts", js.Array(value :_*))
    
    @scala.inline
    def set_deleted(value: Boolean): Self = StObject.set(x, "_deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_deletedUndefined: Self = StObject.set(x, "_deleted", js.undefined)
  }
}
