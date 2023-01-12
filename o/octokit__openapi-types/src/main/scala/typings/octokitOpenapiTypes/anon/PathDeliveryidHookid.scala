package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeliveryidHookid extends StObject {
  
  var path: DeliveryidHookid
}
object PathDeliveryidHookid {
  
  inline def apply(path: DeliveryidHookid): PathDeliveryidHookid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeliveryidHookid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDeliveryidHookid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DeliveryidHookid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
