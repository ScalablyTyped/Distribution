package typings
package nanoLib.nanoMod.nanoNs

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
  var _deleted: js.UndefOr[scala.Boolean] = js.undefined
  // List of deleted conflicted revisions. Available if requested with deleted_conflicts=true query parameter.
  var _deleted_conflicts: js.UndefOr[js.Array[_]] = js.undefined
  // Document ID.
  var _id: java.lang.String
  // Document’s update sequence in current database. Available if requested with local_seq=true query parameter.
  var _local_seq: js.UndefOr[java.lang.String] = js.undefined
  // Revision MVCC token.
  var _rev: java.lang.String
  // List of local revision tokens without. Available if requested with revs=true query parameter.
  var _revisions: js.UndefOr[js.Any] = js.undefined
  // List of objects with information about local revisions and their status. Available if requested with
  // open_revs query parameter.
  var _revs_info: js.UndefOr[js.Array[_]] = js.undefined
}

