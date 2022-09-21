package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEncoding extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Encoding
}
object ApplicationjsonEncoding {
  
  inline def apply(applicationSlashjson: Encoding): ApplicationjsonEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEncoding]
  }
  
  extension [Self <: ApplicationjsonEncoding](x: Self) {
    
    inline def setApplicationSlashjson(value: Encoding): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
