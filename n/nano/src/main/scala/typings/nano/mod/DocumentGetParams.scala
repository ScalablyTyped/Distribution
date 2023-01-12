package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document get parameters.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid} */
trait DocumentGetParams extends StObject {
  
  /** Includes encoding information in attachment stubs if the particular attachment is compressed.
    *
    * @default false */
  var att_encoding_info: js.UndefOr[Boolean] = js.undefined
  
  /** Includes attachments bodies in response.
    *
    * @default false */
  var attachments: js.UndefOr[Boolean] = js.undefined
  
  /** Includes attachments only since specified revisions.
    *
    * Doesn’t includes attachments for specified revisions. */
  var atts_since: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** Includes information about conflicts in document.
    *
    * @default false */
  var conflicts: js.UndefOr[Boolean] = js.undefined
  
  /** Includes information about deleted conflicted revisions.
    *
    * @default false */
  var deleted_conflicts: js.UndefOr[Boolean] = js.undefined
  
  /** Forces retrieving latest “leaf” revision, no matter what rev was requested.
    *
    * @default false */
  var latest: js.UndefOr[Boolean] = js.undefined
  
  /** Includes last update sequence for the document.
    *
    * @default false */
  var local_seq: js.UndefOr[Boolean] = js.undefined
  
  /** Acts same as specifying all conflicts, deleted_conflicts and revs_info query parameters.
    *
    * @default false */
  var meta: js.UndefOr[Boolean] = js.undefined
  
  /** Retrieves documents of specified leaf revisions.
    *
    * Additionally, it accepts value as all to return all leaf revisions. */
  var open_revs: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** Retrieves document of specified revision. */
  var rev: js.UndefOr[String] = js.undefined
  
  /** Includes list of all known document revisions. */
  var revs: js.UndefOr[Boolean] = js.undefined
  
  /** Includes detailed information for all known document revisions.
    *
    * @default false */
  var revs_info: js.UndefOr[Boolean] = js.undefined
}
object DocumentGetParams {
  
  inline def apply(): DocumentGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentGetParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentGetParams] (val x: Self) extends AnyVal {
    
    inline def setAtt_encoding_info(value: Boolean): Self = StObject.set(x, "att_encoding_info", value.asInstanceOf[js.Any])
    
    inline def setAtt_encoding_infoUndefined: Self = StObject.set(x, "att_encoding_info", js.undefined)
    
    inline def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAtts_since(value: js.Array[Any]): Self = StObject.set(x, "atts_since", value.asInstanceOf[js.Any])
    
    inline def setAtts_sinceUndefined: Self = StObject.set(x, "atts_since", js.undefined)
    
    inline def setAtts_sinceVarargs(value: Any*): Self = StObject.set(x, "atts_since", js.Array(value*))
    
    inline def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setDeleted_conflicts(value: Boolean): Self = StObject.set(x, "deleted_conflicts", value.asInstanceOf[js.Any])
    
    inline def setDeleted_conflictsUndefined: Self = StObject.set(x, "deleted_conflicts", js.undefined)
    
    inline def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
    
    inline def setLocal_seq(value: Boolean): Self = StObject.set(x, "local_seq", value.asInstanceOf[js.Any])
    
    inline def setLocal_seqUndefined: Self = StObject.set(x, "local_seq", js.undefined)
    
    inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setOpen_revs(value: js.Array[Any]): Self = StObject.set(x, "open_revs", value.asInstanceOf[js.Any])
    
    inline def setOpen_revsUndefined: Self = StObject.set(x, "open_revs", js.undefined)
    
    inline def setOpen_revsVarargs(value: Any*): Self = StObject.set(x, "open_revs", js.Array(value*))
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
    
    inline def setRevs(value: Boolean): Self = StObject.set(x, "revs", value.asInstanceOf[js.Any])
    
    inline def setRevsUndefined: Self = StObject.set(x, "revs", js.undefined)
    
    inline def setRevs_info(value: Boolean): Self = StObject.set(x, "revs_info", value.asInstanceOf[js.Any])
    
    inline def setRevs_infoUndefined: Self = StObject.set(x, "revs_info", js.undefined)
  }
}
