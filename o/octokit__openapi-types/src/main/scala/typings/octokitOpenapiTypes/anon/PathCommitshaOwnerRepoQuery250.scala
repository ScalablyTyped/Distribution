package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaOwnerRepoQuery250 extends StObject {
  
  var path: CommitshaOwnerRepo
  
  var query: `250`
}
object PathCommitshaOwnerRepoQuery250 {
  
  inline def apply(path: CommitshaOwnerRepo, query: `250`): PathCommitshaOwnerRepoQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaOwnerRepoQuery250]
  }
  
  extension [Self <: PathCommitshaOwnerRepoQuery250](x: Self) {
    
    inline def setPath(value: CommitshaOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
