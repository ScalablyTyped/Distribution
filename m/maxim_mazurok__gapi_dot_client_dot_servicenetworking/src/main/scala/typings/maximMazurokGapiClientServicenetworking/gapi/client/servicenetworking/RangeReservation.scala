package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeReservation extends StObject {
  
  /**
    * Required. The size of the desired subnet. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR range. The goal is to determine if one of the allocated
    * ranges has enough free space for a subnet of the requested size.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. DO NOT USE - Under development. The size of the desired secondary ranges for the subnet. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR
    * range. The goal is to determine that the allocated ranges have enough free space for all the requested secondary ranges.
    */
  var secondaryRangeIpPrefixLengths: js.UndefOr[js.Array[Double]] = js.undefined
}
object RangeReservation {
  
  @scala.inline
  def apply(): RangeReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeReservation]
  }
  
  @scala.inline
  implicit class RangeReservationMutableBuilder[Self <: RangeReservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpPrefixLength(value: Double): Self = StObject.set(x, "ipPrefixLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPrefixLengthUndefined: Self = StObject.set(x, "ipPrefixLength", js.undefined)
    
    @scala.inline
    def setSecondaryRangeIpPrefixLengths(value: js.Array[Double]): Self = StObject.set(x, "secondaryRangeIpPrefixLengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryRangeIpPrefixLengthsUndefined: Self = StObject.set(x, "secondaryRangeIpPrefixLengths", js.undefined)
    
    @scala.inline
    def setSecondaryRangeIpPrefixLengthsVarargs(value: Double*): Self = StObject.set(x, "secondaryRangeIpPrefixLengths", js.Array(value :_*))
  }
}
