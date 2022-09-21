package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonStrict extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Strict
}
object ApplicationjsonStrict {
  
  inline def apply(applicationSlashjson: Strict): ApplicationjsonStrict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonStrict]
  }
  
  extension [Self <: ApplicationjsonStrict](x: Self) {
    
    inline def setApplicationSlashjson(value: Strict): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
