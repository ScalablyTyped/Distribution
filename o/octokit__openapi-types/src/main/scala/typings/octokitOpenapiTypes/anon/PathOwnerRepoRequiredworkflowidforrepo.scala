package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoRequiredworkflowidforrepo extends StObject {
  
  var path: OwnerRepoRequiredworkflowidforrepo
  
  var query: ActorBranch
}
object PathOwnerRepoRequiredworkflowidforrepo {
  
  inline def apply(path: OwnerRepoRequiredworkflowidforrepo, query: ActorBranch): PathOwnerRepoRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerRepoRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRepoRequiredworkflowidforrepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ActorBranch): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
