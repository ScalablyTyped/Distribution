package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedactionsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Selectedactionsurl
}
object ApplicationjsonSelectedactionsurl {
  
  inline def apply(applicationSlashjson: Selectedactionsurl): ApplicationjsonSelectedactionsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedactionsurl]
  }
  
  extension [Self <: ApplicationjsonSelectedactionsurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Selectedactionsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
