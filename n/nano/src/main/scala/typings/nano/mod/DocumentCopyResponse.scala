package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
trait DocumentCopyResponse extends js.Object {
  // Document ID
  var id: String
  // Operation status
  var ok: Boolean
  // Revision MVCC token
  var rev: String
}

object DocumentCopyResponse {
  @scala.inline
  def apply(id: String, ok: Boolean, rev: String): DocumentCopyResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCopyResponse]
  }
}

