package typings.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogObject extends StObject {
  
  def log(): Unit = js.native
}
object LogObject {
  
  @scala.inline
  def apply(log: () => Unit): LogObject = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction0(log))
    __obj.asInstanceOf[LogObject]
  }
  
  @scala.inline
  implicit class LogObjectMutableBuilder[Self <: LogObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(value: () => Unit): Self = StObject.set(x, "log", js.Any.fromFunction0(value))
  }
}
