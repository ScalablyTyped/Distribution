package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Mango execution stats.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/find.html#execution-statistics} */
trait MangoExecutionStats extends StObject {
  
  /** Total execution time in milliseconds as measured by the database. */
  var execution_time_ms: Double
  
  /** Number of results returned from the query. */
  var results_returned: Double
  
  /** Number of documents fetched from the database / index.
    *
    * Equivalent to using include_docs = true in a view. */
  var total_docs_examined: Double
  
  /** Number of index keys examined. Currently always 0. */
  var total_keys_examined: Double
  
  /** Number of documents fetched from the database using an out-of-band document fetch.
    *
    * This is only non-zero when read quorum > 1 is specified in the query parameters. */
  var total_quorum_docs_examined: Double
}
object MangoExecutionStats {
  
  inline def apply(
    execution_time_ms: Double,
    results_returned: Double,
    total_docs_examined: Double,
    total_keys_examined: Double,
    total_quorum_docs_examined: Double
  ): MangoExecutionStats = {
    val __obj = js.Dynamic.literal(execution_time_ms = execution_time_ms.asInstanceOf[js.Any], results_returned = results_returned.asInstanceOf[js.Any], total_docs_examined = total_docs_examined.asInstanceOf[js.Any], total_keys_examined = total_keys_examined.asInstanceOf[js.Any], total_quorum_docs_examined = total_quorum_docs_examined.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoExecutionStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MangoExecutionStats] (val x: Self) extends AnyVal {
    
    inline def setExecution_time_ms(value: Double): Self = StObject.set(x, "execution_time_ms", value.asInstanceOf[js.Any])
    
    inline def setResults_returned(value: Double): Self = StObject.set(x, "results_returned", value.asInstanceOf[js.Any])
    
    inline def setTotal_docs_examined(value: Double): Self = StObject.set(x, "total_docs_examined", value.asInstanceOf[js.Any])
    
    inline def setTotal_keys_examined(value: Double): Self = StObject.set(x, "total_keys_examined", value.asInstanceOf[js.Any])
    
    inline def setTotal_quorum_docs_examined(value: Double): Self = StObject.set(x, "total_quorum_docs_examined", value.asInstanceOf[js.Any])
  }
}
