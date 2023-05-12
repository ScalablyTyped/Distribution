package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRulesetid extends StObject {
  
  var path: RepoRulesetid
  
  var query: Includesparents
}
object PathRepoRulesetid {
  
  inline def apply(path: RepoRulesetid, query: Includesparents): PathRepoRulesetid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoRulesetid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRulesetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Includesparents): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
