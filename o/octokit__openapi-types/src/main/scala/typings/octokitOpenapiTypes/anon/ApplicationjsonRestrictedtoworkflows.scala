package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRestrictedtoworkflows extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Restrictedtoworkflows
}
object ApplicationjsonRestrictedtoworkflows {
  
  inline def apply(applicationSlashjson: Restrictedtoworkflows): ApplicationjsonRestrictedtoworkflows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRestrictedtoworkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRestrictedtoworkflows] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Restrictedtoworkflows): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
