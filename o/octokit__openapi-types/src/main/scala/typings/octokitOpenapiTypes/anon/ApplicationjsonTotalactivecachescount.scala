package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotalactivecachescount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Totalactivecachescount
}
object ApplicationjsonTotalactivecachescount {
  
  inline def apply(applicationSlashjson: Totalactivecachescount): ApplicationjsonTotalactivecachescount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotalactivecachescount]
  }
  
  extension [Self <: ApplicationjsonTotalactivecachescount](x: Self) {
    
    inline def setApplicationSlashjson(value: Totalactivecachescount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
