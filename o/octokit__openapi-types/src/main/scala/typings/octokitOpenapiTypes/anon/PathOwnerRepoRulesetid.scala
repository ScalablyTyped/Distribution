package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoRulesetid extends StObject {
  
  var path: OwnerRepoRulesetid
  
  var query: js.UndefOr[`394`] = js.undefined
}
object PathOwnerRepoRulesetid {
  
  inline def apply(path: OwnerRepoRulesetid): PathOwnerRepoRulesetid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerRepoRulesetid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRepoRulesetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `394`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
