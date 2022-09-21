package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCustom404 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Custom404
}
object ApplicationjsonCustom404 {
  
  inline def apply(applicationSlashjson: Custom404): ApplicationjsonCustom404 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCustom404]
  }
  
  extension [Self <: ApplicationjsonCustom404](x: Self) {
    
    inline def setApplicationSlashjson(value: Custom404): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
