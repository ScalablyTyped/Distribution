package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidQuery extends StObject {
  
  var path: Installationid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathInstallationidQuery {
  
  inline def apply(path: Installationid): PathInstallationidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInstallationidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Installationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
