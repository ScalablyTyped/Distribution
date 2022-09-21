package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationidQueryPage extends StObject {
  
  var path: Installationid
  
  var query: Page
}
object PathInstallationidQueryPage {
  
  inline def apply(path: Installationid, query: Page): PathInstallationidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationidQueryPage]
  }
  
  extension [Self <: PathInstallationidQueryPage](x: Self) {
    
    inline def setPath(value: Installationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
