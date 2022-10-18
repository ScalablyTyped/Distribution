package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyComments extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyComments
}
object ApplicationjsonBodyComments {
  
  inline def apply(applicationSlashjson: BodyComments): ApplicationjsonBodyComments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyComments]
  }
  
  extension [Self <: ApplicationjsonBodyComments](x: Self) {
    
    inline def setApplicationSlashjson(value: BodyComments): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
