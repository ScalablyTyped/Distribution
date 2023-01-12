package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery464 extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: `464`
}
object PathIssuenumberOwnerRepoQuery464 {
  
  inline def apply(path: IssuenumberOwnerRepo, query: `464`): PathIssuenumberOwnerRepoQuery464 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery464]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberOwnerRepoQuery464] (val x: Self) extends AnyVal {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `464`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
