package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TailLogEntriesResponse extends StObject {
  
  /** A list of log entries. Each response in the stream will order entries with increasing values of LogEntry.timestamp. Ordering is not guaranteed between separate responses. */
  var entries: js.UndefOr[js.Array[LogEntry]] = js.undefined
  
  /**
    * If entries that otherwise would have been included in the session were not sent back to the client, counts of relevant entries omitted from the session with the reason that they
    * were not included. There will be at most one of each reason per response. The counts represent the number of suppressed entries since the last streamed response.
    */
  var suppressionInfo: js.UndefOr[js.Array[SuppressionInfo]] = js.undefined
}
object TailLogEntriesResponse {
  
  inline def apply(): TailLogEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TailLogEntriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TailLogEntriesResponse] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[LogEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: LogEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setSuppressionInfo(value: js.Array[SuppressionInfo]): Self = StObject.set(x, "suppressionInfo", value.asInstanceOf[js.Any])
    
    inline def setSuppressionInfoUndefined: Self = StObject.set(x, "suppressionInfo", js.undefined)
    
    inline def setSuppressionInfoVarargs(value: SuppressionInfo*): Self = StObject.set(x, "suppressionInfo", js.Array(value*))
  }
}
