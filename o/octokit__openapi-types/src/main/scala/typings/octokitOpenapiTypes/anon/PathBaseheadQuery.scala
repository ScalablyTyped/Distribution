package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBaseheadQuery extends StObject {
  
  var path: Basehead
  
  var query: js.UndefOr[`271`] = js.undefined
}
object PathBaseheadQuery {
  
  inline def apply(path: Basehead): PathBaseheadQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBaseheadQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBaseheadQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Basehead): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `271`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
