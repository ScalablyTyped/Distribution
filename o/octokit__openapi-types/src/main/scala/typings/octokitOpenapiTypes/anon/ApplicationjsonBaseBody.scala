package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBaseBody extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BaseBody
}
object ApplicationjsonBaseBody {
  
  inline def apply(applicationSlashjson: BaseBody): ApplicationjsonBaseBody = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBaseBody]
  }
  
  extension [Self <: ApplicationjsonBaseBody](x: Self) {
    
    inline def setApplicationSlashjson(value: BaseBody): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
