package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllDocsMeta extends StObject {
  
  var _attachments: js.UndefOr[Attachments] = js.native
  
  /** Only present if `conflicts` is `true` */
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.native
}
object AllDocsMeta {
  
  @scala.inline
  def apply(): AllDocsMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllDocsMeta]
  }
  
  @scala.inline
  implicit class AllDocsMetaMutableBuilder[Self <: AllDocsMeta] (val x: Self) extends AnyVal {
    
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
  }
}
