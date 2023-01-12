package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerOptions extends StObject {
  
  var logger: js.UndefOr[LoggerFunction] = js.undefined
  
  var loggerLevel: js.UndefOr[LoggerLevel] = js.undefined
}
object LoggerOptions {
  
  inline def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    
    inline def setLogger(value: LoggerFunction): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerLevel(value: LoggerLevel): Self = StObject.set(x, "loggerLevel", value.asInstanceOf[js.Any])
    
    inline def setLoggerLevelUndefined: Self = StObject.set(x, "loggerLevel", js.undefined)
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
