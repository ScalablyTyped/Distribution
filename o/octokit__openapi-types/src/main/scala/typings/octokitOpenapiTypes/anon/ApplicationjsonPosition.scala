package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPosition extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Position
}
object ApplicationjsonPosition {
  
  inline def apply(applicationSlashjson: Position): ApplicationjsonPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPosition]
  }
  
  extension [Self <: ApplicationjsonPosition](x: Self) {
    
    inline def setApplicationSlashjson(value: Position): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
