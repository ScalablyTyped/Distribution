package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseInfo extends js.Object {
  /** Name of the database you gave when you called new PouchDB(), and also the unique identifier for the database. */
  var db_name: String = js.native
  /** Total number of non-deleted documents in the database. */
  var doc_count: Double = js.native
  /** Sequence number of the database. It starts at 0 and gets incremented every time a document is added or modified */
  var update_seq: Double | String = js.native
}

object DatabaseInfo {
  @scala.inline
  def apply(db_name: String, doc_count: Double, update_seq: Double | String): DatabaseInfo = {
    val __obj = js.Dynamic.literal(db_name = db_name.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], update_seq = update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInfo]
  }
  @scala.inline
  implicit class DatabaseInfoOps[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
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
    def setDb_name(value: String): Self = this.set("db_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoc_count(value: Double): Self = this.set("doc_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate_seq(value: Double | String): Self = this.set("update_seq", value.asInstanceOf[js.Any])
  }
  
}

