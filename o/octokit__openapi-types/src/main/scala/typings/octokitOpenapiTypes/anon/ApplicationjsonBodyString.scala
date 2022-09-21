package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyString extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyString
}
object ApplicationjsonBodyString {
  
  inline def apply(applicationSlashjson: BodyString): ApplicationjsonBodyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyString]
  }
  
  extension [Self <: ApplicationjsonBodyString](x: Self) {
    
    inline def setApplicationSlashjson(value: BodyString): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
