package typings.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogObject extends StObject {
  
  def log(): Unit
}
object LogObject {
  
  inline def apply(log: () => Unit): LogObject = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction0(log))
    __obj.asInstanceOf[LogObject]
  }
  
  extension [Self <: LogObject](x: Self) {
    
    inline def setLog(value: () => Unit): Self = StObject.set(x, "log", js.Any.fromFunction0(value))
  }
}
