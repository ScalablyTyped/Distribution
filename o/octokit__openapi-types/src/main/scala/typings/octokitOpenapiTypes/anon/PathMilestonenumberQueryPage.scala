package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMilestonenumberQueryPage extends StObject {
  
  var path: Milestonenumber
  
  var query: Page
}
object PathMilestonenumberQueryPage {
  
  inline def apply(path: Milestonenumber, query: Page): PathMilestonenumberQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMilestonenumberQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMilestonenumberQueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Milestonenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
