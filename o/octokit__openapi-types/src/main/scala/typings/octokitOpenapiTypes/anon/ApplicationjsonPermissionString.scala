package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPermissionString extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: PermissionString
}
object ApplicationjsonPermissionString {
  
  inline def apply(applicationSlashjson: PermissionString): ApplicationjsonPermissionString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPermissionString]
  }
  
  extension [Self <: ApplicationjsonPermissionString](x: Self) {
    
    inline def setApplicationSlashjson(value: PermissionString): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
