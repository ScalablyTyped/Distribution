package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidNumberQuery426 extends StObject {
  
  var path: InstallationidNumber
  
  var query: `426`
}
object PathInstallationidNumberQuery426 {
  
  inline def apply(path: InstallationidNumber, query: `426`): PathInstallationidNumberQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidNumberQuery426]
  }
  
  extension [Self <: PathInstallationidNumberQuery426](x: Self) {
    
    inline def setPath(value: InstallationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
