package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberNumberQuery extends StObject {
  
  var path: DiscussionnumberNumber
  
  var query: js.UndefOr[`625`] = js.undefined
}
object PathDiscussionnumberNumberQuery {
  
  inline def apply(path: DiscussionnumberNumber): PathDiscussionnumberNumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `625`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
