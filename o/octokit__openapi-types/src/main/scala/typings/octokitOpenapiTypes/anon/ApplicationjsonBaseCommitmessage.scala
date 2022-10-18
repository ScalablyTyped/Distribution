package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBaseCommitmessage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BaseCommitmessage
}
object ApplicationjsonBaseCommitmessage {
  
  inline def apply(applicationSlashjson: BaseCommitmessage): ApplicationjsonBaseCommitmessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBaseCommitmessage]
  }
  
  extension [Self <: ApplicationjsonBaseCommitmessage](x: Self) {
    
    inline def setApplicationSlashjson(value: BaseCommitmessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
