package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPv6Range
  extends StObject
     with IpRange {
  
  // Lower address.
  var lowerAddress: js.UndefOr[String] = js.undefined
  
  // Upper address.
  var upperAddress: js.UndefOr[String] = js.undefined
}
object IPv6Range {
  
  inline def apply(): IPv6Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPv6Range]
  }
  
  extension [Self <: IPv6Range](x: Self) {
    
    inline def setLowerAddress(value: String): Self = StObject.set(x, "lowerAddress", value.asInstanceOf[js.Any])
    
    inline def setLowerAddressUndefined: Self = StObject.set(x, "lowerAddress", js.undefined)
    
    inline def setUpperAddress(value: String): Self = StObject.set(x, "upperAddress", value.asInstanceOf[js.Any])
    
    inline def setUpperAddressUndefined: Self = StObject.set(x, "upperAddress", js.undefined)
  }
}
