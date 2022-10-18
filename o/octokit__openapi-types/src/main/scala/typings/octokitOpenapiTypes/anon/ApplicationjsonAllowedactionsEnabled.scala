package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowedactionsEnabled extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AllowedactionsEnabled
}
object ApplicationjsonAllowedactionsEnabled {
  
  inline def apply(applicationSlashjson: AllowedactionsEnabled): ApplicationjsonAllowedactionsEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowedactionsEnabled]
  }
  
  extension [Self <: ApplicationjsonAllowedactionsEnabled](x: Self) {
    
    inline def setApplicationSlashjson(value: AllowedactionsEnabled): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
