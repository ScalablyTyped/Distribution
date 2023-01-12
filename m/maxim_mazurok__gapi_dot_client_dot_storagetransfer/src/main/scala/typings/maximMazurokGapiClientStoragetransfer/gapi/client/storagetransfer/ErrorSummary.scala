package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorSummary extends StObject {
  
  /** Required. */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /** Required. Count of this type of error. */
  var errorCount: js.UndefOr[String] = js.undefined
  
  /** Error samples. At most 5 error log entries are recorded for a given error code for a single transfer operation. */
  var errorLogEntries: js.UndefOr[js.Array[ErrorLogEntry]] = js.undefined
}
object ErrorSummary {
  
  inline def apply(): ErrorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorSummary] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    inline def setErrorLogEntries(value: js.Array[ErrorLogEntry]): Self = StObject.set(x, "errorLogEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorLogEntriesUndefined: Self = StObject.set(x, "errorLogEntries", js.undefined)
    
    inline def setErrorLogEntriesVarargs(value: ErrorLogEntry*): Self = StObject.set(x, "errorLogEntries", js.Array(value*))
  }
}
