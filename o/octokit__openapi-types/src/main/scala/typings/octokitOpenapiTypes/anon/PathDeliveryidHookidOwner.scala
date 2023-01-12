package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeliveryidHookidOwner extends StObject {
  
  var path: DeliveryidHookidOwner
}
object PathDeliveryidHookidOwner {
  
  inline def apply(path: DeliveryidHookidOwner): PathDeliveryidHookidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeliveryidHookidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDeliveryidHookidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DeliveryidHookidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
