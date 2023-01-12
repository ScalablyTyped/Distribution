package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatabaseDdlMetadata extends StObject {
  
  /** Reports the commit timestamps of all statements that have succeeded so far, where `commit_timestamps[i]` is the commit timestamp for the statement `statements[i]`. */
  var commitTimestamps: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The database being modified. */
  var database: js.UndefOr[String] = js.undefined
  
  /**
    * The progress of the UpdateDatabaseDdl operations. Currently, only index creation statements will have a continuously updating progress. For non-index creation statements,
    * `progress[i]` will have start time and end time populated with commit timestamp of operation, as well as a progress of 100% once the operation has completed. `progress[i]` is the
    * operation progress for `statements[i]`.
    */
  var progress: js.UndefOr[js.Array[OperationProgress]] = js.undefined
  
  /** For an update this list contains all the statements. For an individual statement, this list contains only that statement. */
  var statements: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. When true, indicates that the operation is throttled e.g due to resource constraints. When resources become available the operation will resume and this field will be
    * false again.
    */
  var throttled: js.UndefOr[Boolean] = js.undefined
}
object UpdateDatabaseDdlMetadata {
  
  inline def apply(): UpdateDatabaseDdlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDatabaseDdlMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatabaseDdlMetadata] (val x: Self) extends AnyVal {
    
    inline def setCommitTimestamps(value: js.Array[String]): Self = StObject.set(x, "commitTimestamps", value.asInstanceOf[js.Any])
    
    inline def setCommitTimestampsUndefined: Self = StObject.set(x, "commitTimestamps", js.undefined)
    
    inline def setCommitTimestampsVarargs(value: String*): Self = StObject.set(x, "commitTimestamps", js.Array(value*))
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setProgress(value: js.Array[OperationProgress]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: OperationProgress*): Self = StObject.set(x, "progress", js.Array(value*))
    
    inline def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value*))
    
    inline def setThrottled(value: Boolean): Self = StObject.set(x, "throttled", value.asInstanceOf[js.Any])
    
    inline def setThrottledUndefined: Self = StObject.set(x, "throttled", js.undefined)
  }
}
