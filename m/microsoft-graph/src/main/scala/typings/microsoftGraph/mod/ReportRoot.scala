package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRoot extends StObject {
  
  var dailyPrintUsageByPrinter: js.UndefOr[NullableOption[js.Array[PrintUsageByPrinter]]] = js.undefined
  
  var dailyPrintUsageByUser: js.UndefOr[NullableOption[js.Array[PrintUsageByUser]]] = js.undefined
  
  var monthlyPrintUsageByPrinter: js.UndefOr[NullableOption[js.Array[PrintUsageByPrinter]]] = js.undefined
  
  var monthlyPrintUsageByUser: js.UndefOr[NullableOption[js.Array[PrintUsageByUser]]] = js.undefined
  
  var security: js.UndefOr[NullableOption[SecurityReportsRoot]] = js.undefined
}
object ReportRoot {
  
  inline def apply(): ReportRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportRoot] (val x: Self) extends AnyVal {
    
    inline def setDailyPrintUsageByPrinter(value: NullableOption[js.Array[PrintUsageByPrinter]]): Self = StObject.set(x, "dailyPrintUsageByPrinter", value.asInstanceOf[js.Any])
    
    inline def setDailyPrintUsageByPrinterNull: Self = StObject.set(x, "dailyPrintUsageByPrinter", null)
    
    inline def setDailyPrintUsageByPrinterUndefined: Self = StObject.set(x, "dailyPrintUsageByPrinter", js.undefined)
    
    inline def setDailyPrintUsageByPrinterVarargs(value: PrintUsageByPrinter*): Self = StObject.set(x, "dailyPrintUsageByPrinter", js.Array(value*))
    
    inline def setDailyPrintUsageByUser(value: NullableOption[js.Array[PrintUsageByUser]]): Self = StObject.set(x, "dailyPrintUsageByUser", value.asInstanceOf[js.Any])
    
    inline def setDailyPrintUsageByUserNull: Self = StObject.set(x, "dailyPrintUsageByUser", null)
    
    inline def setDailyPrintUsageByUserUndefined: Self = StObject.set(x, "dailyPrintUsageByUser", js.undefined)
    
    inline def setDailyPrintUsageByUserVarargs(value: PrintUsageByUser*): Self = StObject.set(x, "dailyPrintUsageByUser", js.Array(value*))
    
    inline def setMonthlyPrintUsageByPrinter(value: NullableOption[js.Array[PrintUsageByPrinter]]): Self = StObject.set(x, "monthlyPrintUsageByPrinter", value.asInstanceOf[js.Any])
    
    inline def setMonthlyPrintUsageByPrinterNull: Self = StObject.set(x, "monthlyPrintUsageByPrinter", null)
    
    inline def setMonthlyPrintUsageByPrinterUndefined: Self = StObject.set(x, "monthlyPrintUsageByPrinter", js.undefined)
    
    inline def setMonthlyPrintUsageByPrinterVarargs(value: PrintUsageByPrinter*): Self = StObject.set(x, "monthlyPrintUsageByPrinter", js.Array(value*))
    
    inline def setMonthlyPrintUsageByUser(value: NullableOption[js.Array[PrintUsageByUser]]): Self = StObject.set(x, "monthlyPrintUsageByUser", value.asInstanceOf[js.Any])
    
    inline def setMonthlyPrintUsageByUserNull: Self = StObject.set(x, "monthlyPrintUsageByUser", null)
    
    inline def setMonthlyPrintUsageByUserUndefined: Self = StObject.set(x, "monthlyPrintUsageByUser", js.undefined)
    
    inline def setMonthlyPrintUsageByUserVarargs(value: PrintUsageByUser*): Self = StObject.set(x, "monthlyPrintUsageByUser", js.Array(value*))
    
    inline def setSecurity(value: NullableOption[SecurityReportsRoot]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityNull: Self = StObject.set(x, "security", null)
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
  }
}
