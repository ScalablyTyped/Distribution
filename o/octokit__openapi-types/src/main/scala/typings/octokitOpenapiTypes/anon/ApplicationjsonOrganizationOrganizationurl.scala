package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOrganizationOrganizationurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OrganizationOrganizationurl
}
object ApplicationjsonOrganizationOrganizationurl {
  
  inline def apply(applicationSlashjson: OrganizationOrganizationurl): ApplicationjsonOrganizationOrganizationurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOrganizationOrganizationurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonOrganizationOrganizationurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: OrganizationOrganizationurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
