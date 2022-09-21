package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPv4CidrRange
  extends StObject
     with IpRange {
  
  // IPv4 address in CIDR notation. Not nullable.
  var cidrAddress: js.UndefOr[String] = js.undefined
}
object IPv4CidrRange {
  
  inline def apply(): IPv4CidrRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPv4CidrRange]
  }
  
  extension [Self <: IPv4CidrRange](x: Self) {
    
    inline def setCidrAddress(value: String): Self = StObject.set(x, "cidrAddress", value.asInstanceOf[js.Any])
    
    inline def setCidrAddressUndefined: Self = StObject.set(x, "cidrAddress", js.undefined)
  }
}
