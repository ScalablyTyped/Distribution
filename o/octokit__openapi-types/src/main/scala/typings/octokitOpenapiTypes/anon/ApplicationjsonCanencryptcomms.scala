package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCanencryptcomms extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Canencryptcomms
}
object ApplicationjsonCanencryptcomms {
  
  inline def apply(applicationSlashjson: Canencryptcomms): ApplicationjsonCanencryptcomms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCanencryptcomms]
  }
  
  extension [Self <: ApplicationjsonCanencryptcomms](x: Self) {
    
    inline def setApplicationSlashjson(value: Canencryptcomms): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
