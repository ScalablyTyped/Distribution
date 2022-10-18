package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInreplyto extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Inreplyto
}
object ApplicationjsonInreplyto {
  
  inline def apply(applicationSlashjson: Inreplyto): ApplicationjsonInreplyto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInreplyto]
  }
  
  extension [Self <: ApplicationjsonInreplyto](x: Self) {
    
    inline def setApplicationSlashjson(value: Inreplyto): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
