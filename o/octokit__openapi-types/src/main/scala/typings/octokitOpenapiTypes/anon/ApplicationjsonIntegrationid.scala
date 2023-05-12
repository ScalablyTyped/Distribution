package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIntegrationid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Integrationid
}
object ApplicationjsonIntegrationid {
  
  inline def apply(applicationSlashjson: Integrationid): ApplicationjsonIntegrationid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIntegrationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonIntegrationid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Integrationid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
