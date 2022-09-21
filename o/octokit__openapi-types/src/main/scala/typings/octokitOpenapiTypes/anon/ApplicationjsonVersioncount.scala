package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonVersioncount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Versioncount
}
object ApplicationjsonVersioncount {
  
  inline def apply(applicationSlashjson: Versioncount): ApplicationjsonVersioncount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonVersioncount]
  }
  
  extension [Self <: ApplicationjsonVersioncount](x: Self) {
    
    inline def setApplicationSlashjson(value: Versioncount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
