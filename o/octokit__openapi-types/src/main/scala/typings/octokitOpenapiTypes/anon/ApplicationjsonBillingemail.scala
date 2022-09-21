package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBillingemail extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Billingemail
}
object ApplicationjsonBillingemail {
  
  inline def apply(applicationSlashjson: Billingemail): ApplicationjsonBillingemail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBillingemail]
  }
  
  extension [Self <: ApplicationjsonBillingemail](x: Self) {
    
    inline def setApplicationSlashjson(value: Billingemail): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
