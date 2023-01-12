package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncompleteresultsBoolean extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: IncompleteresultsBoolean
}
object ApplicationjsonIncompleteresultsBoolean {
  
  inline def apply(applicationSlashjson: IncompleteresultsBoolean): ApplicationjsonIncompleteresultsBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncompleteresultsBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonIncompleteresultsBoolean] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: IncompleteresultsBoolean): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
