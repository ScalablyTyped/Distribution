package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAccounturls extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Accounturls
}
object ApplicationjsonAccounturls {
  
  inline def apply(applicationSlashjson: Accounturls): ApplicationjsonAccounturls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAccounturls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAccounturls] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Accounturls): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
