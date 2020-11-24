package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorSummary extends js.Object {
  
  /** Required. */
  var errorCode: js.UndefOr[String] = js.native
  
  /** Required. Count of this type of error. */
  var errorCount: js.UndefOr[String] = js.native
  
  /** Error samples. At most 5 error log entries will be recorded for a given error code for a single transfer operation. */
  var errorLogEntries: js.UndefOr[js.Array[ErrorLogEntry]] = js.native
}
object ErrorSummary {
  
  @scala.inline
  def apply(): ErrorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorSummary]
  }
  
  @scala.inline
  implicit class ErrorSummaryOps[Self <: ErrorSummary] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorCount(value: String): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCount: Self = this.set("errorCount", js.undefined)
    
    @scala.inline
    def setErrorLogEntriesVarargs(value: ErrorLogEntry*): Self = this.set("errorLogEntries", js.Array(value :_*))
    
    @scala.inline
    def setErrorLogEntries(value: js.Array[ErrorLogEntry]): Self = this.set("errorLogEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorLogEntries: Self = this.set("errorLogEntries", js.undefined)
  }
}
