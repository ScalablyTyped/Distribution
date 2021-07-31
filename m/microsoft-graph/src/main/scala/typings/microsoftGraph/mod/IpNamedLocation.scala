package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpNamedLocation
  extends StObject
     with NamedLocation {
  
  // List of IP address ranges in IPv4 CIDR format (e.g. 1.2.3.4/32) or any allowable IPv6 format from IETF RFC596.
  var ipRanges: js.UndefOr[js.Array[IpRange]] = js.undefined
  
  // True if this location is explicitly trusted.
  var isTrusted: js.UndefOr[Boolean] = js.undefined
}
object IpNamedLocation {
  
  @scala.inline
  def apply(): IpNamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpNamedLocation]
  }
  
  @scala.inline
  implicit class IpNamedLocationMutableBuilder[Self <: IpNamedLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpRanges(value: js.Array[IpRange]): Self = StObject.set(x, "ipRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRangesUndefined: Self = StObject.set(x, "ipRanges", js.undefined)
    
    @scala.inline
    def setIpRangesVarargs(value: IpRange*): Self = StObject.set(x, "ipRanges", js.Array(value :_*))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
  }
}
