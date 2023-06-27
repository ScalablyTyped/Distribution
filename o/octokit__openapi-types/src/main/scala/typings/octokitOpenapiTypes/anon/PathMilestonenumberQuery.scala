package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMilestonenumberQuery extends StObject {
  
  var path: Milestonenumber
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathMilestonenumberQuery {
  
  inline def apply(path: Milestonenumber): PathMilestonenumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMilestonenumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMilestonenumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Milestonenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
