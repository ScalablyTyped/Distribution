package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackTrace extends StObject {
  
  var stackTrace: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ticket: js.UndefOr[String] = js.undefined
}
object StackTrace {
  
  inline def apply(): StackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackTrace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackTrace] (val x: Self) extends AnyVal {
    
    inline def setStackTrace(value: String | js.Array[String]): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setStackTraceVarargs(value: String*): Self = StObject.set(x, "stackTrace", js.Array(value*))
    
    inline def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
    
    inline def setTicketUndefined: Self = StObject.set(x, "ticket", js.undefined)
  }
}
