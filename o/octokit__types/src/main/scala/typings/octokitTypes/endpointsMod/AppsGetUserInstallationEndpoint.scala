package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsGetUserInstallationEndpoint extends StObject {
  
  var username: String = js.native
}
object AppsGetUserInstallationEndpoint {
  
  @scala.inline
  def apply(username: String): AppsGetUserInstallationEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetUserInstallationEndpoint]
  }
  
  @scala.inline
  implicit class AppsGetUserInstallationEndpointMutableBuilder[Self <: AppsGetUserInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
