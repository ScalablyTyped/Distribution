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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllowupdatebranch] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Allowupdatebranch): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
