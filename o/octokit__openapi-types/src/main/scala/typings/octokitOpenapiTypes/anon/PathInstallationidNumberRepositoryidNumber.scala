package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidNumberRepositoryidNumber extends StObject {
  
  var path: InstallationidNumberRepositoryidNumber
}
object PathInstallationidNumberRepositoryidNumber {
  
  inline def apply(path: InstallationidNumberRepositoryidNumber): PathInstallationidNumberRepositoryidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidNumberRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInstallationidNumberRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: InstallationidNumberRepositoryidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
