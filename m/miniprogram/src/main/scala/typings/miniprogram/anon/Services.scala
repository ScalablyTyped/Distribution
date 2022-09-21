package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Services extends StObject {
  
  var services: js.Array[IsPrimary]
}
object Services {
  
  inline def apply(services: js.Array[IsPrimary]): Services = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  
  extension [Self <: Services](x: Self) {
    
    inline def setServices(value: js.Array[IsPrimary]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: IsPrimary*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
