package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#delete--db-docid
trait DocumentDestroyResponse extends js.Object {
  // Document ID
  var id: String
  // Operation status
  var ok: Boolean
  // Revision MVCC token
  var rev: String
}

object DocumentDestroyResponse {
  @scala.inline
  def apply(id: String, ok: Boolean, rev: String): DocumentDestroyResponse = {
    val __obj = js.Dynamic.literal(id = id, ok = ok, rev = rev)
  
    __obj.asInstanceOf[DocumentDestroyResponse]
  }
}

