package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidNumberQuery473 extends StObject {
  
  var path: InstallationidNumber
  
  var query: `473`
}
object PathInstallationidNumberQuery473 {
  
  inline def apply(path: InstallationidNumber, query: `473`): PathInstallationidNumberQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidNumberQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInstallationidNumberQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: InstallationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
