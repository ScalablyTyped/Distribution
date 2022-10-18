package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOrganizationurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Organizationurl
}
object ApplicationjsonOrganizationurl {
  
  inline def apply(applicationSlashjson: Organizationurl): ApplicationjsonOrganizationurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOrganizationurl]
  }
  
  extension [Self <: ApplicationjsonOrganizationurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Organizationurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
