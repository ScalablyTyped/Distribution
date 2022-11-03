package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstDayOfWeek extends StObject {
  
  var firstDayOfWeek: int
  
  var minimalDaysInFirstWeek: int
}
object FirstDayOfWeek {
  
  inline def apply(firstDayOfWeek: int, minimalDaysInFirstWeek: int): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], minimalDaysInFirstWeek = minimalDaysInFirstWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
  
  extension [Self <: FirstDayOfWeek](x: Self) {
    
    inline def setFirstDayOfWeek(value: int): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setMinimalDaysInFirstWeek(value: int): Self = StObject.set(x, "minimalDaysInFirstWeek", value.asInstanceOf[js.Any])
  }
}
