package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContext extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Context
}
object ApplicationjsonContext {
  
  inline def apply(applicationSlashjson: Context): ApplicationjsonContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContext]
  }
  
  extension [Self <: ApplicationjsonContext](x: Self) {
    
    inline def setApplicationSlashjson(value: Context): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
