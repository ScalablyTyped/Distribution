package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDocumentation extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Documentation
}
object ApplicationjsonDocumentation {
  
  inline def apply(applicationSlashjson: Documentation): ApplicationjsonDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDocumentation]
  }
  
  extension [Self <: ApplicationjsonDocumentation](x: Self) {
    
    inline def setApplicationSlashjson(value: Documentation): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
