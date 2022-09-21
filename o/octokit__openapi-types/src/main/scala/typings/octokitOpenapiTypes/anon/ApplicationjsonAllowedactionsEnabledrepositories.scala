package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowedactionsEnabledrepositories extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AllowedactionsEnabledrepositories
}
object ApplicationjsonAllowedactionsEnabledrepositories {
  
  inline def apply(applicationSlashjson: AllowedactionsEnabledrepositories): ApplicationjsonAllowedactionsEnabledrepositories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowedactionsEnabledrepositories]
  }
  
  extension [Self <: ApplicationjsonAllowedactionsEnabledrepositories](x: Self) {
    
    inline def setApplicationSlashjson(value: AllowedactionsEnabledrepositories): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
