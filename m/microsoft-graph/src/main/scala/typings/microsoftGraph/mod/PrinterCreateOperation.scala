package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterCreateOperation
  extends StObject
     with PrintOperation {
  
  // The signed certificate created during the registration process. Read-only.
  var certificate: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The created printer entity. Read-only.
  var printer: js.UndefOr[NullableOption[Printer]] = js.undefined
}
object PrinterCreateOperation {
  
  inline def apply(): PrinterCreateOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterCreateOperation]
  }
  
  extension [Self <: PrinterCreateOperation](x: Self) {
    
    inline def setCertificate(value: NullableOption[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setPrinter(value: NullableOption[Printer]): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
    
    inline def setPrinterNull: Self = StObject.set(x, "printer", null)
    
    inline def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
  }
}
