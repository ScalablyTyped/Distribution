package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContextsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ContextsArray
}
object ApplicationjsonContextsArray {
  
  inline def apply(applicationSlashjson: ContextsArray): ApplicationjsonContextsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContextsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonContextsArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ContextsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
