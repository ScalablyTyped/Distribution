package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidNumberQuery extends StObject {
  
  var path: InstallationidNumber
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathInstallationidNumberQuery {
  
  inline def apply(path: InstallationidNumber): PathInstallationidNumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInstallationidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: InstallationidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
