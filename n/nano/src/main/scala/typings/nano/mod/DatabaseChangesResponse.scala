package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
@js.native
trait DatabaseChangesResponse extends js.Object {
  
  // Last change update sequence
  var last_seq: js.Any = js.native
  
  // Count of remaining items in the feed
  var pending: Double = js.native
  
  // Changes made to a database
  var results: js.Array[DatabaseChangesResultItem] = js.native
}
object DatabaseChangesResponse {
  
  @scala.inline
  def apply(last_seq: js.Any, pending: Double, results: js.Array[DatabaseChangesResultItem]): DatabaseChangesResponse = {
    val __obj = js.Dynamic.literal(last_seq = last_seq.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseChangesResponse]
  }
  
  @scala.inline
  implicit class DatabaseChangesResponseOps[Self <: DatabaseChangesResponse] (val x: Self) extends AnyVal {
    
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
    def setLast_seq(value: js.Any): Self = this.set("last_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: DatabaseChangesResultItem*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[DatabaseChangesResultItem]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
