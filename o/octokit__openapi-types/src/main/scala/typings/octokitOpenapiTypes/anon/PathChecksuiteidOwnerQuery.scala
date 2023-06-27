package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathChecksuiteidOwnerQuery extends StObject {
  
  var path: ChecksuiteidOwner
  
  var query: js.UndefOr[ChecknameFilter] = js.undefined
}
object PathChecksuiteidOwnerQuery {
  
  inline def apply(path: ChecksuiteidOwner): PathChecksuiteidOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathChecksuiteidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathChecksuiteidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ChecksuiteidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ChecknameFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
