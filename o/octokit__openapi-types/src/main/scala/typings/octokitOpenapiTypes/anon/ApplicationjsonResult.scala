package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonResult extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Result
}
object ApplicationjsonResult {
  
  inline def apply(applicationSlashjson: Result): ApplicationjsonResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonResult]
  }
  
  extension [Self <: ApplicationjsonResult](x: Self) {
    
    inline def setApplicationSlashjson(value: Result): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
