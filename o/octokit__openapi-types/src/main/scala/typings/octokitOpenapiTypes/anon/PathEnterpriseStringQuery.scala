package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseStringQuery extends StObject {
  
  var path: EnterpriseString
  
  var query: js.UndefOr[Secrettype] = js.undefined
}
object PathEnterpriseStringQuery {
  
  inline def apply(path: EnterpriseString): PathEnterpriseStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnterpriseStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnterpriseString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Secrettype): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
