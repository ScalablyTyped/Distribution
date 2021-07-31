package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPv4CidrRange
  extends StObject
     with IpRange {
  
  // IPv4 address in CIDR notation
  var cidrAddress: js.UndefOr[String] = js.undefined
}
object IPv4CidrRange {
  
  @scala.inline
  def apply(): IPv4CidrRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPv4CidrRange]
  }
  
  @scala.inline
  implicit class IPv4CidrRangeMutableBuilder[Self <: IPv4CidrRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrAddress(value: String): Self = StObject.set(x, "cidrAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAddressUndefined: Self = StObject.set(x, "cidrAddress", js.undefined)
  }
}
