package typings.pouchdbCore.PouchDB.Core

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
  implicit class GetOptionsOps[Self <: GetOptions] (val x: Self) extends AnyVal {
    
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
    def setAttachments(value: Boolean): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setConflicts(value: Boolean): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflicts: Self = this.set("conflicts", js.undefined)
    
    @scala.inline
    def setLatest(value: Boolean): Self = this.set("latest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatest: Self = this.set("latest", js.undefined)
    
    @scala.inline
    def setRev(value: RevisionId): Self = this.set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRev: Self = this.set("rev", js.undefined)
    
    @scala.inline
    def setRevs(value: Boolean): Self = this.set("revs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevs: Self = this.set("revs", js.undefined)
    
    @scala.inline
    def setRevs_info(value: Boolean): Self = this.set("revs_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevs_info: Self = this.set("revs_info", js.undefined)
  }
}
