package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDate extends StObject {
  
  var baseDate: js.UndefOr[js.Date] = js.undefined
  
  var format: js.UndefOr[DDMM] = js.undefined
  
  var rangeLimit: js.UndefOr[END] = js.undefined
}
object BaseDate {
  
  inline def apply(): BaseDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseDate] (val x: Self) extends AnyVal {
    
    inline def setBaseDate(value: js.Date): Self = StObject.set(x, "baseDate", value.asInstanceOf[js.Any])
    
    inline def setBaseDateUndefined: Self = StObject.set(x, "baseDate", js.undefined)
    
    inline def setFormat(value: DDMM): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRangeLimit(value: END): Self = StObject.set(x, "rangeLimit", value.asInstanceOf[js.Any])
    
    inline def setRangeLimitUndefined: Self = StObject.set(x, "rangeLimit", js.undefined)
  }
}
