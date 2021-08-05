package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecondaryIpRange extends StObject {
  
  /** Secondary IP CIDR range in `x.x.x.x/y` format. */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /** Name of the secondary IP range. */
  var rangeName: js.UndefOr[String] = js.undefined
}
object SecondaryIpRange {
  
  inline def apply(): SecondaryIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecondaryIpRange]
  }
  
  extension [Self <: SecondaryIpRange](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    inline def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
  }
}
