package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidNumber extends StObject {
  
  var path: InstallationidNumber
}
object PathInstallationidNumber {
  
  inline def apply(path: InstallationidNumber): PathInstallationidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInstallationidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: InstallationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
