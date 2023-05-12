package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncludeclaimkeysArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: IncludeclaimkeysArray
}
object ApplicationjsonIncludeclaimkeysArray {
  
  inline def apply(applicationSlashjson: IncludeclaimkeysArray): ApplicationjsonIncludeclaimkeysArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncludeclaimkeysArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonIncludeclaimkeysArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: IncludeclaimkeysArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
