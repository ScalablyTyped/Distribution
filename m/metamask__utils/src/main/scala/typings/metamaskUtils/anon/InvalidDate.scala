package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidDate extends StObject {
  
  var invalidDate: js.Date
  
  var someDate: js.Date
  
  var someOther: js.Date
}
object InvalidDate {
  
  inline def apply(invalidDate: js.Date, someDate: js.Date, someOther: js.Date): InvalidDate = {
    val __obj = js.Dynamic.literal(invalidDate = invalidDate.asInstanceOf[js.Any], someDate = someDate.asInstanceOf[js.Any], someOther = someOther.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidDate]
  }
  
  extension [Self <: InvalidDate](x: Self) {
    
    inline def setInvalidDate(value: js.Date): Self = StObject.set(x, "invalidDate", value.asInstanceOf[js.Any])
    
    inline def setSomeDate(value: js.Date): Self = StObject.set(x, "someDate", value.asInstanceOf[js.Any])
    
    inline def setSomeOther(value: js.Date): Self = StObject.set(x, "someOther", value.asInstanceOf[js.Any])
  }
}
