package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExcludegitdata extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Excludegitdata
}
object ApplicationjsonExcludegitdata {
  
  inline def apply(applicationSlashjson: Excludegitdata): ApplicationjsonExcludegitdata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExcludegitdata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonExcludegitdata] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Excludegitdata): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
