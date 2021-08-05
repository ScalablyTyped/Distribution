package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsDefenderScanActionResult
  extends StObject
     with DeviceActionResult {
  
  // Scan type either full scan or quick scan
  var scanType: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsDefenderScanActionResult {
  
  inline def apply(): WindowsDefenderScanActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDefenderScanActionResult]
  }
  
  extension [Self <: WindowsDefenderScanActionResult](x: Self) {
    
    inline def setScanType(value: NullableOption[String]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeNull: Self = StObject.set(x, "scanType", null)
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
  }
}
