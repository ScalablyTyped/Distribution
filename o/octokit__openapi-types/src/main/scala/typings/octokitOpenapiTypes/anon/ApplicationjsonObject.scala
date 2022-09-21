package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonObject extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Object
}
object ApplicationjsonObject {
  
  inline def apply(applicationSlashjson: Object): ApplicationjsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonObject]
  }
  
  extension [Self <: ApplicationjsonObject](x: Self) {
    
    inline def setApplicationSlashjson(value: Object): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
