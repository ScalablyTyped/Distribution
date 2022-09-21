package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreatedatName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CreatedatName
}
object ApplicationjsonCreatedatName {
  
  inline def apply(applicationSlashjson: CreatedatName): ApplicationjsonCreatedatName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreatedatName]
  }
  
  extension [Self <: ApplicationjsonCreatedatName](x: Self) {
    
    inline def setApplicationSlashjson(value: CreatedatName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
