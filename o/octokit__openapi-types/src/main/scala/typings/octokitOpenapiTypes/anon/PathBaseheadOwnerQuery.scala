package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBaseheadOwnerQuery extends StObject {
  
  var path: BaseheadOwner
  
  var query: js.UndefOr[`690`] = js.undefined
}
object PathBaseheadOwnerQuery {
  
  inline def apply(path: BaseheadOwner): PathBaseheadOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBaseheadOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBaseheadOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: BaseheadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `690`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
