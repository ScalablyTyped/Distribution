package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLabel extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Label
}
object ApplicationjsonLabel {
  
  inline def apply(applicationSlashjson: Label): ApplicationjsonLabel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLabel]
  }
  
  extension [Self <: ApplicationjsonLabel](x: Self) {
    
    inline def setApplicationSlashjson(value: Label): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
