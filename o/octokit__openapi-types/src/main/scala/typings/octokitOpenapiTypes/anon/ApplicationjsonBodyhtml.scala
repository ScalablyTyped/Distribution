package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyhtml extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Bodyhtml
}
object ApplicationjsonBodyhtml {
  
  inline def apply(applicationSlashjson: Bodyhtml): ApplicationjsonBodyhtml = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyhtml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBodyhtml] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Bodyhtml): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
