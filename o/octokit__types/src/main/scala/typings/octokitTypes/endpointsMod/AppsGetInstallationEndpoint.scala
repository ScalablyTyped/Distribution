package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetInstallationEndpoint extends StObject {
  
  var installation_id: Double
}
object AppsGetInstallationEndpoint {
  
  inline def apply(installation_id: Double): AppsGetInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetInstallationEndpoint]
  }
  
  extension [Self <: AppsGetInstallationEndpoint](x: Self) {
    
    inline def setInstallation_id(value: Double): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
  }
}
