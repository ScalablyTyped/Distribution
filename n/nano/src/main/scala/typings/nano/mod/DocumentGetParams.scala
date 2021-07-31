package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
trait DocumentGetParams extends StObject {
  
  // Includes encoding information in attachment stubs if the particular attachment is compressed. Default is
  // false.
  var att_encoding_info: js.UndefOr[Boolean] = js.undefined
  
  // Includes attachments bodies in response. Default is false.
  var attachments: js.UndefOr[Boolean] = js.undefined
  
  // Includes attachments only since specified revisions. Doesn’t includes attachments for specified revisions.
  var atts_since: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  // Includes information about conflicts in document. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.undefined
  
  // Includes information about deleted conflicted revisions. Default is false.
  var deleted_conflicts: js.UndefOr[Boolean] = js.undefined
  
  // Forces retrieving latest “leaf” revision, no matter what rev was requested. Default is false.
  var latest: js.UndefOr[Boolean] = js.undefined
  
  // Includes last update sequence for the document. Default is false.
  var local_seq: js.UndefOr[Boolean] = js.undefined
  
  // Acts same as specifying all conflicts, deleted_conflicts and revs_info query parameters. Default is false.
  var meta: js.UndefOr[Boolean] = js.undefined
  
  // Retrieves documents of specified leaf revisions. Additionally, it accepts value as all to return all leaf
  // revisions.
  var open_revs: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  // Retrieves document of specified revision.
  var rev: js.UndefOr[String] = js.undefined
  
  // Includes list of all known document revisions.
  var revs: js.UndefOr[Boolean] = js.undefined
  
  // Includes detailed information for all known document revisions. Default is false.
  var revs_info: js.UndefOr[Boolean] = js.undefined
}
object DocumentGetParams {
  
  @scala.inline
  def apply(): DocumentGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentGetParams]
  }
  
  @scala.inline
  implicit class DocumentGetParamsMutableBuilder[Self <: DocumentGetParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtt_encoding_info(value: Boolean): Self = StObject.set(x, "att_encoding_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtt_encoding_infoUndefined: Self = StObject.set(x, "att_encoding_info", js.undefined)
    
    @scala.inline
    def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAtts_since(value: js.Array[js.Any]): Self = StObject.set(x, "atts_since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtts_sinceUndefined: Self = StObject.set(x, "atts_since", js.undefined)
    
    @scala.inline
    def setAtts_sinceVarargs(value: js.Any*): Self = StObject.set(x, "atts_since", js.Array(value :_*))
    
    @scala.inline
    def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    @scala.inline
    def setDeleted_conflicts(value: Boolean): Self = StObject.set(x, "deleted_conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted_conflictsUndefined: Self = StObject.set(x, "deleted_conflicts", js.undefined)
    
    @scala.inline
    def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
    
    @scala.inline
    def setLocal_seq(value: Boolean): Self = StObject.set(x, "local_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal_seqUndefined: Self = StObject.set(x, "local_seq", js.undefined)
    
    @scala.inline
    def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setOpen_revs(value: js.Array[js.Any]): Self = StObject.set(x, "open_revs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_revsUndefined: Self = StObject.set(x, "open_revs", js.undefined)
    
    @scala.inline
    def setOpen_revsVarargs(value: js.Any*): Self = StObject.set(x, "open_revs", js.Array(value :_*))
    
    @scala.inline
    def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
    
    @scala.inline
    def setRevs(value: Boolean): Self = StObject.set(x, "revs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevsUndefined: Self = StObject.set(x, "revs", js.undefined)
    
    @scala.inline
    def setRevs_info(value: Boolean): Self = StObject.set(x, "revs_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevs_infoUndefined: Self = StObject.set(x, "revs_info", js.undefined)
  }
}
