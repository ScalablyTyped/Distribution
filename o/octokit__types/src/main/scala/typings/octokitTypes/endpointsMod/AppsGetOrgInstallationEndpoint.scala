package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsGetOrgInstallationEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
}
object AppsGetOrgInstallationEndpoint {
  
  @scala.inline
  def apply(org_ : String): AppsGetOrgInstallationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetOrgInstallationEndpoint]
  }
  
  @scala.inline
  implicit class AppsGetOrgInstallationEndpointMutableBuilder[Self <: AppsGetOrgInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
