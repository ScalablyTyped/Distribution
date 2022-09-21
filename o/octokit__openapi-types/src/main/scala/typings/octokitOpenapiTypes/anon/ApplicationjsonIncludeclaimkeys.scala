package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncludeclaimkeys extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Includeclaimkeys
}
object ApplicationjsonIncludeclaimkeys {
  
  inline def apply(applicationSlashjson: Includeclaimkeys): ApplicationjsonIncludeclaimkeys = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncludeclaimkeys]
  }
  
  extension [Self <: ApplicationjsonIncludeclaimkeys](x: Self) {
    
    inline def setApplicationSlashjson(value: Includeclaimkeys): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
