package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidNumberQuery407 extends StObject {
  
  var path: InstallationidNumber
  
  var query: `407`
}
object PathInstallationidNumberQuery407 {
  
  inline def apply(path: InstallationidNumber, query: `407`): PathInstallationidNumberQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidNumberQuery407]
  }
  
  extension [Self <: PathInstallationidNumberQuery407](x: Self) {
    
    inline def setPath(value: InstallationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
