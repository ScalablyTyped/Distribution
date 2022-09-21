package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameQueryPage extends StObject {
  
  var path: Environmentname
  
  var query: Page
}
object PathEnvironmentnameQueryPage {
  
  inline def apply(path: Environmentname, query: Page): PathEnvironmentnameQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameQueryPage]
  }
  
  extension [Self <: PathEnvironmentnameQueryPage](x: Self) {
    
    inline def setPath(value: Environmentname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
