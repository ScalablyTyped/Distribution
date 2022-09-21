package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonColorDescription extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ColorDescription
}
object ApplicationjsonColorDescription {
  
  inline def apply(applicationSlashjson: ColorDescription): ApplicationjsonColorDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonColorDescription]
  }
  
  extension [Self <: ApplicationjsonColorDescription](x: Self) {
    
    inline def setApplicationSlashjson(value: ColorDescription): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
