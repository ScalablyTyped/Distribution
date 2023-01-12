package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDefault extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Default
}
object ApplicationjsonDefault {
  
  inline def apply(applicationSlashjson: Default): ApplicationjsonDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDefault] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Default): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
