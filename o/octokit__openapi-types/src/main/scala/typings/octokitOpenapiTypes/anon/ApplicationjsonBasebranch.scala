package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBasebranch extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Basebranch
}
object ApplicationjsonBasebranch {
  
  inline def apply(applicationSlashjson: Basebranch): ApplicationjsonBasebranch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBasebranch]
  }
  
  extension [Self <: ApplicationjsonBasebranch](x: Self) {
    
    inline def setApplicationSlashjson(value: Basebranch): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
