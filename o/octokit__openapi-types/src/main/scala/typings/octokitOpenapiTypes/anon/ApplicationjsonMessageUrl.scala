package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMessageUrl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: MessageUrl
}
object ApplicationjsonMessageUrl {
  
  inline def apply(applicationSlashjson: MessageUrl): ApplicationjsonMessageUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMessageUrl]
  }
  
  extension [Self <: ApplicationjsonMessageUrl](x: Self) {
    
    inline def setApplicationSlashjson(value: MessageUrl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
