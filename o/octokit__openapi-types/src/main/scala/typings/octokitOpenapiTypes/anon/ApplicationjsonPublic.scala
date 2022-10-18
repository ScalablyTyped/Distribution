package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPublic extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Public
}
object ApplicationjsonPublic {
  
  inline def apply(applicationSlashjson: Public): ApplicationjsonPublic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPublic]
  }
  
  extension [Self <: ApplicationjsonPublic](x: Self) {
    
    inline def setApplicationSlashjson(value: Public): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
