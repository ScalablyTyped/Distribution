package typings.mfiles

import typings.mfiles.MFiles.MFTriggerMonth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMonthlyDateTrigger extends StObject {
  
  var Days: Double
  
  var Months: MFTriggerMonth
}
object IMonthlyDateTrigger {
  
  inline def apply(Days: Double, Months: MFTriggerMonth): IMonthlyDateTrigger = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonthlyDateTrigger]
  }
  
  extension [Self <: IMonthlyDateTrigger](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: MFTriggerMonth): Self = StObject.set(x, "Months", value.asInstanceOf[js.Any])
  }
}
