package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAction extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Action
}
object ApplicationjsonAction {
  
  inline def apply(applicationSlashjson: Action): ApplicationjsonAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAction] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Action): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
