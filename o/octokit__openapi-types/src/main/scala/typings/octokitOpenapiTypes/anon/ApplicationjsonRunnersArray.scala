package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunnersArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RunnersArray
}
object ApplicationjsonRunnersArray {
  
  inline def apply(applicationSlashjson: RunnersArray): ApplicationjsonRunnersArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunnersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRunnersArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RunnersArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
