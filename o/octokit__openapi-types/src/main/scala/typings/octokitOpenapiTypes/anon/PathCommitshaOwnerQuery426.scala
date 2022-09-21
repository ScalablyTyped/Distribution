package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaOwnerQuery426 extends StObject {
  
  var path: CommitshaOwner
  
  var query: `426`
}
object PathCommitshaOwnerQuery426 {
  
  inline def apply(path: CommitshaOwner, query: `426`): PathCommitshaOwnerQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaOwnerQuery426]
  }
  
  extension [Self <: PathCommitshaOwnerQuery426](x: Self) {
    
    inline def setPath(value: CommitshaOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
