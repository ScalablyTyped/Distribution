package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerOptions extends StObject {
  
  /**
    * Override default global log level.
    */
  var logger: js.UndefOr[log] = js.native
  
  /**
    * Custom logger function
    */
  var loggerLevel: js.UndefOr[String] = js.native
}
object LoggerOptions {
  
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  @scala.inline
  implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogger(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoggerLevel(value: String): Self = StObject.set(x, "loggerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerLevelUndefined: Self = StObject.set(x, "loggerLevel", js.undefined)
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
