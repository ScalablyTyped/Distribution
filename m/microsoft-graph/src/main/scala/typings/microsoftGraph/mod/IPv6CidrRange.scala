package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPv6CidrRange extends IpRange {
  
  // IPv6 address in CIDR notation
  var cidrAddress: js.UndefOr[String] = js.native
}
object IPv6CidrRange {
  
  @scala.inline
  def apply(): IPv6CidrRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPv6CidrRange]
  }
  
  @scala.inline
  implicit class IPv6CidrRangeOps[Self <: IPv6CidrRange] (val x: Self) extends AnyVal {
    
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
    def setCidrAddress(value: String): Self = this.set("cidrAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrAddress: Self = this.set("cidrAddress", js.undefined)
  }
}
