package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonHireable extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Hireable
}
object ApplicationjsonHireable {
  
  inline def apply(applicationSlashjson: Hireable): ApplicationjsonHireable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonHireable]
  }
  
  extension [Self <: ApplicationjsonHireable](x: Self) {
    
    inline def setApplicationSlashjson(value: Hireable): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
