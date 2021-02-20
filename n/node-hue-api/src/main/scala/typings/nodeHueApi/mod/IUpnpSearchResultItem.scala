package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUpnpSearchResultItem extends StObject {
  
  var id: String = js.native
  
  var ipaddress: String = js.native
}
object IUpnpSearchResultItem {
  
  @scala.inline
  def apply(id: String, ipaddress: String): IUpnpSearchResultItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ipaddress = ipaddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpnpSearchResultItem]
  }
  
  @scala.inline
  implicit class IUpnpSearchResultItemMutableBuilder[Self <: IUpnpSearchResultItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpaddress(value: String): Self = StObject.set(x, "ipaddress", value.asInstanceOf[js.Any])
  }
}
