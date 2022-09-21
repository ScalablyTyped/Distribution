package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInreplytoid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Inreplytoid
}
object ApplicationjsonInreplytoid {
  
  inline def apply(applicationSlashjson: Inreplytoid): ApplicationjsonInreplytoid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInreplytoid]
  }
  
  extension [Self <: ApplicationjsonInreplytoid](x: Self) {
    
    inline def setApplicationSlashjson(value: Inreplytoid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
