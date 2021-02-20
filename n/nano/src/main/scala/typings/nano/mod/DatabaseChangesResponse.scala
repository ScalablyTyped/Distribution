package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
@js.native
trait DatabaseChangesResponse extends StObject {
  
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
  implicit class DatabaseChangesResponseMutableBuilder[Self <: DatabaseChangesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_seq(value: js.Any): Self = StObject.set(x, "last_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[DatabaseChangesResultItem]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: DatabaseChangesResultItem*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
