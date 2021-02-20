package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOptions extends Options {
  
  /** Include attachment data. */
  var attachments: js.UndefOr[Boolean] = js.native
  
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[Boolean] = js.native
  
  /** Include list of conflicting leaf revisions. */
  var conflicts: js.UndefOr[Boolean] = js.native
  
  /** Forces retrieving latest “leaf” revision, no matter what rev was requested. */
  var latest: js.UndefOr[Boolean] = js.native
  
  /** Specific revision to fetch */
  var rev: js.UndefOr[RevisionId] = js.native
  
  /** Include revision history of the document. */
  var revs: js.UndefOr[Boolean] = js.native
  
  /**
    * Include a list of revisions of the document, and their
    * availability.
    */
  var revs_info: js.UndefOr[Boolean] = js.native
}
object GetOptions {
  
  @scala.inline
  def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  
  @scala.inline
  implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: Boolean): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    @scala.inline
    def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
    
    @scala.inline
    def setRev(value: RevisionId): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
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
