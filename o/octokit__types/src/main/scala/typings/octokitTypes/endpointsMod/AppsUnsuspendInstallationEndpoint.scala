package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsUnsuspendInstallationEndpoint extends StObject {
  
  var installation_id: Double = js.native
}
object AppsUnsuspendInstallationEndpoint {
  
  @scala.inline
  def apply(installation_id: Double): AppsUnsuspendInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsUnsuspendInstallationEndpoint]
  }
  
  @scala.inline
  implicit class AppsUnsuspendInstallationEndpointMutableBuilder[Self <: AppsUnsuspendInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallation_id(value: Double): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
  }
}
