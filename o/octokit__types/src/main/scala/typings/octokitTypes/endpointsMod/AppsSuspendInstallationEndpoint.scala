package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsSuspendInstallationEndpoint extends StObject {
  
  var installation_id: Double = js.native
}
object AppsSuspendInstallationEndpoint {
  
  @scala.inline
  def apply(installation_id: Double): AppsSuspendInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsSuspendInstallationEndpoint]
  }
  
  @scala.inline
  implicit class AppsSuspendInstallationEndpointMutableBuilder[Self <: AppsSuspendInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallation_id(value: Double): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
  }
}
