package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnabled extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Enabled
}
object ApplicationjsonEnabled {
  
  inline def apply(applicationSlashjson: Enabled): ApplicationjsonEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEnabled] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Enabled): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
