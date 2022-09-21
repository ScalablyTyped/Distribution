package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMostrecentinstance extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Mostrecentinstance
}
object ApplicationjsonMostrecentinstance {
  
  inline def apply(applicationSlashjson: Mostrecentinstance): ApplicationjsonMostrecentinstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMostrecentinstance]
  }
  
  extension [Self <: ApplicationjsonMostrecentinstance](x: Self) {
    
    inline def setApplicationSlashjson(value: Mostrecentinstance): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
