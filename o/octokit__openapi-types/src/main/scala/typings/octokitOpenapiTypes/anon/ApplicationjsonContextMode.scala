package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContextMode extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ContextMode
}
object ApplicationjsonContextMode {
  
  inline def apply(applicationSlashjson: ContextMode): ApplicationjsonContextMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContextMode]
  }
  
  extension [Self <: ApplicationjsonContextMode](x: Self) {
    
    inline def setApplicationSlashjson(value: ContextMode): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
