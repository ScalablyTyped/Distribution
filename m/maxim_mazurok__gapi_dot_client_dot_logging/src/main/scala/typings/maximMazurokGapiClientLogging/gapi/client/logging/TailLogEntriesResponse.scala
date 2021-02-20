package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TailLogEntriesResponse extends StObject {
  
  /** A list of log entries. Each response in the stream will order entries with increasing values of LogEntry.timestamp. Ordering is not guaranteed between separate responses. */
  var entries: js.UndefOr[js.Array[LogEntry]] = js.native
  
  /**
    * If entries that otherwise would have been included in the session were not sent back to the client, counts of relevant entries omitted from the session with the reason that they
    * were not included. There will be at most one of each reason per response. The counts represent the number of suppressed entries since the last streamed response.
    */
  var suppressionInfo: js.UndefOr[js.Array[SuppressionInfo]] = js.native
}
object TailLogEntriesResponse {
  
  @scala.inline
  def apply(): TailLogEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TailLogEntriesResponse]
  }
  
  @scala.inline
  implicit class TailLogEntriesResponseMutableBuilder[Self <: TailLogEntriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[LogEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: LogEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setSuppressionInfo(value: js.Array[SuppressionInfo]): Self = StObject.set(x, "suppressionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressionInfoUndefined: Self = StObject.set(x, "suppressionInfo", js.undefined)
    
    @scala.inline
    def setSuppressionInfoVarargs(value: SuppressionInfo*): Self = StObject.set(x, "suppressionInfo", js.Array(value :_*))
  }
}
