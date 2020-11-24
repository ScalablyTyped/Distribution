package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeReservation extends js.Object {
  
  /**
    * Required. The size of the desired subnet. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR range. The goal is to determine if one of the allocated
    * ranges has enough free space for a subnet of the requested size.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  
  /**
    * Optional. DO NOT USE - Under development. The size of the desired secondary ranges for the subnet. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR
    * range. The goal is to determine that the allocated ranges have enough free space for all the requested secondary ranges.
    */
  var secondaryRangeIpPrefixLengths: js.UndefOr[js.Array[Double]] = js.native
}
object RangeReservation {
  
  @scala.inline
  def apply(): RangeReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeReservation]
  }
  
  @scala.inline
  implicit class RangeReservationOps[Self <: RangeReservation] (val x: Self) extends AnyVal {
    
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
    def setIpPrefixLength(value: Double): Self = this.set("ipPrefixLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpPrefixLength: Self = this.set("ipPrefixLength", js.undefined)
    
    @scala.inline
    def setSecondaryRangeIpPrefixLengthsVarargs(value: Double*): Self = this.set("secondaryRangeIpPrefixLengths", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryRangeIpPrefixLengths(value: js.Array[Double]): Self = this.set("secondaryRangeIpPrefixLengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryRangeIpPrefixLengths: Self = this.set("secondaryRangeIpPrefixLengths", js.undefined)
  }
}
