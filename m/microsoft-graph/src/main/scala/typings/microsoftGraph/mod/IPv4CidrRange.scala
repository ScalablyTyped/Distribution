package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPv4CidrRange extends IpRange {
  
  // IPv4 address in CIDR notation
  var cidrAddress: js.UndefOr[String] = js.native
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
