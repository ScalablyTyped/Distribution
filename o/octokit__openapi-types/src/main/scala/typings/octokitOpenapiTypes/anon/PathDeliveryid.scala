package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeliveryid extends StObject {
  
  var path: Deliveryid
}
object PathDeliveryid {
  
  inline def apply(path: Deliveryid): PathDeliveryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeliveryid]
  }
  
  extension [Self <: PathDeliveryid](x: Self) {
    
    inline def setPath(value: Deliveryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
