package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonReason extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Reason
}
object ApplicationjsonReason {
  
  inline def apply(applicationSlashjson: Reason): ApplicationjsonReason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonReason] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Reason): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
