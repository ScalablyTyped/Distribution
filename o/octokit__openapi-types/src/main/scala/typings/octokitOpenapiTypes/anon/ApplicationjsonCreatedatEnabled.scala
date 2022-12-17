package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreatedatEnabled extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CreatedatEnabled
}
object ApplicationjsonCreatedatEnabled {
  
  inline def apply(applicationSlashjson: CreatedatEnabled): ApplicationjsonCreatedatEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreatedatEnabled]
  }
  
  extension [Self <: ApplicationjsonCreatedatEnabled](x: Self) {
    
    inline def setApplicationSlashjson(value: CreatedatEnabled): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
