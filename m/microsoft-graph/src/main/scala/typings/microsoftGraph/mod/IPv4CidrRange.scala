package typings.microsoftGraph.mod

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
  implicit class IPv4CidrRangeOps[Self <: IPv4CidrRange] (val x: Self) extends AnyVal {
    
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
