package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidRepositoryid extends StObject {
  
  var path: InstallationidRepositoryid
}
object PathInstallationidRepositoryid {
  
  inline def apply(path: InstallationidRepositoryid): PathInstallationidRepositoryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInstallationidRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: InstallationidRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
