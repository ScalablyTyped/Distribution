package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonHead extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Head
}
object ApplicationjsonHead {
  
  inline def apply(applicationSlashjson: Head): ApplicationjsonHead = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonHead]
  }
  
  extension [Self <: ApplicationjsonHead](x: Self) {
    
    inline def setApplicationSlashjson(value: Head): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
