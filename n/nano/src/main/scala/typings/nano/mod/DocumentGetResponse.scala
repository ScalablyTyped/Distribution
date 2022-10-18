package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document get response: 
  * @see docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid} */
trait DocumentGetResponse extends StObject {
  
  /** Attachment’s stubs. Available if document has any attachments. */
  var _attachments: js.UndefOr[Any] = js.undefined
  
  /** List of conflicted revisions. Available if requested with conflicts=true query parameter. */
  var _conflicts: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** Deletion flag. Available if document was removed. */
  var _deleted: js.UndefOr[Boolean] = js.undefined
  
  /** List of deleted conflicted revisions. Available if requested with deleted_conflicts=true query parameter. */
  var _deleted_conflicts: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** Document ID. */
  var _id: String
  
  /** Document’s update sequence in current database. Available if requested with local_seq=true query parameter. */
  var _local_seq: js.UndefOr[String] = js.undefined
  
  /** Revision MVCC token. */
  var _rev: String
  
  /** List of local revision tokens without.
    *
    * Available if requested with revs=true query parameter. */
  var _revisions: js.UndefOr[Any] = js.undefined
  
  /** List of objects with information about local revisions and their status.
    *
    * Available if requested with open_revs query parameter. */
  var _revs_info: js.UndefOr[js.Array[Any]] = js.undefined
}
object DocumentGetResponse {
  
  inline def apply(_id: String, _rev: String): DocumentGetResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentGetResponse]
  }
  
  extension [Self <: DocumentGetResponse](x: Self) {
    
    inline def set_attachments(value: Any): Self = StObject.set(x, "_attachments", value.asInstanceOf[js.Any])
    
    inline def set_attachmentsUndefined: Self = StObject.set(x, "_attachments", js.undefined)
    
    inline def set_conflicts(value: js.Array[Any]): Self = StObject.set(x, "_conflicts", value.asInstanceOf[js.Any])
    
    inline def set_conflictsUndefined: Self = StObject.set(x, "_conflicts", js.undefined)
    
    inline def set_conflictsVarargs(value: Any*): Self = StObject.set(x, "_conflicts", js.Array(value*))
    
    inline def set_deleted(value: Boolean): Self = StObject.set(x, "_deleted", value.asInstanceOf[js.Any])
    
    inline def set_deletedUndefined: Self = StObject.set(x, "_deleted", js.undefined)
    
    inline def set_deleted_conflicts(value: js.Array[Any]): Self = StObject.set(x, "_deleted_conflicts", value.asInstanceOf[js.Any])
    
    inline def set_deleted_conflictsUndefined: Self = StObject.set(x, "_deleted_conflicts", js.undefined)
    
    inline def set_deleted_conflictsVarargs(value: Any*): Self = StObject.set(x, "_deleted_conflicts", js.Array(value*))
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_local_seq(value: String): Self = StObject.set(x, "_local_seq", value.asInstanceOf[js.Any])
    
    inline def set_local_seqUndefined: Self = StObject.set(x, "_local_seq", js.undefined)
    
    inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    
    inline def set_revisions(value: Any): Self = StObject.set(x, "_revisions", value.asInstanceOf[js.Any])
    
    inline def set_revisionsUndefined: Self = StObject.set(x, "_revisions", js.undefined)
    
    inline def set_revs_info(value: js.Array[Any]): Self = StObject.set(x, "_revs_info", value.asInstanceOf[js.Any])
    
    inline def set_revs_infoUndefined: Self = StObject.set(x, "_revs_info", js.undefined)
    
    inline def set_revs_infoVarargs(value: Any*): Self = StObject.set(x, "_revs_info", js.Array(value*))
  }
}
