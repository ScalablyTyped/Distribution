package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetUserInstallationEndpoint extends StObject {
  
  var username: String
}
object AppsGetUserInstallationEndpoint {
  
  inline def apply(username: String): AppsGetUserInstallationEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetUserInstallationEndpoint]
  }
  
  extension [Self <: AppsGetUserInstallationEndpoint](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
