package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonUrl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Url
}
object ApplicationjsonUrl {
  
  inline def apply(applicationSlashjson: Url): ApplicationjsonUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonUrl]
  }
  
  extension [Self <: ApplicationjsonUrl](x: Self) {
    
    inline def setApplicationSlashjson(value: Url): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
