package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dates extends StObject {
  
  /**
    * The selected dates as UTC timestamps
    */
  var dates: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The selected dates
    */
  var values: js.UndefOr[js.Array[Any]] = js.undefined
}
object Dates {
  
  inline def apply(): Dates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dates] (val x: Self) extends AnyVal {
    
    inline def setDates(value: js.Array[Any]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
    
    inline def setDatesVarargs(value: Any*): Self = StObject.set(x, "dates", js.Array(value*))
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
