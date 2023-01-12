package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBaserole extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Baserole
}
object ApplicationjsonBaserole {
  
  inline def apply(applicationSlashjson: Baserole): ApplicationjsonBaserole = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBaserole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBaserole] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Baserole): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
