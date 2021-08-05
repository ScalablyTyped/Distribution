package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerOptions extends StObject {
  
  /**
    * Override default global log level.
    */
  var logger: js.UndefOr[log] = js.undefined
  
  /**
    * Custom logger function
    */
  var loggerLevel: js.UndefOr[String] = js.undefined
}
object LoggerOptions {
  
  inline def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  extension [Self <: LoggerOptions](x: Self) {
    
    inline def setLogger(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction2(value))
    
    inline def setLoggerLevel(value: String): Self = StObject.set(x, "loggerLevel", value.asInstanceOf[js.Any])
    
    inline def setLoggerLevelUndefined: Self = StObject.set(x, "loggerLevel", js.undefined)
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
