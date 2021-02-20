package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Ids
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMeta extends StObject {
  
  /** Attachments where index is attachmentId */
  var _attachments: js.UndefOr[Attachments] = js.native
  
  /**
    * Conflicting leaf revisions.
    *
    * Only present if `GetOptions.conflicts` is `true`
    */
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.native
  
  var _rev: RevisionId = js.native
  
  /** Only present if `GetOptions.revs_info` is `true` */
  var _revisions: js.UndefOr[Ids] = js.native
  
  /** Only present if `GetOptions.revs` is `true` */
  var _revs_info: js.UndefOr[js.Array[RevisionInfo]] = js.native
}
object GetMeta {
  
  @scala.inline
  def apply(_rev: RevisionId): GetMeta = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeta]
  }
  
  @scala.inline
  implicit class GetMetaMutableBuilder[Self <: GetMeta] (val x: Self) extends AnyVal {
    
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
    def set_rev(value: RevisionId): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_revisions(value: Ids): Self = StObject.set(x, "_revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_revisionsUndefined: Self = StObject.set(x, "_revisions", js.undefined)
    
    @scala.inline
    def set_revs_info(value: js.Array[RevisionInfo]): Self = StObject.set(x, "_revs_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_revs_infoUndefined: Self = StObject.set(x, "_revs_info", js.undefined)
    
    @scala.inline
    def set_revs_infoVarargs(value: RevisionInfo*): Self = StObject.set(x, "_revs_info", js.Array(value :_*))
  }
}
