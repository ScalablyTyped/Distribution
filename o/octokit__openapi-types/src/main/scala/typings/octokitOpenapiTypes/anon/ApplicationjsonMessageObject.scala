package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMessageObject extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: MessageObject
}
object ApplicationjsonMessageObject {
  
  inline def apply(applicationSlashjson: MessageObject): ApplicationjsonMessageObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMessageObject]
  }
  
  extension [Self <: ApplicationjsonMessageObject](x: Self) {
    
    inline def setApplicationSlashjson(value: MessageObject): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
