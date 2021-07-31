package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPv6CidrRange
  extends StObject
     with IpRange {
  
  // IPv6 address in CIDR notation
  var cidrAddress: js.UndefOr[String] = js.undefined
}
object IPv6CidrRange {
  
  @scala.inline
  def apply(): IPv6CidrRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPv6CidrRange]
  }
  
  @scala.inline
  implicit class IPv6CidrRangeMutableBuilder[Self <: IPv6CidrRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrAddress(value: String): Self = StObject.set(x, "cidrAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAddressUndefined: Self = StObject.set(x, "cidrAddress", js.undefined)
  }
}
