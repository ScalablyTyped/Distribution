package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOrganizationsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OrganizationsTotalcount
}
object ApplicationjsonOrganizationsTotalcount {
  
  inline def apply(applicationSlashjson: OrganizationsTotalcount): ApplicationjsonOrganizationsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOrganizationsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonOrganizationsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: OrganizationsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
