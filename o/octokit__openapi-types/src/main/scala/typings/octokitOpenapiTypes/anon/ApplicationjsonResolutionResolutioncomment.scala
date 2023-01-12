package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonResolutionResolutioncomment extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ResolutionResolutioncomment
}
object ApplicationjsonResolutionResolutioncomment {
  
  inline def apply(applicationSlashjson: ResolutionResolutioncomment): ApplicationjsonResolutionResolutioncomment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonResolutionResolutioncomment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonResolutionResolutioncomment] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ResolutionResolutioncomment): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
