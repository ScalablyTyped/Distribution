package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressItemV2 extends StObject {
  
  var addressElements: js.Array[Code]
  
  var distance: String
  
  var englishAddress: String
  
  var jibunAddress: String
  
  var roadAddress: String
  
  var x: String
  
  var y: String
}
object AddressItemV2 {
  
  inline def apply(
    addressElements: js.Array[Code],
    distance: String,
    englishAddress: String,
    jibunAddress: String,
    roadAddress: String,
    x: String,
    y: String
  ): AddressItemV2 = {
    val __obj = js.Dynamic.literal(addressElements = addressElements.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], englishAddress = englishAddress.asInstanceOf[js.Any], jibunAddress = jibunAddress.asInstanceOf[js.Any], roadAddress = roadAddress.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressItemV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressItemV2] (val x: Self) extends AnyVal {
    
    inline def setAddressElements(value: js.Array[Code]): Self = StObject.set(x, "addressElements", value.asInstanceOf[js.Any])
    
    inline def setAddressElementsVarargs(value: Code*): Self = StObject.set(x, "addressElements", js.Array(value*))
    
    inline def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setEnglishAddress(value: String): Self = StObject.set(x, "englishAddress", value.asInstanceOf[js.Any])
    
    inline def setJibunAddress(value: String): Self = StObject.set(x, "jibunAddress", value.asInstanceOf[js.Any])
    
    inline def setRoadAddress(value: String): Self = StObject.set(x, "roadAddress", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
