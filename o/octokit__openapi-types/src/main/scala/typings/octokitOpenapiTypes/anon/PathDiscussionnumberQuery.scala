package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberQuery extends StObject {
  
  var path: Discussionnumber
  
  var query: js.UndefOr[DirectionPage] = js.undefined
}
object PathDiscussionnumberQuery {
  
  inline def apply(path: Discussionnumber): PathDiscussionnumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Discussionnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
