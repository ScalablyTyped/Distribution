package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonApi extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Api
}
object ApplicationjsonApi {
  
  inline def apply(applicationSlashjson: Api): ApplicationjsonApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonApi]
  }
  
  extension [Self <: ApplicationjsonApi](x: Self) {
    
    inline def setApplicationSlashjson(value: Api): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
