package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecondaryIpRange extends js.Object {
  
  /** Secondary IP CIDR range in `x.x.x.x/y` format. */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /** Name of the secondary IP range. */
  var rangeName: js.UndefOr[String] = js.native
}
object SecondaryIpRange {
  
  @scala.inline
  def apply(): SecondaryIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecondaryIpRange]
  }
  
  @scala.inline
  implicit class SecondaryIpRangeOps[Self <: SecondaryIpRange] (val x: Self) extends AnyVal {
    
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
    def setIpCidrRange(value: String): Self = this.set("ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpCidrRange: Self = this.set("ipCidrRange", js.undefined)
    
    @scala.inline
    def setRangeName(value: String): Self = this.set("rangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeName: Self = this.set("rangeName", js.undefined)
  }
}
