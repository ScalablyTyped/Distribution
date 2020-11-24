package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
@js.native
trait DocumentGetResponse extends js.Object {
  
  // Attachment’s stubs. Available if document has any attachments.
  var _attachments: js.UndefOr[js.Any] = js.native
  
  // List of conflicted revisions. Available if requested with conflicts=true query parameter.
  var _conflicts: js.UndefOr[js.Array[_]] = js.native
  
  // Deletion flag. Available if document was removed.
  var _deleted: js.UndefOr[Boolean] = js.native
  
  // List of deleted conflicted revisions. Available if requested with deleted_conflicts=true query parameter.
  var _deleted_conflicts: js.UndefOr[js.Array[_]] = js.native
  
  // Document ID.
  var _id: String = js.native
  
  // Document’s update sequence in current database. Available if requested with local_seq=true query parameter.
  var _local_seq: js.UndefOr[String] = js.native
  
  // Revision MVCC token.
  var _rev: String = js.native
  
  // List of local revision tokens without. Available if requested with revs=true query parameter.
  var _revisions: js.UndefOr[js.Any] = js.native
  
  // List of objects with information about local revisions and their status. Available if requested with
  // open_revs query parameter.
  var _revs_info: js.UndefOr[js.Array[_]] = js.native
}
object DocumentGetResponse {
  
  @scala.inline
  def apply(_id: String, _rev: String): DocumentGetResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentGetResponse]
  }
  
  @scala.inline
  implicit class DocumentGetResponseOps[Self <: DocumentGetResponse] (val x: Self) extends AnyVal {
    
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rev(value: String): Self = this.set("_rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_attachments(value: js.Any): Self = this.set("_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_attachments: Self = this.set("_attachments", js.undefined)
    
    @scala.inline
    def set_conflictsVarargs(value: js.Any*): Self = this.set("_conflicts", js.Array(value :_*))
    
    @scala.inline
    def set_conflicts(value: js.Array[_]): Self = this.set("_conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_conflicts: Self = this.set("_conflicts", js.undefined)
    
    @scala.inline
    def set_deleted(value: Boolean): Self = this.set("_deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_deleted: Self = this.set("_deleted", js.undefined)
    
    @scala.inline
    def set_deleted_conflictsVarargs(value: js.Any*): Self = this.set("_deleted_conflicts", js.Array(value :_*))
    
    @scala.inline
    def set_deleted_conflicts(value: js.Array[_]): Self = this.set("_deleted_conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_deleted_conflicts: Self = this.set("_deleted_conflicts", js.undefined)
    
    @scala.inline
    def set_local_seq(value: String): Self = this.set("_local_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_local_seq: Self = this.set("_local_seq", js.undefined)
    
    @scala.inline
    def set_revisions(value: js.Any): Self = this.set("_revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_revisions: Self = this.set("_revisions", js.undefined)
    
    @scala.inline
    def set_revs_infoVarargs(value: js.Any*): Self = this.set("_revs_info", js.Array(value :_*))
    
    @scala.inline
    def set_revs_info(value: js.Array[_]): Self = this.set("_revs_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_revs_info: Self = this.set("_revs_info", js.undefined)
  }
}
