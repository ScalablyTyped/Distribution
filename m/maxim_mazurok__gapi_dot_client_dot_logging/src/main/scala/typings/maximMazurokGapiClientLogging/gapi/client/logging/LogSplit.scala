package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogSplit extends StObject {
  
  /** The index of this LogEntry in the sequence of split log entries. Log entries are given |index| values 0, 1, ..., n-1 for a sequence of n log entries. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** The total number of log entries that the original LogEntry was split into. */
  var totalSplits: js.UndefOr[Double] = js.undefined
  
  /**
    * A globally unique identifier for all log entries in a sequence of split log entries. All log entries with the same |LogSplit.uid| are assumed to be part of the same sequence of
    * split log entries.
    */
  var uid: js.UndefOr[String] = js.undefined
}
object LogSplit {
  
  inline def apply(): LogSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSplit]
  }
  
  extension [Self <: LogSplit](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setTotalSplits(value: Double): Self = StObject.set(x, "totalSplits", value.asInstanceOf[js.Any])
    
    inline def setTotalSplitsUndefined: Self = StObject.set(x, "totalSplits", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
