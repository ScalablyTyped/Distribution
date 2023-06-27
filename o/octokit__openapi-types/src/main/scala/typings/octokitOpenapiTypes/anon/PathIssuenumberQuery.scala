package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberQuery extends StObject {
  
  var path: Issuenumber
  
  var query: js.UndefOr[Perpage] = js.undefined
}
object PathIssuenumberQuery {
  
  inline def apply(path: Issuenumber): PathIssuenumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Issuenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Perpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
