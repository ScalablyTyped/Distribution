package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaOwnerQuery extends StObject {
  
  var path: CommitshaOwner
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathCommitshaOwnerQuery {
  
  inline def apply(path: CommitshaOwner): PathCommitshaOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommitshaOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommitshaOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
