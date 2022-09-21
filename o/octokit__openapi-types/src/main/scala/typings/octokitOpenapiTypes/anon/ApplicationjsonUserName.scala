package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonUserName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: UserName_
}
object ApplicationjsonUserName {
  
  inline def apply(applicationSlashjson: UserName_): ApplicationjsonUserName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonUserName]
  }
  
  extension [Self <: ApplicationjsonUserName](x: Self) {
    
    inline def setApplicationSlashjson(value: UserName_): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
