package typings.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def debug(msg: String, args: Any*): Unit
  def debug(obj: js.Object, msg: String, args: Any*): Unit
  def debug(obj: js.Object, msg: Unit, args: Any*): Unit
  @JSName("debug")
  var debug_Original: LogFn
  
  def error(msg: String, args: Any*): Unit
  def error(obj: js.Object, msg: String, args: Any*): Unit
  def error(obj: js.Object, msg: Unit, args: Any*): Unit
  @JSName("error")
  var error_Original: LogFn
  
  def fatal(msg: String, args: Any*): Unit
  def fatal(obj: js.Object, msg: String, args: Any*): Unit
  def fatal(obj: js.Object, msg: Unit, args: Any*): Unit
  @JSName("fatal")
  var fatal_Original: LogFn
  
  def info(msg: String, args: Any*): Unit
  def info(obj: js.Object, msg: String, args: Any*): Unit
  def info(obj: js.Object, msg: Unit, args: Any*): Unit
  @JSName("info")
  var info_Original: LogFn
  
  def trace(msg: String, args: Any*): Unit
  def trace(obj: js.Object, msg: String, args: Any*): Unit
  def trace(obj: js.Object, msg: Unit, args: Any*): Unit
  @JSName("trace")
  var trace_Original: LogFn
  
  def warn(msg: String, args: Any*): Unit
  def warn(obj: js.Object, msg: String, args: Any*): Unit
  def warn(obj: js.Object, msg: Unit, args: Any*): Unit
  @JSName("warn")
  var warn_Original: LogFn
}
object Logger {
  
  inline def apply(debug: LogFn, error: LogFn, fatal: LogFn, info: LogFn, trace: LogFn, warn: LogFn): Logger = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: LogFn): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setError(value: LogFn): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFatal(value: LogFn): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: LogFn): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setTrace(value: LogFn): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: LogFn): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
  }
}
