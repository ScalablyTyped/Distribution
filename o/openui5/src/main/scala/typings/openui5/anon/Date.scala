package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  /**
    * focused date
    */
  var date: js.UndefOr[js.Object] = js.undefined
  
  /**
    * focused date is in an other month than the displayed one
    */
  var otherMonth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * focused date is set to the same as before (date in other month clicked)
    */
  var restoreOldDate: js.UndefOr[Boolean] = js.undefined
}
object Date {
  
  inline def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOtherMonth(value: Boolean): Self = StObject.set(x, "otherMonth", value.asInstanceOf[js.Any])
    
    inline def setOtherMonthUndefined: Self = StObject.set(x, "otherMonth", js.undefined)
    
    inline def setRestoreOldDate(value: Boolean): Self = StObject.set(x, "restoreOldDate", value.asInstanceOf[js.Any])
    
    inline def setRestoreOldDateUndefined: Self = StObject.set(x, "restoreOldDate", js.undefined)
  }
}
