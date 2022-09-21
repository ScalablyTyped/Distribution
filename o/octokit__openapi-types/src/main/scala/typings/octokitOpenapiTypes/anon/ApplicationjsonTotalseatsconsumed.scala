package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotalseatsconsumed extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Totalseatsconsumed
}
object ApplicationjsonTotalseatsconsumed {
  
  inline def apply(applicationSlashjson: Totalseatsconsumed): ApplicationjsonTotalseatsconsumed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotalseatsconsumed]
  }
  
  extension [Self <: ApplicationjsonTotalseatsconsumed](x: Self) {
    
    inline def setApplicationSlashjson(value: Totalseatsconsumed): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
