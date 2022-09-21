package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNameString extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NameString
}
object ApplicationjsonNameString {
  
  inline def apply(applicationSlashjson: NameString): ApplicationjsonNameString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNameString]
  }
  
  extension [Self <: ApplicationjsonNameString](x: Self) {
    
    inline def setApplicationSlashjson(value: NameString): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
