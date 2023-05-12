package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeout extends StObject {
  
  /**
    * Time in milliseconds to wait between checks
    */
  var interval: js.UndefOr[int] = js.undefined
  
  /**
    * Time in milliseconds to wait until processing is complete
    */
  var timeout: js.UndefOr[int] = js.undefined
}
object Timeout {
  
  inline def apply(): Timeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: int): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setTimeout(value: int): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
