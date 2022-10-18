package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAutoinit extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Autoinit
}
object ApplicationjsonAutoinit {
  
  inline def apply(applicationSlashjson: Autoinit): ApplicationjsonAutoinit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAutoinit]
  }
  
  extension [Self <: ApplicationjsonAutoinit](x: Self) {
    
    inline def setApplicationSlashjson(value: Autoinit): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
