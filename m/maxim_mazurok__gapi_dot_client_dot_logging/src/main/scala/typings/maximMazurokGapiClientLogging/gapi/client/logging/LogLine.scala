package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogLine extends StObject {
  
  /** App-provided log message. */
  var logMessage: js.UndefOr[String] = js.undefined
  
  /** Severity of this log entry. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Where in the source code this log message was written. */
  var sourceLocation: js.UndefOr[SourceLocation] = js.undefined
  
  /** Approximate time when this log entry was made. */
  var time: js.UndefOr[String] = js.undefined
}
object LogLine {
  
  @scala.inline
  def apply(): LogLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogLine]
  }
  
  @scala.inline
  implicit class LogLineMutableBuilder[Self <: LogLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogMessage(value: String): Self = StObject.set(x, "logMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogMessageUndefined: Self = StObject.set(x, "logMessage", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSourceLocation(value: SourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
