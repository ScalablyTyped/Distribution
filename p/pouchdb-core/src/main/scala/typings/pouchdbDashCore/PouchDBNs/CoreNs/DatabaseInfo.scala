package typings.pouchdbDashCore.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseInfo extends js.Object {
  /** Name of the database you gave when you called new PouchDB(), and also the unique identifier for the database. */
  var db_name: String
  /** Total number of non-deleted documents in the database. */
  var doc_count: Double
  /** Sequence number of the database. It starts at 0 and gets incremented every time a document is added or modified */
  var update_seq: Double | String
}

object DatabaseInfo {
  @scala.inline
  def apply(db_name: String, doc_count: Double, update_seq: Double | String): DatabaseInfo = {
    val __obj = js.Dynamic.literal(db_name = db_name, doc_count = doc_count, update_seq = update_seq.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabaseInfo]
  }
}

