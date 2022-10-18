package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotaladvancedsecuritycommitters extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Totaladvancedsecuritycommitters
}
object ApplicationjsonTotaladvancedsecuritycommitters {
  
  inline def apply(applicationSlashjson: Totaladvancedsecuritycommitters): ApplicationjsonTotaladvancedsecuritycommitters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotaladvancedsecuritycommitters]
  }
  
  extension [Self <: ApplicationjsonTotaladvancedsecuritycommitters](x: Self) {
    
    inline def setApplicationSlashjson(value: Totaladvancedsecuritycommitters): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
