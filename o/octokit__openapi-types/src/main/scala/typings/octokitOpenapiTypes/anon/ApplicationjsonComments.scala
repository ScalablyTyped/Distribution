package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonComments extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Comments
}
object ApplicationjsonComments {
  
  inline def apply(applicationSlashjson: Comments): ApplicationjsonComments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonComments]
  }
  
  extension [Self <: ApplicationjsonComments](x: Self) {
    
    inline def setApplicationSlashjson(value: Comments): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
