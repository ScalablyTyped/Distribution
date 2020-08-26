package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
@js.native
trait DocumentGetParams extends js.Object {
  // Includes encoding information in attachment stubs if the particular attachment is compressed. Default is
  // false.
  var att_encoding_info: js.UndefOr[Boolean] = js.native
  // Includes attachments bodies in response. Default is false.
  var attachments: js.UndefOr[Boolean] = js.native
  // Includes attachments only since specified revisions. Doesn’t includes attachments for specified revisions.
  var atts_since: js.UndefOr[js.Array[_]] = js.native
  // Includes information about conflicts in document. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.native
  // Includes information about deleted conflicted revisions. Default is false.
  var deleted_conflicts: js.UndefOr[Boolean] = js.native
  // Forces retrieving latest “leaf” revision, no matter what rev was requested. Default is false.
  var latest: js.UndefOr[Boolean] = js.native
  // Includes last update sequence for the document. Default is false.
  var local_seq: js.UndefOr[Boolean] = js.native
  // Acts same as specifying all conflicts, deleted_conflicts and revs_info query parameters. Default is false.
  var meta: js.UndefOr[Boolean] = js.native
  // Retrieves documents of specified leaf revisions. Additionally, it accepts value as all to return all leaf
  // revisions.
  var open_revs: js.UndefOr[js.Array[_]] = js.native
  // Retrieves document of specified revision.
  var rev: js.UndefOr[String] = js.native
  // Includes list of all known document revisions.
  var revs: js.UndefOr[Boolean] = js.native
  // Includes detailed information for all known document revisions. Default is false.
  var revs_info: js.UndefOr[Boolean] = js.native
}

object DocumentGetParams {
  @scala.inline
  def apply(): DocumentGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentGetParams]
  }
  @scala.inline
  implicit class DocumentGetParamsOps[Self <: DocumentGetParams] (val x: Self) extends AnyVal {
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
    def setAtt_encoding_info(value: Boolean): Self = this.set("att_encoding_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtt_encoding_info: Self = this.set("att_encoding_info", js.undefined)
    @scala.inline
    def setAttachments(value: Boolean): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setAtts_sinceVarargs(value: js.Any*): Self = this.set("atts_since", js.Array(value :_*))
    @scala.inline
    def setAtts_since(value: js.Array[_]): Self = this.set("atts_since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtts_since: Self = this.set("atts_since", js.undefined)
    @scala.inline
    def setConflicts(value: Boolean): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflicts: Self = this.set("conflicts", js.undefined)
    @scala.inline
    def setDeleted_conflicts(value: Boolean): Self = this.set("deleted_conflicts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted_conflicts: Self = this.set("deleted_conflicts", js.undefined)
    @scala.inline
    def setLatest(value: Boolean): Self = this.set("latest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatest: Self = this.set("latest", js.undefined)
    @scala.inline
    def setLocal_seq(value: Boolean): Self = this.set("local_seq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal_seq: Self = this.set("local_seq", js.undefined)
    @scala.inline
    def setMeta(value: Boolean): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setOpen_revsVarargs(value: js.Any*): Self = this.set("open_revs", js.Array(value :_*))
    @scala.inline
    def setOpen_revs(value: js.Array[_]): Self = this.set("open_revs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen_revs: Self = this.set("open_revs", js.undefined)
    @scala.inline
    def setRev(value: String): Self = this.set("rev", value.asInstanceOf[js.Any])
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

