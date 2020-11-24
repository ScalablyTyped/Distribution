package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpNamedLocation extends NamedLocation {
  
  // List of IP address ranges in IPv4 CIDR format (e.g. 1.2.3.4/32) or any allowable IPv6 format from IETF RFC596.
  var ipRanges: js.UndefOr[js.Array[IpRange]] = js.native
  
  // True if this location is explicitly trusted.
  var isTrusted: js.UndefOr[Boolean] = js.native
}
object IpNamedLocation {
  
  @scala.inline
  def apply(): IpNamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpNamedLocation]
  }
  
  @scala.inline
  implicit class IpNamedLocationOps[Self <: IpNamedLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIpRangesVarargs(value: IpRange*): Self = this.set("ipRanges", js.Array(value :_*))
    
    @scala.inline
    def setIpRanges(value: js.Array[IpRange]): Self = this.set("ipRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpRanges: Self = this.set("ipRanges", js.undefined)
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTrusted: Self = this.set("isTrusted", js.undefined)
  }
}
