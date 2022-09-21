package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDisplayName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DisplayName_
}
object ApplicationjsonDisplayName {
  
  inline def apply(applicationSlashjson: DisplayName_): ApplicationjsonDisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDisplayName]
  }
  
  extension [Self <: ApplicationjsonDisplayName](x: Self) {
    
    inline def setApplicationSlashjson(value: DisplayName_): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
