package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
@js.native
trait DatabaseUpdatesResponse extends js.Object {
  // The last sequence ID reported.
  var last_seq: String = js.native
  // An array of database events. For longpoll and continuous modes, the entire response is the contents of the
  // results array.
  var results: js.Array[DatabaseUpdatesResultItem] = js.native
}

object DatabaseUpdatesResponse {
  @scala.inline
  def apply(last_seq: String, results: js.Array[DatabaseUpdatesResultItem]): DatabaseUpdatesResponse = {
    val __obj = js.Dynamic.literal(last_seq = last_seq.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUpdatesResponse]
  }
  @scala.inline
  implicit class DatabaseUpdatesResponseOps[Self <: DatabaseUpdatesResponse] (val x: Self) extends AnyVal {
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
    def setLast_seq(value: String): Self = this.set("last_seq", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: DatabaseUpdatesResultItem*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[DatabaseUpdatesResultItem]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

