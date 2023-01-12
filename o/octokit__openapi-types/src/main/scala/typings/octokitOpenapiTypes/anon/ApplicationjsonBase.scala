package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBase extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Base
}
object ApplicationjsonBase {
  
  inline def apply(applicationSlashjson: Base): ApplicationjsonBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBase] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Base): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
