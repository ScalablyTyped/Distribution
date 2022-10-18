package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Action]
}
object ApplicationjsonArray {
  
  inline def apply(applicationSlashjson: js.Array[Action]): ApplicationjsonArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonArray]
  }
  
  extension [Self <: ApplicationjsonArray](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Action]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Action*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
