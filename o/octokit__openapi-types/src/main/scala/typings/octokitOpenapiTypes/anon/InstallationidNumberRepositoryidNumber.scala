package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationidNumberRepositoryidNumber extends StObject {
  
  var installation_id: Double
  
  var repository_id: Double
}
object InstallationidNumberRepositoryidNumber {
  
  inline def apply(installation_id: Double, repository_id: Double): InstallationidNumberRepositoryidNumber = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationidNumberRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallationidNumberRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setInstallation_id(value: Double): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
