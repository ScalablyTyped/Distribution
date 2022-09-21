package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTfvcproject extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Tfvcproject
}
object ApplicationjsonTfvcproject {
  
  inline def apply(applicationSlashjson: Tfvcproject): ApplicationjsonTfvcproject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTfvcproject]
  }
  
  extension [Self <: ApplicationjsonTfvcproject](x: Self) {
    
    inline def setApplicationSlashjson(value: Tfvcproject): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
