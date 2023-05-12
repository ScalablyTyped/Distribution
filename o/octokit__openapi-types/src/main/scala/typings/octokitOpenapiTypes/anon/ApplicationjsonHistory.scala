package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonHistory extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: History
}
object ApplicationjsonHistory {
  
  inline def apply(applicationSlashjson: History): ApplicationjsonHistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonHistory] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: History): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
