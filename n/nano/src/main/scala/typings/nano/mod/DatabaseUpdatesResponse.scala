package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Global changes response.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates} */
trait DatabaseUpdatesResponse extends StObject {
  
  /** The last sequence ID reported. */
  var last_seq: String
  
  /** An array of database events.
    *
    * For longpoll and continuous modes, the entire response is the contents of the results array. */
  var results: js.Array[DatabaseUpdatesResultItem]
}
object DatabaseUpdatesResponse {
  
  inline def apply(last_seq: String, results: js.Array[DatabaseUpdatesResultItem]): DatabaseUpdatesResponse = {
    val __obj = js.Dynamic.literal(last_seq = last_seq.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUpdatesResponse]
  }
  
  extension [Self <: DatabaseUpdatesResponse](x: Self) {
    
    inline def setLast_seq(value: String): Self = StObject.set(x, "last_seq", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[DatabaseUpdatesResultItem]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: DatabaseUpdatesResultItem*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
