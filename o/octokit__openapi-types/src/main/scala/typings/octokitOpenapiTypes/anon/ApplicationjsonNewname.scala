package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNewname extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Newname
}
object ApplicationjsonNewname {
  
  inline def apply(applicationSlashjson: Newname): ApplicationjsonNewname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNewname]
  }
  
  extension [Self <: ApplicationjsonNewname](x: Self) {
    
    inline def setApplicationSlashjson(value: Newname): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
