package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDescriptionNewname extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DescriptionNewname
}
object ApplicationjsonDescriptionNewname {
  
  inline def apply(applicationSlashjson: DescriptionNewname): ApplicationjsonDescriptionNewname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDescriptionNewname]
  }
  
  extension [Self <: ApplicationjsonDescriptionNewname](x: Self) {
    
    inline def setApplicationSlashjson(value: DescriptionNewname): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
