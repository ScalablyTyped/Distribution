package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationidNumberRepositoryidNumber extends StObject {
  
  /** The unique identifier of the installation. */
  var installation_id: Double
  
  /** The unique identifier of the repository. */
  var repository_id: Double
}
object InstallationidNumberRepositoryidNumber {
  
  inline def apply(installation_id: Double, repository_id: Double): InstallationidNumberRepositoryidNumber = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationidNumberRepositoryidNumber]
  }
  
  extension [Self <: InstallationidNumberRepositoryidNumber](x: Self) {
    
    inline def setInstallation_id(value: Double): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
