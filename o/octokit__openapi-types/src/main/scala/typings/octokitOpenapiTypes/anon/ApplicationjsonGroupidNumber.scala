package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonGroupidNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: GroupidNumber
}
object ApplicationjsonGroupidNumber {
  
  inline def apply(applicationSlashjson: GroupidNumber): ApplicationjsonGroupidNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonGroupidNumber]
  }
  
  extension [Self <: ApplicationjsonGroupidNumber](x: Self) {
    
    inline def setApplicationSlashjson(value: GroupidNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
