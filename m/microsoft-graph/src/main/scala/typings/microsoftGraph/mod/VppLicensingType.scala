package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VppLicensingType extends StObject {
  
  // Whether the program supports the device licensing type.
  var supportsDeviceLicensing: js.UndefOr[Boolean] = js.undefined
  
  // Whether the program supports the user licensing type.
  var supportsUserLicensing: js.UndefOr[Boolean] = js.undefined
}
object VppLicensingType {
  
  inline def apply(): VppLicensingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VppLicensingType]
  }
  
  extension [Self <: VppLicensingType](x: Self) {
    
    inline def setSupportsDeviceLicensing(value: Boolean): Self = StObject.set(x, "supportsDeviceLicensing", value.asInstanceOf[js.Any])
    
    inline def setSupportsDeviceLicensingUndefined: Self = StObject.set(x, "supportsDeviceLicensing", js.undefined)
    
    inline def setSupportsUserLicensing(value: Boolean): Self = StObject.set(x, "supportsUserLicensing", value.asInstanceOf[js.Any])
    
    inline def setSupportsUserLicensingUndefined: Self = StObject.set(x, "supportsUserLicensing", js.undefined)
  }
}
