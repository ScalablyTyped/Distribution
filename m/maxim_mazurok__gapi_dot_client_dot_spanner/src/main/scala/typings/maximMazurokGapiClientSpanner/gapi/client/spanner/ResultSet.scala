package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSet extends StObject {
  
  /** Metadata about the result set, such as row type information. */
  var metadata: js.UndefOr[ResultSetMetadata] = js.undefined
  
  /**
    * Each element in `rows` is a row whose format is defined by metadata.row_type. The ith element in each row matches the ith field in metadata.row_type. Elements are encoded based on
    * type as described here.
    */
  var rows: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * Query plan and execution statistics for the SQL statement that produced this result set. These can be requested by setting ExecuteSqlRequest.query_mode. DML statements always
    * produce stats containing the number of rows modified, unless executed using the ExecuteSqlRequest.QueryMode.PLAN ExecuteSqlRequest.query_mode. Other fields may or may not be
    * populated, based on the ExecuteSqlRequest.query_mode.
    */
  var stats: js.UndefOr[ResultSetStats] = js.undefined
}
object ResultSet {
  
  inline def apply(): ResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultSet] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: ResultSetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRows(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setStats(value: ResultSetStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
  }
}
