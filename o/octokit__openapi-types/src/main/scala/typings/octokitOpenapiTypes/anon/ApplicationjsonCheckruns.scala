package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCheckruns extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Checkruns
}
object ApplicationjsonCheckruns {
  
  inline def apply(applicationSlashjson: Checkruns): ApplicationjsonCheckruns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCheckruns]
  }
  
  extension [Self <: ApplicationjsonCheckruns](x: Self) {
    
    inline def setApplicationSlashjson(value: Checkruns): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
