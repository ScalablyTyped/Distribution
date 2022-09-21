package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIsalphanumeric extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Isalphanumeric
}
object ApplicationjsonIsalphanumeric {
  
  inline def apply(applicationSlashjson: Isalphanumeric): ApplicationjsonIsalphanumeric = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIsalphanumeric]
  }
  
  extension [Self <: ApplicationjsonIsalphanumeric](x: Self) {
    
    inline def setApplicationSlashjson(value: Isalphanumeric): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
