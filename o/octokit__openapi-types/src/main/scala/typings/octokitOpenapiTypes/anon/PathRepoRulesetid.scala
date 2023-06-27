package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoRulesetid extends StObject {
  
  var path: RepoRulesetid
  
  var query: js.UndefOr[`394`] = js.undefined
}
object PathRepoRulesetid {
  
  inline def apply(path: RepoRulesetid): PathRepoRulesetid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoRulesetid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRulesetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `394`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
