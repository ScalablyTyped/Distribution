package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson214 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `214`
}
object Applicationjson214 {
  
  inline def apply(applicationSlashjson: `214`): Applicationjson214 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson214]
  }
  
  extension [Self <: Applicationjson214](x: Self) {
    
    inline def setApplicationSlashjson(value: `214`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
