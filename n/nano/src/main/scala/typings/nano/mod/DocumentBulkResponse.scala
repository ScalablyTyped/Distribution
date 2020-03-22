package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_bulk_docs
trait DocumentBulkResponse extends js.Object {
  // Error type. Available if response code is 4xx
  var error: js.UndefOr[String] = js.undefined
  // Document ID. Available in all cases
  var id: String
  // Error reason. Available if response code is 4xx
  var reason: js.UndefOr[String] = js.undefined
  // New document revision token. Available if document has saved without errors.
  var rev: js.UndefOr[String] = js.undefined
}

object DocumentBulkResponse {
  @scala.inline
  def apply(id: String, error: String = null, reason: String = null, rev: String = null): DocumentBulkResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (rev != null) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentBulkResponse]
  }
}

