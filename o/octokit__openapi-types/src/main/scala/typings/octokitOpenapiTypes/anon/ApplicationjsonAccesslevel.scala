package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAccesslevel extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Accesslevel
}
object ApplicationjsonAccesslevel {
  
  inline def apply(applicationSlashjson: Accesslevel): ApplicationjsonAccesslevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAccesslevel]
  }
  
  extension [Self <: ApplicationjsonAccesslevel](x: Self) {
    
    inline def setApplicationSlashjson(value: Accesslevel): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
