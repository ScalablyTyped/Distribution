package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaOwnerQuery407 extends StObject {
  
  var path: CommitshaOwner
  
  var query: `407`
}
object PathCommitshaOwnerQuery407 {
  
  inline def apply(path: CommitshaOwner, query: `407`): PathCommitshaOwnerQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaOwnerQuery407]
  }
  
  extension [Self <: PathCommitshaOwnerQuery407](x: Self) {
    
    inline def setPath(value: CommitshaOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
