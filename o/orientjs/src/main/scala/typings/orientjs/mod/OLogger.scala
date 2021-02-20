package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OLogger extends StObject {
  
  def debug(args: js.Any*): Unit = js.native
  
  def error(args: js.Any*): Unit = js.native
  
  def log(args: js.Any*): Unit = js.native
}
object OLogger {
  
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit
  ): OLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[OLogger]
  }
  
  @scala.inline
  implicit class OLoggerMutableBuilder[Self <: OLogger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
  }
}
