package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNodeidObject extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NodeidObject
}
object ApplicationjsonNodeidObject {
  
  inline def apply(applicationSlashjson: NodeidObject): ApplicationjsonNodeidObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNodeidObject]
  }
  
  extension [Self <: ApplicationjsonNodeidObject](x: Self) {
    
    inline def setApplicationSlashjson(value: NodeidObject): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
