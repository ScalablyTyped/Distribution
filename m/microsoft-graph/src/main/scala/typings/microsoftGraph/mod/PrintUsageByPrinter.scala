package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintUsageByPrinter
  extends StObject
     with PrintUsage {
  
  var printerId: js.UndefOr[String] = js.undefined
}
object PrintUsageByPrinter {
  
  inline def apply(): PrintUsageByPrinter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintUsageByPrinter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintUsageByPrinter] (val x: Self) extends AnyVal {
    
    inline def setPrinterId(value: String): Self = StObject.set(x, "printerId", value.asInstanceOf[js.Any])
    
    inline def setPrinterIdUndefined: Self = StObject.set(x, "printerId", js.undefined)
  }
}
