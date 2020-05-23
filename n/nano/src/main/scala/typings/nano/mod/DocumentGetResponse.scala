package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
trait DocumentGetResponse extends js.Object {
  // Attachment’s stubs. Available if document has any attachments.
  var _attachments: js.UndefOr[js.Any] = js.undefined
  // List of conflicted revisions. Available if requested with conflicts=true query parameter.
  var _conflicts: js.UndefOr[js.Array[_]] = js.undefined
  // Deletion flag. Available if document was removed.
  var _deleted: js.UndefOr[Boolean] = js.undefined
  // List of deleted conflicted revisions. Available if requested with deleted_conflicts=true query parameter.
  var _deleted_conflicts: js.UndefOr[js.Array[_]] = js.undefined
  // Document ID.
  var _id: String
  // Document’s update sequence in current database. Available if requested with local_seq=true query parameter.
  var _local_seq: js.UndefOr[String] = js.undefined
  // Revision MVCC token.
  var _rev: String
  // List of local revision tokens without. Available if requested with revs=true query parameter.
  var _revisions: js.UndefOr[js.Any] = js.undefined
  // List of objects with information about local revisions and their status. Available if requested with
  // open_revs query parameter.
  var _revs_info: js.UndefOr[js.Array[_]] = js.undefined
}

object DocumentGetResponse {
  @scala.inline
  def apply(
    _id: String,
    _rev: String,
    _attachments: js.Any = null,
    _conflicts: js.Array[_] = null,
    _deleted: js.UndefOr[Boolean] = js.undefined,
    _deleted_conflicts: js.Array[_] = null,
    _local_seq: String = null,
    _revisions: js.Any = null,
    _revs_info: js.Array[_] = null
  ): DocumentGetResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_conflicts != null) __obj.updateDynamic("_conflicts")(_conflicts.asInstanceOf[js.Any])
    if (!js.isUndefined(_deleted)) __obj.updateDynamic("_deleted")(_deleted.get.asInstanceOf[js.Any])
    if (_deleted_conflicts != null) __obj.updateDynamic("_deleted_conflicts")(_deleted_conflicts.asInstanceOf[js.Any])
    if (_local_seq != null) __obj.updateDynamic("_local_seq")(_local_seq.asInstanceOf[js.Any])
    if (_revisions != null) __obj.updateDynamic("_revisions")(_revisions.asInstanceOf[js.Any])
    if (_revs_info != null) __obj.updateDynamic("_revs_info")(_revs_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentGetResponse]
  }
}

