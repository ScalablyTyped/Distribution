package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OLogger extends StObject {
  
  def debug(args: Any*): Unit
  
  def error(args: Any*): Unit
  
  def log(args: Any*): Unit
}
object OLogger {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    error: /* repeated */ Any => Unit,
    log: /* repeated */ Any => Unit
  ): OLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[OLogger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OLogger] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
  }
}
