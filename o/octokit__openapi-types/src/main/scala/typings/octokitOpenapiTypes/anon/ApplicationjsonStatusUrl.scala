package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonStatusUrl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: StatusUrl
}
object ApplicationjsonStatusUrl {
  
  inline def apply(applicationSlashjson: StatusUrl): ApplicationjsonStatusUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonStatusUrl]
  }
  
  extension [Self <: ApplicationjsonStatusUrl](x: Self) {
    
    inline def setApplicationSlashjson(value: StatusUrl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
