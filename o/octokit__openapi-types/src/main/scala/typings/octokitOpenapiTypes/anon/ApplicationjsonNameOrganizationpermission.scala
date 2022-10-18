package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNameOrganizationpermission extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NameOrganizationpermission
}
object ApplicationjsonNameOrganizationpermission {
  
  inline def apply(applicationSlashjson: NameOrganizationpermission): ApplicationjsonNameOrganizationpermission = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNameOrganizationpermission]
  }
  
  extension [Self <: ApplicationjsonNameOrganizationpermission](x: Self) {
    
    inline def setApplicationSlashjson(value: NameOrganizationpermission): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
