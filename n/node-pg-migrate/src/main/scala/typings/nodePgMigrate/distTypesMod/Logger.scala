package typings.nodePgMigrate.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var debug: js.UndefOr[LogFn] = js.undefined
  
  def error(msg: String): Unit
  @JSName("error")
  var error_Original: LogFn
  
  def info(msg: String): Unit
  @JSName("info")
  var info_Original: LogFn
  
  def warn(msg: String): Unit
  @JSName("warn")
  var warn_Original: LogFn
}
object Logger {
  
  inline def apply(error: /* msg */ String => Unit, info: /* msg */ String => Unit, warn: /* msg */ String => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: /* msg */ String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: /* msg */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* msg */ String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* msg */ String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
