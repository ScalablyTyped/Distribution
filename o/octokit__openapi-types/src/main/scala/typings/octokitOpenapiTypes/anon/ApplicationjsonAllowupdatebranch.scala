package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowupdatebranch extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowupdatebranch
}
object ApplicationjsonAllowupdatebranch {
  
  inline def apply(applicationSlashjson: Allowupdatebranch): ApplicationjsonAllowupdatebranch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowupdatebranch]
  }
  
  extension [Self <: ApplicationjsonAllowupdatebranch](x: Self) {
    
    inline def setApplicationSlashjson(value: Allowupdatebranch): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
