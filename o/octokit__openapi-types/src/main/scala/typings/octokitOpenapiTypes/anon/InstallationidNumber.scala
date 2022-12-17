package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationidNumber extends StObject {
  
  /** The unique identifier of the installation. */
  var installation_id: Double
}
object InstallationidNumber {
  
  inline def apply(installation_id: Double): InstallationidNumber = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationidNumber]
  }
  
  extension [Self <: InstallationidNumber](x: Self) {
    
    inline def setInstallation_id(value: Double): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
  }
}
