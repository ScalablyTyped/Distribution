package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonGroups extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Groups
}
object ApplicationjsonGroups {
  
  inline def apply(applicationSlashjson: Groups): ApplicationjsonGroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonGroups]
  }
  
  extension [Self <: ApplicationjsonGroups](x: Self) {
    
    inline def setApplicationSlashjson(value: Groups): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
