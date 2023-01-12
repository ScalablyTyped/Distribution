package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  /**
    * Close code provided by the server
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Reason from server for closing the connection
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the connection was cleanly closed or not
    */
  var wasClean: js.UndefOr[String] = js.undefined
}
object Code {
  
  inline def apply(): Code = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setWasClean(value: String): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    
    inline def setWasCleanUndefined: Self = StObject.set(x, "wasClean", js.undefined)
  }
}
