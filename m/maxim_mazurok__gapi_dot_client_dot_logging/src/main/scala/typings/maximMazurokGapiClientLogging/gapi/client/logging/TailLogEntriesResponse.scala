package typings.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TailLogEntriesResponse extends js.Object {
  
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
  implicit class TailLogEntriesResponseOps[Self <: TailLogEntriesResponse] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: LogEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[LogEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setSuppressionInfoVarargs(value: SuppressionInfo*): Self = this.set("suppressionInfo", js.Array(value :_*))
    
    @scala.inline
    def setSuppressionInfo(value: js.Array[SuppressionInfo]): Self = this.set("suppressionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressionInfo: Self = this.set("suppressionInfo", js.undefined)
  }
}
