package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @js.native
  trait LogFunction extends StObject {
    
    def apply(message: String, args: js.Any*): Unit = js.native
  }
  
  trait Logger extends StObject {
    
    def debug(message: String, args: js.Any*): Unit
    @JSName("debug")
    var debug_Original: LogFunction
    
    def error(message: String, args: js.Any*): Unit
    @JSName("error")
    var error_Original: LogFunction
    
    def info(message: String, args: js.Any*): Unit
    @JSName("info")
    var info_Original: LogFunction
    
    def warn(message: String, args: js.Any*): Unit
    @JSName("warn")
    var warn_Original: LogFunction
  }
  object Logger {
    
    @scala.inline
    def apply(debug: LogFunction, error: LogFunction, info: LogFunction, warn: LogFunction): Logger = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: LogFunction): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: LogFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: LogFunction): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarn(value: LogFunction): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
