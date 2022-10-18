package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonConclusion extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Conclusion
}
object ApplicationjsonConclusion {
  
  inline def apply(applicationSlashjson: Conclusion): ApplicationjsonConclusion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonConclusion]
  }
  
  extension [Self <: ApplicationjsonConclusion](x: Self) {
    
    inline def setApplicationSlashjson(value: Conclusion): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
