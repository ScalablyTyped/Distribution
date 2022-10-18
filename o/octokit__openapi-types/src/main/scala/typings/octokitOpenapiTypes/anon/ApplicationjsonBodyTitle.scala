package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyTitle extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyTitle
}
object ApplicationjsonBodyTitle {
  
  inline def apply(applicationSlashjson: BodyTitle): ApplicationjsonBodyTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyTitle]
  }
  
  extension [Self <: ApplicationjsonBodyTitle](x: Self) {
    
    inline def setApplicationSlashjson(value: BodyTitle): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
