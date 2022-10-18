package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAppslug extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Appslug
}
object ApplicationjsonAppslug {
  
  inline def apply(applicationSlashjson: Appslug): ApplicationjsonAppslug = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAppslug]
  }
  
  extension [Self <: ApplicationjsonAppslug](x: Self) {
    
    inline def setApplicationSlashjson(value: Appslug): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
