package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeliveryidHookidOrg extends StObject {
  
  var path: DeliveryidHookidOrg
}
object PathDeliveryidHookidOrg {
  
  inline def apply(path: DeliveryidHookidOrg): PathDeliveryidHookidOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeliveryidHookidOrg]
  }
  
  extension [Self <: PathDeliveryidHookidOrg](x: Self) {
    
    inline def setPath(value: DeliveryidHookidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
