package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonShaString extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ShaString
}
object ApplicationjsonShaString {
  
  inline def apply(applicationSlashjson: ShaString): ApplicationjsonShaString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonShaString]
  }
  
  extension [Self <: ApplicationjsonShaString](x: Self) {
    
    inline def setApplicationSlashjson(value: ShaString): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
