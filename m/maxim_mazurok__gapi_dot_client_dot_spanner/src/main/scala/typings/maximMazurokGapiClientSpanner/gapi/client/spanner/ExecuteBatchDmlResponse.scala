package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteBatchDmlResponse extends StObject {
  
  /**
    * One ResultSet for each statement in the request that ran successfully, in the same order as the statements in the request. Each ResultSet does not contain any rows. The
    * ResultSetStats in each ResultSet contain the number of rows modified by the statement. Only the first ResultSet in the response contains valid ResultSetMetadata.
    */
  var resultSets: js.UndefOr[js.Array[ResultSet]] = js.undefined
  
  /** If all DML statements are executed successfully, the status is `OK`. Otherwise, the error status of the first failed statement. */
  var status: js.UndefOr[Status] = js.undefined
}
object ExecuteBatchDmlResponse {
  
  inline def apply(): ExecuteBatchDmlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteBatchDmlResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteBatchDmlResponse] (val x: Self) extends AnyVal {
    
    inline def setResultSets(value: js.Array[ResultSet]): Self = StObject.set(x, "resultSets", value.asInstanceOf[js.Any])
    
    inline def setResultSetsUndefined: Self = StObject.set(x, "resultSets", js.undefined)
    
    inline def setResultSetsVarargs(value: ResultSet*): Self = StObject.set(x, "resultSets", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
