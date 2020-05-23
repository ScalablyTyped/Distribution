package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
trait DocumentGetParams extends js.Object {
  // Includes encoding information in attachment stubs if the particular attachment is compressed. Default is
  // false.
  var att_encoding_info: js.UndefOr[Boolean] = js.undefined
  // Includes attachments bodies in response. Default is false.
  var attachments: js.UndefOr[Boolean] = js.undefined
  // Includes attachments only since specified revisions. Doesn’t includes attachments for specified revisions.
  var atts_since: js.UndefOr[js.Array[_]] = js.undefined
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
  var open_revs: js.UndefOr[js.Array[_]] = js.undefined
  // Retrieves document of specified revision.
  var rev: js.UndefOr[String] = js.undefined
  // Includes list of all known document revisions.
  var revs: js.UndefOr[Boolean] = js.undefined
  // Includes detailed information for all known document revisions. Default is false.
  var revs_info: js.UndefOr[Boolean] = js.undefined
}

object DocumentGetParams {
  @scala.inline
  def apply(
    att_encoding_info: js.UndefOr[Boolean] = js.undefined,
    attachments: js.UndefOr[Boolean] = js.undefined,
    atts_since: js.Array[_] = null,
    conflicts: js.UndefOr[Boolean] = js.undefined,
    deleted_conflicts: js.UndefOr[Boolean] = js.undefined,
    latest: js.UndefOr[Boolean] = js.undefined,
    local_seq: js.UndefOr[Boolean] = js.undefined,
    meta: js.UndefOr[Boolean] = js.undefined,
    open_revs: js.Array[_] = null,
    rev: String = null,
    revs: js.UndefOr[Boolean] = js.undefined,
    revs_info: js.UndefOr[Boolean] = js.undefined
  ): DocumentGetParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(att_encoding_info)) __obj.updateDynamic("att_encoding_info")(att_encoding_info.get.asInstanceOf[js.Any])
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments.get.asInstanceOf[js.Any])
    if (atts_since != null) __obj.updateDynamic("atts_since")(atts_since.asInstanceOf[js.Any])
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted_conflicts)) __obj.updateDynamic("deleted_conflicts")(deleted_conflicts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_seq)) __obj.updateDynamic("local_seq")(local_seq.get.asInstanceOf[js.Any])
    if (!js.isUndefined(meta)) __obj.updateDynamic("meta")(meta.get.asInstanceOf[js.Any])
    if (open_revs != null) __obj.updateDynamic("open_revs")(open_revs.asInstanceOf[js.Any])
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(revs_info)) __obj.updateDynamic("revs_info")(revs_info.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentGetParams]
  }
}

