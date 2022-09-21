package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodytext extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Bodytext
}
object ApplicationjsonBodytext {
  
  inline def apply(applicationSlashjson: Bodytext): ApplicationjsonBodytext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodytext]
  }
  
  extension [Self <: ApplicationjsonBodytext](x: Self) {
    
    inline def setApplicationSlashjson(value: Bodytext): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
