package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetOrgInstallationEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
}
object AppsGetOrgInstallationEndpoint {
  
  inline def apply(org_ : String): AppsGetOrgInstallationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetOrgInstallationEndpoint]
  }
  
  extension [Self <: AppsGetOrgInstallationEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
