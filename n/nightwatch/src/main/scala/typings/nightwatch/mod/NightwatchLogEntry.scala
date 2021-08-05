package typings.nightwatch.mod

import typings.nightwatch.nightwatchStrings.DEBUG
import typings.nightwatch.nightwatchStrings.INFO
import typings.nightwatch.nightwatchStrings.SEVERE
import typings.nightwatch.nightwatchStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchLogEntry extends StObject {
  
  /**
    * Severity level
    */
  var level: SEVERE | WARNING | INFO | DEBUG
  
  /**
    * The log entry message.
    */
  var message: String
  
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The time stamp of log entry in seconds.
    */
  var timestamp: Double
}
object NightwatchLogEntry {
  
  inline def apply(level: SEVERE | WARNING | INFO | DEBUG, message: String, timestamp: Double): NightwatchLogEntry = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLogEntry]
  }
  
  extension [Self <: NightwatchLogEntry](x: Self) {
    
    inline def setLevel(value: SEVERE | WARNING | INFO | DEBUG): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
