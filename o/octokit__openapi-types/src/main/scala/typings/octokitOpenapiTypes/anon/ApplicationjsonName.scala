package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Name
}
object ApplicationjsonName {
  
  inline def apply(applicationSlashjson: Name): ApplicationjsonName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonName]
  }
  
  extension [Self <: ApplicationjsonName](x: Self) {
    
    inline def setApplicationSlashjson(value: Name): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
