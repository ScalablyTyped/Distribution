package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPrivacy extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Privacy
}
object ApplicationjsonPrivacy {
  
  inline def apply(applicationSlashjson: Privacy): ApplicationjsonPrivacy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPrivacy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonPrivacy] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Privacy): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
