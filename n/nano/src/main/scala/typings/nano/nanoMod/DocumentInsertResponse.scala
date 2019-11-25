package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/common.html#post--db
// http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
trait DocumentInsertResponse extends js.Object {
  // Document ID
  var id: String
  // Operation status
  var ok: Boolean
  // Revision MVCC token
  var rev: String
}

object DocumentInsertResponse {
  @scala.inline
  def apply(id: String, ok: Boolean, rev: String): DocumentInsertResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentInsertResponse]
  }
}

