package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Ids
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMeta extends js.Object {
  
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
  implicit class GetMetaOps[Self <: GetMeta] (val x: Self) extends AnyVal {
    
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
    def set_rev(value: RevisionId): Self = this.set("_rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_attachments(value: Attachments): Self = this.set("_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_attachments: Self = this.set("_attachments", js.undefined)
    
    @scala.inline
    def set_conflictsVarargs(value: RevisionId*): Self = this.set("_conflicts", js.Array(value :_*))
    
    @scala.inline
    def set_conflicts(value: js.Array[RevisionId]): Self = this.set("_conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_conflicts: Self = this.set("_conflicts", js.undefined)
    
    @scala.inline
    def set_revisions(value: Ids): Self = this.set("_revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_revisions: Self = this.set("_revisions", js.undefined)
    
    @scala.inline
    def set_revs_infoVarargs(value: RevisionInfo*): Self = this.set("_revs_info", js.Array(value :_*))
    
    @scala.inline
    def set_revs_info(value: js.Array[RevisionInfo]): Self = this.set("_revs_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_revs_info: Self = this.set("_revs_info", js.undefined)
  }
}
