package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAccesstoken extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Accesstoken
}
object ApplicationjsonAccesstoken {
  
  inline def apply(applicationSlashjson: Accesstoken): ApplicationjsonAccesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAccesstoken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAccesstoken] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Accesstoken): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
