package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnabledSelectedactionsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EnabledSelectedactionsurl
}
object ApplicationjsonEnabledSelectedactionsurl {
  
  inline def apply(applicationSlashjson: EnabledSelectedactionsurl): ApplicationjsonEnabledSelectedactionsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnabledSelectedactionsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEnabledSelectedactionsurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: EnabledSelectedactionsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
