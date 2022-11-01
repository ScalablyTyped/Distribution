package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Country
import typings.navermaps.naver.maps.PointObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressItem extends StObject {
  
  var addrdetail: Country
  
  var address: String
  
  var isRoadAddress: Boolean
  
  var point: PointObjectLiteral
}
object AddressItem {
  
  inline def apply(addrdetail: Country, address: String, isRoadAddress: Boolean, point: PointObjectLiteral): AddressItem = {
    val __obj = js.Dynamic.literal(addrdetail = addrdetail.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], isRoadAddress = isRoadAddress.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressItem]
  }
  
  extension [Self <: AddressItem](x: Self) {
    
    inline def setAddrdetail(value: Country): Self = StObject.set(x, "addrdetail", value.asInstanceOf[js.Any])
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setIsRoadAddress(value: Boolean): Self = StObject.set(x, "isRoadAddress", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: PointObjectLiteral): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
