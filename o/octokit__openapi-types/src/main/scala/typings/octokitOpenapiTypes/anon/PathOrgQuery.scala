package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgQuery extends StObject {
  
  var path: Org
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathOrgQuery {
  
  inline def apply(path: Org): PathOrgQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
