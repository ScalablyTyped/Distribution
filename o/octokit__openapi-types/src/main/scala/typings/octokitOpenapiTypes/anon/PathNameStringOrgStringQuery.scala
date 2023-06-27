package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameStringOrgStringQuery extends StObject {
  
  var path: NameStringOrgString
  
  var query: js.UndefOr[`591`] = js.undefined
}
object PathNameStringOrgStringQuery {
  
  inline def apply(path: NameStringOrgString): PathNameStringOrgStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameStringOrgStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameStringOrgStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameStringOrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `591`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
