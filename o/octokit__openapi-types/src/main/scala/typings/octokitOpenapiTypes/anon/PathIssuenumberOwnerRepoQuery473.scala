package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery473 extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: `473`
}
object PathIssuenumberOwnerRepoQuery473 {
  
  inline def apply(path: IssuenumberOwnerRepo, query: `473`): PathIssuenumberOwnerRepoQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberOwnerRepoQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
