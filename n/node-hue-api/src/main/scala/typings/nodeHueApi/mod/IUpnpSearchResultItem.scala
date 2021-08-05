package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpnpSearchResultItem extends StObject {
  
  var id: String
  
  var ipaddress: String
}
object IUpnpSearchResultItem {
  
  inline def apply(id: String, ipaddress: String): IUpnpSearchResultItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ipaddress = ipaddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpnpSearchResultItem]
  }
  
  extension [Self <: IUpnpSearchResultItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIpaddress(value: String): Self = StObject.set(x, "ipaddress", value.asInstanceOf[js.Any])
  }
}
