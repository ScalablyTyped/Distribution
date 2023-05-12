package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLocked extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Locked
}
object ApplicationjsonLocked {
  
  inline def apply(applicationSlashjson: Locked): ApplicationjsonLocked = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLocked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonLocked] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Locked): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
