package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaOwnerQuery473 extends StObject {
  
  var path: CommitshaOwner
  
  var query: `473`
}
object PathCommitshaOwnerQuery473 {
  
  inline def apply(path: CommitshaOwner, query: `473`): PathCommitshaOwnerQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaOwnerQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommitshaOwnerQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommitshaOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
