package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonResolutioncomment extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Resolutioncomment
}
object ApplicationjsonResolutioncomment {
  
  inline def apply(applicationSlashjson: Resolutioncomment): ApplicationjsonResolutioncomment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonResolutioncomment]
  }
  
  extension [Self <: ApplicationjsonResolutioncomment](x: Self) {
    
    inline def setApplicationSlashjson(value: Resolutioncomment): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
