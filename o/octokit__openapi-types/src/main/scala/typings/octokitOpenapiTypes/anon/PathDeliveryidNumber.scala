package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeliveryidNumber extends StObject {
  
  var path: DeliveryidNumber
}
object PathDeliveryidNumber {
  
  inline def apply(path: DeliveryidNumber): PathDeliveryidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeliveryidNumber]
  }
  
  extension [Self <: PathDeliveryidNumber](x: Self) {
    
    inline def setPath(value: DeliveryidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
