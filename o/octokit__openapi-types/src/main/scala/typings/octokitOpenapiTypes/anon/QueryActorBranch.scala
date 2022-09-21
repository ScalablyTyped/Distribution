package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryActorBranch extends StObject {
  
  var path: OwnerString
  
  var query: ActorBranch
}
object QueryActorBranch {
  
  inline def apply(path: OwnerString, query: ActorBranch): QueryActorBranch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryActorBranch]
  }
  
  extension [Self <: QueryActorBranch](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ActorBranch): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
